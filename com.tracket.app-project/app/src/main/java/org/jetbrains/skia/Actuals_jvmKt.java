package org.jetbrains.skia;

import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Actuals_jvmKt {
    public static final <R> void commonSynchronized(Object obj, Function0<? extends R> function0) {
        obj.getClass();
        function0.getClass();
        synchronized (obj) {
            function0.invoke();
        }
    }

    public static final Pattern compilePattern(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        return patternCompile;
    }

    public static final String defaultLanguageTag() {
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }
}
