package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class mbc implements z1c {
    public final Bundle y = new Bundle();

    @Override // defpackage.z1c
    public final synchronized void q(String str) {
        this.y.putInt(str, 1);
    }

    @Override // defpackage.z1c
    public final synchronized void r(String str, String str2) {
        this.y.putInt(str, 3);
    }

    @Override // defpackage.z1c
    public final synchronized void w(String str) {
        this.y.putInt(str, 2);
    }

    @Override // defpackage.z1c
    public final void a() {
    }

    @Override // defpackage.z1c
    public final void b() {
    }

    @Override // defpackage.z1c
    public final void H(String str) {
    }
}
