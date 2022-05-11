package Ex2_Heranca;

public class Losango extends Figura2D{
    double area, plano;

    public void losangoCompleto(){
        System.out.println("Losango criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
