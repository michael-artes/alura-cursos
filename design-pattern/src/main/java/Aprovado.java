
public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() * 0.02 + orcamento.getValor());
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja aprovado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja aprovado, nao pode ser reprovados");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstadoDeUmOrcamento(new Finalizado());
	}

}
