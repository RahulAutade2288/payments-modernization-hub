package com.payments.modernization.zelle;

/**
 * ZelleRiskService is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class ZelleRiskService {
    private String name;
    private int version;
    private boolean enabled = true;

    public ZelleRiskService() {
        this.name = "ZelleRiskService";
        this.version = 1;
    }

    public ZelleRiskService(String name, int version) {
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


    public boolean isAliasValid(String alias) {
    if (alias == null) return false;
    String trimmed = alias.trim();
    return trimmed.contains("@") || trimmed.matches("\\d{10}");
    }

    public double remainingDailyLimit(double limit, double used) {
    double remaining = limit - used;
    return remaining < 0 ? 0 : remaining;
    }

    public String processZelleRiskServiceContext(String customerId, double score) {
    String bucket = score < 2 ? "LOW" : (score < 4 ? "MEDIUM" : "HIGH");
    return customerId + ":" + bucket;
    }
}