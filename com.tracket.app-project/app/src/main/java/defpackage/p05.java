package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class p05 implements Map.Entry, wi4 {
    public final Object A;
    public final /* synthetic */ int y;
    public final Object z;

    public p05(String str, List list) {
        this.y = 2;
        str.getClass();
        list.getClass();
        this.z = str;
        this.A = list;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        int i = this.y;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && ff4.h(entry.getKey(), obj2) && ff4.h(entry.getValue(), getValue());
            case 1:
            default:
                return super.equals(obj);
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return ff4.h(entry2.getKey(), (String) obj2) && ff4.h(entry2.getValue(), (List) this.A);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.y) {
            case 0:
                return this.z;
            case 1:
                return this.z;
            default:
                return (String) this.z;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.y) {
            case 0:
                return this.A;
            case 1:
                return this.A;
            default:
                return (List) this.A;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i = this.y;
        Object obj = this.z;
        switch (i) {
            case 0:
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            case 1:
            default:
                return super.hashCode();
            case 2:
                return ((List) this.A).hashCode() ^ ((String) obj).hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        int i = this.y;
        Object obj = this.z;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                return ((String) obj) + '=' + ((List) this.A);
        }
    }

    public /* synthetic */ p05(int i, Object obj, Object obj2) {
        this.y = i;
        this.z = obj;
        this.A = obj2;
    }
}
