package defpackage;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yce implements FileFilter {
    public static final /* synthetic */ yce a = new yce();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.getName().endsWith(".apk");
    }
}
