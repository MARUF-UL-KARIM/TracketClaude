package com.tracket.settings;
import defpackage.x03;
public enum VideoVerificationTab {
    DECODER("Decoder"),
    HARDWARE_BUFFER("Hardware buffer"),
    PRODUCER("Producer"),
    AUDIO("Audio");
    public static final x03 B = new x03(values());
    public final String y;
    VideoVerificationTab(String str) { this.y = str; }
}
