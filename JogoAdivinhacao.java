/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
 */
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int contador = 1;
        int tentativa;

        System.out.println(numero);
        while(contador <= 5){
            System.out.println("Qual número? ");
            tentativa = sc.nextInt();
            if(tentativa == numero){
                System.out.println("Acertou número!!!");
                break;
            }
            else if(tentativa < numero){
                System.out.println("Número é Maior!!!");
            }else{
                System.out.println("Número é Menor!!");
            }
            contador++;
        }


        sc.close();
    }
}
