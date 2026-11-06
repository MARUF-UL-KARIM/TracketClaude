package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l71 implements z86 {
    public abstract boolean a(char c);

    @Override // defpackage.z86
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
