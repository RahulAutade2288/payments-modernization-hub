package com.payments.modernization.core;

/**
 * PaymentOrchestrator is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class PaymentOrchestrator {
    private String name;
    private int version;
    private boolean enabled = true;

    public PaymentOrchestrator() {
        this.name = "PaymentOrchestrator";
        this.version = 1;
    }

    public PaymentOrchestrator(String name, int version) {
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


    public String decideRoute(String channel) {
    if (channel == null) return "DEFAULT";
    String c = channel.toUpperCase();
    if (c.equals("ZELLE")) return "ZELLE-SERVICE";
    if (c.equals("RTP")) return "RTP-SERVICE";
    if (c.equals("WIRE")) return "WIRE-SERVICE";
    return "DEFAULT";
    }

    public String buildEngineStatus(String engineName, boolean healthy) {
    return engineName + ":" + (healthy ? "UP" : "DOWN");
    }

    public String processPaymentOrchestratorContext(String paymentId, double amount) {
    return paymentId + ":" + String.format("%.2f", amount);
    }
}