package defpackage;

import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class lhd implements v8e {
    public static final lhd A;
    public static final lhd B;
    public static final lhd C;
    public static final lhd D;
    public static final lhd E;
    public final /* synthetic */ int y;
    public final String z;

    static {
        int i = 0;
        A = new lhd("TINK", i);
        B = new lhd("CRUNCHY", i);
        C = new lhd("NO_PREFIX", i);
        int i2 = 1;
        D = new lhd("IEEE_P1363", i2);
        E = new lhd("DER", i2);
    }

    public /* synthetic */ lhd(String str, int i) {
        this.y = i;
        this.z = str;
    }

    public static lhd a(uic uicVar) {
        String str;
        uicVar.E(2);
        int I = uicVar.I();
        int i = I >> 1;
        int i2 = I & 1;
        int i3 = 3;
        int I2 = uicVar.I() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i4 = I2 | (i2 << 5);
        String str2 = i < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(i4).length();
        String str3 = i4 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(mi9.d(str3, length + length2, length3));
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
        sb.append(i4);
        return new lhd(sb.toString(), i3);
    }

    @Override // defpackage.v8e
    public /* synthetic */ void h(JsonWriter jsonWriter) throws IOException {
        Object obj = zce.b;
        jsonWriter.name("params").beginObject();
        String str = this.z;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        int i = this.y;
        String str = this.z;
        switch (i) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }
}
