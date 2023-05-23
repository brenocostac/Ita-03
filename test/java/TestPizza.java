import Principal.dominio.Pizza;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPizza {
   @Before
    public void zeraIngredientes(){
       Pizza.limparIngredientes();
   }

   @Test
    public void testeValorPizza(){
       Pizza pizza01 = new Pizza();
       pizza01.adicionarIgrediente("muçarela");
       pizza01.adicionarIgrediente("calabresa");
       pizza01.adicionarIgrediente("azeitona");
       pizza01.adicionarIgrediente("cebola");

       assertEquals(20,pizza01.getPreco());
   }

   @Test
   public void testeListaIngredientes(){
      Pizza pizza01 = new Pizza();
      pizza01.adicionarIgrediente("muçarela");
      pizza01.adicionarIgrediente("calabresa");
      pizza01.adicionarIgrediente("azeitona");
      pizza01.adicionarIgrediente("cebola");

      ArrayList<String> ingredientes = new ArrayList<>(pizza01.listarIngredientes());

      assertEquals(ingredientes, pizza01.listarIngredientes());


   }

   @After
   public void zerarIngredientes(){
      Pizza.limparIngredientes();
   }

}
