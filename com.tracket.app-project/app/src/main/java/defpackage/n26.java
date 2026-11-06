package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n26 {
    public static final ea2 a;

    static {
        ea2 ea2Var;
        try {
            ea2Var = (ea2) ea2.class.getDeclaredConstructor(null).newInstance(null);
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
            ea2Var = null;
        }
        if (ea2Var == null) {
            StringBuilder sb = new StringBuilder();
            String str = ea2.e[0];
            try {
                ea2Var = (ea2) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
                throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
            }
        }
        a = ea2Var;
    }
}
