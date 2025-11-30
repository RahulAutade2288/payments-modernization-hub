package com.payments.modernization.auth;

/**
 * CustomerAuthContext is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class CustomerAuthContext {
    private String name;
    private int version;
    private boolean enabled = true;

    public CustomerAuthContext() {
        this.name = "CustomerAuthContext";
        this.version = 1;
    }

    public CustomerAuthContext(String name, int version) {
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


    public boolean isKeyStrong(String apiKey) {
    if (apiKey == null || apiKey.length() < 16) return false;
    boolean hasDigit = apiKey.chars().anyMatch(Character::isDigit);
    boolean hasLetter = apiKey.chars().anyMatch(Character::isLetter);
    return hasDigit && hasLetter;
    }

    public long computeTokenExpiry(long issuedAtMillis, long ttlMillis) {
    return issuedAtMillis + ttlMillis;
    }

    public String processCustomerAuthContextContext(String customerId, String channel) {
    String c = customerId == null ? "UNKNOWN" : customerId.trim();
    String ch = channel == null ? "GENERIC" : channel.toUpperCase();
    return c + "@" + ch;
    }
}