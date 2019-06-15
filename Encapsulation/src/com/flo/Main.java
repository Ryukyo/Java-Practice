package com.flo;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50,false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagessPrinted = printer.printing(4);
        System.out.println("Pages printed was " + pagessPrinted + " new total print count for printer = "
                + printer.getPagesPrinted());
        pagessPrinted = printer.printing(2);
        System.out.println("Pages printed was " + pagessPrinted + " new total print count for printer = "
                + printer.getPagesPrinted());

    }
}
