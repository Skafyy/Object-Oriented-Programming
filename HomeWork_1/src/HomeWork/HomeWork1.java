package HomeWork;
import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[]args) {
		
		int number=getScannedInteger();
		
		int[]numbers=generateNumbers(number);
		
		printOutNumbers(numbers);
		
	}
	
	private static int getScannedInteger() {
		Scanner input=new Scanner(System.in);
		int number=0;
		
		do {
			System.out.print("Give a number: ");
			while(!input.hasNextInt()){
				System.out.println("This is not a number");
				input.next();
			} number=input.nextInt();
			
		} while(number>10000); //Valami utasítás, hogy ne legyen sok az output 
		
			input.close();
		
		return number;
	}
	
	private static int[] generateNumbers(int num) {
		int[]number=new int[num];
		
			for(int i=0;i<number.length;i++){
				number[i]=i+1;
			}
		
		return number;
	}
	
	private static void printOutNumbers(int[] numbers){
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		} 
	}

}
