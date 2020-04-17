package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        String ecshon;
        boolean isRoma;
        Parser parser = new Parser();
        num1 = parser.getNumber1();
        num2 = parser.getNumber2();
        ecshon = parser.getEcshen();
        isRoma = parser.isIsroman();
        Calculator calculator = new Calculator(num1, num2, ecshon);
        result = calculator.calculeit();
        Preoprozavatel preoprozavatel = new Preoprozavatel();
        if (isRoma){
            System.out.println(preoprozavatel.arabicToRoman(result));
        } else {
            System.out.println(result);
        }
   }
}
