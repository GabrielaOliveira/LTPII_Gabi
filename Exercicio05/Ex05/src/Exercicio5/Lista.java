package Exercicio5;

public class Lista {

	public static void main(String[] args) {
		int num [] = {5,1,4,2,7,8,3,6};
		
		int x, aux;
		
		for ( x=7; x>= 4; x--)
		{
			aux = num[x];
			num[x]= num[7-x];
			num[7-x]=aux;
		}
		
		num[2]=num[0];
		num[num[2]] = num[num[1]];
		
		for (x=0; x<9;x++)
		System.out.println (num[x]);

		
		
	}
}

