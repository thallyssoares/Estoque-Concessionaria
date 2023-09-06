public class Estoque {
    Carro[] carro;
    int quantidade;

    public Estoque(Carro[] carro, int quantidade){
        this.carro = carro;
        this.quantidade = quantidade;
    }
    public void darSaida(int quantidadeSaida){
        if(quantidadeSaida < this.quantidade){
            System.out.println("Quantidade menor do que a do estoque.");
        }
        this.quantidade = quantidadeSaida;
    }
    public void consultarEstoque(){
        for(int i=0; i< carro.length;i++){
            System.out.println("=================================================================================");
            System.out.println("Marca: "+carro[i].getMarca()+"\nModelo: "+carro[i].getModelo()+"\nAno: "+carro[i].getAno()+"\nCapacidade do Tanque: "+carro[i].getCapTanque()+"\nNúmero de Passageiros: "+carro[i].getNumPassageiros()+"\nValor: "+carro[i].getValor());
            System.out.println("=================================================================================");
            System.out.println("Quantidade em estoque: "+this.quantidade);
        }

    }

}
