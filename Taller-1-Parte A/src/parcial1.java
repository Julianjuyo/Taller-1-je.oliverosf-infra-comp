import java.util.Random;

public class parcial1 extends Thread {

    //No exeder limite de mesas ni comenzales

    private int id ;
    private int C; //comesales

    private static sema semafo;

    // k personas 1<=k <=C 
    public parcial1 (int id , int pC){

        this.id=id;
        this.C=pC;
        
       

    }


	public void run() {

        int numeroPersonas=0;

        semafo.entrar(numeroPersonas);

        semafo.salir(numeroPersonas);

	}

	public static void main(String[] args) {

        parcial1[] t = new parcial1[10];
        int numero;
        sema
      
        parcial1.semafo = new sema(10, 130);


		for (int i = 0; i < t.length; i++) {
			
            numero = (int) (Math.random() * 10) + 1;

			t[i] = new parcial1(i,10);
			t[i].start();
		}



    }

}
