package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class we7 {
    public final Function0 a;
    public final Function0 b;
    public final boolean c;

    public we7(Function0 function0, Function0 function1, boolean z) {
        this.a = function0;
        this.b = function1;
        this.c = z;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}
