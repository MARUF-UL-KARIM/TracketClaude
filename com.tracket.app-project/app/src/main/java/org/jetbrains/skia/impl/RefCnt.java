package org.jetbrains.skia.impl;

import defpackage.l82;
import java.lang.ref.Reference;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RefCnt extends Managed {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class _FinalizerHolder {
        public static final _FinalizerHolder INSTANCE = new _FinalizerHolder();
        private static final long PTR = RefCnt.Companion._nGetFinalizer();

        private _FinalizerHolder() {
        }

        public final long getPTR() {
            return PTR;
        }
    }

    public RefCnt(long j) {
        super(j, _FinalizerHolder.INSTANCE.getPTR(), true);
    }

    public static final native long _nGetFinalizer();

    public static final native int _nGetRefCount(long j);

    public final int getRefCount() {
        try {
            Stats.INSTANCE.onNativeCall();
            return Companion._nGetRefCount(get_ptr$skiko_release());
        } finally {
            Reference.reachabilityFence(this);
        }
    }

    @Override // org.jetbrains.skia.impl.Native
    public String toString() {
        return RefCntKt.refCntToString(this, super.toString(), 0L);
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Companion {
        public /* synthetic */ Companion(l82 l82Var) {
            this();
        }

        public final long _nGetFinalizer() {
            return RefCnt._nGetFinalizer();
        }

        public final int _nGetRefCount(long j) {
            return RefCnt._nGetRefCount(j);
        }

        private Companion() {
        }
    }

    public RefCnt(long j, boolean z) {
        super(j, _FinalizerHolder.INSTANCE.getPTR(), z);
    }
}
