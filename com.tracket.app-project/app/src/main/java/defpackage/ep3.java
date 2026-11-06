package defpackage;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ep3 extends dp3 implements ym8 {
    public final SQLiteStatement z;

    public ep3(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.z = sQLiteStatement;
    }

    @Override // defpackage.ym8
    public final long i0() {
        return this.z.executeInsert();
    }

    @Override // defpackage.ym8
    public final void j() {
        this.z.execute();
    }

    @Override // defpackage.ym8
    public final int t() {
        return this.z.executeUpdateDelete();
    }
}
