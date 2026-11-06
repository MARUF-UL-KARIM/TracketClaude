package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class hf7 implements qs5 {
    public Float A = null;
    public Float B = null;
    public we7 C = null;
    public we7 D = null;
    public final int y;
    public final List z;

    public hf7(int i, ArrayList arrayList) {
        this.y = i;
        this.z = arrayList;
    }

    @Override // defpackage.qs5
    public final boolean o() {
        return this.z.contains(this);
    }
}
