package org.jetbrains.skia.shaper;

import defpackage.wi4;
import defpackage.xk5;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class TrivialScriptRunIterator implements Iterator<ScriptRun>, wi4 {
    private boolean _atEnd;
    private final int _length;
    private final String _script;

    public TrivialScriptRunIterator(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        this._length = length;
        this._script = str2;
        this._atEnd = length == 0;
    }

    public final boolean get_atEnd$skiko_release() {
        return this._atEnd;
    }

    public final int get_length() {
        return this._length;
    }

    public final String get_script() {
        return this._script;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this._atEnd;
    }

    @Override // java.util.Iterator
    public ScriptRun next() {
        this._atEnd = true;
        return new ScriptRun(this._length, this._script);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new xk5("An operation is not implemented: Not yet implemented");
    }

    public final void set_atEnd$skiko_release(boolean z) {
        this._atEnd = z;
    }
}
