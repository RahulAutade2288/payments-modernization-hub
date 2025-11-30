package com.payments.modernization.validation;

/**
 * SchemaValidator is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class SchemaValidator {
    private String name;
    private int version;
    private boolean enabled = true;

    public SchemaValidator() {
        this.name = "SchemaValidator";
        this.version = 1;
    }

    public SchemaValidator(String name, int version) {
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


    public boolean isPositiveAmount(double amount) {
    return amount > 0;
    }

    public boolean isCurrencyCode(String currency) {
    return currency != null && currency.matches("[A-Z]{3}");
    }

    public String processSchemaValidatorContext(String reference) {
    if (reference == null) return "INVALID";
    String trimmed = reference.trim();
    return trimmed.isEmpty() ? "INVALID" : "VALID";
    }
}