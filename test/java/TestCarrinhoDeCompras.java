import Principal.dominio.CarrinhoDeCompras;
import Principal.dominio.Pizza;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCarrinhoDeCompras {
    @Test
    public void testeValorCarrinho(){
        Pizza pizza01 = new Pizza();
        pizza01.adicionarIgrediente("muçarela");
        pizza01.adicionarIgrediente("calabresa");
        pizza01.adicionarIgrediente("azeitona");
        pizza01.adicionarIgrediente("cebola");
        Pizza pizza02 = new Pizza();
        pizza02.adicionarIgrediente("muçarela");
        pizza02.adicionarIgrediente("cebola");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarPizza(pizza01);
        carrinho.adicionarPizza(pizza02);

        assertEquals(35, carrinho.Total());
    }

    @Test
    public void testeCarrinhoPizzaSemIngrediente(){
        Pizza pizza0 = new Pizza();
        CarrinhoDeCompras carrinhoDeCompras0 = new CarrinhoDeCompras();

        assertEquals(0, carrinhoDeCompras0.totalDePizzas());
    }
}
