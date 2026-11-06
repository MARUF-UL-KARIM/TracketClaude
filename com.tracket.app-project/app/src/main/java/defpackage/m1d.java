package defpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class m1d implements t1d {
    public final byte[] y;

    @Override // defpackage.t1d
    public Object D(FileInputStream fileInputStream) {
        try {
            return ucd.a(fileInputStream);
        } catch (IOException e) {
            throw new n1d("Cannot read bytes.", e);
        }
    }

    @Override // defpackage.t1d
    public /* synthetic */ void b(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // defpackage.t1d
    public /* synthetic */ Object c() {
        return this.y;
    }
}
