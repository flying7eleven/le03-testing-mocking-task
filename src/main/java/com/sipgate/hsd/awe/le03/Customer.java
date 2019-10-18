package com.sipgate.hsd.awe.le03;

class Customer {
    private boolean shouldSendEmail = false;
    private boolean hasToPayTaxes = false;

    void wantsEmail(boolean shouldSendEmail) {
        this.shouldSendEmail = shouldSendEmail;
    }

    boolean wantsEmail() {
        return this.shouldSendEmail;
    }

    String getEmail() {
        return null;
    }

    boolean hasToPayTax() {
        return this.hasToPayTaxes;
    }

    void hasToPayTax(final boolean hasToPayTaxes) {
        this.hasToPayTaxes = hasToPayTaxes;
    }
}
