package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class sb3 extends pb3 {
    public boolean b;
    public File[] c;
    public int d;

    @Override // defpackage.tb3
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArrListFiles = this.c;
        if (fileArrListFiles != null && this.d >= fileArrListFiles.length) {
            return null;
        }
        if (fileArrListFiles == null) {
            fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        fileArrListFiles.getClass();
        int i = this.d;
        this.d = i + 1;
        return fileArrListFiles[i];
    }
}
