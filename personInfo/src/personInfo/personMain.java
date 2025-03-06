package personInfo;
import java.util.Scanner;

public class personMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int SIZE; person[]person;
		
		
		do {
			SIZE=getArraySize(sc);
			person=new person[SIZE];
			
			getDatas(person, sc);
			printOut(person);
			
			System.out.println("Az adatok sikeresen beolvasva, szeretnéd folytatni? (i/n)");
			
		} while(sc.nextLine().equalsIgnoreCase("i"));
		
		
		sc.close();
		System.out.println("Kilépés...");
		
	}
	
	private static void printOut(person[]persons) {
		System.out.println("--------------- A beolvasott emberek adatai: ---------------");
		for(person p: persons) {
			System.out.println(p.getInformations());
		}
	}
	
	private static int getArraySize(Scanner sc) {
		int num=0;
		do {
			System.out.println("Adja meg, hogy hány ember adatait szeretné beolvasni: ");
			while(!sc.hasNextLine()) {
				System.out.println("Ez nem egy szám, próbáld újra!");
				sc.next();
			} 
			num=sc.nextInt();
		} while(num<1);
		
		return num; 
	}
	
	private static void getDatas(person[]persons, Scanner sc) {
		sc.nextLine();
		
		for(int i=0;i<persons.length;i++) {
			System.out.println((i+1)+". személy adatai: ");
			
			System.out.println("Név: ");
			String name=sc.nextLine();
			
			System.out.println("Súly: (kg): ");
			int weight=getValidInteger(sc);
			
			System.out.println("Magasság: (cm): ");
			int height=getValidInteger(sc);
			sc.nextLine();
			
			persons[i]=new person();
			persons[i].setName(name);
			persons[i].setWeight(weight);
			persons[i].setHeight(height);
			
		}
	}
	
	private static int getValidInteger(Scanner sc) {
		while(!sc.hasNextInt()) {
			System.out.println("Ez nem egy szám, próbáld újra!");
			sc.next();
		}
		return sc.nextInt();
	}

}
