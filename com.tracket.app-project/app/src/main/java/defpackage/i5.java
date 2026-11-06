package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.Topic;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i5 {
    public static /* bridge */ /* synthetic */ Class A() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return RemoveSpaceGesture.class;
    }

    public static /* synthetic */ GetTopicsRequest.Builder f() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Topic g(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return JoinOrSplitGesture.class;
    }
}
