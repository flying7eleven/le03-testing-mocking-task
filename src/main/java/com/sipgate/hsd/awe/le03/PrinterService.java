package com.sipgate.hsd.awe.le03;

class PrinterService {
    void printInvoice(final Invoice invoice, final float price) {
        System.out.printf("Printed invoice for %.2f Euros", price);
    }
}
