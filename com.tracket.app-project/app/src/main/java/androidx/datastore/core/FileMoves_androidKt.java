package androidx.datastore.core;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(File file, File file2) {
        file.getClass();
        file2.getClass();
        return Api26Impl.INSTANCE.move(file, file2);
    }
}
