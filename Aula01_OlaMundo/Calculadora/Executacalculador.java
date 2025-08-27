package Aula01_OlaMundo.Calculadora;
import Aula01_OlaMundo.Calculadora.Calculadora;

public class Executacalculador {
    public static void main(String[] args){
        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora();
        calc1.numeroA = 2.0;
        calc1.numeroB = 3.0;

        calc2.numeroA = 4.0;
        calc2.numeroB = 5.0;

        calc1.somar();
        calc2.somar();
        
        calc1.Subt();
        calc2.Subt();
    }
}

