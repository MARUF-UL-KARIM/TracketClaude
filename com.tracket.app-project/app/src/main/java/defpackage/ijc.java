package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ijc implements hnc {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ ijc(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.hnc
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Bundle) obj).putString("adid_p", true != z ? "0" : "1");
                break;
            case 1:
                ((Bundle) obj).putBoolean("ibrr", z);
                break;
            case 2:
                ((Bundle) obj).putBoolean("is_gbid", z);
                break;
            default:
                Bundle bundle = (Bundle) obj;
                if (z) {
                    bundle.putBoolean("sdk_prefetch", true);
                }
                break;
        }
    }
}
