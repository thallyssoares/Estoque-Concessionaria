public class Cliente {

    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private Cliente(String nome, String sobrenome, String telefone, String email){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }

    public static class BuilderCliente{
        private String nome;
        private String sobrenome;
        private String telefone;
        private String email;

        public BuilderCliente setNome(String nome){
            this.nome = nome;
            return this;
        }
        public BuilderCliente setSobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }
        public BuilderCliente setTelefone(String telefone){
            this.telefone = telefone;
            return this;
        }
        public BuilderCliente setEmail(String email){
            this.email = email;
            return this;
        }
        public Cliente build(){
            return new Cliente(nome, sobrenome, telefone, email);
        }

    }
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getEmail(){
        return this.email;
    }


}
