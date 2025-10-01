package atividade1;
public class Computador{
     public Computador(int memoriaRAM, int SSD, int nucleos, float operacoesPorSegundo) {
          this.memoriaRAM = memoriaRAM;
          this.SSD = SSD;
          this.nucleos = nucleos;
          this.operacoesPorSegundo = operacoesPorSegundo;
     }
    public int memoriaRAM;
    public int SSD;
    public int nucleos;
    public float operacoesPorSegundo;

   public int getMemoriaRAM(){
        return memoriaRAM;
   }

   public void setMemoriaRAM(int memoriaRAM){
        this.memoriaRAM = memoriaRAM;
   }

   public int getSSD(){
        return SSD;
   }

   public void setSSD(int SSD){
        this.SSD = SSD;
   }

   public int getNucleos(){
        return nucleos;
   }

   public void setNucleos(int nucleos){
    this.nucleos = nucleos;
   }

   public float getoperacoesPorSegundo(){
        return operacoesPorSegundo;
   }

   public void setoperacoesPorSegundo(int operacoesPorSegundo){
        this.operacoesPorSegundo = operacoesPorSegundo;
   }
}