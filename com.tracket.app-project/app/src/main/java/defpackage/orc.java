package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class orc implements Cloneable {
    public boolean y;
    public boolean z;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final orc clone() {
        try {
            return (orc) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
