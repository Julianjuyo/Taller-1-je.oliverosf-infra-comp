import java.util.Scanner;

public class Ejercicio extends Thread{

	private int maxLimit;
	private int Sleep;
	private int ParImpar;


	public Ejercicio (int maxLimit, int Slepp) {

		System.out.println("Extendiendo la clase Thread");
		this.maxLimit = maxLimit;
	}


	public void run() {

		
		for (int i = 0; i < maxLimit; i++) {
		
			
			
			if(i%2==0) {
				
			}
			else if(i%2==1) {
				
			}
		}
		
		System.out.println(ParImpar);


	}



	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		int max=  input.nextInt();
		int Sleep = input.nextInt();
		
		
		
		Ejercicio t = new Ejercicio(max,Sleep);

		Ejercicio t2 = new Ejercicio(max,Sleep);

		t.start();
		



	}


}
