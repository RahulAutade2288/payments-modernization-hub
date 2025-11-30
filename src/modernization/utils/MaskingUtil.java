package com.payments.modernization.utils;

/**
 * MaskingUtil is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class MaskingUtil {
    private String name;
    private int version;
    private boolean enabled = true;

    public MaskingUtil() {
        this.name = "MaskingUtil";
        this.version = 1;
    }

    public MaskingUtil(String name, int version) {
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
    return "MaskingUtil";
    }

    public int version() {
    return 1;
    }

    public String processMaskingUtilContext(String input) {
    return "MaskingUtil:" + input;
    }
}