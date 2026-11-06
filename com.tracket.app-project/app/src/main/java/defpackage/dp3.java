package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class dp3 implements tm8 {
    public final SQLiteProgram y;

    public dp3(SQLiteProgram sQLiteProgram) {
        this.y = sQLiteProgram;
    }

    @Override // defpackage.tm8
    public final void M(int i, byte[] bArr) {
        this.y.bindBlob(i, bArr);
    }

    @Override // defpackage.tm8
    public final void b(int i, double d) {
        this.y.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.y.close();
    }

    @Override // defpackage.tm8
    public final void g(int i, long j) {
        this.y.bindLong(i, j);
    }

    @Override // defpackage.tm8
    public final void i(int i) {
        this.y.bindNull(i);
    }

    @Override // defpackage.tm8
    public final void l() {
        this.y.clearBindings();
    }

    @Override // defpackage.tm8
    public final void s(int i, String str) {
        str.getClass();
        this.y.bindString(i, str);
    }
}
