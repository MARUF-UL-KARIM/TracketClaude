package org.checkerframework.checker.i18nformatter.qual;

import java.util.Date;
import java.util.StringJoiner;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum I18nConversionCategory {
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED(null),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL(null),
    /* JADX INFO: Fake field, exist only in values array */
    DATE(new Class[]{Date.class, Number.class}),
    /* JADX INFO: Fake field, exist only in values array */
    NUMBER(new Class[]{Number.class});

    public final Class[] y;

    I18nConversionCategory(Class[] clsArr) {
        this.y = clsArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder(name());
        Class[] clsArr = this.y;
        if (clsArr == null) {
            sb.append(" conversion category (all types)");
        } else {
            StringJoiner stringJoiner = new StringJoiner(", ", " conversion category (one of: ", ")");
            for (Class cls : clsArr) {
                stringJoiner.add(cls.getCanonicalName());
            }
            sb.append(stringJoiner);
        }
        return sb.toString();
    }
}
