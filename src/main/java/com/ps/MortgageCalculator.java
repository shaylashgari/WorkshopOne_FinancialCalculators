package com.ps;

import java.util.Scanner;


}
public class MortgageCalculator {
    public static void main(String[] args) {
        float principleAmount;
        float interestRate;
        int loanLength;

        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter the principle amount:");
        principleAmount= input.nextFloat();
        System.out.println("Please enter the interest rate: ");
        interestRate= input.nextFloat();
        System.out.println( "Please enter the loan length: ");
        loanLength= input.nextInt();

        float monthlyInterestRate= (interestRate/100 )/12;
        int loanLengthInMonths= loanLength * 12;


    }


}
