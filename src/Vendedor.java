public class Vendedor {
    private String nome;
    private String sobrenome;
    private int matricula;
    private double comissao;
    private double salario = 1500;
    private Vendedor(String nome, String sobrenome, int matricula, double comissao){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.comissao = comissao;
    }
    public static class BuilderVendedor{
        private String nome;
        private String sobrenome;
        private int matricula;
        private double comissao;

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
        public BuilderVendedor setComissao(double comissao){
            this.comissao = comissao;
            return this;
        }

        public Vendedor build(){
            return new Vendedor(nome, sobrenome, matricula, comissao);
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
    public double calcularSalario(){
        this.salario += this.comissao;
        return this.salario;
    }
}
