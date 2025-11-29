package AT3;
package model;

public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String email;

    public Pessoa() {}

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Encapsulamento: getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Abstrato — Polimorfismo em subclasses
    public abstract String getTipo();
}

public class Pessoa {
    
}
