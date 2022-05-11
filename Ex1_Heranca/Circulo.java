package Ex1_Heranca;

public class Circulo extends Forma{
    double area, plano;

    public void circuloCompleto(){
        System.out.println("Circulo criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}