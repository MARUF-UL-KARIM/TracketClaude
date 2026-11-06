package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class yjc implements hnc {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public /* synthetic */ yjc(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.hnc
    public final void i(Object obj) {
        int i = this.a;
        ArrayList<String> arrayList = this.b;
        switch (i) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
                break;
            default:
                Bundle bundle = (Bundle) obj;
                if (arrayList != null) {
                    bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
                }
                break;
        }
    }
}
