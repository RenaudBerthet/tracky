package be.rbe.tracky.domain;

import java.util.Objects;

public enum Severity {
    LOW {
        @Override
        public String toText() {
            return "low";
        }
    },
    MEDIUM {
        @Override
        public String toText() {
            return "medium";
        }
    },
    HIGH {
        @Override
        public String toText() {
            return "high";
        }
    },
    CRITICAL {
        @Override
        public String toText() {
            return "critical";
        }
    };


    static Severity fromText(String value) {
        Objects.requireNonNull(value, "Unable to create Severity from <null> text");
        for (Severity severity : Severity.values()) {
            if (severity.name().equals(value.toUpperCase())) {
                return severity;
            }
        }
        throw new IllegalArgumentException("Unable to create Svereity from value: <" + value + ">");
    }

    public abstract String toText();
}



