import java.util.Scanner;
import java.util.Random;
public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random numero = new Random();

        System.out.print("Numero de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Numero de colunas: ");
        int colunas = sc.nextInt();
        System.out.println(" ");

        int[][] vetor = new int[linhas][colunas];

        for(int i=0; i<linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[i][j] = numero.nextInt(0, 10);
            }
        }

        for(int i=0; i<linhas; i++){
            int somaLinhas = 0;
            int somaColunas = 0;

            for(int j=0; j<colunas; j++){
                somaLinhas += vetor[i][j];
                somaColunas += vetor[j][i];
            }
            System.out.println("SOMA DA LINHA " + (i + 1) + " = " + somaLinhas);
            System.out.println("SOMA DA COLUNA " + (i + 1) + " = " + somaColunas);
            System.out.println(" ");
        }

        for(int l=0; l<linhas; l++){
            for(int j=0; j<colunas; j++){
                System.out.print(vetor[l][j] + " ");
            }
            System.out.println(" ");
        }

        sc.close();
    }
}