package defpackage;

import com.tracket.processing.reverse.ReverseAudioJobStatus;
import com.tracket.processing.reverse.ReverseVideoJobStatus;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ix6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ReverseVideoJobStatus.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ReverseAudioJobStatus.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
