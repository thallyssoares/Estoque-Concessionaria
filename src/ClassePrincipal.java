public class ClassePrincipal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente.BuilderCliente().setNome("Ricardo").setSobrenome("Lucas").setTelefone("999788545").setEmail("email@wmail.com").build();
        Carro carro1 = new Carro.BuilderCarro().setMarca("Fiat").setModelo("Ducato").setNumPassageiros(10).setCapTanque(100).setAno(1998).setValor(12000).build();
        Carro carro2 = new Carro.BuilderCarro().setMarca("Volkswagen").setModelo("Fusca").setAno(2016).setCapTanque(30).setNumPassageiros(4).setValor(25000).build();
        Carro[] carros = {carro1, carro2};
        Estoque estoque1 = new Estoque(carros, 3);
        estoque1.consultarEstoque();


    }
}