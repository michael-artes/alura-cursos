
public class ImprimirNotaFiscal implements AcoesPosGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Observer --------> imprimindo nf= " + nf);
	}

}
