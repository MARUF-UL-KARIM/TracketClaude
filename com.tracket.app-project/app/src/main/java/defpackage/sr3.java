package defpackage;

import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sr3 implements Runnable {
    public final /* synthetic */ String A;
    public final /* synthetic */ ApplicationProcessState B;
    public final /* synthetic */ int y;
    public final /* synthetic */ GaugeManager z;

    public /* synthetic */ sr3(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState, int i) {
        this.y = i;
        this.z = gaugeManager;
        this.A = str;
        this.B = applicationProcessState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        ApplicationProcessState applicationProcessState = this.B;
        String str = this.A;
        GaugeManager gaugeManager = this.z;
        switch (i) {
            case 0:
                gaugeManager.lambda$stopCollectingGauges$3(str, applicationProcessState);
                break;
            default:
                gaugeManager.lambda$startCollectingGauges$2(str, applicationProcessState);
                break;
        }
    }
}
