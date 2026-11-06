package defpackage;

import com.tracket.rendering.color.EffectivePreviewMode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class tw3 {
    public final EffectivePreviewMode a;
    public final String b;

    public tw3(EffectivePreviewMode effectivePreviewMode, String str) {
        this.a = effectivePreviewMode;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw3)) {
            return false;
        }
        tw3 tw3Var = (tw3) obj;
        return this.a == tw3Var.a && this.b.equals(tw3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HdrRenderSessionDecision(previewMode=" + this.a + ", reason=" + this.b + ")";
    }
}
