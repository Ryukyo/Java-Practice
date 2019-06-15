package com.flo;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int fillToner (int inputToner) {
        if (inputToner > 0 && inputToner <= 100) {
            if(this.tonerLevel + inputToner > 100) {
                return -1;
            }
            this.tonerLevel += inputToner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printing (int numberOfPrintedPages) {
        int pagesToPrint = numberOfPrintedPages;
        if (this.duplex) {
            pagesToPrint = (numberOfPrintedPages / 2) + (numberOfPrintedPages % 2);
            System.out.println("Printing in duplex mode");
        }
        tonerLevel -= numberOfPrintedPages;
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
