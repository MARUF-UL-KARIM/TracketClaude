package defpackage;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ww4 {
    public static final tw4 a = new tw4();

    public static void a(String str) {
        a.getClass();
        HashSet hashSet = tw4.a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void b(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = tw4.a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
