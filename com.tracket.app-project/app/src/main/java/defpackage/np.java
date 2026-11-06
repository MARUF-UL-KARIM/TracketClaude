package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class np {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static yv4 b(Configuration configuration) {
        return yv4.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(yv4 yv4Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(yv4Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, yv4 yv4Var) {
        configuration.setLocales(LocaleList.forLanguageTags(yv4Var.a.a.toLanguageTags()));
    }
}
