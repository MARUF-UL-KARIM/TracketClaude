package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class dma extends tla {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public dma(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dma.class != obj.getClass()) {
            return false;
        }
        dma dmaVar = (dma) obj;
        return this.b == dmaVar.b && this.c == dmaVar.c && this.d == dmaVar.d && Arrays.equals(this.e, dmaVar.e) && Arrays.equals(this.f, dmaVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
