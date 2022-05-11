package Ex2_Heranca;

public class Cubo extends Figura3D{
    double volume;

    public void cuboCompleto(){
        System.out.println("Cubo criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
