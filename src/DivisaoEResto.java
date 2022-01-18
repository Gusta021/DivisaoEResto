import java.util.Scanner;

import javax.print.event.PrintEvent;
import javax.sound.sampled.SourceDataLine;

public class DivisaoEResto {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        int num = scan.nextInt();
        System.out.println("Digite o denominador: ");
        int den = scan.nextInt();
        float res = num / den;
        float resto = num % den;
        System.out.println("O resultado da divisão é: " + res);
        System.out.println("E o resto da divisão é: " + resto);
    }
}
