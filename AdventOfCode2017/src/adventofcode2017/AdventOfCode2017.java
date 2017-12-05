/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

import java.util.Scanner;

/**
 *
 * @author João Miranda
 */
public class AdventOfCode2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day, menu = 0, parte = 0, resultado = 0;
        Scanner sc = new Scanner(System.in);
        String input;

        while (menu == 0) {

            System.out.print("Choose a day!\n0 to exit.\n> ");
            day = sc.nextInt();
            if (day != 0) {
                System.out.print("Choose a part!\n0 to exit.\n> ");
                parte = sc.nextInt();
            }

            if (day != 0 && parte != 0) {
                System.out.print("Input your number!\n> ");
                input = sc.next();

                switch (day) {
                    case 1:
                        Day1 day1 = new Day1();
                        resultado = day1.menu(parte, input);
                        break;

                    case 2:
                    default:
                        break;
                }
            } else {
                menu = 1;
            }
            if (resultado != 0) {
                System.out.println("Here's the output: " + resultado);
            }
        }

        System.out.println("Goodbye!");
    }

}
