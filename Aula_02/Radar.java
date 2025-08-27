public class Radar {
    public Integer limitevelocidade;
    public String modelo;
    public String localizacao;

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de Velocidade: "+this.limitevelocidade);
        System.err.println("Velocidade Avaliada: "+velocidadeAvaliada);
        System.out.println("Placa: "+placa);
    }

    public void avaliarvelocidade(Carro c){
        if (c.velocidade > limitevelocidade) {
            emitirNotificacao(c.placa, c.velocidade);
                System.out.println("Voce foi multado, comedia!");
            if (c.velocidade <= limitevelocidade) {
                System.out.println("Liberado!");
            }
        }
    }
}