package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class yhd {
    public static final yhd c;
    public static final yhd d;
    public static final yhd e;
    public static final yhd f;
    public static final yhd g;
    public static final yhd h;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i = 0;
        c = new yhd("TINK", i);
        d = new yhd("NO_PREFIX", i);
        int i2 = 1;
        e = new yhd("TINK", i2);
        f = new yhd("CRUNCHY", i2);
        g = new yhd("LEGACY", i2);
        h = new yhd("NO_PREFIX", i2);
    }

    public yhd(String str) {
        this.a = 4;
        this.b = zd2.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e2);
                str2 = wd0.l(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return wd0.k(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", e(this.b, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.b, str, objArr));
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.b, str, objArr));
        }
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
            case 1:
            case 3:
                return str;
            case 2:
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yhd(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public yhd(g0c g0cVar) {
        String strA;
        this.a = 3;
        try {
            strA = g0cVar.a();
        } catch (RemoteException e2) {
            q9c.g("", e2);
            strA = null;
        }
        this.b = strA;
    }
}
