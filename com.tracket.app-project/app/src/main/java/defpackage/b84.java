package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class b84 {
    public final Object a;
    public final Object b;
    public final Object c;

    public b84(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.c);
        return new IllegalArgumentException(sb.toString());
    }
}
