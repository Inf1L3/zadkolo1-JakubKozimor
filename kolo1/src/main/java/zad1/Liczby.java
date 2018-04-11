/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

/**
 *
 * @author student
 */
public class Liczby {

    public int i;

    public void Liczby(int i) {
        this.i = i;
    }

  
    public Liczby(int i) {

        while (i >= 0) {
            if (i == 8 || i == 6 || i == 3 || i == 1) {
                i--;
                continue;
            } else {

                
               System.out.println(i);
            }
            i--;

        }
    }
}
