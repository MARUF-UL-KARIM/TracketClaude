package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class eia {
    public final iia a;
    public final iia b;

    public eia(iia iiaVar, iia iiaVar2) {
        this.a = iiaVar;
        this.b = iiaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eia.class != obj.getClass()) {
            return false;
        }
        eia eiaVar = (eia) obj;
        return this.a.equals(eiaVar.a) && this.b.equals(eiaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        iia iiaVar = this.a;
        String string = iiaVar.toString();
        iia iiaVar2 = this.b;
        String strConcat = iiaVar.equals(iiaVar2) ? "" : ", ".concat(iiaVar2.toString());
        return zd2.r(new StringBuilder(mi9.d(strConcat, string.length() + 1, 1)), "[", string, strConcat, "]");
    }
}
