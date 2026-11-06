package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class rkc implements hnc {
    public final /* synthetic */ int a;
    public final Integer b;

    public /* synthetic */ rkc(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    @Override // defpackage.hnc
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        int i = this.a;
        Integer num = this.b;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (num != null) {
                    bundle.putInt("aos", num.intValue());
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                if (num != null) {
                    bundle2.putInt("dspct", Math.min(num.intValue(), 20));
                }
                break;
        }
    }
}
