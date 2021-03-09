public class sema {

    private int M ; //mesas
    private int C; //comesales

    //private static int k; // personas 
    private static int grupos;

    public sema(int M , int M){
        this.M =M;
        This.C=C;
    }

    public synchronized void entrar(int k){

        Object a = new Object(); 

        if(grupos>=M){
            if(k >= C){
                try {
                    a.wait();
                } catch (InterruptedException e) {
                }

            }
        }
        grupos++;
        C= C+k;
    }


    public synchronized void salir(int K){
     
		notify();
        grupos--;
        C=C-K;

    }
}
