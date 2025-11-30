package com.payments.modernization.notifications;

/**
 * NotificationPreference is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class NotificationPreference {
    private String name;
    private int version;
    private boolean enabled = true;

    public NotificationPreference() {
        this.name = "NotificationPreference";
        this.version = 1;
    }

    public NotificationPreference(String name, int version) {
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

    public String processNotificationPreferenceContext(String channel, String destination) {
    return channel + "->" + destination;
    }
}