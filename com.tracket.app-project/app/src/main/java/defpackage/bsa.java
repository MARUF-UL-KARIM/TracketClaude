package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class bsa {
    public final Object a;
    public long b;
    public long c;
    public long d;
    public final Object e;

    public /* synthetic */ bsa(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2) {
        this.a = byteBuffer;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = byteBuffer2;
    }

    public bsa(AudioTrack audioTrack) {
        this.a = audioTrack;
        this.e = new AudioTimestamp();
    }
}
