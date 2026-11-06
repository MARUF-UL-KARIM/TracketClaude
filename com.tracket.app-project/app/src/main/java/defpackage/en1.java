package defpackage;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class en1 {
    public static final Date e = new Date(-1);
    public static final Date f = new Date(-1);
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();

    public en1(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final dn1 a() {
        dn1 dn1Var;
        synchronized (this.c) {
            int i = this.a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.a.getLong("backoff_end_time_in_millis", -1L));
            dn1Var = new dn1();
            dn1Var.a = i;
            dn1Var.b = date;
        }
        return dn1Var;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final dn1 c() {
        dn1 dn1Var;
        synchronized (this.d) {
            int i = this.a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L));
            dn1Var = new dn1();
            dn1Var.a = i;
            dn1Var.b = date;
        }
        return dn1Var;
    }

    public final void d(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i, Date date) {
        synchronized (this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
