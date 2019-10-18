package com.sipgate.hsd.awe.le03;

class Invoice {
    private Customer customer;
    private float[] singleNetPrices = {23.14f, 34.14f, 123.21f, 73.94f};

    float getPriceToPay(boolean hasToPayTaxex) {
        final float netValue = this.getNetPriceOfProducts();

        float grossPrice = netValue;

        if (hasToPayTaxex) {
            grossPrice = netValue * 1.19f;
        }

        return Math.round(grossPrice * 100.0f) / 100.0f;
    }

    private float getNetPriceOfProducts() {
        float sum = 0.0f;
        for(float currentValue: this.singleNetPrices) {
            sum += currentValue;
        }
        return sum;
    }
}
