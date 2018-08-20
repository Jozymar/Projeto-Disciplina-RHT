package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Envolvimento;

/**
 *
 * @author jozimar
 */
public interface EnvolvimentoDao {
    
    public void cadastrar(Envolvimento envolvimento);
    
    public Long consultarPorDiscordoTotalmente();
}
