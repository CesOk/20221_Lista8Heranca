package Ex2_Heranca;

public class Quadrado extends Figura2D{
    double area, plano;

    public void quadradoCompleto(){
        System.out.println("Quadrado criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
