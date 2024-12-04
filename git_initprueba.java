package git_initprueba;

import java.util.Scanner;

public class git_initprueba {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion, num1, num2, total;
		
		do {
			System.out.println("Menú");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Resta dos números");
			System.out.println("3. Multiplicar dos números");
			System.out.println("4. Dividir dos números");
			System.out.println("5. Salir");
			System.out.println("Elige una opción: ");
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.print("Ingresa un úmero entero: ");
				num1=sc.nextInt();
				System.out.print("Ingresa otro número entero: ");
				num2=sc.nextInt();
				total= num1 + num2;
				System.out.println(total);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.print("Saliendo...");
				break;
			default:
                System.out.print("Opción inválida. Por favor, elige una opción entre 1 y 5.");
        }
    } while (opcion != 5);
			}
		
	}