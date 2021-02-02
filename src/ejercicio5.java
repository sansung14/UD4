import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		int A;
		int B;
		int C;
		int D;
        System.out.println ("Introduce valor A:");
        Scanner teclado = new Scanner (System.in);
        A = teclado.nextInt();
        System.out.println ("Introduce valor B:");
        B = teclado.nextInt();
        System.out.println ("Introduce valor C:");
        C = teclado.nextInt();
        System.out.println ("Introduce valor D:");
        D = teclado.nextInt();
		System.out.println("Valor A = "+A);
		System.out.println("Valor B = "+B);
		System.out.println("Valor C = "+C);
		System.out.println("Valor D = "+D);
		
		int A2=A;
		int B2=B;
		int C2=C;
		int D2=D;
		
		B=C2;
		C=A2;
		A=D2;
		D=B2;
		
		System.out.println("Sustitución:");
		
		System.out.println("Valor A = "+A);
		System.out.println("Valor B = "+B);
		System.out.println("Valor C = "+C);
		System.out.println("Valor D = "+D);
		
	}
}
