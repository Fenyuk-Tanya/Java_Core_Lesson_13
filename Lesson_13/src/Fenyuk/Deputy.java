package Fenyuk;

import java.util.Scanner;

public class Deputy extends Human {

	private String firstName;
	private String lastName;
	private int age;
	private boolean grafter;
	private int grafterSize;
	
	public Deputy(double weight, double height, String firstName, String lastName, int age, boolean grafter) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grafter = grafter;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getGrafterSize() {
		return grafterSize;
	}

	public void setGrafterSize(int grafterSize) {
		this.grafterSize = grafterSize;
	}
	
	public void giveGrafter(){
		if (grafter == false) {
			System.out.println(" Цей депутат не бере хабарів");
		}else if (grafter == true) {
			Scanner sc = new Scanner (System.in);
			System.out.println(" Цей депутат бере хабарі");
			
			int graftSize = sc.nextInt();
			if (graftSize > 5000) {
				System.out.println("Поліція ув'язнить депутата. Сума хабаря = " + graftSize);
			}else {
				grafterSize = graftSize;
			}
			
		}
	}
	
	@Override
	public String toString() {
		return "Deputy [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", grafter=" + grafter
				+ ", grafterSize=" + grafterSize + "]";
	}
	

}
