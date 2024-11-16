package org.example;

public class hw01 {

    public boolean checkDivision(int number) {
        return number % 5 == 0 && number % 7 == 0;
    }

    public boolean checkNumber(int number) {
        return number >= 10 && number <= 20;
    }

    public boolean checkSquare(double num1, double num2) {
        return Math.pow(num1, 2) == num2 || Math.pow(num1, 2) == num1 ;
    }

    public boolean checkLastNumber(int number) {
        return number % 10 == 5;
    }

    public boolean checkSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number/= 10;
        }
        return sum % 2 == 0;
    }

    public boolean compareModule(int num1, int num2) {
        return Math.abs(num1) == Math.abs(num2);
    }

    //проверка знака числа

}
