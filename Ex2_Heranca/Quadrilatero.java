package Ex2_Heranca;

public class Quadrilatero extends Figura3D{
    double volume;

    public void quadrilateroCompleto(){
        System.out.println("Quadrilatero criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
