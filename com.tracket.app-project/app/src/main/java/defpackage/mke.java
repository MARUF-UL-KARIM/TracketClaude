package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mke {
    public static final j3c b = new j3c(19);
    public final /* synthetic */ int a = 3;

    public static void a(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        ce9.k(file, "Unable to create parent directories of ");
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    public int hashCode() {
        switch (this.a) {
            case 3:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                String strD = iq6.a(getClass()).d();
                strD.getClass();
                return strD;
            default:
                return super.toString();
        }
    }
}
