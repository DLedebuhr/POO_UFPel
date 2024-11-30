// 6. Faça um programa que calcule o fatorial.

package slideexerciciosete;

public class SlideExercicioSete {

    public static void main(String[] args) {
        
        int numero = 4;
        int fatorial = numero;
        
        int i;
      
        for (i = numero; i > 1; i--){
            
            fatorial *= i - 1;
            
        }
        
        System.out.println("Fatorial de " + numero + " = " + fatorial);
        
    }
}
