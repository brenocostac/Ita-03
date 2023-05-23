package Principal;

import Principal.dominio.CarrinhoDeCompras;
import Principal.dominio.Pizza;

public class Principal {
    public static void main(String[] args) {
        Pizza pizza01 = new Pizza();
        Pizza pizza02 = new Pizza();
        Pizza pizza03 = new Pizza();

        pizza01.adicionarIgrediente("Muçarela");
        pizza01.adicionarIgrediente("Calabresa");

        pizza02.adicionarIgrediente("Presunto");
        pizza02.adicionarIgrediente("Ovos");
        pizza02.adicionarIgrediente("Muçarela");

        pizza03.adicionarIgrediente("Frango");
        pizza03.adicionarIgrediente("Milho");
        pizza03.adicionarIgrediente("Catupiry");
        pizza03.adicionarIgrediente("Catupiry");
        pizza03.adicionarIgrediente("Muçarela");
        pizza03.adicionarIgrediente("Borda com catupiry");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarPizza(pizza01);
        carrinho.adicionarPizza(pizza02);
        carrinho.adicionarPizza(pizza03);

        System.out.println("Total do carrinho de compras: R$ " + carrinho.Total());
        System.out.println("Lista de ingredientes: " + Pizza.tabelaDeIngredientes());


    }


}
