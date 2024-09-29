package com.ps;

import java.util.Scanner;


public class FinancialCalculator {
    public static void main(String[] args) {

        int calculatorChoice;

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter which calculator you would like to use:");
        calculatorChoice= input.nextInt();


        float principleAmount;
        float interestRate;
        int loanLength;
        double totalInterest;

        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter the principle amount:");
        principleAmount= input.nextFloat();
        System.out.println("Please enter the interest rate: ");
        interestRate= input.nextFloat();
        System.out.println( "Please enter the loan length: ");
        loanLength= input.nextInt();

        float monthlyInterestRate= (interestRate/100 )/12;
        int loanLengthInMonths= loanLength * 12;

        double monthlyPayment = (principleAmount * monthlyInterestRate * Math.pow(1+monthlyInterestRate, loanLengthInMonths))/
                (Math.pow(1+monthlyInterestRate, loanLengthInMonths)-1);

        int n = 1;
        int t= 15;

        totalInterest = principleAmount * Math.pow((1+ (interestRate/100)/n), n*t);
                // A=P(1+r/n)^nt

        System.out.println("The monthly payment is: "+ monthlyPayment);

        System.out.println( "The total interest:"+ totalInterest);

    }


}
