package atividade1;
public class SistemaOperacional {
    public Computador computador;

    public Computador geComputador(){
        return computador;
    }

    public void setcomputador(Computador computador){
        this.computador = computador;
    }
    
    public boolean executarPrograma(Programa p){
        if (p.getSSDocupado() > computador.getSSD()) {
            System.out.println("Ocorreu um erro! Espaço insuficiente na unidade de armazenamento.");
            return false;
        }
    if (p.getmemoriaRAMalocada() > computador.getMemoriaRAM()) {
            System.out.println("Ocorreu um erro! Não existe mais espaço para alocar na memoria RAM.");
            return false;
        }
        if (p.getnucleos() > computador.getNucleos()) {
            System.out.println("Ocorreu um erro! A quantidade de nucleos disponiveis esta abaixo da quantidade exigida pelo programa.");
            return false;
        }
        
        float tempoExecucao = p.getquantidadeOperacoes() / (computador.getoperacoesPorSegundo() * computador.getNucleos());

        System.out.println("O progama foi executado com êxito!");
        System.out.println("Tempo levado para executar: " + tempoExecucao);
        return true;
    }
}
