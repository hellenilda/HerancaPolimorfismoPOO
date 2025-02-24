package animais2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		ArrayList<Animal> animais = new ArrayList();

		for (int i = 0; i < 10; i++) {
			System.out.println("1- Cachorro \n2- Peixe \nDigite a opção que deseja cadastrar: ");
			int tipo = leitor.nextInt();
			leitor.nextLine();

			System.out.println("\nDigite o nome do animal:");
			String nome = leitor.nextLine();
			System.out.println();

			if (tipo == 1) {
				Cachorro cachorro = new Cachorro(nome);
				animais.add(cachorro);

			} else if (tipo == 2) {
				Peixe peixe = new Peixe(nome);
				animais.add(peixe);
			} else {
				System.out.println("Opção inválida. Tente novamente");
				i--;
			}

		}

		System.out.println("Animais cadastrados:" + animais.toString() + "\n");

		int quantCachorros = 0;
		int quantPeixes = 0;

		for (Animal animal : animais) {
			if (animal instanceof Cachorro) {
				quantCachorros++;
			} else if (animal instanceof Peixe) {
				quantPeixes++;
			}
		}

		System.out.println("Total de cachorros: " + quantCachorros);
		System.out.println("Total de peixes: " + quantPeixes + "\n");
	}
}