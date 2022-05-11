package Ex2_Heranca;

public class Circulo extends Figura2D{
    double area, plano;

    public void circuloCompleto(){
        System.out.println("Circulo criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
