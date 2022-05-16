
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbgru
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 20: ");
        int num = scan.nextInt();
        if (num > 20)
            System.out.print("Número digitado é inválido");
        for (int i = 0; i < num; i++){
            int z;
            for (z=0; z < i+1; z++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
