package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class yv4 {
    public static final yv4 b = new yv4(new zv4(new LocaleList(new Locale[0])));
    public final zv4 a;

    public yv4(zv4 zv4Var) {
        this.a = zv4Var;
    }

    public static yv4 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new yv4(new zv4(new LocaleList(localeArr)));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final int c() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yv4) {
            return this.a.equals(((yv4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
