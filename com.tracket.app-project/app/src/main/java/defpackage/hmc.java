package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class hmc implements hnc {
    public final /* synthetic */ int a;
    public final Boolean b;

    public /* synthetic */ hmc(int i, Boolean bool) {
        this.a = i;
        this.b = bool;
    }

    @Override // defpackage.hnc
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        int i = this.a;
        Boolean bool = this.b;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (bool != null) {
                    bundle.putBoolean("hw_accel", bool.booleanValue());
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                if (bool == null) {
                    bundle2.putInt("lft", -1);
                } else if (!bool.booleanValue()) {
                    bundle2.putInt("lft", 0);
                } else {
                    bundle2.putInt("lft", 1);
                }
                break;
        }
    }
}
