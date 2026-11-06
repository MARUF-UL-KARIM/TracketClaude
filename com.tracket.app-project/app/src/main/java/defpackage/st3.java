package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class st3 implements kb4 {
    public final String a;
    public final String b;

    public st3(String str) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.a = str;
        this.b = null;
    }

    @Override // defpackage.kb4
    public gb4 toInstant() {
        throw new ib4(this.a + " when parsing an Instant from \"" + g4c.h(64, this.b) + '\"');
    }

    public st3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
