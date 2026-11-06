package org.opencv.dnn;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class Net {
    private static native long Net_0();

    private static native void connect_0(long j, String str, String str2);

    private static native void delete(long j);

    private static native void dumpToFile_0(long j, String str);

    private static native void dumpToPbtxt_0(long j, String str);

    private static native String dump_0(long j);

    private static native boolean empty_0(long j);

    private static native void enableFusion_0(long j, boolean z);

    private static native void enableWinograd_0(long j, boolean z);

    private static native long forward_0(long j, String str);

    private static native long forward_1(long j);

    private static native void forward_2(long j, long j2, String str);

    private static native void forward_3(long j, long j2);

    private static native void forward_4(long j, long j2, List<String> list);

    private static native long getFLOPS_0(long j, List<Object> list);

    private static native long getFLOPS_1(long j, long j2);

    private static native long getFLOPS_2(long j, int i, List<Object> list);

    private static native long getFLOPS_3(long j, int i, long j2);

    private static native void getInputDetails_0(long j, long j2, long j3);

    private static native int getLayerId_0(long j, String str);

    private static native List<String> getLayerNames_0(long j);

    private static native void getLayerTypes_0(long j, List<String> list);

    private static native long getLayer_0(long j, int i);

    private static native long getLayer_1(long j, String str);

    private static native long getLayer_2(long j, long j2);

    private static native int getLayersCount_0(long j, String str);

    private static native void getMemoryConsumption_0(long j, long j2, double[] dArr, double[] dArr2);

    private static native void getMemoryConsumption_1(long j, int i, List<Object> list, double[] dArr, double[] dArr2);

    private static native void getMemoryConsumption_2(long j, int i, long j2, double[] dArr, double[] dArr2);

    private static native void getOutputDetails_0(long j, long j2, long j3);

    private static native long getParam_0(long j, int i, int i2);

    private static native long getParam_1(long j, int i);

    private static native long getParam_2(long j, String str, int i);

    private static native long getParam_3(long j, String str);

    private static native long getPerfProfile_0(long j, long j2);

    private static native List<String> getUnconnectedOutLayersNames_0(long j);

    private static native long getUnconnectedOutLayers_0(long j);

    private static native long quantize_0(long j, long j2, int i, int i2, boolean z);

    private static native long quantize_1(long j, long j2, int i, int i2);

    private static native long readFromModelOptimizer_0(String str, String str2);

    private static native long readFromModelOptimizer_1(long j, long j2);

    private static native void setHalideScheduler_0(long j, String str);

    private static native void setInputShape_0(long j, String str, long j2);

    private static native void setInput_0(long j, long j2, String str, double d, double d2, double d3, double d4, double d5);

    private static native void setInput_1(long j, long j2, String str, double d);

    private static native void setInput_2(long j, long j2, String str);

    private static native void setInput_3(long j, long j2);

    private static native void setInputsNames_0(long j, List<String> list);

    private static native void setParam_0(long j, int i, int i2, long j2);

    private static native void setParam_1(long j, String str, int i, long j2);

    private static native void setPreferableBackend_0(long j, int i);

    private static native void setPreferableTarget_0(long j, int i);

    public final void finalize() {
        delete(0L);
    }
}
