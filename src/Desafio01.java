import java.util.Scanner;
public class Desafio01 {

        static int sequenciaFibo(int numero) {
            if (numero == 1 || numero == 2) return 1;
            else return sequenciaFibo(numero-1) + sequenciaFibo(numero-2);

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escreva a posição para saber o número na sequência de fibonacci: ");
            System.out.println(sequenciaFibo(sc.nextInt()));
            sc.close();
        }

    }

