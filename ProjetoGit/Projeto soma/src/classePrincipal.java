import java.util.Scanner;

public class ClassePrincipal {
	
	public static void main(String[] args){
		
		while (true){
			System.out.println("informe a calculadora");
			Scanner sc = new Scanner (System.in);
			int numero = sc. nextInt();
			
			for(int i=0; i<=10; i++){
				System.out.println(numero +"*"+ i + "=");
				System.out.println(numero * i);
			}
			
			break;
		}

	}

}
