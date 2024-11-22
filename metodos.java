import java.util.Scanner;
import java.util.Stack;


public class metodos {
    Scanner sc = new Scanner(System.in);


    public int[] LLenarvector(int dimension, int[] v) {
            for (int i = 0; i < dimension; i++) {
                System.out.print("Ingrese el elemento " + (i + 1) + ": ");

                v[i] = sc.nextInt();
            }
            
        
        return v;
    }
    
    public Stack<Integer> factorial(int[] v) {
   
        Stack<Integer> pila = new Stack<>();

       
        for (int i = 0; i < v.length; i++) {
            int num = v[i];
            int factorial = 1;

    
            for (int j = 1; j <= num; j++) {
                factorial *= j;
            }

          
            pila.push(factorial);
        }

        return pila;
    }

    public void mostrarpila( int[] vector){
        Stack<Integer> pilar = factorial(vector);
        System.out.println(pilar);
    }



}























