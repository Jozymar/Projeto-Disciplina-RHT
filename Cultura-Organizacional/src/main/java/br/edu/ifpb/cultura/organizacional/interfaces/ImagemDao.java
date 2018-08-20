package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Imagem;

/**
 *
 * @author jozimar
 */
public interface ImagemDao {
    
    public void cadastrar(Imagem imagem);
    
    public Long consultarPorDiscordoTotalmente();
}
