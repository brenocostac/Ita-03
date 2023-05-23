package Principal.dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
     public static int qtdIngredientes;
     public static Map<String, Integer> ingredientes = new HashMap<>();
     public double preco;
     public ArrayList <String>  listaDeIngrediente = new ArrayList<String>();


    public static void contIngredientes(String ingrediente){
        if (ingredientes.containsKey(ingrediente)){
            int key = ingredientes.get(ingrediente);
            ingredientes.put(ingrediente, key + 1 );
        }else {
            ingredientes.put(ingrediente, 1);
        }
        qtdIngredientes++;

    }

     public void adicionarIgrediente(String ingrediente){
         this.listaDeIngrediente.add(ingrediente);
        contIngredientes(ingrediente);

     }


    public static Map<String, Integer>  tabelaDeIngredientes()
    {
        return ingredientes;}

    public double getPreco ()
    {
        if (listaDeIngrediente.size() <= 2)
        {
            preco = 15;
        }
        if (listaDeIngrediente.size() >= 3 && listaDeIngrediente.size() <=5)
        {
            preco = 20;
        }
        if (listaDeIngrediente.size() > 5)
        {
            preco = 23;
        }
        if (listaDeIngrediente.isEmpty())
        {
            preco = 0;
        }
        return preco;
    }

    public static void limparIngredientes(){
        ingredientes.clear();
    }

    public ArrayList<String> listarIngredientes(){
        return listaDeIngrediente;
    }


}
