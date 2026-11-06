package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface vg9 extends wg9 {
    @Override // defpackage.tg9
    default long e(sn snVar, sn snVar2, sn snVar3) {
        return ((long) (s() + p())) * 1000000;
    }

    int p();

    int s();
}
