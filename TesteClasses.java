
public class TesteClasses {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("Azure");

		Carro carro1 = new Carro("333-222", "Verde", 2009, "Gasolina", 4, 0, "444-01", "224", 500.0, "BMW", "3000");

		Carro carro2 = new Carro("343-222", "Preto", 2014, "Gasolina", 4, 0, "444-11", "222", 200.0, "Fiat", "Uno");

		
		empresa.addAutomoveis(carro1);
		empresa.addAutomoveis(carro2);
		
		System.out.println(empresa.getAutomoveis().indexOf(carro1));
		System.out.println(empresa.getAutomoveis().indexOf(carro2));
		System.out.println(empresa.getAutomoveis().get(0).getMarca().getModelo().getNomeDoModelo());
		
	}

}
