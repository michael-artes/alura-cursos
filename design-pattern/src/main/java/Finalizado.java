
public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja finalizado");
	}

}
