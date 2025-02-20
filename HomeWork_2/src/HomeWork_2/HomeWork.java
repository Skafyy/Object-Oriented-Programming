package HomeWork_2;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in); int sor,oszlop,keresettElem;
		
		System.out.println("Adja meg a sorok számát: ");
			sor=sc.nextInt();
		System.out.println("Adja meg az oszlopok számát: ");
			oszlop=sc.nextInt();
			
		
		int[][]matrix=fillTheArray(sor, oszlop);
		printTheArray(matrix);
		
		keresettElem=searchedNumber(sc);
		
		if(linearSearch(matrix, keresettElem)==true) {
			System.out.println("Létezik ilyen elem.");
		} else {
			System.out.println("Nem létezik ilyen elem.");
		}
		
		sc.close();
	}
	
	private static int[][] fillTheArray(int sor, int oszlop) {
		
		Random rand=new Random();
		int[][]matrix=new int[sor][oszlop];
		
		for(int i=0;i<sor;i++) {
			for(int j=0;j<oszlop;j++) {
				matrix[i][j]=rand.nextInt(100);
			}
		}
		return matrix;
	}
	
	private static void printTheArray(int[][]matrix) {
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}System.out.println();
		} 
	}
	
	private static int searchedNumber(Scanner sc){
		int num=0; 
		
		do {
			System.out.println("Adja meg a keresendő elemet: ");
			
			while(!sc.hasNextInt()) {
				System.out.println("Ez nem egy szám. Próbálja újra!");
				sc.next();
			}
			num=sc.nextInt();
			
		} while(num<0);
		
		return num;
	}
	
	private static boolean linearSearch(int[][]matrix, int num) {
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==num) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}



	
