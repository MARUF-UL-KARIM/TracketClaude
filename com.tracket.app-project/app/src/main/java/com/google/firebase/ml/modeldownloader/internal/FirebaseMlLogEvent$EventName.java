package com.google.firebase.ml.modeldownloader.internal;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseMlLogEvent$EventName {
    public static final /* synthetic */ FirebaseMlLogEvent$EventName[] A;
    public static final FirebaseMlLogEvent$EventName y;
    public static final FirebaseMlLogEvent$EventName z;

    /* JADX INFO: Fake field, exist only in values array */
    FirebaseMlLogEvent$EventName EF0;

    static {
        FirebaseMlLogEvent$EventName firebaseMlLogEvent$EventName = new FirebaseMlLogEvent$EventName("UNKNOWN_EVENT", 0);
        FirebaseMlLogEvent$EventName firebaseMlLogEvent$EventName2 = new FirebaseMlLogEvent$EventName("MODEL_DOWNLOAD", 1);
        y = firebaseMlLogEvent$EventName2;
        FirebaseMlLogEvent$EventName firebaseMlLogEvent$EventName3 = new FirebaseMlLogEvent$EventName("MODEL_UPDATE", 2);
        FirebaseMlLogEvent$EventName firebaseMlLogEvent$EventName4 = new FirebaseMlLogEvent$EventName("REMOTE_MODEL_DELETE_ON_DEVICE", 3);
        z = firebaseMlLogEvent$EventName4;
        A = new FirebaseMlLogEvent$EventName[]{firebaseMlLogEvent$EventName, firebaseMlLogEvent$EventName2, firebaseMlLogEvent$EventName3, firebaseMlLogEvent$EventName4};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, firebaseMlLogEvent$EventName);
        sparseArray.put(100, firebaseMlLogEvent$EventName2);
        sparseArray.put(101, firebaseMlLogEvent$EventName3);
        sparseArray.put(252, firebaseMlLogEvent$EventName4);
    }

    public static FirebaseMlLogEvent$EventName valueOf(String str) {
        return (FirebaseMlLogEvent$EventName) Enum.valueOf(FirebaseMlLogEvent$EventName.class, str);
    }

    public static FirebaseMlLogEvent$EventName[] values() {
        return (FirebaseMlLogEvent$EventName[]) A.clone();
    }
}
