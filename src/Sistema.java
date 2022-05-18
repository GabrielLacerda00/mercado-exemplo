import Repository.ProdutoRepository;
import Repository.LoteRepository;
import exemplo.Lote;
import exemplo.Produto;
import Services.ProdutoService;
import Services.LoteRepository;

public class Sistema {

	private static ProdutoRepository catalogoDeProdutos = new ProdutoRepository();
	private static LoteRepository catalogoDeLotes = new LoteRepository();
	private static ProdutoService produtService = new ProdutoService();
	private static LoteService lotService = new LoteService();

	public static void main(String[] args) {
		
		Produto produto01 = new Produto("Leite", "Parmalat");
		Produto produto02 = new Produto("Frango", "GranjaFeliz");
		Produto produto03 = new Produto("Carne","Frigorifico");
		Produto produto04 = new Produto("Macarrão", "MassasFit")
		Lote lote01 = new Lote(produto01, 10L);
		Lote lote02 = new Lote(produto02, 32l);
		Lote lote03 = new Lote(produto03, 25l);
		Lote lote04 = new Lote(produto04, 17l);



		//Adicionando produtos no catálogo
		produtService.addProduto(produto01);
		produtService.addProduto(produto02);
		produtService.addProduto(produto03);
		produtService.addProduto(produto04);

		//catalogoDeProdutos.atualizaProduto(produto02.getId(),"Ovo","GranjaDoOvo");
		//catalogoDeProdutos.removeProduto(produto04.getId());
		//catalogoDeProdutos.listaDeProdutos();

		// Consulta de produto "leite" no catálogo de produto
		List<Produto> selection = produtService.listaProdutsLoteByName("leite");
		System.out.println(selection);

		// Consulta de produto "leite" no catálogo de produto com lotes no sistema
		List<Produto> selectionWithLote = produtService.listaProdutsLoteByName("leite");
		System.out.println(selectionWithLote);

		//Adicionando lotes no catálogo
		lotService.adicionarLote(lote01);
		lotService.adicionarLote(lote02);
		lotService.adicionarLote(lote03);
		lotService.adicionarLote(lote04);

		//catalogoDeLotes.atualizaLote(lote01.getId(), 15l);
		//catalogoDeLotes.removeLote(lote02.getId());
		//catalogoDeLotes.pegaLote(lote03.getId());
		//catalogoDeLotes.listaDeLotes();
	}
}
