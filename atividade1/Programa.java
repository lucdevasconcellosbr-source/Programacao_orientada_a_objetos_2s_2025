package Programacao_orientada_a_objetos_2s_2025.atividade1;
public class Programa {
    public Programa(int memoriaRAMalocada, int SSDocupado, int nucleos, int quantidadeOperacoes) {
        this.memoriaRAMalocada = memoriaRAMalocada;
        this.SSDocupado = SSDocupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
    public int memoriaRAMalocada;
    public int SSDocupado;
    public int nucleos;
    public int quantidadeOperacoes;

    public int getmemoriaRAMalocada(){
        return memoriaRAMalocada;
    }

    public void setmemoriaRAMalocada(int memoriaRAMalocada){
        this.memoriaRAMalocada = memoriaRAMalocada;
    }

    public int getSSDocupado(){
        return SSDocupado;
    }

    public void setSSDocupado(int SSDocupado){
        this.SSDocupado = SSDocupado;
    }

    public int getnucleos(){
        return nucleos;
    }

    public void setnucleos(int nucleos){
        this.nucleos = nucleos;
    }

    public int getquantidadeOperacoes(){
        return quantidadeOperacoes;
    }

    public void setquantidadeOperacoes(int quantidadeOperacoes){
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}
