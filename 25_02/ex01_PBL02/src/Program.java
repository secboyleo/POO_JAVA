import java.util.Scanner;
import java.util.Random;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de itens para a lista: ");
        int n = sc.nextInt();
        Random numero = new Random();
        int[] vetor = new int[n];

        for(int i=0; i<vetor.length; i++){
            vetor[i] = numero.nextInt(0, 100);
        }

        for(int i=0; i< vetor.length; i++){
            if(vetor[i] % 3 == 0){
                System.out.println(vetor[i] + " = DIVISIVEL POR 3");
            } else if(vetor[i] % 2 == 0){
                System.out.println(vetor[i] + " = PAR");
            } else {
                System.out.println(vetor[i] + " = IMPAR");
            }
        }

            sc.close();
    }
}
