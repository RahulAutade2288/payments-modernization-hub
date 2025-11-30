package com.payments.modernization.ledger;

/**
 * LedgerReconciliationService is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class LedgerReconciliationService {
    private String name;
    private int version;
    private boolean enabled = true;

    public LedgerReconciliationService() {
        this.name = "LedgerReconciliationService";
        this.version = 1;
    }

    public LedgerReconciliationService(String name, int version) {
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

    public String processLedgerReconciliationServiceContext(String accountId, String paymentId) {
    return accountId + ":" + paymentId;
    }
}