package Fib;
import java.util.Scanner;

public class Fibonacci {
	
	
		public static void main(String[] args) {
			Scanner fib = new Scanner (System.in);
			int num, primeiro=0, segundo=1, terceiro, x=1;
			
			System.out.println("Entre com um numero: ");
			num = fib.nextInt();
	
			
			if (num < 20)
			{	
				while (x < num)
				{
					terceiro= segundo+primeiro;
					primeiro=segundo;
					segundo=terceiro;
					x++;
				}
				
			}
			
			else
			{
				System.out.println("Entre com um numero menor que 20: ");
				num = fib.nextInt();
				
			}
			
				
			System.out.printf("Numero %dº de Fibonacci é o: %d ", num, segundo);
			
			
			
			
			
			
			
			
		}

	}



