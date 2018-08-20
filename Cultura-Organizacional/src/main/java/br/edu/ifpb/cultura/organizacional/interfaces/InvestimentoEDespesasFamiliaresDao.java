package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.InvestimentoEDespesasFamiliares;

/**
 *
 * @author jozimar
 */
public interface InvestimentoEDespesasFamiliaresDao {
    
    public void cadastrar(InvestimentoEDespesasFamiliares investimentoEDespesasFamiliares);
    
    public Long consultarPorDiscordoTotalmente();
}
