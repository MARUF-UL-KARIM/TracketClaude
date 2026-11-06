package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class hdc {
    public final String a;
    public final ArrayList b;
    public final Set c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final int g;
    public final Set h;
    public final Bundle i;
    public final Set j;
    public final boolean k;
    public long l = 0;

    public hdc(xcc xccVar) {
        this.a = xccVar.g;
        this.b = xccVar.h;
        this.c = Collections.unmodifiableSet(xccVar.a);
        this.d = xccVar.b;
        Collections.unmodifiableMap(xccVar.c);
        this.e = xccVar.i;
        this.f = xccVar.j;
        this.g = xccVar.k;
        this.h = Collections.unmodifiableSet(xccVar.d);
        this.i = xccVar.e;
        this.j = Collections.unmodifiableSet(xccVar.f);
        this.k = xccVar.l;
    }
}
