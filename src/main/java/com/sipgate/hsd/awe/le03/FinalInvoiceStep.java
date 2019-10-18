package com.sipgate.hsd.awe.le03;

class FinalInvoiceStep {
    private EmailService emailService;
    private PrinterService printerService;

    FinalInvoiceStep(final PrinterService printerService, final EmailService emailService) {
        this.emailService = emailService;
        this.printerService = printerService;
    }

    void handleInvoice(final Invoice invoice, final Customer customer) {
        if (customer.wantsEmail()) {
            emailService.sendInvoice(invoice, customer.getEmail(), invoice.getPriceToPay(customer.hasToPayTax()));
        } else {
            printerService.printInvoice(invoice, invoice.getPriceToPay(customer.hasToPayTax()));
        }
    }
}
