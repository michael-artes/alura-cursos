
public class EmAprovacao implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() * 0.05 + orcamento.getValor());
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setEstadoDeUmOrcamento(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setEstadoDeUmOrcamento(new Reprovado());
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstadoDeUmOrcamento(new Finalizado());
	}

}
