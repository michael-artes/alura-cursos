
public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento nao pode aplicar descontos");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado nao pode ser aprovado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado nao pode ser reprovado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstadoDeUmOrcamento(new Finalizado());
	}

}
