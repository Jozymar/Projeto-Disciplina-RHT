package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.SituacaoFinanceira;

/**
 *
 * @author jozimar
 */
public interface SituacaoFinanceiraDao {
    
    public void cadastrar(SituacaoFinanceira situacaoFinanceira);
    
    public Long consultarPorDiscordoTotalmente();

    public Long consultarPorDiscordoModeradamente();

    public Long consultarPorNaoConcordoNemDiscordo();

    public Long consultarPorConcordoModeradamente();

    public Long consultarPorConcordoTotalmente();
}
