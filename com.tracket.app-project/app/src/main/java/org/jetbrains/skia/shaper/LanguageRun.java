package org.jetbrains.skia.shaper;

import defpackage.ff4;
import defpackage.zd2;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class LanguageRun {
    private final int end;
    private final String language;

    public LanguageRun(int i, String str) {
        str.getClass();
        this.end = i;
        this.language = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LanguageRun)) {
            return false;
        }
        LanguageRun languageRun = (LanguageRun) obj;
        if (this.end != languageRun.end) {
            return false;
        }
        return ff4.h(this.language, languageRun.language);
    }

    public final int getEnd$skiko_release() {
        return this.end;
    }

    public final String getLanguage$skiko_release() {
        return this.language;
    }

    public int hashCode() {
        return this.language.hashCode() + ((this.end + 59) * 59);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LanguageRun(_end=");
        sb.append(this.end);
        sb.append(", _language=");
        return zd2.p(sb, this.language, ')');
    }
}
