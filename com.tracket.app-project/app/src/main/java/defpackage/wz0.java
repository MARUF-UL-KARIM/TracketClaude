package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class wz0 {
    public final /* synthetic */ int y;
    public int z;

    public /* synthetic */ wz0(int i, int i2) {
        this.y = i2;
        this.z = i;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = ff4.i(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static String o(int i) {
        char c = (char) ((i >> 24) & 255);
        char c2 = (char) ((i >> 16) & 255);
        char c3 = (char) ((i >> 8) & 255);
        char c4 = (char) (i & 255);
        StringBuilder sb = new StringBuilder(iu1.b(String.valueOf(c).length(), String.valueOf(c2).length(), String.valueOf(c3).length(), String.valueOf(c4).length()));
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }

    public void a(int i) {
        this.z = i | this.z;
    }

    public boolean g(int i) {
        return (this.z & i) == i;
    }

    public abstract void i(yo3 yo3Var);

    public abstract void j(yo3 yo3Var, int i, int i2);

    public abstract void k(yo3 yo3Var);

    public abstract void l(yo3 yo3Var, int i, int i2);

    public String toString() {
        switch (this.y) {
            case 1:
                return c(this.z);
            case 2:
            default:
                return super.toString();
            case 3:
                return o(this.z);
        }
    }

    public /* synthetic */ wz0() {
        this.y = 0;
    }

    public void h(yo3 yo3Var) {
    }
}
