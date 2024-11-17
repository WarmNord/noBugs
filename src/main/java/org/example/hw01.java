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
    public String checkSignNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public boolean checkDivisionTwoThree(int number) {
        return number % 2 == 0 || number % 3 == 0;
    }

    public String task9(int num1, int num2) {
        if ((num1 + num2) % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public boolean task10(int number) {
        return number % 4 == 0 && number % 6 == 0;
    }

    public String task11(int num1, int num2) {
        int sum = num1 + num2;
        if (sum % 2 == 0 && sum % 10 == 0 ) {
            return  "Even and Divisible by 10";
        } else if (sum % 2 == 0 && sum % 10 != 0 ){
            return  "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }

    public int task12(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3) ;
    }

    public boolean task13(int number) {
        StringBuilder str = new StringBuilder();
        String reverse = str.append(number).reverse().toString();
        return Integer.parseInt(reverse) == number;
    }

    public Integer task14(int num1, int num2) {
        if (num1 % 3 == 0 && num2 % 3 ==0) {
            return num1 + num2;
        } else if (num1 % 3 == 0 || num2 % 3 ==0) {
            return num2 * 2;
        } else {
            return null;
        }
    }

    public String task15(int num) {
        if (num <= 12) {
            return  "Child";
        } else if (num >= 13 && num <= 17){
            return  "Teenager";
        } else if (num >= 18 && num <= 64){
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public boolean task16(int num1, int num2) {
        return num1 % num2 == 2;
    }
}
