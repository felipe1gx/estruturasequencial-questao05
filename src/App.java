import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        int cent, met;
        System.out.println("Digite a medida em Metros: ");
        met = console.nextInt();
        cent = met * 100;
        System.out.println("A medida: " + met + " em Centímetros é igual a: " + cent);
    }
}
