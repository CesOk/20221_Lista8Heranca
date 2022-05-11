package Ex1_Heranca;

public class Losango extends Forma{
    double area, plano;

    public void losangoCompleto(){
        System.out.println("Losango criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
