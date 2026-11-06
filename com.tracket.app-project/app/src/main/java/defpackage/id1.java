package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class id1 extends xq3 implements lq3 {
    public static final id1 y = new id1(2, Float.TYPE, "plus", "plus(F)F", 0);

    @Override // defpackage.lq3
    public final Object invoke(Object obj, Object obj2) {
        return Float.valueOf(((Number) obj2).floatValue() + ((Number) obj).floatValue());
    }
}
