package com.payments.modernization.simulation;

/**
 * ScenarioBuilder is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class ScenarioBuilder {
    private String name;
    private int version;
    private boolean enabled = true;

    public ScenarioBuilder() {
        this.name = "ScenarioBuilder";
        this.version = 1;
    }

    public ScenarioBuilder(String name, int version) {
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


    public long estimateProcessingTimeMillis(int txCount, int avgMillisPerTx) {
    return (long) txCount * avgMillisPerTx;
    }

    public double estimateThroughput(int txCount, int seconds) {
    if (seconds <= 0) return 0.0;
    return (double) txCount / seconds;
    }

    public String processScenarioBuilderContext(String scenarioName, int variation) {
    return scenarioName + "-v" + variation;
    }
}