package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class cqa {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public ppa r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(cqa cqaVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (cqaVar != null) {
            if (!this.c && cqaVar.c) {
                this.b = cqaVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = cqaVar.h;
            }
            if (this.i == -1) {
                this.i = cqaVar.i;
            }
            if (this.a == null && (str = cqaVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = cqaVar.f;
            }
            if (this.g == -1) {
                this.g = cqaVar.g;
            }
            if (this.n == -1) {
                this.n = cqaVar.n;
            }
            if (this.o == null && (alignment2 = cqaVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = cqaVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = cqaVar.q;
            }
            if (this.j == -1) {
                this.j = cqaVar.j;
                this.k = cqaVar.k;
            }
            if (this.r == null) {
                this.r = cqaVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = cqaVar.s;
            }
            if (this.t == null) {
                this.t = cqaVar.t;
            }
            if (this.u == null) {
                this.u = cqaVar.u;
            }
            if (this.v == null) {
                this.v = cqaVar.v;
            }
            if (!this.e && cqaVar.e) {
                this.d = cqaVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = cqaVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
