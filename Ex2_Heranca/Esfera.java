package Ex2_Heranca;

public class Esfera extends Figura3D{
    double volume;

    public void esferaCompleto(){
        System.out.println("Esfera criado. Possui " + getPonto() + " pontos e " + getLinha() + " linhas.");
    }
}
