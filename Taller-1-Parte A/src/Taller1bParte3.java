
import java.util.concurrent.ThreadLocalRandom;


public class Taller1bParte3 extends Thread {
	

	private final static int INT_MAX =105345;

	private final static int DIM = 3;

	private static int[][] matriz = new int[DIM][DIM];

	private static Maximo mayor = new Maximo() ;
	

	private  int mayorFila = -1;
	
	private  int idThread ;

	private  int fila ;
	
	

	public Taller1bParte3 (int pIdThread, int pFila) {
		this.idThread = pIdThread;
		this.fila = pFila;
	}


	public static void crearMatriz() {
		for (int i = 0; i < DIM; i++) {
			for (int j = 0; j < DIM; j++) {
				matriz[i][j]= ThreadLocalRandom.current().nextInt(0,INT_MAX);
			}
		}

		System.out.println("Matriz");
		System.out.println("============================");
		ImprimirMatriz();
	}

	public static void ImprimirMatriz() {
		for (int i = 0; i < DIM; i++) {
			for (int j = 0; j < DIM; j++) {

				System.out.println(matriz[i][j]+"\t");
			}
		}
		System.out.println();
	}

	
	@Override
	public void run() {

		for (int i = 0; i < DIM; i++) {
			if(this.mayorFila < matriz[this.fila][i]) {
				this.mayorFila = matriz[this.fila][i];
			}
		} 
		if( this.mayorFila >mayor) {
			try {
				Thread.sleep(250);
			} catch (Exception e) {
				e.printStackTrace();
			}

			mayor = this.mayorFila;

			String warn = String.format(
					"============ Nuevo maximo encontrado ========== \n"+
							"ID Thread: %d - Maximo local actual: %d - Maximo global: %d \n"+
							"\n",
							this.idThread,
							mayor,
							this.mayorFila


					);
			System.out.println(warn);

			String msg = String.format("ID Thread: %d - Maximo local actual: %d - Maximo global: %d",
					this.idThread,
					this.mayorFila,
					mayor);
			System.out.println(msg);

		}

	}


	public static void main (String[] args) {
		
		System.out.println("Busqueda concurrente por una matriz");
		
		
		Taller1bParte3.crearMatriz();
		System.out.println();
		System.out.println("Iniciando la busqueda por la matriz \n");
		
		Taller1bParte3[] bThreads = new Taller1bParte3[DIM];
		
		for (int i = 0; i < DIM; i++) {
			bThreads[i] = new Taller1bParte3(i,i);
			bThreads[i].start();
		}
		
	}


}
