package com.tracket.settings;
import defpackage.x03;
public enum TextBenchmarkVariant {
    MULTILINE("Multiline"),
    SINGLE_LINE("Single"),
    STROKE("Stroke"),
    ALIGN_START("Start"),
    SINGLE_BOX("Box"),
    MULTI_BOX("Multi box");
    public static final x03 B = new x03(values());
    public final String y;
    TextBenchmarkVariant(String str) { this.y = str; }
}
