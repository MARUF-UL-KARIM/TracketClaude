package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class wkd {
    public static final ivd a = ivd.a(new byte[0]);

    public static final ivd a(int i) {
        return ivd.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final ivd b(int i) {
        return ivd.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
