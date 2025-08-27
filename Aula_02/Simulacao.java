public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.velocidade = 0;
        opala.placa = "ACLR300";
        opala.modelo = "Comodoro";
        opala.ano = 76;

        Radar radar = new Radar();
        radar.modelo = "pardal";
        radar.limitevelocidade = 60;
        radar.localizacao = "Pistão Sul";

        opala.acelerar(); // 5
        opala.acelerar(); // 10
        opala.acelerar(); // 15
        opala.acelerar(); // 20
        opala.acelerar(); // 25
        opala.acelerar(); // 30
        opala.acelerar(); // 35
        opala.acelerar(); // 40
        opala.acelerar(); // 45
        opala.acelerar(); // 50
        opala.acelerar(); // 55
        opala.acelerar(); // 60

        radar.avaliarvelocidade(opala);
    }
}
