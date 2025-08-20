package Aula01_OlaMundo.Calculadora;

public class Calculadora {
    
    public double numeroA;
    public double numeroB;

    public void somar(){
        Double resultadoSoma = this.numeroA + this.numeroB;
        System.out.println(this.numeroA + " + " + this.numeroB + " = " + resultadoSoma);
    }

    public void Subt(){
        Double resultadoSubt = this.numeroA - this.numeroB;
        System.out.println(this.numeroA + " - " + this.numeroB + " = " + resultadoSubt);
    }
}
