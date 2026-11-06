package androidx.compose.ui.contentcapture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class AndroidContentCaptureManager$TranslateStatus {
    public static final /* synthetic */ AndroidContentCaptureManager$TranslateStatus[] A;
    public static final AndroidContentCaptureManager$TranslateStatus y;
    public static final AndroidContentCaptureManager$TranslateStatus z;

    static {
        AndroidContentCaptureManager$TranslateStatus androidContentCaptureManager$TranslateStatus = new AndroidContentCaptureManager$TranslateStatus("SHOW_ORIGINAL", 0);
        y = androidContentCaptureManager$TranslateStatus;
        AndroidContentCaptureManager$TranslateStatus androidContentCaptureManager$TranslateStatus2 = new AndroidContentCaptureManager$TranslateStatus("SHOW_TRANSLATED", 1);
        z = androidContentCaptureManager$TranslateStatus2;
        A = new AndroidContentCaptureManager$TranslateStatus[]{androidContentCaptureManager$TranslateStatus, androidContentCaptureManager$TranslateStatus2};
    }

    public static AndroidContentCaptureManager$TranslateStatus valueOf(String str) {
        return (AndroidContentCaptureManager$TranslateStatus) Enum.valueOf(AndroidContentCaptureManager$TranslateStatus.class, str);
    }

    public static AndroidContentCaptureManager$TranslateStatus[] values() {
        return (AndroidContentCaptureManager$TranslateStatus[]) A.clone();
    }
}
