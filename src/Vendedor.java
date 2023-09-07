public class Vendedor {
    private String nome;
    private String sobrenome;
    private int matricula;
    private double salario;
    private Vendedor(String nome, String sobrenome, int matricula){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.salario = 1500;
    }
    public static class BuilderVendedor{
        private String nome;
        private String sobrenome;
        private int matricula;

        public BuilderVendedor setNome(String nome){
            this.nome = nome;
            return this;
        }
        public BuilderVendedor setSobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }
        public BuilderVendedor setMatricula(int matricula){
            this.matricula = matricula;
            return this;
        }


        public Vendedor build(){
            return new Vendedor(nome, sobrenome, matricula);
        }
    }


    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public double getSalario(){
        return this.salario;
    }
    public double calcularSalario(double comissao){
        this.salario += comissao;
        return this.salario;
    }
}
