package defpackage;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class a31 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;
    public final Serializable d;

    public /* synthetic */ a31(String str, String str2, Serializable serializable, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = serializable;
    }

    public final InputStream a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return new ByteArrayInputStream(bArr);
            default:
                File file = (File) obj;
                if (!file.exists() || !file.isFile()) {
                    return null;
                }
                try {
                    return new FileInputStream(file);
                } catch (FileNotFoundException unused) {
                    return null;
                }
        }
    }
}
