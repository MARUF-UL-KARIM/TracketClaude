package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class lba {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final pba b;

    static {
        pba pbaVar;
        for (int i = 0; i < 2; i++) {
            pbaVar = null;
            try {
                pbaVar = (pba) Class.forName(a[i]).asSubclass(pba.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (pbaVar != null) {
                b = pbaVar;
            }
        }
        pbaVar = new pba();
        b = pbaVar;
    }
}
