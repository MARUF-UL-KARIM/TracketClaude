package defpackage;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class uw7 {
    public static final qi1 b;
    public final Context a;

    static {
        pi1 pi1VarB = qi1.b(uw7.class);
        pi1VarB.a(td2.b(r95.class));
        pi1VarB.a(td2.b(Context.class));
        pi1VarB.E = new fgd(17);
        b = pi1VarB.c();
    }

    public uw7(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
