package HomeWork;

public class HomeWork2 {
	
	public static void main(String[]args) {
		int[][]szamParok=new int[100][2];
		int szamlalo=0;
		
		for(int i=1;i<=100;i++){
			for(int j=i+1;j<=100;j++){
				if(isPrime(i) && isPrime(j) && Math.abs(i-j) == 2){
					szamParok[szamlalo][0]=i;
					szamParok[szamlalo][1]=j;
					szamlalo++;
				}
			}
		}
		
		for(int i=0;i<szamlalo;i++){
			System.out.println(szamParok[i][0]+" "+szamParok[i][1]);
		}
	}
	

	private static boolean isPrime(int number) {
		if(number<2) {
			return false;
		} 
		
		for(int i=2;i*i<=number;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
