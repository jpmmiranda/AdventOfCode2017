/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

import static java.lang.Character.getNumericValue;

/**
 *
 * @author João Miranda
 */
public class Day1 {

    int menu(int parte, String input) {
        int resultado = 0;
        switch (parte) {
            case 1:
                resultado = parte1(input);
                break;
            case 2:
                resultado = parte2(input);
                break;
            default:
                break;
        }
        return resultado;
    }

    int parte1(String input) {
        int r = 0;
        int inicio, length, i;

        char[] digits = input.toCharArray();
        length = digits.length;
        inicio = getNumericValue(digits[0]);

        for (i = 0; i < length - 1; i++) {
            if (getNumericValue(digits[i]) == getNumericValue(digits[i + 1])) {
                r += getNumericValue(digits[i]);
            }
        }
        if (getNumericValue(digits[length - 1]) == inicio && length > 1) {
            r += inicio;
        }

        return r;
    }

    int parte2(String input) {
        int r = 0;
        int nextInt = 0, length, i, j = 0;

        char[] digits = input.toCharArray();
        length = digits.length;

        if (length > 1 && length % 2 == 0) {
            nextInt = length / 2;
        }

        for (i = 0; i <= length - 1; i++) {
            if (i < nextInt) {
                if (getNumericValue(digits[i]) == getNumericValue(digits[i + nextInt])) {
                    r += getNumericValue(digits[i]);
                }
            } else {
                if (getNumericValue(digits[i]) == getNumericValue(digits[i - nextInt])) {
                    r += getNumericValue(digits[i]);
                }
            }
        }

        return r;
    }
}
