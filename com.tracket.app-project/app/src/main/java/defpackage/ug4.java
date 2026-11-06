package defpackage;

import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ug4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final ClassDiscriminatorMode i;
    public final boolean j;

    public ug4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, boolean z6, ClassDiscriminatorMode classDiscriminatorMode, boolean z7) {
        str.getClass();
        str2.getClass();
        classDiscriminatorMode.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = str2;
        this.h = z6;
        this.i = classDiscriminatorMode;
        this.j = z7;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.b + ", isLenient=" + this.c + ", allowStructuredMapKeys=" + this.d + ", prettyPrint=false, explicitNulls=" + this.e + ", prettyPrintIndent='" + this.f + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.g + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.h + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.i + ", exceptionsWithDebugInfo=" + this.j + ')';
    }
}
