package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.view.inputmethod.DeleteRangeGesture;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class iw3 {
    public static /* bridge */ /* synthetic */ Class B() {
        return TopicsManager.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return SdkSandboxController.class;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager g(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse h(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager j(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ SdkSandboxController n(Object obj) {
        return (SdkSandboxController) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture q(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class r() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }
}
