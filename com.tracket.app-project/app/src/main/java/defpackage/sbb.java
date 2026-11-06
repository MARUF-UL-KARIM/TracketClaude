package defpackage;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class sbb extends p6a implements tbb {
    @Override // defpackage.tbb
    public final void zza(List list) {
        Parcel parcelY1 = y1();
        parcelY1.writeTypedList(list);
        e2(parcelY1, 1);
    }
}
