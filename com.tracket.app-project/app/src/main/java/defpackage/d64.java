package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class d64 {
    public final Bitmap a;
    public final long b;

    public d64(long j, Bitmap bitmap) {
        this.a = bitmap;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d64)) {
            return false;
        }
        d64 d64Var = (d64) obj;
        return this.a.equals(d64Var.a) && this.b == d64Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageFrameResource(value=" + this.a + ", releaseTimeNs=" + this.b + ")";
    }
}
