package Ex1_Heranca;

public class Quadrado extends Forma{
    double area, plano;

    public void quadradoCompleto(){
        System.out.println("Quadrado criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
