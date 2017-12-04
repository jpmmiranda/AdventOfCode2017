/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

import static java.lang.Character.getNumericValue;
import static java.lang.Character.getNumericValue;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author João Miranda
 */
public class Day1 {

    int menu() {
        Scanner sc = new Scanner(System.in);
        int r = 0, parte = 0;

        System.out.println("Choose a part!");
        parte = sc.nextInt();

        switch (parte) {
            case 1:
                r = parte1();
                break;
            case 2:
                break;
            default:
                break;
        }
        return r;
    }

    int parte1() {
        int r = 0;
        String input;
        int inicio = 0, length, i, j = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your number: ");

        input = sc.next();
        System.out.println(input);
        char[] digits = input.toCharArray();
        length = digits.length;
        inicio = getNumericValue(digits[0]);

        for (i = 0; i < length - 1; i++) {
            if (getNumericValue(digits[i]) == getNumericValue(digits[i + 1]))  {
                r += getNumericValue(digits[i]);
            }
        }
        if (getNumericValue(digits[length - 1]) == inicio && length > 1) {
            r += inicio;
        }

        return r;
    }
    
    int parte2() {
        int r = 0;
        String input;
        int inicio = 0, length, i, j = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your number: ");
        
        input = sc.next();
        System.out.println(input);
        char[] digits = input.toCharArray();
        length = digits.length;
        
        return r;
    }
}
