package test;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parser {

    private int number1;
    private int number2;
    private String ecshen;
    private String element1;
    private String element2;
    private boolean isroman;

    private Preoprozavatel preoprozavatel = new Preoprozavatel();

    public Parser() {
        readLine();
        noCorrectedVod();
        number1 = returnIntArabic(element1);
        number2 = returnIntArabic(element2);
        isroman = isRoma();
        moor10(number1, number2);
    }

    public int getNumber1() {

        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getEcshen() {
        return ecshen;
    }

    public boolean isIsroman() {
        return isroman;
    }

    private String[] readLine() {
        String[] mass = new String[0];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            mass = reader.readLine().split(" ");
            element1 = mass[0];
            element2 = mass[2];
            ecshen = mass[1];
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return mass;
    }

    private boolean cheacNotArabicn(String element) {
        int one;
        try {
            one = Integer.parseInt(element1);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private int returnIntArabic(String element) {
        int number;
        if (cheacNotArabicn(element)) {
            number = Integer.parseInt(element);
        } else {
            number = preoprozavatel.romanToArabic(element);
        }
        return number;
    }

    private void noCorrectedVod() {
        try {
            if (cheacNotArabicn(element1) ^ cheacNotArabicn(element2)) {
                throw new IllegalArgumentException("Некоректный ввод");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    private boolean isRoma() {
        if (cheacNotArabicn(element1) && cheacNotArabicn(element2)) {
            return false;
        } else {
            return true;
        }
    }

    private void moor10(int number1, int number2) {
        try {
            if ((number1 > 10 || number1 < 0) && (number2 > 10 || number2 < 0)) {
                throw new IllegalArgumentException("Не больше 10 и не меньше 0!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            throw new IllegalArgumentException(e);
        }
    }
}
