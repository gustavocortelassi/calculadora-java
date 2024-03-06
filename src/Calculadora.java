import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op, a, b, resultado;
        
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
                    a = scanner.nextInt();

                    System.out.println("Informe o segundo numero a ser somado ");
                    b = scanner.nextInt();
                    
                    resultado = Soma(a, b);

                    System.out.println("O resultado eh: " +resultado);
                    break;

                case 2:
                    System.out.println("Informe o primeiro numero ");
                    a = scanner.nextInt();

                    System.out.println("Informe o segundo numero, a ser subtraido do primeiro");
                    b = scanner.nextInt();

                    resultado = Subtracao(a, b);

                    System.out.println("O resultado eh: " +resultado);
                    break;
                case 3:
                    System.out.println("Informe o numerador ");
                    a = scanner.nextInt();

                    System.out.println("Informe o denominador ");
                    b = scanner.nextInt();

                    resultado = Divisao(a, b);

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

    public static int Subtracao(int a, int b){
        int sub = a - b;
        return sub;
    }

    public static int Divisao(int a, int b){
        int div = a / b;
        return div;
    }

    public static int Multiplicacao(int a, int b){
        int multi = a * b;
        return multi;
    }
}
