// 2. Calcule o IMC.

// Condição        IMC em Mulheres
// Magro           peso < 20
// Normal          20 <= peso < 25
// Acima do peso   25 <= peso < 29
// Obeso           29 <= peso < 30
// Muito obeso     peso >= 30

package slideexerciciodois;

public class SlideExercicioDois {

    public static void main(String[] args) {
        
        float Peso = 52;
        float Altura = 1.65f;
        float Resultado = (Peso / (Altura * Altura));
        
        System.out.println("IMC = " + String.format("%.2f", Resultado));
        
        if (Resultado < 20) {
            
            System.out.println("Condicao = Magra");
            
        } else if (Resultado < 25) {
            
            System.out.println("Condicao = Normal");
            
        } else if (Resultado < 29) {
            
            System.out.println("Condicao = Acima do Peso");
            
        } else if (Resultado < 30) {
            
            System.out.println("Condicao = Obeso");
            
        } else if (Resultado >= 30) {
            
            System.out.println("Condicao = Muito Obeso");
            
        }
    }     
}
