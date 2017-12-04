/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author João Miranda
 */
public class AdventOfCode2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int menu = 0, menuTrue = 0, parte = 0, resultado = 0;
        Scanner sc = new Scanner(System.in);

        while (menuTrue == 0) {
            System.out.print("Choose a day!\n0 to exit.\n> ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    Day1 day1 = new Day1();
                    resultado = day1.menu();
                    System.out.println("O resultado é: " + resultado);
                    break;
                case 0:
                    menuTrue = 1;
                    break;
                default:
                    break;
            }
        }
    }

}
