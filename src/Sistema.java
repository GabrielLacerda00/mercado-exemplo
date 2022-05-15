import Repository.ProdutoRepository;
import Repository.LoteRepository;
import exemplo.Lote;
import exemplo.Produto;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto01 = new Produto("Leite", "Parmalat");
		Produto produto02 = new Produto("Frango", "GranjaFeliz");
		Produto produto03 = new Produto("Carne","Frigorifico");
		Produto produto04 = new Produto("Macarrão", "MassasFit")
		Lote lote01 = new Lote(produto01, 10L);
		Lote lote02 = new Lote(produto02, 32l);
		Lote lote03 = new Lote(produto03, 25l);
		Lote lote04 = new Lote(produto04, 17l);
		
		ProdutoRepository catalogoDeProdutos = new ProdutoRepository();
		LoteRepository catalogoDeLotes = new LoteRepository();


		catalogoDeProdutos.addProduto(produto01);
		catalogoDeProdutos.addProduto(produto02);
		catalogoDeProdutos.addProduto(produto03);
		catalogoDeProdutos.addProduto(produto04);

		catalogoDeProdutos.atualizaProduto(produto02.getId(),"Ovo","GranjaDoOvo");
		catalogoDeProdutos.removeProduto(produto04.getId());
		catalogoDeProdutos.listaDeProdutos();


		catalogoDeLotes.adicionarLote(lote01);
		catalogoDeLotes.adicionarLote(lote02);
		catalogoDeLotes.adicionarLote(lote03);
		catalogoDeLotes.adicionarLote(lote04);

		catalogoDeLotes.atualizaLote(lote01.getId(), 15l);
		catalogoDeLotes.removeLote(lote02.getId());
		catalogoDeLotes.pegaLote(lote03.getId());
		catalogoDeLotes.listaDeLotes();

	}
}
