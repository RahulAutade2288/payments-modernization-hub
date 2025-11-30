package com.payments.modernization.iso20022;

/**
 * Pacs008Parser is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class Pacs008Parser {
    private String name;
    private int version;
    private boolean enabled = true;

    public Pacs008Parser() {
        this.name = "Pacs008Parser";
        this.version = 1;
    }

    public Pacs008Parser(String name, int version) {
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


    public String extractTag(String xml, String tagName) {
    if (xml == null || tagName == null) return null;
    String startTag = "<" + tagName + ">";
    String endTag = "</" + tagName + ">";
    int start = xml.indexOf(startTag);
    int end = xml.indexOf(endTag);
    if (start < 0 || end < 0 || end <= start) return null;
    return xml.substring(start + startTag.length(), end);
    }

    public String buildSimpleTag(String tagName, String value) {
    String t = tagName == null ? "Tag" : tagName;
    String v = value == null ? "" : value;
    return "<" + t + ">" + v + "</" + t + ">";
    }

    public String processPacs008ParserContext(String msgId, String type) {
    String id = msgId == null ? "NA" : msgId;
    String t = type == null ? "UNKNOWN" : type;
    return "MSG[" + t + "]::" + id;
    }
}