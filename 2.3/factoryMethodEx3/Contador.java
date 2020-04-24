package factoryMethodEx3;

public class Contador {	

	public static void main(String[] args) {
		int i;

		for(i=1; i<=10; i++) {
			System.out.println(i);
		}
		new SalvarLog.Salvar();
	}
}