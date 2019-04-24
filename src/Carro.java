
public class Carro {

    private String nome;
    private String marca;
    private String cor;
    private String fabricacao;
    private String largura;
    private String peso;

    public void acelerar() {
        System.out.println("Carro acelerar!");
    }

    public void setNome(String nome) {
        if (nome != "") {
            this.nome = nome;
        }
    }
    
    

}
