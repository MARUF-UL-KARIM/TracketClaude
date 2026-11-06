package defpackage;

import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ap3 extends RuntimeException {
    public final FrameworkSQLiteOpenHelper$OpenHelper$CallbackName y;
    public final Throwable z;

    public ap3(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName, Throwable th) {
        super(th);
        this.y = frameworkSQLiteOpenHelper$OpenHelper$CallbackName;
        this.z = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.z;
    }
}
