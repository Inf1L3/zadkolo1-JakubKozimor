package pl.edu.ur.kolo1;

import java.util.Scanner;
import javafx.scene.control.Tab;
import javax.swing.text.StyleConstants;

import zad1.Liczby;
import zad2.Fib;
import zad3.MyTab;

/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
        System.out.println("zad1");

        Liczby liczba = new Liczby(10);
        liczba.Liczby(10);
        System.out.println("zad2");
        Fib r = new Fib();
        int rekurencja = 0;

        rekurencja = r.sumaRekurencja(3);

        System.out.println("Rekurencja: " + rekurencja);

        System.out.println("zad3");
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        MyTab tab = new MyTab(test);

        tab.setTab();
        tab.getTab();
        tab.srTab();
    }

}
