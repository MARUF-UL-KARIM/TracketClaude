package com.tracket.settings;
import defpackage.x03;
public enum VideoVerificationScenario {
    ALL("Run all"),
    PREPARE("Run prepare"),
    SEEK("Run seek"),
    PLAYBACK("Run playback"),
    SCRUB("Run scrub");
    public static final x03 A = new x03(values());
    public final String y;
    VideoVerificationScenario(String str) { this.y = str; }
}
