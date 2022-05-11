package Ex5_Heranca;

public class Oviparo extends Animal{
    int qtOvos, diasEclosao;
    public Oviparo(String nome, int patas, int qtOvos, int diasEclosao){
        super(nome, patas);
    }

    public int getOvos(){
        return qtOvos;
    }
    public void setOvos(int qtOvos){
        this.qtOvos = qtOvos;
    }
    public int getEclosao(){
        return diasEclosao;
    }
    public void setEclosao(int diasEclosao){
        this.diasEclosao = diasEclosao;
    }
}
