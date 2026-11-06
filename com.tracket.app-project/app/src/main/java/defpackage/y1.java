package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y1 implements Map.Entry {
    public final /* synthetic */ int y;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.y) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (fwb.a(getKey(), entry.getKey()) && fwb.a(getValue(), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (hfe.c(getKey(), entry2.getKey()) && hfe.c(getValue(), entry2.getValue())) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.y) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    public final String toString() {
        switch (this.y) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return wd0.k(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
