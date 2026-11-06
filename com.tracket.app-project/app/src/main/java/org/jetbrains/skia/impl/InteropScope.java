package org.jetbrains.skia.impl;

import defpackage.ud9;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class InteropScope {
    public final /* synthetic */ <T> T[] fromInterop(Object obj, ArrayInteropDecoder<T> arrayInteropDecoder) {
        obj.getClass();
        arrayInteropDecoder.getClass();
        return (T[]) ((Object[]) obj);
    }

    public final NativePointerArray fromInteropNativePointerArray(Object obj) {
        obj.getClass();
        long[] jArr = (long[]) obj;
        return new NativePointerArray(jArr.length, jArr);
    }

    public final Object toInterop(NativePointerArray nativePointerArray) {
        if (nativePointerArray != null) {
            return nativePointerArray.getBacking$skiko_release();
        }
        return null;
    }

    public final Object toInteropForArraysOfPointers(Object[] objArr) {
        objArr.getClass();
        return objArr;
    }

    public final Object toInteropForResult(byte[] bArr) {
        return toInterop(bArr);
    }

    public final Object virtual(Function0<ud9> function0) {
        function0.getClass();
        return callback(function0);
    }

    public final Object virtualBoolean(Function0<Boolean> function0) {
        function0.getClass();
        return booleanCallback(function0);
    }

    public final Object virtualInt(Function0<Integer> function0) {
        function0.getClass();
        return intCallback(function0);
    }

    public final Object virtualInteropPointer(Function0<? extends Object> function0) {
        function0.getClass();
        return interopPointerCallback(function0);
    }

    public final Object virtualNativePointer(Function0<Long> function0) {
        function0.getClass();
        return nativePointerCallback(function0);
    }

    public final Object toInteropForResult(short[] sArr) {
        return toInterop(sArr);
    }

    public final Object toInteropForResult(int[] iArr) {
        return toInterop(iArr);
    }

    public final Object toInteropForResult(float[] fArr) {
        return toInterop(fArr);
    }

    public final Object toInteropForResult(double[] dArr) {
        return toInterop(dArr);
    }

    public final void fromInterop(Object obj, byte[] bArr) {
        obj.getClass();
        bArr.getClass();
    }

    public final Object toInterop(byte[] bArr) {
        return bArr;
    }

    public final Object toInteropForResult(NativePointerArray nativePointerArray) {
        return toInterop(nativePointerArray);
    }

    public final void fromInterop(Object obj, double[] dArr) {
        obj.getClass();
        dArr.getClass();
    }

    public final Object toInterop(double[] dArr) {
        return dArr;
    }

    public final void fromInterop(Object obj, float[] fArr) {
        obj.getClass();
        fArr.getClass();
    }

    public final Object toInterop(float[] fArr) {
        return fArr;
    }

    public final void fromInterop(Object obj, int[] iArr) {
        obj.getClass();
        iArr.getClass();
    }

    public final Object toInterop(int[] iArr) {
        return iArr;
    }

    public final void fromInterop(Object obj, long[] jArr) {
        obj.getClass();
        jArr.getClass();
    }

    public final Object toInterop(long[] jArr) {
        return jArr;
    }

    public final void fromInterop(Object obj, short[] sArr) {
        obj.getClass();
        sArr.getClass();
    }

    public final Object toInterop(String[] strArr) {
        return strArr;
    }

    public final void fromInterop(Object obj, NativePointerArray nativePointerArray) {
        obj.getClass();
        nativePointerArray.getClass();
    }

    public final Object toInterop(short[] sArr) {
        return sArr;
    }

    public final Object toInterop(String str) {
        return str;
    }

    public final void release() {
    }

    public final Object booleanCallback(Function0<Boolean> function0) {
        return function0;
    }

    public final Object callback(Function0<ud9> function0) {
        return function0;
    }

    public final Object intCallback(Function0<Integer> function0) {
        return function0;
    }

    public final Object interopPointerCallback(Function0<? extends Object> function0) {
        return function0;
    }

    public final Object nativePointerCallback(Function0<Long> function0) {
        return function0;
    }
}
