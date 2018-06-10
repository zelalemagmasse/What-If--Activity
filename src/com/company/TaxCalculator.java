package com.company;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        int custmID;
        String custmName;
        double salesAmt=0;
        String taxCode;
        double totalAmnt=0;
        double taxRate=0;
        Scanner keyboard = new Scanner(System.in);


        System.out.print( "please Enter the customer ID:" );
        custmID = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print( "please Enter the customer Name:" );
        custmName = keyboard.nextLine();
        System.out.print( "please Enter the sales amount:" );
        salesAmt = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print( "please Enter the tax code:" );
        taxCode = keyboard.nextLine();
        System.out.println();


        switch (taxCode.toUpperCase()){
            case "NRM":  taxRate=0.06;
            break;
            case "NPF":  taxRate=0;
            break;
            case "BIZ":  taxRate=0.045;
            break;
        }

        totalAmnt=salesAmt + (salesAmt*taxRate);
        System.out.println("Customer ID :" + custmID);
        System.out.println("Customer Name:" + custmName);
        System.out.printf("Sales Amount:$%.2f%n", salesAmt);
        System.out.println("Tax Code:" + taxCode.toUpperCase());
        System.out.printf("Total Amount:$%.2f", totalAmnt);

    }
}