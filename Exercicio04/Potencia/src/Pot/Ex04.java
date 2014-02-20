package Pot;
import java.util.Scanner;


public class Ex04 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner m = new Scanner (System.in);
		
		
		int num, x;
		
		System.out.println("Entre com um numero:  ");
		num = m.nextInt();
		
		int vet[] = new int [num];
		
		for (x=0; x < vet.length; x++)
		{
			int aux = x*x;
			if ( aux == num) break;
			
			System.out.println(aux);
			
			
			
		}
		System.out.println(num);
	}

}
