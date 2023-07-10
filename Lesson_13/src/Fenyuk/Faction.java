package Fenyuk;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Faction {
	
	private String factionName;

	private ArrayList<Deputy> faction = new ArrayList<>();

	public Faction(String factionName) {
		super();
		this.factionName = factionName;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public ArrayList<Deputy> getFaction() {
		return faction;
	}

	public void setFaction(ArrayList<Deputy> faction) {
		this.faction = faction;
	}

	public void addDeputy() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть ім'я депутата");
		String firstName = scan.nextLine();

		System.out.println("Введіть прізвище депутата.");
		String lastName = scan.nextLine();

		System.out.println("Введіть вік депутата.");
		int age = scan.nextInt();

		System.out.println("Введіть ріст депутата");
		double height = scan.nextDouble();

		System.out.println("Введіть вагу депутата.");
		double weight = scan.nextDouble();

		System.out.println("Введіть, чи бере депутат хабарі (true/false).");
		boolean giveGrafter = scan.hasNextBoolean();

		try {
			Deputy DB = new Deputy(weight, height, firstName, lastName, age, giveGrafter);
			faction.add(DB);
		} catch (Exception ex) {
			System.out.println("Депутат не прийнятий у фракцію.");
		}

		System.out.println("Депутат " + firstName + " " + lastName + " прийнятий у фракцію.");
	}

	public void removeDeputy() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть ім'я депутата.");
		String firstName = scan.nextLine();

		System.out.println("Введіть прізвище депутата.");
		String lastName = scan.nextLine();

		System.out.println("Введіть вік депутата.");
		int age = scan.nextInt();

		Iterator<Deputy> iterator = faction.iterator();
		while (iterator.hasNext()) {
			Deputy DB = iterator.next();
			if (DB.getFirstName().equalsIgnoreCase(firstName) && DB.getLastName().equalsIgnoreCase(lastName)
					&& DB.getAge() == age) {
				iterator.remove();

				System.out.println("Депутат " + firstName + " " + lastName + " видалений з фракції.");
			}
		}
		System.out.println("Введеного депутата немає в даній фракції.");
	}

	public void displayAllGrafters() {

		Iterator<Deputy> iterator = faction.iterator();
		while (faction.iterator().hasNext()) {
			Deputy displayGraftersMP = iterator.next();
			if (displayGraftersMP.isGrafter()) {
				System.out.println(displayGraftersMP);
			}
		}
	}

	public Deputy displayMostGrafter() {
		return Collections.max(faction, new DeputySizeOfGrafterComperator());
	}

	public void displayAllDeputis() {
		Iterator<Deputy> iterator = faction.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void clearFaction() {
		faction.clear();
	}

	@Override
	public String toString() {
		return "[Фракція  " + factionName + "]";
	}
	
}
