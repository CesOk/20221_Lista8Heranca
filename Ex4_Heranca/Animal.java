package Ex4_Heranca;

public class Animal {
    private String nome;
    private int patas = 4;

    public Animal(){
        System.out.println("Construindo Animal...");
        setNome("Cachorro");
        setPatas(4);
    }

    public Animal(String nome){
        System.out.println("Construindo Animal...");
        setNome(nome);
        setPatas(4);
    }

    public Animal(String nome, int patas){
        System.out.println("Construindo Animal...");
        setNome(nome);
        setPatas(patas);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getPatas(){
        return patas;
    }
    public void setPatas(int patas){
        this.patas = patas;
    }
}
