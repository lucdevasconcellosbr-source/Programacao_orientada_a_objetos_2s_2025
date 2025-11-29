package AT3;
package AT3.src.Dao;

public class PessoaDAO {


import model.*;
import database.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    public PessoaDAO() {
        criarTabela();
    }

    private void criarTabela() {
        String sql = """
            CREATE TABLE IF NOT EXISTS pessoas (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nome TEXT NOT NULL,
                email TEXT NOT NULL,
                tipo TEXT NOT NULL,
                matricula TEXT,
                salario REAL
            );
        """;

        try (Connection con = Database.conectar(); Statement stmt = con.createStatement()) {
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inserir(Pessoa p) {
        String sql = """
            INSERT INTO pessoas (nome, email, tipo, matricula, salario)
            VALUES (?, ?, ?, ?, ?);
        """;

        try (Connection con = Database.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getNome());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getTipo());

            if (p instanceof Aluno a) {
                ps.setString(4, a.getMatricula());
                ps.setNull(5, Types.NULL);
            } else if (p instanceof Professor prof) {
                ps.setNull(4, Types.NULL);
                ps.setDouble(5, prof.getSalario());
            }

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Pessoa> listar() {
        List<Pessoa> lista = new ArrayList<>();

        String sql = "SELECT * FROM pessoas";

        try (Connection con = Database.conectar(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                String tipo = rs.getString("tipo");

                Pessoa p = null;

                if (tipo.equals("Aluno")) {
                    p = new Aluno(
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getString("matricula")
                    );
                } else if (tipo.equals("Professor")) {
                    p = new Professor(
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getDouble("salario")
                    );
                }

                p.setId(rs.getInt("id"));
                lista.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}

}
