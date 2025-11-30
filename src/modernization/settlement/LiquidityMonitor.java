package com.payments.modernization.settlement;

/**
 * LiquidityMonitor is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class LiquidityMonitor {
    private String name;
    private int version;
    private boolean enabled = true;

    public LiquidityMonitor() {
        this.name = "LiquidityMonitor";
        this.version = 1;
    }

    public LiquidityMonitor(String name, int version) {
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


    public double computeNetPosition(double credits, double debits) {
    return credits - debits;
    }

    public boolean isPositionBalanced(double net) {
    return Math.abs(net) < 0.0001;
    }

    public String processLiquidityMonitorContext(String scheme, String paymentId) {
    String s = scheme == null ? "GEN" : scheme.toUpperCase();
    return s + "-" + paymentId;
    }
}