package service;

import java.util.Scanner;

public class Calculator {

    Math math;
    String operation;

    public void innerOperation () {

        System.out.println("Введите одну из операций: +, -, *, /");
        Scanner in = new Scanner(System.in);
        operation = in.nextLine();
    }

    public void innerNum () {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число, ВНИМАНИЕ, дробные числа вводятся через запятую!");
        double one = in.nextDouble();
        System.out.println("Введите второе число, ВНИМАНИЕ, дробные числа вводятся через запятую!");
        double two = in.nextDouble();

        Math m = new Math(one, two);
        math = m;
    }

    public void resultOperation () {
        switch (operation) {
            case "+":
                System.out.println(math.getOne() + " + " + math.getTwo() + " = " + math.sum());
                break;
            case "-":
                System.out.println(math.getOne() + " - " + math.getTwo() + " = " + math.division());
                break;
            case "*":
                System.out.println(math.getOne() + " * " + math.getTwo() + " = " + math.multiplication());
                break;
            case "/":
                System.out.println(math.getOne() + " / " + math.getTwo() + " = " + math.subtraction());
                break;
            default:
                System.out.println(operation + " - неверная операция!!!");
        }
    }
}
