package Ex1_Heranca;

public class Retangulo extends Forma{
    double area, plano;

    public void retanguloCompleto(){
        System.out.println("Retangulo criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
