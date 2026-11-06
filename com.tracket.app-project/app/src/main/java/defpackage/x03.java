package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class x03 extends i1 implements w03, RandomAccess, Serializable {
    public final Enum[] y;

    public x03(Enum[] enumArr) {
        enumArr.getClass();
        this.y = enumArr;
    }

    @Override // defpackage.y
    public final int a() {
        return this.y.length;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) xu.D(this.y, r3.ordinal())) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.y;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        cp2.j(zd2.i(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.i1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) xu.D(this.y, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.i1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) xu.D(this.y, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
