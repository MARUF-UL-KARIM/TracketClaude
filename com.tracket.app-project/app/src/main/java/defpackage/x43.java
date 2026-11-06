package defpackage;

import com.tracket.editor.export.ExportPersistenceException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class x43 implements z43 {
    public final ExportPersistenceException a;
    public final boolean b;

    public x43(ExportPersistenceException exportPersistenceException, boolean z) {
        this.a = exportPersistenceException;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x43) {
            x43 x43Var = (x43) obj;
            if (this.a == x43Var.a && this.b == x43Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.a + ", partialDestinationDeleted=" + this.b + ")";
    }
}
