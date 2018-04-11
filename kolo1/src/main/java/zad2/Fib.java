/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author student
 */
public class Fib {

    

    public int sumaIteracja(int n) {
        int suma = 0;
        while(n > 0) {
            suma = suma+n;
            n--;
        }
        return suma;
    }
 
    public int sumaRekurencja(int n) {
        if(n>0) {
            return n + sumaRekurencja(n-1);
        } else {
            return 0;
        }
    }

}
