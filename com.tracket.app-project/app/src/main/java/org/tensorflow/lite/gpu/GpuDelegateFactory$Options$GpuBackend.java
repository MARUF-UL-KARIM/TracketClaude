package org.tensorflow.lite.gpu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class GpuDelegateFactory$Options$GpuBackend {
    public static final /* synthetic */ GpuDelegateFactory$Options$GpuBackend[] y = {new GpuDelegateFactory$Options$GpuBackend("UNSET", 0), new GpuDelegateFactory$Options$GpuBackend("OPENCL", 1), new GpuDelegateFactory$Options$GpuBackend("OPENGL", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    GpuDelegateFactory$Options$GpuBackend EF5;

    public static GpuDelegateFactory$Options$GpuBackend valueOf(String str) {
        return (GpuDelegateFactory$Options$GpuBackend) Enum.valueOf(GpuDelegateFactory$Options$GpuBackend.class, str);
    }

    public static GpuDelegateFactory$Options$GpuBackend[] values() {
        return (GpuDelegateFactory$Options$GpuBackend[]) y.clone();
    }
}
