package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class dy7 {
    public int A;
    public int[] y;
    public Object[] z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dy7(dy7 dy7Var) {
        this(0);
        int i = dy7Var.A;
        b(this.A + i);
        if (this.A != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(dy7Var.f(i2), dy7Var.i(i2));
            }
        } else if (i > 0) {
            xu.e(0, 0, i, dy7Var.y, this.y);
            xu.f(0, 0, i << 1, dy7Var.z, this.z);
            this.A = i;
        }
    }

    public final int a(Object obj) {
        int i = this.A * 2;
        Object[] objArr = this.z;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.A;
        int[] iArr = this.y;
        if (iArr.length < i) {
            this.y = Arrays.copyOf(iArr, i);
            this.z = Arrays.copyOf(this.z, i * 2);
        }
        if (this.A == i2) {
            return;
        }
        cp2.k();
    }

    public final int c(int i, Object obj) {
        int i2 = this.A;
        if (i2 == 0) {
            return -1;
        }
        int iB = kab.b(i2, this.y, i);
        if (iB < 0 || ff4.h(obj, this.z[iB << 1])) {
            return iB;
        }
        int i3 = iB + 1;
        while (i3 < i2 && this.y[i3] == i) {
            if (ff4.h(obj, this.z[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iB - 1; i4 >= 0 && this.y[i4] == i; i4--) {
            if (ff4.h(obj, this.z[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        int i = this.A;
        if (i > 0) {
            this.y = kab.a;
            this.z = kab.c;
            i = 0;
            this.A = 0;
        }
        if (i <= 0) {
            return;
        }
        cp2.k();
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.A;
        if (i == 0) {
            return -1;
        }
        int iB = kab.b(i, this.y, 0);
        if (iB < 0 || this.z[iB << 1] == null) {
            return iB;
        }
        int i2 = iB + 1;
        while (i2 < i && this.y[i2] == 0) {
            if (this.z[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iB - 1; i3 >= 0 && this.y[i3] == 0; i3--) {
            if (this.z[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof dy7) {
                int i = this.A;
                if (i != ((dy7) obj).A) {
                    return false;
                }
                dy7 dy7Var = (dy7) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objI = i(i2);
                    Object obj2 = dy7Var.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !dy7Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.A != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.A;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objI2 = i(i4);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.A) {
            z = true;
        }
        if (z) {
            return this.z[i << 1];
        }
        cp2.m(ot5.n(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A)) {
            cp2.m(ot5.n(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.z;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.y;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                xu.e(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.z;
                xu.f(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.z;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.y = Arrays.copyOf(iArr, i7);
            this.z = Arrays.copyOf(this.z, i7 << 1);
            if (i2 != this.A) {
                cp2.k();
                return null;
            }
            if (i > 0) {
                xu.e(0, 0, i, iArr, this.y);
                xu.f(0, 0, i3, objArr, this.z);
            }
            if (i < i4) {
                int i8 = i + 1;
                xu.e(i, i8, i2, iArr, this.y);
                xu.f(i3, i8 << 1, i2 << 1, objArr, this.z);
            }
        }
        if (i2 == this.A) {
            this.A = i4;
            return obj;
        }
        cp2.k();
        return null;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.z[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.z[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.A) {
            z = true;
        }
        if (!z) {
            cp2.m(ot5.n(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.z;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.y;
        Object[] objArr = this.z;
        int i = this.A;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        boolean z = false;
        if (i >= 0 && i < this.A) {
            z = true;
        }
        if (z) {
            return this.z[(i << 1) + 1];
        }
        cp2.m(ot5.n(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean isEmpty() {
        return this.A <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.A;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.z;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.y;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.y = Arrays.copyOf(iArr, i4);
            this.z = Arrays.copyOf(this.z, i4 << 1);
            if (i != this.A) {
                cp2.k();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.y;
            int i5 = i3 + 1;
            xu.e(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.z;
            xu.f(i5 << 1, i3 << 1, this.A << 1, objArr2, objArr2);
        }
        int i6 = this.A;
        if (i == i6) {
            int[] iArr3 = this.y;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.z;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.A = i6 + 1;
                return null;
            }
        }
        cp2.k();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !ff4.h(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !ff4.h(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    public final int size() {
        return this.A;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A * 28);
        sb.append('{');
        int i = this.A;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public dy7(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = kab.a;
        } else {
            iArr = new int[i];
        }
        this.y = iArr;
        if (i == 0) {
            objArr = kab.c;
        } else {
            objArr = new Object[i << 1];
        }
        this.z = objArr;
    }

    public dy7() {
        this(0);
    }
}
