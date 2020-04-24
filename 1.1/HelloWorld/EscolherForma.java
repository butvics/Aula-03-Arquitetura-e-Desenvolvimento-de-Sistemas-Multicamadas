package HelloWorld;

public class EscolherForma {
	
	public static void main(String[] args) {
		
		int imprimir = 2;
		
		if (imprimir == 1) {
			CriarArquivo.criarArquivo();
		}
		else {
			Printar.printar();
		}
	}
}