// 4. Escreva um programa que dado três números inteiros, apresente o menor deles e todos que são positivos.

package slideexerciciocinco;

public class SlideExercicioCinco {

    public static void main(String[] args) {
     
        int a = 4;
        int b = 3;
        int c = 2;
        
        if (a < b && a < c) {
            
            System.out.println("Menor numero: " + a);
            
        } else if (b < a && b < c) {
            
            System.out.println("Menor numero: " + b);
            
        } else if (c < b && c < a) {
            
            System.out.println("Menor numero: " + c);
            
        }
        
        System.out.print("\nNumeros positivos:");
        
        if (a > 0) {
            
            System.out.print(" [ " + a + " ]");
            
        } if (b > 0){
            
            System.out.print(" [ " + b + " ]");
            
        } if (c > 0){
            
            System.out.println(" [ " + c + " ]");
            
        }
    }
}
