package defpackage;

import com.tracket.editor.dto.BlendMode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class pv0 {
    public final float a;
    public final BlendMode b;

    public pv0(float f, BlendMode blendMode) {
        blendMode.getClass();
        this.a = f;
        this.b = blendMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv0)) {
            return false;
        }
        pv0 pv0Var = (pv0) obj;
        return Float.compare(this.a, pv0Var.a) == 0 && this.b == pv0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(opacity=" + this.a + ", blendMode=" + this.b + ")";
    }
}
