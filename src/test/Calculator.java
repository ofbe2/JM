package test;

public class Calculator {
    private int numb1;
    private int numb2;
    private String acshon;
    private int result;


    public Calculator(int number1, int number2, String acshon) {
        this.numb1 = number1;
        this.numb2 = number2;
        this.acshon = acshon;
    }

    public int calculeit() {
        try {
            switch (acshon) {
                case "+":
                    result = numb1 + numb2;
                    break;
                case "-":
                    result = numb1 - numb2;
                    break;
                case "*":
                    result = numb1 * numb2;
                    break;
                case "/":
                    result = numb1 / numb2;
                    break;

                default: throw new IllegalArgumentException("Некоректный ввод действие");

            }
        } catch (IllegalArgumentException e){
            System.out.println(e);
            throw new IllegalArgumentException(e);
        }
        return result;
    }

}
