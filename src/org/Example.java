package org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Example {

    static int addNumber(int number) {
        if(number <= 199 && number >= 1){
            if(number % 3 == 0 && number % 5 == 0)
                System.out.println("FizzBuzz");
            else if (number % 5 == 0)
                System.out.println("Buzz");
            else if(number % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(number);
            return addNumber(number - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        //int nombre = 15;
        //Object o = new Object();

        List<Shapable> shapes = new ArrayList<>();
        shapes.add(new Rectangle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).move());
        }
        //addNumber(nombre);
    }
}
