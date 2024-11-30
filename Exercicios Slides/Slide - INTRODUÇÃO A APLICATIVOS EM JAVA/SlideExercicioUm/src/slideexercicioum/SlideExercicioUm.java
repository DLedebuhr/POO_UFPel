// 1. Faça um programa que imprima as tabuadas do 1 até 10 (as 10 primeiras linhas de cada tabuada).

package slideexercicioum;

public class SlideExercicioUm {

    public static void main(String[] args) {
        
        int i, j;
      
        for (i = 0; i <= 10 ; i++){
            
            System.out.println("-- Tabuada do " + i + "\n");
            
            for (j = 0; j <= 10; j++){
                
                System.out.println("[ " + i + " ] x [ " + j + " ] = [ " + (i * j) + " ]"); 
                
            }
            
            System.out.println();
            
        }      
    }
}
