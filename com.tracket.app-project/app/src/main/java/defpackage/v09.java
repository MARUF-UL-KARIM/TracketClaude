package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class v09 implements o86 {
    public final int y;
    public final long z;

    public v09(int i, long j) {
        this.y = i;
        this.z = j;
    }

    @Override // defpackage.o86
    public final long d(fc4 fc4Var, long j, LayoutDirection layoutDirection, long j2) {
        int i = (int) (j2 >> 32);
        int iD = ((fc4Var.d() - i) / 2) + fc4Var.a;
        long j3 = this.z;
        if (iD < 0) {
            int i2 = fc4Var.a;
            int i3 = (i + i2) - ((int) (j3 >> 32));
            iD = i2 - (i3 >= 0 ? i3 : 0);
        } else if (iD + i > ((int) (j3 >> 32)) && (iD = fc4Var.c - i) < 0) {
            iD = 0;
        }
        int i4 = fc4Var.b - ((int) (j2 & 4294967295L));
        int i5 = this.y;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = fc4Var.d + i5;
        }
        return (((long) iD) << 32) | (((long) i6) & 4294967295L);
    }
}
