package org.jetbrains.skia;

import defpackage.l82;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class FontStyle {
    private static final FontStyle BOLD;
    private static final FontStyle BOLD_ITALIC;
    public static final Companion Companion = new Companion(null);
    private static final FontStyle ITALIC;
    private static final FontStyle NORMAL;
    private final int _value;

    static {
        FontSlant fontSlant = FontSlant.UPRIGHT;
        NORMAL = new FontStyle(400, 5, fontSlant);
        BOLD = new FontStyle(700, 5, fontSlant);
        FontSlant fontSlant2 = FontSlant.ITALIC;
        ITALIC = new FontStyle(400, 5, fontSlant2);
        BOLD_ITALIC = new FontStyle(700, 5, fontSlant2);
    }

    public FontStyle(int i, int i2, FontSlant fontSlant) {
        fontSlant.getClass();
        this._value = (i & 65535) | ((i2 & 255) << 16) | (fontSlant.ordinal() << 24);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FontStyle) && this._value == ((FontStyle) obj)._value;
    }

    public final FontSlant getSlant() {
        return (FontSlant) FontSlant.getEntries().get((this._value >> 24) & 255);
    }

    public final int getWeight() {
        return this._value & 65535;
    }

    public final int getWidth() {
        return (this._value >> 16) & 255;
    }

    public final int get_value() {
        return this._value;
    }

    public int hashCode() {
        return 59 + this._value;
    }

    public String toString() {
        return "FontStyle(weight=" + getWeight() + ", width=" + getWidth() + ", slant=" + getSlant() + ')';
    }

    public final FontStyle withSlant(FontSlant fontSlant) {
        fontSlant.getClass();
        return new FontStyle(getWeight(), getWidth(), fontSlant);
    }

    public final FontStyle withWeight(int i) {
        return new FontStyle(i, getWidth(), getSlant());
    }

    public final FontStyle withWidth(int i) {
        return new FontStyle(getWeight(), i, getSlant());
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Companion {
        public /* synthetic */ Companion(l82 l82Var) {
            this();
        }

        public final FontStyle getBOLD() {
            return FontStyle.BOLD;
        }

        public final FontStyle getBOLD_ITALIC() {
            return FontStyle.BOLD_ITALIC;
        }

        public final FontStyle getITALIC() {
            return FontStyle.ITALIC;
        }

        public final FontStyle getNORMAL() {
            return FontStyle.NORMAL;
        }

        private Companion() {
        }
    }

    public FontStyle(int i) {
        this._value = i;
    }
}
