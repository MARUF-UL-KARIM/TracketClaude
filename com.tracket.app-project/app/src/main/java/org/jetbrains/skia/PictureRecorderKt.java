package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class PictureRecorderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native long PictureRecorder_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long PictureRecorder_nMake();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nBeginRecording(long j, float f, float f2, float f3, float f4, long j2);

    private static final native long _nFinishRecordingAsDrawable(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nFinishRecordingAsPicture(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nFinishRecordingAsPictureWithCull(long j, float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nGetRecordingCanvas(long j);
}
