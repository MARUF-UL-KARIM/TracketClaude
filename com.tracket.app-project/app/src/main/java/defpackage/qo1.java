package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 implements lb7 {
    public final lb7 y;

    public qo1(lb7 lb7Var) {
        this.y = lb7Var;
    }

    @Override // defpackage.lb7
    public final void E(int i, String str) {
        str.getClass();
        this.y.E(i, str);
    }

    @Override // defpackage.lb7
    public final String U(int i) {
        return this.y.U(i);
    }

    @Override // defpackage.lb7
    public final void b(int i, double d) {
        this.y.b(i, d);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        lb7 lb7Var = this.y;
        lb7Var.reset();
        lb7Var.l();
    }

    @Override // defpackage.lb7
    public final boolean f0() {
        return this.y.f0();
    }

    @Override // defpackage.lb7
    public final void g(int i, long j) {
        this.y.g(i, j);
    }

    @Override // defpackage.lb7
    public final byte[] getBlob(int i) {
        return this.y.getBlob(i);
    }

    @Override // defpackage.lb7
    public final boolean getBoolean() {
        return this.y.getBoolean();
    }

    @Override // defpackage.lb7
    public final int getColumnCount() {
        return this.y.getColumnCount();
    }

    @Override // defpackage.lb7
    public final String getColumnName(int i) {
        return this.y.getColumnName(i);
    }

    @Override // defpackage.lb7
    public final List getColumnNames() {
        return this.y.getColumnNames();
    }

    @Override // defpackage.lb7
    public final double getDouble(int i) {
        return this.y.getDouble(i);
    }

    @Override // defpackage.lb7
    public final long getLong(int i) {
        return this.y.getLong(i);
    }

    @Override // defpackage.lb7
    public final int h0(int i) {
        return this.y.h0(i);
    }

    @Override // defpackage.lb7
    public final void i(int i) {
        this.y.i(i);
    }

    @Override // defpackage.lb7
    public final boolean isNull(int i) {
        return this.y.isNull(i);
    }

    @Override // defpackage.lb7
    public final void l() {
        this.y.l();
    }

    @Override // defpackage.lb7
    public final void reset() {
        this.y.reset();
    }
}
