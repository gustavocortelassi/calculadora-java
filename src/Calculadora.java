import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op;
        
        do{
            System.out.println("--- CALCULADORA ---");
            System.out.println("Informe a operação que deseja realizar: ");
            System.out.println("1. Soma ");
            System.out.println("2. Subtracao");
            System.out.println("3. Divisao");
            System.out.println("4. Multiplicacao");
            System.out.println("0. Sair");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Informe o primeiro numero a ser somado ");
                    int a = scanner.nextInt();

                    System.out.println("Informe o segundo numero a ser somado ");
                    int b = scanner.nextInt();
                    
                    int resultado = Soma(a, b);

                    System.out.println("O resultado eh: " +resultado);
                    break;
            
                default:
                    break;
            }

        } while (op != 0);
    }

    public static int Soma(int a, int b){
        int soma = a + b;
        return soma;
    }
}
