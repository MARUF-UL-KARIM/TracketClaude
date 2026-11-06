package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class skb {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;
    public final tga d;

    public skb(Context context, tga tgaVar) {
        this.c = context;
        this.d = tgaVar;
    }

    public final synchronized void a(String str) {
        try {
            HashMap map = this.a;
            if (map.containsKey(str)) {
                return;
            }
            boolean zEquals = Objects.equals(str, "__default__");
            Context context = this.c;
            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            udb udbVar = new udb(this, str);
            map.put(str, udbVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(udbVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
