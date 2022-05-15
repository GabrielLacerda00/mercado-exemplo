package Repository;

import java.util.HashMap;
import java.util.Map;

import exemplo.Produto;

public class ProdutoRepository {
	
   Map<String,Produto> catalogo = new HashMap<String, Produto>();
   
   public void adicionarProduto(Produto produto) {
	   catalogo.put(produto.getId(), produto);
   }
   
   public void atualizaProduto(String id, String novoNome, String novoFabricante) {
       String produtoId = produto.getId();
	   produto.setNome(novoNome);
	   produto.setFabricante(novoFabricante);
   }
   
   public void removeProduto(String id) {
      catalogo.remove(id);
   }
   
   public Produto pegaProduto(String id) {
      return catalogo.get(id);
   }

   public void listaDeProdutos() {
      System.out.println(catalogo.values());
   }

}
