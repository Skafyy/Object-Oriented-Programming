package MasodfokuEgyenletMegoldo;
import java.util.Scanner;
import java.math.*;

public class Megoldo {

	public static void main(String[] args) {
		Scanner inputValues=new Scanner(System.in);
		boolean status=true;
		
		
		
		while(status) {
			int[]numbers=getNumbers(inputValues);
			int a=numbers[0];
			int b=numbers[1];
			int c=numbers[2];
			calculateTheSolution(a,b,c);
			
			System.out.println("Szeretnél még egy egyenletet megoldani? (igen/nem): ");
			String response=inputValues.nextLine().trim().toLowerCase();
			response.equals("igen");
		} 
		
		System.out.println("köszönöm, hogy használtad a programot!");
		
		inputValues.close();
	}

	public static int[] getNumbers(Scanner inputValues) {
		boolean status; int[]egyutthatok=new int[3]; 
			
			do {
				System.out.println("Az egyenlet konstansai vesszővel elválasztva: (például: 1,2,3)");
				String readedString=inputValues.nextLine();
				String[]cutter=readedString.split(",");
				status=true;
				
				try {
					egyutthatok[0]=Integer.parseInt(cutter[0]);
					egyutthatok[1]=Integer.parseInt(cutter[1]);
					egyutthatok[2]=Integer.parseInt(cutter[2]);
				
					if(egyutthatok[0]==0) {
						throw new IllegalArgumentException("Az 'a' együttható"
								+ "nem lehet nulla!");
					}
					
				} catch(NumberFormatException | ArrayIndexOutOfBoundsException ex) {
						status=false;
						System.out.println("Hiba történt: "+ex.getMessage());
				}	
				 catch(IllegalArgumentException ex) {
					status=false;
					System.out.print("Hiba történt: "+ex.getMessage());
				}
			} while(!status);
			
	
			
			return egyutthatok;
	}
	
	public static double calculateDiscriminatory(int a,int b, int c) {
		return (double)(b*b)-4*(double)a*(double)c;
	}
	
	public static void calculateTheSolution(int a, int b, int c) {
		
		double diszkriminans=calculateDiscriminatory(a,b,c);
		
		if(diszkriminans>0) {
			double solution1=(-b+Math.sqrt(diszkriminans)/(2*a));
			double solution2=(-b-Math.sqrt(diszkriminans)/(2*a));
			System.out.println("Két valós gyök: "+solution1+" és "+solution2);
		} else if(diszkriminans==0) {
			double solution=-b/(2.0*a);
			System.out.println("Egy valós gyök: "+solution);
		} else {
			System.out.println("Nincsenek valós gyökök.");
		}
		
	}
}
