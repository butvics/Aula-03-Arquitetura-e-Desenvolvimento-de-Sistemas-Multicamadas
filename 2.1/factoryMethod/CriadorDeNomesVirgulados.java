package factoryMethod;

public class CriadorDeNomesVirgulados implements CriadorDeNomes{

	@Override
	public Nome criar(String s) {
		//Elias, Kaue
		String[] sep = s.split(", ");
		return new Nome (sep[1], sep [0]);
	}
	
}
