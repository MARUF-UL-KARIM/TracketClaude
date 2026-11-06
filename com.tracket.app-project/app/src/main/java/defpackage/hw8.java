package defpackage;

import com.tracket.editor.dto.Visual$Text;
import org.jetbrains.skia.Typeface;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class hw8 {
    public final Visual$Text.FontKey a;
    public final Typeface b;
    public final String c;
    public final long d;
    public final boolean e;

    public hw8(Visual$Text.FontKey fontKey, Typeface typeface, String str, long j, boolean z) {
        fontKey.getClass();
        this.a = fontKey;
        this.b = typeface;
        this.c = str;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw8)) {
            return false;
        }
        hw8 hw8Var = (hw8) obj;
        return ff4.h(this.a, hw8Var.a) && ff4.h(this.b, hw8Var.b) && ff4.h(this.c, hw8Var.c) && this.d == hw8Var.d && this.e == hw8Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Typeface typeface = this.b;
        int iHashCode2 = (iHashCode + (typeface == null ? 0 : typeface.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.e) + ot5.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "TextRenderAsset(fontKey=" + this.a + ", typeface=" + this.b + ", fontFilePath=" + this.c + ", version=" + this.d + ", isFallback=" + this.e + ")";
    }
}
