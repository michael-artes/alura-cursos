import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;
	private List<Item> itens;

	private EstadoDeUmOrcamento estadoDeUmOrcamento;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		
		this.estadoDeUmOrcamento = new EmAprovacao();
	}

	
	public void setEstadoDeUmOrcamento(EstadoDeUmOrcamento estadoDeUmOrcamento) {
		this.estadoDeUmOrcamento = estadoDeUmOrcamento;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public void aplicaDescontoExtra() {
		estadoDeUmOrcamento.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		this.estadoDeUmOrcamento.aprovar(this);
	}
	
	public void reprova() {
		this.estadoDeUmOrcamento.reprovar(this);
	}
	
	public void finaliza() {
		this.estadoDeUmOrcamento.finalizar(this);
	}

}