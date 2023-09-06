public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double capTanque;
    private int numPassageiros;
    private double valor;

    private Carro(String marca, String modelo, int ano, double capTanque, int numPassageiros, double valor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capTanque = capTanque;
        this.numPassageiros = numPassageiros;
        this.valor = valor;
    }

    public static class BuilderCarro{
        private String marca;
        private String modelo;
        private int ano;
        private double capTanque;
        private int numPassageiros;
        private double valor;

        public BuilderCarro setMarca(String marca){
            this.marca = marca;
            return this;
        }
        public BuilderCarro setModelo(String modelo){
            this.modelo = modelo;
            return this;
        }
        public BuilderCarro setAno(int ano){
            this.ano = ano;
            return this;
        }
        public BuilderCarro setCapTanque(double capTanque){
            this.capTanque = capTanque;
            return this;
        }
        public BuilderCarro setNumPassageiros(int numPassageiros){
            this.numPassageiros = numPassageiros;
            return this;
        }
        public BuilderCarro setValor(double valor){
            this.valor = valor;
            return this;
        }

        public Carro build(){
            return new Carro(marca, modelo, ano, capTanque, numPassageiros, valor);
        }
    }
    public double getValor(){
        return this.valor;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public double getCapTanque(){
        return this.capTanque;
    }
    public int getNumPassageiros(){
        return this.numPassageiros;
    }

}
