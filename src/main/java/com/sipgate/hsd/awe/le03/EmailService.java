package com.sipgate.hsd.awe.le03;

class EmailService {
    void sendInvoice(final Invoice invoice, final String email, final float price) {
        System.out.printf("Email invoice for %.2f Euros", price);
    }
}
