package defpackage;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class v2 {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public v2(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    public final za a() {
        za zaVar = new za();
        zaVar.a = "frc";
        zaVar.m = this.d.getTime();
        zaVar.b = this.a;
        zaVar.c = this.b;
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        zaVar.d = str;
        zaVar.e = this.e;
        zaVar.j = this.f;
        return zaVar;
    }
}
