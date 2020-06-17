import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	
	private List<ItemNota> itemsNota = new ArrayList<ItemNota>(0);
	
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	
	public NotaFiscalBuilder comRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItens(ItemNota itemNota) {
		this.itemsNota.add(itemNota);
		
		valorBruto += itemNota.getValor();
		impostos += itemNota.getValor() * 0.05;
		
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder comDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}

	public NotaFiscal criarNota() {
		return new NotaFiscal(razaoSocial, cnpj, itemsNota, valorBruto, impostos, observacoes, data);
	}
}
