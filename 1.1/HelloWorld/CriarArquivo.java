package HelloWorld;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CriarArquivo {
		
	public static void criarArquivo() {
		try (PrintWriter writer = new PrintWriter(new File("HelloWorld.txt"))) {
		    writer.println("Hello World");
		} catch (FileNotFoundException e) {
			System.out.println("Deu erro ao escrever o arquivo");
			e.printStackTrace();
		}
	}
}
