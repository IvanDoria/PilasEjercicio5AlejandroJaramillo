import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            metodos m = new metodos();
            int dimension = 0;
            System.out.println("Ingrese la dimension del vector");
            dimension = sc.nextInt();
            int[] vector = new int[dimension];
            m.LLenarvector(dimension, vector);
            System.out.print("[");
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.println("]");
   
            
            System.out.println("Su pila con factoriales es: ");
            m.mostrarpila(vector);
        }

       
    


      
    }

   
}