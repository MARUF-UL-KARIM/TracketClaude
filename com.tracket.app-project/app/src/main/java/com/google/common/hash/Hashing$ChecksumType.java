package com.google.common.hash;

import defpackage.yk8;
import java.util.zip.Adler32;
import java.util.zip.CRC32;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
abstract class Hashing$ChecksumType implements yk8 {
    public static final /* synthetic */ Hashing$ChecksumType[] y = {new AnonymousClass1("CRC_32", 0), new AnonymousClass2("ADLER_32", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Hashing$ChecksumType EF5;

    /* JADX INFO: renamed from: com.google.common.hash.Hashing$ChecksumType$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass1 extends Hashing$ChecksumType {
        @Override // defpackage.yk8
        public final Object get() {
            return new CRC32();
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.Hashing$ChecksumType$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public final enum AnonymousClass2 extends Hashing$ChecksumType {
        @Override // defpackage.yk8
        public final Object get() {
            return new Adler32();
        }
    }

    public static Hashing$ChecksumType valueOf(String str) {
        return (Hashing$ChecksumType) Enum.valueOf(Hashing$ChecksumType.class, str);
    }

    public static Hashing$ChecksumType[] values() {
        return (Hashing$ChecksumType[]) y.clone();
    }
}
