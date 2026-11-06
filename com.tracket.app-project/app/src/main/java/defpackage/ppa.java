package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ppa {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final rad e = rad.p(new Object[]{"auto", "none"}, 2);
    public static final rad f = rad.p(new Object[]{"dot", "sesame", "circle"}, 3);
    public static final rad g = rad.p(new Object[]{"filled", "open"}, 2);
    public static final rad h = rad.p(new Object[]{"after", "before", "outside"}, 3);
    public final int a;
    public final int b;
    public final int c;

    public ppa(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
