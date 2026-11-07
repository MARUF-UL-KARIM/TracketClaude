package com.tracket.editor.dto;
import defpackage.x03;
public enum AspectRatio {
    Default9to16(0.5625f),
    Default16to9(1.7777778f),
    Default1to1(1.0f),
    Default4to3(1.3333334f),
    Default3to4(0.75f),
    Default3to2(1.5f),
    Default2to3(0.6666667f),
    Default21to9(2.3333333f),
    Default9to21(0.42857143f);
    public static final x03 A = new x03(values());
    public final float y;
    AspectRatio(float f) { this.y = f; }
}
