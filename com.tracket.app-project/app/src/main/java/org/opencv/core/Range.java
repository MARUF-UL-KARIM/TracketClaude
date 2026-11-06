package org.opencv.core;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Range {
    public final Object clone() {
        return new Range();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof Range);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(-2.147483648E9d);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(2.147483647E9d);
        return (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "[-2147483648, 2147483647)";
    }
}
