package Estagio;

public class TesteFibonacci {

    private static int[] vetAux = new int[50];
    private static int k;

    public static long fibo(int n) {
             k = 1; // inicializa k
             return recursao(n);
           }

    private static long recursao(int n) {
            if (n < 0) {
               return vetAux[0];
          } else {
           if (k < 3) {
              vetAux[n] = k - 1;
              k++;
           } else {
                 vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
                 }
              return recursao(n - 1);
           }
    }

    public static void main(String[] args) {
    	int busca = 3;  // Numero para busca Fibonacci 
    	int contador = 40;
    	boolean h = false;
    for (int i = 0; i < contador; i++) {
        System.out.print("(" + i + "):" + TesteFibonacci.fibo(i) + "\t");
        if(busca == TesteFibonacci.fibo(i)) {
        	h=true;
        }
       
        }
    if(h==true) {
    	System.out.println("\nnumero Fibonacci");
    }else {
    	System.out.println("\nnumero nao Fibonacci");
    }
    }
}