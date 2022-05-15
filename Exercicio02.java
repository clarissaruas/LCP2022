
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbgru
 */
public class Exercicio02 {
    
    static int soma (int num1, int num2, int num3){
        return (int) (num1+num2+num3);
    }
    
    static int produto (int num1, int num2, int num3){
        return (int) (num1*num2*num3);
    }
    
    static float media (int num1, int num2, int num3){
        return (float) ((num1*num2*num3)/3);
    }
    
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite três números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        int soma_num = soma(num1, num2, num3);
        System.out.printf("A soma dos números é %d\n", soma_num);
        int prod_num = produto(num1, num2, num3);
        System.out.printf("O produto dos números é %d\n", prod_num);
        float media_num = media(num1, num2, num3);
        System.out.printf("A médias dos números é %f\n", media_num);
        
        if (num1<num2)
            if (num2<num3)
                System.out.printf("Os números em ordem crescente são %d, %d, %d.\n", num1, num2, num3);
            else if (num1<num3)
                System.out.printf("Os números em ordem crescente são %d, %d, %d.\n", num1, num3, num2);
                else
                    System.out.printf("Os números em ordem crescente são %d, %d, %d.\n", num3, num1, num2);
        else
            if (num2<num3)
                if (num1<num3)
                    System.out.printf("Os números em ordem crescente são %d, %d, %d.\n", num2, num1, num3);
                else
                    System.out.printf("Os números em ordem crescente são %d, %d, %d.\n", num2, num3, num1);
            else
                System.out.printf("Os números em ordem crescente são %d, %d, %d.\n", num3, num2, num1);
    }
}
