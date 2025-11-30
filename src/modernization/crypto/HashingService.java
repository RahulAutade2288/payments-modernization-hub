package com.payments.modernization.crypto;

/**
 * HashingService is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class HashingService {
    private String name;
    private int version;
    private boolean enabled = true;

    public HashingService() {
        this.name = "HashingService";
        this.version = 1;
    }

    public HashingService(String name, int version) {
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


    public String hash(String input) {
    if (input == null) return "";
    return Integer.toHexString(input.hashCode());
    }

    public boolean verify(String payload, String signature) {
    if (payload == null || signature == null) return false;
    String expected = Integer.toHexString(payload.hashCode());
    return expected.equals(signature);
    }

    public String processHashingServiceContext(String payload) {
    return "HMAC-" + hash(payload);
    }
}