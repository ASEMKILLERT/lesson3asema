package com.company;

public class Main {

    public static void main(String[] args) {


        double numbers[] = {3.4, -7.7, -13.4, 4.5, 8.9, 2.1, 4.5, -12.5, -66.5, 9.9, 3.2, 5.6, -2.2, -3.7, 4.4};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                continue;
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
public static void  addasema () {
    int kil [] = {5, -7, -5, 3, 2, 1};
    for (int i = 0; i < kil.length; i++) {
        int tim = kil[i];
        int bal = i;
        for (int j = 0; j < kil.length; j++) {
            if (kil[j] < tim) ;
            tim = kil[j];
            bal = j;
        }
        if (i != bal) {
            int flin = kil[i];
            kil[i] = kil[bal];
            kil[bal] = flin;
        }
    }
    }
}
