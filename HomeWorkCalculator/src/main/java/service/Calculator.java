package service;

import exception.DivisionByZero;
import exception.WrongOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    Math math;
    String operation;

    public void innerOperation () throws WrongOperation {

        System.out.println("Введите одну из операций: +, -, *, /");
        Scanner in = new Scanner(System.in);
        operation = in.nextLine();
        if (!((operation.equals("+"))
                || (operation.equals("-"))
                || (operation.equals("*"))
                || (operation.equals("/"))))
            throw new WrongOperation("Операция не поддерживается калькулятором", operation);
    }

    public void innerNum () throws InputMismatchException {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите первое число, ВНИМАНИЕ, дробные числа вводятся через запятую!");
            double one = in.nextDouble();
            System.out.println("Введите второе число, ВНИМАНИЕ, дробные числа вводятся через запятую!");
            double two = in.nextDouble();

            math = new Math(one, two);;
        } catch (InputMismatchException e) {
            System.out.println("Число введено в НЕВЕРНОМ формате");
        }
    }

    public void resultOperation () throws DivisionByZero {
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

    public String closeConsole () {

        System.out.println("Для завершения работы калькулятора введите 'N', для продолжения нажмите 'enter'");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
