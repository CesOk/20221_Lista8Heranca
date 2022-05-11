package Ex2_Heranca;

public class Retangulo extends Figura2D{
    double area, plano;

    public void retanguloCompleto(){
        System.out.println("Retangulo criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
