// 3. Faça um programa que atribua valores para os coeficientes (a, b, c) de uma equação do segundo grau, 
// calcule e exiba o valor de seu discriminante
// Obs: o usuário não irá digitar nada

package slideexerciciotres;
       
import java.util.Random;
        
public class SlideExercicioTres {
    
    public static void main(String[] args) {
        
        Random random = new Random ();
        
        int a = random.nextInt(201) - 100; // Atribui um numero de -100 a 100
        int b = random.nextInt(201) - 100; // Atribui um numero de -100 a 100
        int c = random.nextInt(201) - 100; // Atribui um numero de -100 a 100 
        
        int delta = ((b * b) - (4 * a * c));
        
        System.out.println("Valor das variaveis: \n");
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("\nResultado:\n");
        
        System.out.println("Delta = " + delta);
        
    }
}
