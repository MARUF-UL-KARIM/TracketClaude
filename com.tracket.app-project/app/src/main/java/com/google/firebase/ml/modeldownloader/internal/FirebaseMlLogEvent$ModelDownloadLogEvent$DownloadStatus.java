package com.google.firebase.ml.modeldownloader.internal;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus {
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus A;
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus B;
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus C;
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus D;
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus E;
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus F;
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus G;
    public static final /* synthetic */ FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus[] H;
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus y;
    public static final FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus z;

    static {
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("UNKNOWN_STATUS", 0);
        y = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus;
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus2 = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("EXPLICITLY_REQUESTED", 1);
        z = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus2;
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus3 = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("MODEL_INFO_RETRIEVAL_SUCCEEDED", 2);
        A = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus3;
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus4 = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("MODEL_INFO_RETRIEVAL_FAILED", 3);
        B = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus4;
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus5 = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("SCHEDULED", 4);
        C = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus5;
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus6 = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("DOWNLOADING", 5);
        D = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus6;
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus7 = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("SUCCEEDED", 6);
        E = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus7;
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus8 = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("FAILED", 7);
        F = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus8;
        FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus9 = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus("UPDATE_AVAILABLE", 8);
        G = firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus9;
        H = new FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus[]{firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus2, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus3, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus4, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus5, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus6, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus7, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus8, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus9};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus);
        sparseArray.put(1, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus2);
        sparseArray.put(3, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus3);
        sparseArray.put(4, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus4);
        sparseArray.put(5, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus5);
        sparseArray.put(6, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus6);
        sparseArray.put(7, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus7);
        sparseArray.put(8, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus8);
        sparseArray.put(10, firebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus9);
    }

    public static FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus valueOf(String str) {
        return (FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus) Enum.valueOf(FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus.class, str);
    }

    public static FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus[] values() {
        return (FirebaseMlLogEvent$ModelDownloadLogEvent$DownloadStatus[]) H.clone();
    }
}
