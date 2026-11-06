package org.jetbrains.skia.shaper;

import defpackage.l82;
import defpackage.wi4;
import defpackage.xk5;
import java.text.Bidi;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaTextBidiRunIterator implements Iterator<BidiRun>, wi4 {
    private final Bidi _bidi;
    private int _run;
    private final int _runsCount;

    public JavaTextBidiRunIterator(String str, int i) {
        Bidi bidi = new Bidi(str, i);
        this._bidi = bidi;
        this._runsCount = bidi.getRunCount();
        this._run = -1;
    }

    public final Bidi get_bidi$skiko_release() {
        return this._bidi;
    }

    public final int get_run$skiko_release() {
        return this._run;
    }

    public final int get_runsCount$skiko_release() {
        return this._runsCount;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this._run + 1 < this._runsCount;
    }

    @Override // java.util.Iterator
    public BidiRun next() {
        int i = this._run + 1;
        this._run = i;
        return new BidiRun(this._bidi.getRunLimit(i), this._bidi.getRunLevel(this._run));
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new xk5("An operation is not implemented: Not yet implemented");
    }

    public final void set_run$skiko_release(int i) {
        this._run = i;
    }

    public JavaTextBidiRunIterator(String str) {
        this(str, 0, 2, null);
    }

    public /* synthetic */ JavaTextBidiRunIterator(String str, int i, int i2, l82 l82Var) {
        this(str, (i2 & 2) != 0 ? -2 : i);
    }
}
