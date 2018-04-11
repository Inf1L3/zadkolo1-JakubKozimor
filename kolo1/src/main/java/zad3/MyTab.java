/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class MyTab {

    private int n = 0;
    private int sr;
    private int suma = 0;
    private int[] tablica = new int[10];
    Scanner pobierz = new Scanner(System.in);

    public MyTab(int n) {
        this.n = n;
        //setTab(n);
    }

    public void setTab() {
        for (int i = 0; i < 10; i++) {
            int n = pobierz.nextInt();
            tablica[i] = n;
        }
    }

    public void getTab() {
        for (int i = 0; i < 10; i++) {
            System.out.println(tablica[i]);
        }

    }

    public int srTab() {
        for (int i = 0; i < 10; i++) {
            suma = suma + tablica[i];
        }
        return sr / 10;
    }

}
