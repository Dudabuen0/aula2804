import java.util.Scanner;

public class CalculadoraSimples{
       public static void main(String[] args){
        
         //Delacração de variáveis
         int n1, n2, total, op;

         //Criação em instancia do objeto de entrada
         Scanner entrada = new Scanner(System.in);

         do{

            System.out.println("\n\t\t\t -- Calculadora Simples --\n");

            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Sair");

            System.out.print("Opçaõ: ");
            op = entrada.nextInt();

            if(op == 1){
                System.out.println("\n\t\t\t -- Soma -- \n");
            } else if(op == 2){
                System.out.println("\n\t\t\t -- Subtrair -- \n");
            } else if(op == 3){
                System.out.println("Forte abraço");
            }else{
                System.out.println("Opção " + op + "Incorreta");
            }
         }while(op!=3);

    }
} 