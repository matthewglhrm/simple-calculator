package io.github.vooiid;

import io.github.vooiid.constructor.Numbers;

import java.util.Scanner;

public class Main {

    static public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Numbers num1 = new Numbers();
        Numbers num2 = new Numbers();
        Numbers result = new Numbers();
        String options = "y";

        while (options.equals("Yes") || options.equals("sim") || options.equals("y") || options.equals("Sim") || options.equals("SIM")|| options.equals("yes")) {
            System.out.printf("%nDigite o valor primário: ");
            num1.setValue(scanner.nextInt());
            System.out.printf("%nDigite o valor secundário: ");
            num2.setValue(scanner.nextInt());
            result.setValue(num1.getValue() + num2.getValue());
            System.out.printf("%nO valor da soma foi dado como: %d", result.getValue());
            System.out.printf("%n%nDeseja somar outro valor?%n");
            options = scanner.next();
            System.out.printf("%n%n%n");
        }
    }

}