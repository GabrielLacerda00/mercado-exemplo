package Repository;

import java.util.HashMap;
import java.util.Map;

import exemplo.Produto;

public class ProdutoRepository {
	
   Map<String,Produto> catalogo = new HashMap<String, Produto>();
   List<Produto> listDeProdutos = new List<Produto>();
   
   public void adicionarProduto(Produto produto) {
	   catalogo.put(produto.getId(), produto);
       return produto.getId();
   }
   
   public void atualizaProduto(String id, String novoNome, String novoFabricante) {
       String produtoId = produto.getId();
	   produto.setNome(novoNome);
	   produto.setFabricante(novoFabricante);
   }
   
   public void removeProduto(String id) {
      catalogo.remove(id);
   }
   
   public Produto pegaProdutoById(String id) {
      return catalogo.get(id);
   }

   public void listaDeProdutos() {
      public List<Produto> listaDeProdutos() {
         List<Lote> listDeProdutos = new List<Produto>();
         for (Produto produt: catalogo.values()) {
            listDeProdutos.add(produt);
         }
         return listDeProdutos;
      }
   }

}
