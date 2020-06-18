
public class EnviarSMS implements AcoesPosGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Observer -------->  Enviando SMS nf= " + nf);
	}

}
