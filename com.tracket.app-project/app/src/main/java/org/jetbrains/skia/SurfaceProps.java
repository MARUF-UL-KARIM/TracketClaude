package org.jetbrains.skia;

import defpackage.l82;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceProps {
    private final boolean isDeviceIndependentFonts;
    private final PixelGeometry pixelGeometry;

    public /* synthetic */ SurfaceProps(boolean z, PixelGeometry pixelGeometry, int i, l82 l82Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? PixelGeometry.UNKNOWN : pixelGeometry);
    }

    private final int _getPixelGeometryOrdinal() {
        return this.pixelGeometry.ordinal();
    }

    public final int _getFlags() {
        return this.isDeviceIndependentFonts ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProps)) {
            return false;
        }
        SurfaceProps surfaceProps = (SurfaceProps) obj;
        return this.isDeviceIndependentFonts == surfaceProps.isDeviceIndependentFonts && this.pixelGeometry == surfaceProps.pixelGeometry;
    }

    public final PixelGeometry getPixelGeometry$skiko_release() {
        return this.pixelGeometry;
    }

    public int hashCode() {
        return this.pixelGeometry.hashCode() + (((this.isDeviceIndependentFonts ? 79 : 97) + 59) * 59);
    }

    public final boolean isDeviceIndependentFonts$skiko_release() {
        return this.isDeviceIndependentFonts;
    }

    public final int[] packToIntArray$skiko_release() {
        return new int[]{_getFlags(), _getPixelGeometryOrdinal()};
    }

    public String toString() {
        return "SurfaceProps(_deviceIndependentFonts=" + this.isDeviceIndependentFonts + ", _pixelGeometry=" + this.pixelGeometry + ')';
    }

    public final SurfaceProps withDeviceIndependentFonts(boolean z) {
        return this.isDeviceIndependentFonts == z ? this : new SurfaceProps(z, this.pixelGeometry);
    }

    public final SurfaceProps withPixelGeometry(PixelGeometry pixelGeometry) {
        pixelGeometry.getClass();
        return this.pixelGeometry == pixelGeometry ? this : new SurfaceProps(this.isDeviceIndependentFonts, pixelGeometry);
    }

    public SurfaceProps(boolean z, PixelGeometry pixelGeometry) {
        pixelGeometry.getClass();
        this.isDeviceIndependentFonts = z;
        this.pixelGeometry = pixelGeometry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceProps() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SurfaceProps(PixelGeometry pixelGeometry) {
        this(false, pixelGeometry);
        pixelGeometry.getClass();
    }
}
