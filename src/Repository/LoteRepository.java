package repository;

import java.util.HashMap;
import java.util.Map;

import exemplo.Lote;

public class LoteRepository {

    Map<String,Lote> catalogo = new HashMap<String, Lote>();

    public void adicionarLote(Lote lote) {
        catalogo.put(lote.getId(), lote);
    }

    public void atualizaLote(String id, long quantidade) {
        Lote lote = pegaLote(id);
        lote.setQuantidade(quantidade);
    }

    public void removeLote(String id) {
        catalogo.remove(id);
    }

    public Produto pegaLote(String id) {
        return catalogo.get(id);
    }

    public void listaDeLotes() {
        System.out.println(catalogo.values());
    }

}