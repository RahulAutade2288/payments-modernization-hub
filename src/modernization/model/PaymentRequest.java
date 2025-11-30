package com.payments.modernization.model;

/**
 * PaymentRequest is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class PaymentRequest {
    private String name;
    private int version;
    private boolean enabled = true;

    public PaymentRequest() {
        this.name = "PaymentRequest";
        this.version = 1;
    }

    public PaymentRequest(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public String simpleName() {
    return "PaymentRequest";
    }

    public int version() {
    return 1;
    }

    public String processPaymentRequestContext(String input) {
    return "PaymentRequest:" + input;
    }
}