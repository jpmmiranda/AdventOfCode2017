/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

/**
 *
 * @author João Miranda
 */
public class Day2 {

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

        return 0;
    }

    int parte2(String input) {
        return 0;
    }
}
