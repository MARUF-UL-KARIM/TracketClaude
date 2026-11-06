package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class l6d implements h6d {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.h6d
    public final synchronized void c(HashMap map, Context context, View view) {
        ArrayList arrayList = this.a;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // defpackage.h6d
    public final void a(HashMap map) {
    }

    @Override // defpackage.h6d
    public final void b(HashMap map) {
    }
}
