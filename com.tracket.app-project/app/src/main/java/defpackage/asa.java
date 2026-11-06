package defpackage;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class asa implements zra, hxa {
    public final long A;
    public final long B;
    public final /* synthetic */ int y;
    public final FileChannel z;

    public /* synthetic */ asa(FileChannel fileChannel, long j, long j2, int i) {
        this.y = i;
        this.z = fileChannel;
        this.A = j;
        this.B = j2;
    }

    @Override // defpackage.zra, defpackage.hxa
    public final void b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        int i2 = this.y;
        long j2 = this.A;
        switch (i2) {
            case 0:
                MappedByteBuffer map = this.z.map(FileChannel.MapMode.READ_ONLY, j2 + j, i);
                map.load();
                for (MessageDigest messageDigest : messageDigestArr) {
                    map.position(0);
                    messageDigest.update(map);
                }
                break;
            default:
                MappedByteBuffer map2 = this.z.map(FileChannel.MapMode.READ_ONLY, j2 + j, i);
                map2.load();
                for (MessageDigest messageDigest2 : messageDigestArr) {
                    map2.position(0);
                    messageDigest2.update(map2);
                }
                break;
        }
    }

    @Override // defpackage.zra, defpackage.hxa
    public final long zza() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.B;
    }
}
