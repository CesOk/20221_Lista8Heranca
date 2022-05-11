package Ex2_Heranca;

public class Trapezio extends Figura2D{
    double area, plano;

    public void trapezioCompleto(){
        System.out.println("Trapezio criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
