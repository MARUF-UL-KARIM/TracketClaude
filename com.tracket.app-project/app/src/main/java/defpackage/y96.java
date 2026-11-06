package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class y96 {
    public static final x96 a;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    static {
        x96 x96Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                x96Var = new x96();
            } else {
                x96Var = null;
            }
        } else {
            x96Var = null;
        }
        a = x96Var;
    }
}
