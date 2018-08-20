package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Formacao;

/**
 *
 * @author jozimar
 */
public interface FormacaoDao {
    
    public void cadastrar(Formacao formacao);
    
    public Long consultarPorDiscordoTotalmente();
}
