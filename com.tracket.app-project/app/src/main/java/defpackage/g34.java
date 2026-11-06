package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class g34 {
    public final String a;
    public final int b;

    public g34(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.a = null;
        this.b = 1;
    }

    public g34(String str) {
        this.a = str;
        this.b = 0;
    }

    public g34(int i, String str) {
        this.b = i;
        this.a = str;
    }
}
