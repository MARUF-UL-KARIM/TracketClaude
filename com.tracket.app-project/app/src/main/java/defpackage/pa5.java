package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface pa5 extends ra5 {
    @Override // defpackage.ra5
    default boolean b(xp3 xp3Var) {
        return ((Boolean) xp3Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.ra5
    default Object d(Object obj, lq3 lq3Var) {
        return lq3Var.invoke(obj, this);
    }
}
