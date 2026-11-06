package com.google.common.io;

import defpackage.z86;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
enum Files$FilePredicate implements z86 {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.google.common.io.Files$FilePredicate.1
        @Override // defpackage.z86
        public final boolean apply(Object obj) {
            return ((File) obj).isDirectory();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Files.isDirectory()";
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.google.common.io.Files$FilePredicate.2
        @Override // defpackage.z86
        public final boolean apply(Object obj) {
            return ((File) obj).isFile();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Files.isFile()";
        }
    }
}
