package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bl4 implements vq3, Serializable {
    private final int arity;

    public bl4(int i) {
        this.arity = i;
    }

    @Override // defpackage.vq3
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        iq6.a.getClass();
        return jq6.a(this);
    }
}
