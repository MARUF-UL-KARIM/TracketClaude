package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class iy2 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile iy2 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new f38(cls, charSequence) : super.newEditable(charSequence);
    }
}
