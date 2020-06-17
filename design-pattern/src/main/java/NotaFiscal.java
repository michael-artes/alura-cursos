import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	
	private List<ItemNota> itemsNota = new ArrayList<ItemNota>(0);
	
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	
	public NotaFiscal(String razaoSocial, String cnpj, List<ItemNota> itemsNota, double valorBruto, double impostos,
			String observacoes, Calendar data) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.itemsNota = itemsNota;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.observacoes = observacoes;
		this.data = data;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public List<ItemNota> getItemsNota() {
		return itemsNota;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public Calendar getData() {
		return data;
	}

	@Override
	public String toString() {
		return "NotaFiscal [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", itemsNota=" + itemsNota
				+ ", valorBruto=" + valorBruto + ", impostos=" + impostos + ", observacoes=" + observacoes + ", data="
				+ data + "]";
	}

	
}
