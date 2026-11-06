package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface tg9 {
    boolean d();

    long e(sn snVar, sn snVar2, sn snVar3);

    sn n(long j, sn snVar, sn snVar2, sn snVar3);

    sn t(long j, sn snVar, sn snVar2, sn snVar3);

    default sn u(sn snVar, sn snVar2, sn snVar3) {
        return n(e(snVar, snVar2, snVar3), snVar, snVar2, snVar3);
    }
}
