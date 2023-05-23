package Principal.dominio;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    public double valorTotal = 0;
    public ArrayList<Pizza> pizzas = new ArrayList<>();
    public void adicionarPizza(Pizza pizza){
        if(pizza.getPreco() > 0){
            pizzas.add(pizza);
            valorTotal += pizza.getPreco();
        }

    }

    public int totalDePizzas(){
        return pizzas.size();
    }

    public double Total(){
        return valorTotal;
    }
}
