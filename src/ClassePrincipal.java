public class ClassePrincipal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente.BuilderCliente().setNome("Ricardo").setSobrenome("Lucas").setTelefone("999788545").setEmail("email@wmail.com").build();
        Carro carro1 = new Carro.BuilderCarro().setMarca("Fiat").setModelo("Ducato").setNumPassageiros(10).setCapTanque(100).setAno(1998).setValor(12000).build();
        Carro carro2 = new Carro.BuilderCarro().setMarca("Volkswagen").setModelo("Fusca").setAno(2016).setCapTanque(30).setNumPassageiros(4).setValor(25000).build();
        Carro[] carros = {carro1, carro2};
        Estoque estoque1 = new Estoque(carros, 3);
        Vendedor vendedor1 = new Vendedor.BuilderVendedor().setNome("Lucas").setSobrenome("Silva").setMatricula(5234).build();
        Venda venda1 = new Venda.BuilderVenda().setVendedor(vendedor1).setCliente(cliente1).setCarro(carro2).setQuantidade(2).setEstoque(estoque1).build();
        venda1.vender();

    }
}