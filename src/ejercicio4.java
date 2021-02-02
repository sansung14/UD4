import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		int N = 0;
        System.out.println ("Por favor introduzca un valor:");
        Scanner teclado = new Scanner (System.in);
        N = teclado.nextInt();
		System.out.println("Valor incial de N = "+N);
		System.out.println("N + 77 = "+(N+77));
		System.out.println("N - 3 = "+(N-3));
		System.out.println("N * 2 = "+(N*2));
	}
}
