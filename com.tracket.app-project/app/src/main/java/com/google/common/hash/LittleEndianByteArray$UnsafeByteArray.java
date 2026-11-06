package com.google.common.hash;

import defpackage.c15;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
enum LittleEndianByteArray$UnsafeByteArray {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray.1
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray.2
    };

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            unsafe.arrayBaseOffset(byte[].class);
            if (unsafe.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        } catch (PrivilegedActionException e) {
            c15.u("Could not initialize intrinsics", e.getCause());
        }
    }
}
