// Write a program that emulates a calculator and it should implement a Calculator Class to handle the following methods:
// add(), a  which returns the addition of two numbers
// subtract(), a  which returns the subtraction of num1 from num2
// multiply(), a  which returns the multiplication of numbers
// divide(), a  which returns the division of num2 by num1


package Calculator;


public class Operation {


    public Operation(){     
    }


    public double add (double x, double y){
        return x+y;
    }

    public double sub (double x,double y){
        return x-y;
    }

    public double mult (double x, double y){
        return x*y;
    }

    public double div (double x, double y){
        return x/y;
    }
}
