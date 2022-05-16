package Services;

import Repository.ProdutoRepository;
import Repository.LoteRepository;
import java.util.List;



public class ProdutoService {

    private ProdutoRepository produtReposit;
    private LoteRepository loteReposit;

    public List<Produto> listaProdsLote(){

        List<Lote> lotess = LoteRepository.listaDeLotes();
        List<Produto> produts = getProdutsFromLote(lotess);
    }

    private List<Produto>  getProdutsFromLote(){

    }

    public List<Produto> listaProdsByName() {

    }


}
