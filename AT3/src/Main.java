package AT3.src;

public class Main {
    import dao.PessoaDAO;
    import model.*;

import java.util.Scanner;

import AT3.src.model.Aluno;
import AT3.src.model.Pessoa;
import AT3.src.model.Professor;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaDAO dao = new PessoaDAO();

        while (true) {
            System.out.println("\n=== SISTEMA DE PESSOAS ===");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Consultar Pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> cadastrar(sc, dao);
                case 2 -> consultar(dao);
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        }
    }

    private static void cadastrar(Scanner sc, PessoaDAO dao) {
        System.out.println("Cadastrar: 1-Aluno | 2-Professor");
        int t = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        if (t == 1) {
            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();
            dao.inserir(new Aluno(nome, email, matricula));
        } else if (t == 2) {
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            dao.inserir(new Professor(nome, email, salario));
        }

        System.out.println("Cadastrado com sucesso!");
    }

    private static void consultar(PessoaDAO dao) {
        for (Pessoa p : dao.listar()) {
            System.out.println(
                    p.getId() + " | " + p.getNome() + " | " + p.getEmail()
                    + " | " + p.getTipo()
            );
        }
    }
}

}
