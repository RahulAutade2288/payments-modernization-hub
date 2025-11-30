package com.payments.modernization.rules;

/**
 * CountryRiskScorer is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class CountryRiskScorer {
    private String name;
    private int version;
    private boolean enabled = true;

    public CountryRiskScorer() {
        this.name = "CountryRiskScorer";
        this.version = 1;
    }

    public CountryRiskScorer(String name, int version) {
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


    public boolean isHighRiskCountry(String countryCode) {
    if (countryCode == null) return false;
    String c = countryCode.toUpperCase();
    return c.equals("XYZ") || c.equals("ABC");
    }

    public double applyTieredFee(double amount) {
    if (amount <= 1000) return amount * 0.001;
    if (amount <= 10000) return amount * 0.0008;
    return amount * 0.0005;
    }

    public String processCountryRiskScorerContext(int score) {
    if (score <= 1) return "LOW";
    if (score == 2) return "MEDIUM";
    if (score == 3) return "HIGH";
    return "CRITICAL";
    }
}