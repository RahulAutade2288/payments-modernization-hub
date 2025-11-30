package com.payments.modernization.clearing;

/**
 * ClearingHouseRouter is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class ClearingHouseRouter {
    private String name;
    private int version;
    private boolean enabled = true;

    public ClearingHouseRouter() {
        this.name = "ClearingHouseRouter";
        this.version = 1;
    }

    public ClearingHouseRouter(String name, int version) {
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
    return "ClearingHouseRouter";
    }

    public int version() {
    return 1;
    }

    public String processClearingHouseRouterContext(String input) {
    return "ClearingHouseRouter:" + input;
    }
}