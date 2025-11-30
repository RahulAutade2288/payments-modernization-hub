package com.payments.modernization.model;

/**
 * FeeBreakdown is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class FeeBreakdown {
    private String name;
    private int version;
    private boolean enabled = true;

    public FeeBreakdown() {
        this.name = "FeeBreakdown";
        this.version = 1;
    }

    public FeeBreakdown(String name, int version) {
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


    public String simpleName() {
    return "FeeBreakdown";
    }

    public int version() {
    return 1;
    }

    public String processFeeBreakdownContext(String input) {
    return "FeeBreakdown:" + input;
    }
}