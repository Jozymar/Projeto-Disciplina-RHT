package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.AvaliacaoMotivacao;

/**
 *
 * @author jozimar
 */
public interface AvaliacaoMotivacaoDao {

    public void cadastrar(AvaliacaoMotivacao avaliacaoMotivacao);

    public Long consultarPorDiscordoTotalmente();

    public Long consultarPorDiscordoModeradamente();

    public Long consultarPorNaoConcordoNemDiscordo();

    public Long consultarPorConcordoModeradamente();

    public Long consultarPorConcordoTotalmente();
}
