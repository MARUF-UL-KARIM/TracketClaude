package defpackage;

import com.tracket.editor.dto.AspectRatio;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ux1 implements yx1 {
    public final AspectRatio a;

    public ux1(AspectRatio aspectRatio) {
        aspectRatio.getClass();
        this.a = aspectRatio;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux1) && this.a == ((ux1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fixed(ratio=" + this.a + ")";
    }
}
