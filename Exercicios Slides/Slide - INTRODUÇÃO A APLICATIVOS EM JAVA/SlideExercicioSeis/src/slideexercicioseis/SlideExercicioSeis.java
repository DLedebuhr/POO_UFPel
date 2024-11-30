//5. Faça um programa que verifique se um número é primo.

package slideexercicioseis;

public class SlideExercicioSeis {

    public static void main(String[] args) {
        
        int numero = 13;
        int cont = 0;
        int i;
        
        for (i = 1; i <= numero; i++){
            
            if (numero % i == 0) {
                
                cont++;
                
            }
        }
        
        if (cont == 2){
            
            System.out.println("Primo: " + numero);
            
        } else {
            
            System.out.println("N Primo: " + numero);
            
        }    
    }   
}
