package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class sq9 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = fr9.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
