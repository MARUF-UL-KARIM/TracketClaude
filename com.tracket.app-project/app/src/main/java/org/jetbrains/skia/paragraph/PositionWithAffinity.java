package org.jetbrains.skia.paragraph;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class PositionWithAffinity {
    private final Affinity _affinity;
    private final int position;

    public PositionWithAffinity(int i, Affinity affinity) {
        affinity.getClass();
        this.position = i;
        this._affinity = affinity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PositionWithAffinity)) {
            return false;
        }
        PositionWithAffinity positionWithAffinity = (PositionWithAffinity) obj;
        return this.position == positionWithAffinity.position && getAffinity() == positionWithAffinity.getAffinity();
    }

    public final Affinity getAffinity() {
        return this._affinity;
    }

    public final int getPosition() {
        return this.position;
    }

    public final Affinity get_affinity() {
        return this._affinity;
    }

    public int hashCode() {
        return getAffinity().hashCode() + ((this.position + 59) * 59);
    }

    public String toString() {
        return "PositionWithAffinity(_position=" + this.position + ", _affinity=" + getAffinity() + ')';
    }
}
