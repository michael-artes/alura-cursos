
/**
 * 
 * Exemplo de Builder
 * 
 * */
public class TesteNotaFiscal {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
			builder.comRazaoSocial("Lemontech Ltda")
			.comCnpj("27.123.0001/01-54")
			.comDataAtual()
			.comItens(new ItemNota("Relogio", 50.40))
			.comItens(new ItemNota("Cinta", 40.40))
			.comItens(new ItemNota("Notebook", 35.35));
		
		NotaFiscal criarNota = builder.criarNota();
		
		
		System.out.println(criarNota.getImpostos());
	}

}
