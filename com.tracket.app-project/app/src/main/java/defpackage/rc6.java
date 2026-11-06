package defpackage;

import android.app.ApplicationExitInfo;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rc6 implements xp3 {
    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        int reason = ((ApplicationExitInfo) obj).getReason();
        return Boolean.valueOf(reason == 6 || reason == 5 || reason == 3 || reason == 9);
    }
}
