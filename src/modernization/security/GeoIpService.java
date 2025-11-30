package com.payments.modernization.security;

/**
 * GeoIpService is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class GeoIpService {
    private String name;
    private int version;
    private boolean enabled = true;

    public GeoIpService() {
        this.name = "GeoIpService";
        this.version = 1;
    }

    public GeoIpService(String name, int version) {
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


    public boolean isHighValueCrossBorder(double amount, String country) {
    return amount > 50000 && country != null && !country.equalsIgnoreCase("USA");
    }

    public boolean exceedsVelocity(int countLastMinute, int threshold) {
    return countLastMinute > threshold;
    }

    public String processGeoIpServiceContext(String deviceId, String ipCountry) {
    String id = deviceId == null ? "UNKNOWN" : deviceId.replace(":", "-");
    String c = ipCountry == null ? "NA" : ipCountry.toUpperCase();
    return id + "@" + c;
    }
}