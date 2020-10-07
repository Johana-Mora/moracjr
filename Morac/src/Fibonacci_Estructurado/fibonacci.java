package Fibonacci_Estructurado;

public class fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Programa que muestra la serie de numeros de fibonacci hasta el 10.");
		int Valor1 = 0;
		int Valor2 = 1;
		int Valor3;
		//System.out.println(Valor1);
		//System.out.println(Valor2);

		do
		{       
		    Valor3 = Valor1 + Valor2;
		    System.out.println(Valor3);

		    Valor2 = Valor1;
		    Valor1 = Valor3;          
		} while (Valor1 <= 10);
		

	}

}
