package org.jetbrains.skia.shaper;

import defpackage.zd2;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class BidiRun {
    private final int end;
    private final int level;

    public BidiRun(int i, int i2) {
        this.end = i;
        this.level = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BidiRun)) {
            return false;
        }
        BidiRun bidiRun = (BidiRun) obj;
        return this.end == bidiRun.end && this.level == bidiRun.level;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getLevel() {
        return this.level;
    }

    public int hashCode() {
        return ((this.end + 59) * 59) + this.level;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(_end=");
        sb.append(this.end);
        sb.append(", _level=");
        return zd2.n(sb, this.level, ')');
    }
}
