package Ex1_Heranca;

public class Trapezio extends Forma{
    double area, plano;

    public void trapezioCompleto(){
        System.out.println("Trapezio criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
