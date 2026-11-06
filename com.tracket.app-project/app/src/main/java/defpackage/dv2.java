package defpackage;

import com.tracket.editor.EditorTool$Kind;
import com.tracket.editor.dto.TrackingRegionShape;
import com.tracket.editor.ui.GuardTarget;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class dv2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[GuardTarget.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[EditorTool$Kind.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[TrackingRegionShape.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
