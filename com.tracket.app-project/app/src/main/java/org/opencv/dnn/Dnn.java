package org.opencv.dnn;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class Dnn {
    private static native void NMSBoxesBatched_0(long j, long j2, long j3, float f, float f2, long j4, float f3, int i);

    private static native void NMSBoxesBatched_1(long j, long j2, long j3, float f, float f2, long j4, float f3);

    private static native void NMSBoxesBatched_2(long j, long j2, long j3, float f, float f2, long j4);

    private static native void NMSBoxesRotated_0(long j, long j2, float f, float f2, long j3, float f3, int i);

    private static native void NMSBoxesRotated_1(long j, long j2, float f, float f2, long j3, float f3);

    private static native void NMSBoxesRotated_2(long j, long j2, float f, float f2, long j3);

    private static native void NMSBoxes_0(long j, long j2, float f, float f2, long j3, float f3, int i);

    private static native void NMSBoxes_1(long j, long j2, float f, float f2, long j3, float f3);

    private static native void NMSBoxes_2(long j, long j2, float f, float f2, long j3);

    private static native long blobFromImageWithParams_0(long j, long j2);

    private static native long blobFromImageWithParams_1(long j);

    private static native void blobFromImageWithParams_2(long j, long j2, long j3);

    private static native void blobFromImageWithParams_3(long j, long j2);

    private static native long blobFromImage_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2, int i);

    private static native long blobFromImage_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2);

    private static native long blobFromImage_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z);

    private static native long blobFromImage_3(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7);

    private static native long blobFromImage_4(long j, double d, double d2, double d3);

    private static native long blobFromImage_5(long j, double d);

    private static native long blobFromImage_6(long j);

    private static native long blobFromImagesWithParams_0(long j, long j2);

    private static native long blobFromImagesWithParams_1(long j);

    private static native void blobFromImagesWithParams_2(long j, long j2, long j3);

    private static native void blobFromImagesWithParams_3(long j, long j2);

    private static native long blobFromImages_0(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2, int i);

    private static native long blobFromImages_1(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2);

    private static native long blobFromImages_2(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z);

    private static native long blobFromImages_3(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7);

    private static native long blobFromImages_4(long j, double d, double d2, double d3);

    private static native long blobFromImages_5(long j, double d);

    private static native long blobFromImages_6(long j);

    private static native List<Integer> getAvailableTargets_0(int i);

    private static native String getInferenceEngineBackendType_0();

    private static native String getInferenceEngineCPUType_0();

    private static native String getInferenceEngineVPUType_0();

    private static native void imagesFromBlob_0(long j, long j2);

    private static native long readNetFromCaffe_0(String str, String str2);

    private static native long readNetFromCaffe_1(String str);

    private static native long readNetFromCaffe_2(long j, long j2);

    private static native long readNetFromCaffe_3(long j);

    private static native long readNetFromDarknet_0(String str, String str2);

    private static native long readNetFromDarknet_1(String str);

    private static native long readNetFromDarknet_2(long j, long j2);

    private static native long readNetFromDarknet_3(long j);

    private static native long readNetFromModelOptimizer_0(String str, String str2);

    private static native long readNetFromModelOptimizer_1(String str);

    private static native long readNetFromModelOptimizer_2(long j, long j2);

    private static native long readNetFromONNX_0(String str);

    private static native long readNetFromONNX_1(long j);

    private static native long readNetFromTFLite_0(String str);

    private static native long readNetFromTFLite_1(long j);

    private static native long readNetFromTensorflow_0(String str, String str2);

    private static native long readNetFromTensorflow_1(String str);

    private static native long readNetFromTensorflow_2(long j, long j2);

    private static native long readNetFromTensorflow_3(long j);

    private static native long readNetFromTorch_0(String str, boolean z, boolean z2);

    private static native long readNetFromTorch_1(String str, boolean z);

    private static native long readNetFromTorch_2(String str);

    private static native long readNet_0(String str, String str2, String str3);

    private static native long readNet_1(String str, String str2);

    private static native long readNet_2(String str);

    private static native long readNet_3(String str, long j, long j2);

    private static native long readNet_4(String str, long j);

    private static native long readTensorFromONNX_0(String str);

    private static native long readTorchBlob_0(String str, boolean z);

    private static native long readTorchBlob_1(String str);

    private static native void releaseHDDLPlugin_0();

    private static native void resetMyriadDevice_0();

    private static native String setInferenceEngineBackendType_0(String str);

    private static native void shrinkCaffeModel_0(String str, String str2, List<String> list);

    private static native void shrinkCaffeModel_1(String str, String str2);

    private static native void softNMSBoxes_0(long j, long j2, long j3, float f, float f2, long j4, long j5, float f3);

    private static native void softNMSBoxes_2(long j, long j2, long j3, float f, float f2, long j4, long j5);

    private static native void softNMSBoxes_3(long j, long j2, long j3, float f, float f2, long j4);

    private static native void writeTextGraph_0(String str, String str2);
}
