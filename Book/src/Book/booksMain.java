package Book;
import java.util.Scanner;

public class booksMain {

	public static void main(String[] args) {
		books konyvek=new books();
		Scanner sc=new Scanner(System.in);
		
		konyvek.setCim("Abraka Dabra");
		konyvek.setMegjelenes(2021);
		konyvek.setSzerzo("Varga István Hunor");
		konyvek.setAr(19000);
		
		System.out.println("A könyv adatai: ");
		System.out.println(konyvek.getInformations());
		
		int cost=getIncrease(sc);
		int newCost=konyvek.increaseCost(cost);
		System.out.println("Megnövelt ár "+cost+"%-al: "+newCost);
	}
	
	private static int getIncrease(Scanner sc) {
		int num=0;
		do {
			System.out.println("Add meg, hogy hány százalékkal szeretnéd növelni a könyv árát: ");
			while(!sc.hasNextLine()) {
				System.out.println("Nem jó a bevitt adat! Próbáld újra!");
				sc.next();
			}
			num=sc.nextInt();
		} while(num<1);
		
		
		return num;
	}

}
