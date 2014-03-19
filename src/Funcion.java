import java.util.Scanner;


public class Funcion {
//primero creo la funcion que se llamara somos iguales
	static void Somosiguales () 
	
	{
		Scanner mi_scanner= new Scanner(System.in);
		//aqui creo dos variables int
		int a; int b;
		System.out.println("Ingrese un numero: ");
		a=mi_scanner.nextInt();
		System.out.println("Ingrese otro numero: ");
		b=mi_scanner.nextInt();
		//con un if logro ver so los numeros son iguales (verdaderos) de lo contrario con el else son (falsos)
		if(a==b)
		{
			System.out.println("Verdadero");
		}else
		{
			System.out.println("Falso");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Somosiguales();
		
	}

}
