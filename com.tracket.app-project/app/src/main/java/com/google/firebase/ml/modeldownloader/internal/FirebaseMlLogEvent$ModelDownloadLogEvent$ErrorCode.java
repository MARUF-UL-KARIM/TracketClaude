package com.google.firebase.ml.modeldownloader.internal;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.google.firebase.ml.modeldownloader.internal.FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode, still in use, count: 1, list:
  (r1v1 com.google.firebase.ml.modeldownloader.internal.FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode) from 0x0071: INVOKE 
  (r14v4 android.util.SparseArray)
  (5 int)
  (r1v1 com.google.firebase.ml.modeldownloader.internal.FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode)
 VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:114)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(101),
    NO_NETWORK_CONNECTION(102),
    DOWNLOAD_FAILED(104),
    MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS(105),
    MODEL_INFO_DOWNLOAD_CONNECTION_FAILED(107),
    MODEL_HASH_MISMATCH(116),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERROR(9999);

    public final int y;

    static {
        FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode = NO_ERROR;
        FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode2 = NO_NETWORK_CONNECTION;
        FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode3 = DOWNLOAD_FAILED;
        FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode4 = MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS;
        FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode5 = MODEL_INFO_DOWNLOAD_CONNECTION_FAILED;
        FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode6 = MODEL_HASH_MISMATCH;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode);
        sparseArray.put(5, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode);
        sparseArray.put(101, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode);
        sparseArray.put(102, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode2);
        sparseArray.put(104, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode3);
        sparseArray.put(105, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode4);
        sparseArray.put(107, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode5);
        sparseArray.put(116, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode6);
        sparseArray.put(9999, firebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode);
    }

    public FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode(int i) {
        super(str, i);
        this.y = i;
    }

    public static FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode valueOf(String str) {
        return (FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode) Enum.valueOf(FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode.class, str);
    }

    public static FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode[] values() {
        return (FirebaseMlLogEvent$ModelDownloadLogEvent$ErrorCode[]) F.clone();
    }
}
