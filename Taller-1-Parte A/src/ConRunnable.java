
import java.util.Scanner;

public class ConRunnable implements Runnable{

	private int maxLimit;
	private int sleep;
	private int ParImpar;
	private boolean EsImpar;


	public ConRunnable (int maxLimit, int sleep,  boolean EsImpar) {

		System.out.println("Extendiendo la clase Thread");
		this.maxLimit = maxLimit;
		this.sleep = sleep;
		this.EsImpar= EsImpar;
	}


	public void run() {

		try {
			
			for (int i = 0; i < maxLimit; i++) {

				if(i%2==0 && !EsImpar) {
					System.out.println("Thread par: "+i);
					Thread.sleep(sleep);
				}
				else if(i%2==1 && EsImpar) {
					System.out.println("Thread Impar: "+i);
					Thread.sleep(sleep);
				}
			}
			
		} catch (Exception e) {
			
		}

	}



	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);


		int max=  input.nextInt();
		int Sleep = input.nextInt();



		Thread tPar = new Thread( new ConRunnable(max,Sleep,false));
		
		Thread tImpar = new Thread( new ConRunnable(max,Sleep,true));

		tImpar.start();
		tPar.start();

	}


}
