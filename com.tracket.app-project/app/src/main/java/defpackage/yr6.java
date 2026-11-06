package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yr6 implements mo5, ao5 {
    public final /* synthetic */ RemoteConfigManager y;

    public /* synthetic */ yr6(RemoteConfigManager remoteConfigManager) {
        this.y = remoteConfigManager;
    }

    @Override // defpackage.ao5
    public void H(Exception exc) {
        this.y.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }

    @Override // defpackage.mo5
    public void l(Object obj) {
        this.y.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
