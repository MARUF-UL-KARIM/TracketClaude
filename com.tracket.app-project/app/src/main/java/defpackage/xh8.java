package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public interface xh8 {
    static {
        int i = wh8.a;
    }

    Set a();

    default void b(lq3 lq3Var) {
        for (Map.Entry entry : a()) {
            lq3Var.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    boolean c();

    List d(String str);

    default String e(String str) {
        List listD = d(str);
        if (listD != null) {
            return (String) sc1.H(listD);
        }
        return null;
    }

    boolean isEmpty();
}
