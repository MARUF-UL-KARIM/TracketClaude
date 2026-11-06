package defpackage;

import com.tracket.editor.preview.RenderBackgroundShader;
import com.tracket.rendering.FinalPresentFilterMode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class uv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RenderBackgroundShader.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[FinalPresentFilterMode.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
