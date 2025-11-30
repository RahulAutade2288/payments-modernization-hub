package com.payments.modernization.kafka;

/**
 * KafkaConsumerService is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class KafkaConsumerService {
    private String name;
    private int version;
    private boolean enabled = true;

    public KafkaConsumerService() {
        this.name = "KafkaConsumerService";
        this.version = 1;
    }

    public KafkaConsumerService(String name, int version) {
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


    public String buildTopicName(String base, String region) {
    if (base == null || base.isEmpty()) return "unknown-topic";
    String r = region == null ? "global" : region.toLowerCase();
    return base.toLowerCase() + "-" + r;
    }

    public String buildPartitionKey(String paymentId) {
    if (paymentId == null) return "0";
    int hash = Math.abs(paymentId.hashCode());
    return Integer.toString(hash % 128);
    }

    public String processKafkaConsumerServiceContext(String eventType, String correlationId) {
    String type = eventType == null ? "GENERIC" : eventType.toUpperCase();
    String cid = correlationId == null ? "NA" : correlationId;
    return type + "#" + cid;
    }
}