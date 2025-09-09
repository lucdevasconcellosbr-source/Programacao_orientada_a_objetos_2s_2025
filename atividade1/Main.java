package Programacao_orientada_a_objetos_2s_2025.atividade1;
public class Main {
    public static void main(String[] args) {
        Computador notebook = new Computador(16, 500, 8, 2.5f);

        SistemaOperacional Win = new SistemaOperacional();
        Win.setcomputador(notebook);

        Programa prog1 = new Programa(10, 250, 7, 10000);
        Programa prog2 = new Programa(8, 850, 4, 15000);
        Programa prog3 = new Programa(24, 500, 5, 20000);
        Programa prog4 = new Programa(14, 500, 16, 50000);

        System.out.println("*Testando o Programa 1*");
        Win.executarPrograma(prog1);

        System.out.println("*Testando o Programa 2*");
        Win.executarPrograma(prog2);
        
        System.out.println("*Testando o Programa 3*");
        Win.executarPrograma(prog3);

        System.out.println("*Testando o Programa 4*");
        Win.executarPrograma(prog4);
    }
}