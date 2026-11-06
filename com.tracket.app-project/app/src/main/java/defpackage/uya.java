package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class uya {
    public final String a;
    public String b;
    public final rib c;
    public final Bundle d = new Bundle();
    public final long e;
    public final long f;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public uya(JsonReader jsonReader, rib ribVar) throws IOException {
        Bundle bundle;
        this.e = -1L;
        this.f = -1L;
        this.c = ribVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.e = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.f = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.d.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) wxa.e.c.a(u5b.J2)).booleanValue() || ribVar == null || (bundle = ribVar.K) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.e);
        bundle.putLong("get-signals-sdkcore-end", this.f);
    }
}
