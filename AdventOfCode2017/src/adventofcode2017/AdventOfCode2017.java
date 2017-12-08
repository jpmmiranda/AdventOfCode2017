/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        int day, menu = 0, parte = 0, resultado = 0;
        Scanner sc = new Scanner(System.in);
        String input;
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (menu == 0) {

            System.out.print("Choose a day!\n0 to exit.\n> ");
            day = sc.nextInt();
            if (day != 0) {
                System.out.print("Choose a part!\n0 to exit.\n> ");
                parte = sc.nextInt();
            }

            if (day != 0 && parte != 0) {
                System.out.print("Input your number!\n> ");

                while ((input = br.readLine()) != null && input.length() != 0) {
                    lines.add(input);
                }

                switch (day) {
                    case 1:
                        Day1 day1 = new Day1();
                        resultado = day1.menu(parte, lines);
                        break;

                    case 2:
                        Day2 day2 = new Day2();
                        resultado = day2.menu(parte, lines);
                    default:
                        break;
                }
            } else {
                menu = 1;
            }
            System.out.println("Here's the output: " + resultado);
        }

        System.out.println("Goodbye!");
    }

}
