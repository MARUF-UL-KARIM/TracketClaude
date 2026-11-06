package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ab9 {
    public final int a;
    public final List b;
    public final byte[] c;

    public ab9(int i, String str, int i2, ArrayList arrayList, byte[] bArr, int i3) {
        switch (i3) {
            case 1:
                this.a = i2;
                this.b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                this.c = bArr;
                break;
            default:
                this.a = i2;
                this.b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                this.c = bArr;
                break;
        }
    }

    public int a() {
        int i = this.a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public int b() {
        int i = this.a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }
}
