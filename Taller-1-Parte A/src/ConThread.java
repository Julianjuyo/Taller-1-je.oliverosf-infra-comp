import java.util.Scanner;

public class ConThread extends Thread{

	private int maxLimit;
	private int sleep;
	private boolean EsImpar;


	public ConThread (int maxLimit, int sleep, boolean EsImpar) {

		System.out.println("Extendiendo la clase Thread");
		this.maxLimit = maxLimit;
		this.sleep = sleep;
		this.EsImpar = EsImpar;
		
	}


	public void run() {

		try {
			
			for (int i = 1; i <=maxLimit ; i++) {
				
				if(i%2==0 && !EsImpar) {
					System.out.println("Thread par: "+i);
					Thread.sleep(sleep);
				}
				else if(i%2==1 && EsImpar) {
					System.out.println("Thread impar: "+i);
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



		ConThread tPar = new ConThread(max,Sleep,false);
		ConThread tImpar = new ConThread(max,Sleep, true);

		tImpar.start();
		tPar.start();

	}


}
