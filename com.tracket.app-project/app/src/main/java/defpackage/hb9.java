package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class hb9 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public rt8 r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(hb9 hb9Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (hb9Var != null) {
            if (!this.c && hb9Var.c) {
                this.b = hb9Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = hb9Var.h;
            }
            if (this.i == -1) {
                this.i = hb9Var.i;
            }
            if (this.a == null && (str = hb9Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = hb9Var.f;
            }
            if (this.g == -1) {
                this.g = hb9Var.g;
            }
            if (this.n == -1) {
                this.n = hb9Var.n;
            }
            if (this.o == null && (alignment2 = hb9Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = hb9Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = hb9Var.q;
            }
            if (this.j == -1) {
                this.j = hb9Var.j;
                this.k = hb9Var.k;
            }
            if (this.r == null) {
                this.r = hb9Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = hb9Var.s;
            }
            if (this.t == null) {
                this.t = hb9Var.t;
            }
            if (this.u == null) {
                this.u = hb9Var.u;
            }
            if (!this.e && hb9Var.e) {
                this.d = hb9Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = hb9Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
