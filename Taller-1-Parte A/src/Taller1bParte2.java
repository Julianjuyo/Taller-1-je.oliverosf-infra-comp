import java.util.Scanner;

public class Taller1bParte2 extends Thread {


	private static int contador = 0;


	public void run() {

		System.out.println("COMENZO EN"+contador);
		for (int i = 0; i < 10000 ; i++) {
			contador++;
			
		}

	}



	public static void main (String[] args) {


		Taller1bParte2[] t = new Taller1bParte2[1000];

		for (int i = 0; i < t.length; i++) {
			

			t[i] = new Taller1bParte2();
			t[i].start();
		}
		
		System.out.println(contador);

	}

}
