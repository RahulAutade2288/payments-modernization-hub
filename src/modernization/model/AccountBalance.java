package com.payments.modernization.model;

/**
 * AccountBalance is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class AccountBalance {
    private String name;
    private int version;
    private boolean enabled = true;

    public AccountBalance() {
        this.name = "AccountBalance";
        this.version = 1;
    }

    public AccountBalance(String name, int version) {
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
    return "AccountBalance";
    }

    public int version() {
    return 1;
    }

    public String processAccountBalanceContext(String input) {
    return "AccountBalance:" + input;
    }
}