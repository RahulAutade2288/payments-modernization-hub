package com.payments.modernization.account;

/**
 * AccountLimitService is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class AccountLimitService {
    private String name;
    private int version;
    private boolean enabled = true;

    public AccountLimitService() {
        this.name = "AccountLimitService";
        this.version = 1;
    }

    public AccountLimitService(String name, int version) {
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


    public double calculateAvailableBalance(double ledger, double holds) {
    return ledger - holds;
    }

    public boolean canDebit(double available, double amount) {
    return amount > 0 && available >= amount;
    }

    public String processAccountLimitServiceContext(String accountId, double delta) {
    String safeId = accountId == null ? "UNKNOWN" : accountId.trim();
    String direction = delta >= 0 ? "CREDIT" : "DEBIT";
    return safeId + ":" + direction + ":" + Math.abs(delta);
    }
}