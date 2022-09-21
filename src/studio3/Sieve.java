package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Andy = new Scanner(System.in);

		int number = Andy.nextInt();
		int input[] = new int [number];
		
		for (int i =0; i<number; i++) {
		input[i] = i+1;
		}
		
		int output[] = new int [number];
		
		for (int p =0; p<number; p++) {
			if(input[p]%2!=0 || input[p]==2) {
				output[p]=input[p];
			}
			 if(input[p]%3!= 0 || input[p]==3) {
				output[p]=input[p];
			}
			 if(input[p]%5!=0 || input[p]==5) {
				output[p]=input[p];
			}
			 if(input[p]%7!=0 || input[p]==7) {
					output[p]=input[p];
				}
			if(input[p]%2==0 ||input[p]%3==0 ||input[p]%5==0||input[p]%7==0)
				output[p]= 0;
		}
		
		output[1]=2;
		output[2]=3;
		output[4]=5;
		output[6]=7;

		for (int k =0; k<number; k++) {
System.out.print(output[k]+" ");	
}	
	}

}
