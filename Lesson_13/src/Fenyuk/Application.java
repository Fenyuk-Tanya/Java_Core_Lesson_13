package Fenyuk;

import java.util.Scanner;

public class Application {
	
	public static void menu() {
		System.out.println("Введіть 1, щоб додати фракцію в Верховну Раду.");
		System.out.println("Введіть 2, щоб видалити фракцію з Верховної Ради.");
		System.out.println("Введіть 3, щоб показати всі фракції в Верховній Раді.");
		System.out.println("Введіть 4, щоб видалити введену фракцію.");
		System.out.println("Введіть 5, щоб показати введену фракцію.");
		System.out.println("Введіть 6, щоб додати депутата до фракції.");
		System.out.println("Введіть 7, щоб видалити депутата з фракції.");
		System.out.println("Введіть 8, щоб показати список хабарників.");
		System.out.println("Введіть 9, щоб показати найбільшого хабарника.");
	}

	public static void main(String[] args) {
		
		Faction faction;
		VerhovnaRada Verhovna = VerhovnaRada.getInstance();

		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				Verhovna.addFaction();
				break;
			}
			case "2": {
				Verhovna.removeFaction();
				break;
			}
			case "3": {
				Verhovna.displayAllFaction();
				break;
			}
			case "4": {
				Verhovna.removeDeputyFromSingleFaction();
				break;
			}
			case "5": {
				Verhovna.displayFaction();
				break;
			}
			case "6": {
				Verhovna.addDeputyToSingleFaction();
				break;
			}
			case "7": {
				Verhovna.removeDeputyFromSingleFaction();
				break;
			}
			case "8": {
				Verhovna.displayAllGrafterInFaction();
				break;
			}
			case "9": {
				Verhovna.displayMostGrafterInFaction();
				break;
			}
			}
			System.out.println();
		}

	}

}
