package com.payments.modernization.exceptions;

/**
 * PaymentValidationException is part of the payments-modernization-hub reference implementation.
 * It contains simple but realistic helper logic that can be used in examples,
 * demos, or tests when modelling a modern payment hub.
 */

public class PaymentValidationException extends RuntimeException {
    private String errorCode;
    private String contextId;

    public PaymentValidationException(String message) {
        super(message);
    }

    public PaymentValidationException(String message, String errorCode, String contextId) {
        super(message);
        this.errorCode = errorCode;
        this.contextId = contextId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getContextId() {
        return contextId;
    }

    public boolean hasErrorCode() {
        return errorCode != null && !errorCode.isEmpty();
    }

    public String toLogMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentValidationException");
        sb.append(": ");
        sb.append(getMessage());
        if (errorCode != null) {
            sb.append(" | code=").append(errorCode);
        }
        if (contextId != null) {
            sb.append(" | context=").append(contextId);
        }
        return sb.toString();
    }

    public static PaymentValidationException wrap(Throwable t, String errorCode, String contextId) {
        if (t instanceof PaymentValidationException) {
            return (PaymentValidationException) t;
        }
        String message = t.getMessage() == null ? "Unexpected error" : t.getMessage();
        return new PaymentValidationException(message, errorCode, contextId);
    }

    public boolean isCausedBy(Class<?> type) {
        Throwable current = this;
        while (current != null) {
            if (type.isInstance(current)) {
                return true;
            }
            current = current.getCause();
        }
        return false;
    }
}