package com.tracket.processing;

import defpackage.o43;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class VideoEncoderSetupException extends Exception {

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Capability extends VideoEncoderSetupException {
        public final o43 y;

        public Capability(String str, o43 o43Var) {
            super(str, null);
            this.y = o43Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Muxer extends VideoEncoderSetupException {
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Runtime extends VideoEncoderSetupException {
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Setup extends VideoEncoderSetupException {
        public final o43 y;

        public Setup(int i, String str, Throwable th) {
            super(str, (i & 2) != 0 ? null : th);
            this.y = null;
        }

        public Setup(String str, Throwable th, o43 o43Var) {
            super(str, th);
            this.y = o43Var;
        }
    }
}
