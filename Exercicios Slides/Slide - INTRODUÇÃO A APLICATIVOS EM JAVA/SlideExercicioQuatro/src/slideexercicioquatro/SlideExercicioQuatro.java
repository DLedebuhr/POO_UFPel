// 3. Faça um programa para calcular a média aritmética de duas notas. 
// Também calcule e apresente a nota ponderada, considerando peso 2 e 3, respectivamente.

package slideexercicioquatro;

public class SlideExercicioQuatro {

    public static void main(String[] args) {
        
        float primeiraNota = 8.5f;
        float segundaNota = 7;
        
        float mediaAritmetica = ((primeiraNota + segundaNota ) / 2); 
        
        float mediaPonderada = (((primeiraNota * 2) + (segundaNota * 3)) / 5);
        
        System.out.println("Primeira Nota = " + primeiraNota);
        System.out.println("\nSegunda Nota = " + segundaNota);
        
        System.out.println("\nMedia Aritmetica = " + String.format("%.2f", mediaAritmetica));
        
        System.out.println("\nMedia Ponderada = " + String.format("%.2f", mediaPonderada));
    
    } 
}
