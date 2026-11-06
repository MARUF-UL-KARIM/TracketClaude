package androidx.media3.common.audio;

import defpackage.f10;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(String str, f10 f10Var) {
        super(str + " " + f10Var);
    }

    public AudioProcessor$UnhandledAudioFormatException(f10 f10Var) {
        this("Unhandled input format:", f10Var);
    }
}
