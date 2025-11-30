package com.payments.modernization.config;

/**
 * CutoverConfig is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class CutoverConfig {
    private String name;
    private int version;
    private boolean enabled = true;

    public CutoverConfig() {
        this.name = "CutoverConfig";
        this.version = 1;
    }

    public CutoverConfig(String name, int version) {
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


    public String resolveRegion(String branchCode) {
    if (branchCode == null) return "UNKNOWN";
    if (branchCode.startsWith("NY")) return "US-EAST";
    if (branchCode.startsWith("CA")) return "US-WEST";
    return "US-CENTRAL";
    }

    public boolean isFeatureEnabled(String featureName, boolean defaultValue) {
    if (featureName == null) return defaultValue;
    return !featureName.toLowerCase().contains("disabled");
    }

    public String processCutoverConfigContext(String featureName) {
    return "feature:" + featureName;
    }
}