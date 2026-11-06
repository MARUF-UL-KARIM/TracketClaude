package org.jetbrains.skia.shaper;

import defpackage.zd2;
import org.jetbrains.skia.FourByteTag;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ScriptRun {
    private final int end;
    private final int scriptTag;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScriptRun(int i, String str) {
        this(i, FourByteTag.Companion.fromString(str));
        str.getClass();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScriptRun)) {
            return false;
        }
        ScriptRun scriptRun = (ScriptRun) obj;
        return this.end == scriptRun.end && this.scriptTag == scriptRun.scriptTag;
    }

    public final int getEnd$skiko_release() {
        return this.end;
    }

    public final String getScript() {
        return FourByteTag.Companion.toString(this.scriptTag);
    }

    public final int getScriptTag$skiko_release() {
        return this.scriptTag;
    }

    public int hashCode() {
        return ((this.end + 59) * 59) + this.scriptTag;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScriptRun(_end=");
        sb.append(this.end);
        sb.append(", _scriptTag=");
        return zd2.n(sb, this.scriptTag, ')');
    }

    public ScriptRun(int i, int i2) {
        this.end = i;
        this.scriptTag = i2;
    }
}
