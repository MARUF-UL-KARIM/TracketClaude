package com.tracket.editor.preview;

import defpackage.ji1;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final PlayerBarrierOperation a;
    public final ji1 b;

    public b(PlayerBarrierOperation playerBarrierOperation, ji1 ji1Var) {
        playerBarrierOperation.getClass();
        this.a = playerBarrierOperation;
        this.b = ji1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerBarrier(operation=" + this.a + ", completion=" + this.b + ")";
    }
}
