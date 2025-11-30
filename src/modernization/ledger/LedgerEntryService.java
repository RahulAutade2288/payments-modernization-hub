package com.payments.modernization.ledger;

/**
 * LedgerEntryService is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class LedgerEntryService {
    private String name;
    private int version;
    private boolean enabled = true;

    public LedgerEntryService() {
        this.name = "LedgerEntryService";
        this.version = 1;
    }

    public LedgerEntryService(String name, int version) {
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


    public double postDebit(double balance, double amount) {
    return balance - amount;
    }

    public double postCredit(double balance, double amount) {
    return balance + amount;
    }

    public String processLedgerEntryServiceContext(String accountId, String paymentId) {
    return accountId + ":" + paymentId;
    }
}