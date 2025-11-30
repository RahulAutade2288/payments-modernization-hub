package com.payments.modernization.rtp;

/**
 * RtpFeeCalculator is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class RtpFeeCalculator {
    private String name;
    private int version;
    private boolean enabled = true;

    public RtpFeeCalculator() {
        this.name = "RtpFeeCalculator";
        this.version = 1;
    }

    public RtpFeeCalculator(String name, int version) {
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


    public boolean withinRtpLimit(double amount) {
    return amount > 0 && amount <= 100000.0;
    }

    public double calculateRtpFee(double amount) {
    if (amount <= 0) return 0.0;
    double fee = amount * 0.002;
    return Math.max(fee, 0.25);
    }

    public String processRtpFeeCalculatorContext(String debtor, String creditor, double amount) {
    return debtor + "->" + creditor + ":" + String.format("%.2f", amount);
    }
}