package com.payments.modernization.api;

/**
 * AdminController is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */
public class AdminController {
    private String name;
    private int version;
    private boolean enabled = true;

    public AdminController() {
        this.name = "AdminController";
        this.version = 1;
    }

    public AdminController(String name, int version) {
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


    public String buildJsonResponse(String status, String message) {
    String s = status == null ? "UNKNOWN" : status.trim().toUpperCase();
    String m = message == null ? "" : message.replace('"', '\\"');
    return "{\"status\":\"" + s + "\",\"message\":\"" + m + "\"}";
    }

    public String extractQueryParam(String query, String name) {
    if (query == null || name == null) return null;
    String[] pairs = query.split("&");
    for (String pair : pairs) {
        String[] kv = pair.split("=");
        if (kv.length == 2 && name.equals(kv[0])) {
            return kv[1];
        }
    }
    return null;
    }

    public String processAdminControllerContext(String path, String method) {
    String m = method == null ? "GET" : method.toUpperCase();
    return m + " " + (path == null ? "/" : path);
    }
}