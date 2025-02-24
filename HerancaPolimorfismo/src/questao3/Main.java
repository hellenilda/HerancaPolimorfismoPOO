package questao3;

public class Main {
	public static void main(String[] args) {
		Animal peixe = new Peixe("Atum rabilho do Atlântico", 60.00, "Oceano Atântico");
		Animal cachorro = new Cachorro("Belinha", 3.00, "Pinscher");
		
		System.out.println(peixe);
		System.out.println(cachorro);
	}
}