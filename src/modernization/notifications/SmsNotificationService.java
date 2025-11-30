package com.payments.modernization.notifications;

/**
 * SmsNotificationService is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class SmsNotificationService {
    private String name;
    private int version;
    private boolean enabled = true;

    public SmsNotificationService() {
        this.name = "SmsNotificationService";
        this.version = 1;
    }

    public SmsNotificationService(String name, int version) {
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


    public String buildEmailSubject(String paymentId, String status) {
    return "Payment " + paymentId + " is " + status;
    }

    public String buildSmsBody(double amount, String currency) {
    return "You sent " + String.format("%.2f", amount) + " " + currency;
    }

    public String processSmsNotificationServiceContext(String channel, String destination) {
    return channel + "->" + destination;
    }
}