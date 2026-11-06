package com.google.mediapipe.framework.image;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
class BitmapImageContainer implements MPImageContainer {
    private final Bitmap bitmap;
    private final MPImageProperties properties;

    /* JADX INFO: renamed from: com.google.mediapipe.framework.image.BitmapImageContainer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BitmapImageContainer(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.properties = MPImageProperties.builder().setImageFormat(convertFormatCode(bitmap.getConfig())).setStorageType(1).build();
    }

    public static int convertFormatCode(Bitmap.Config config) {
        int i = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 8;
    }

    @Override // com.google.mediapipe.framework.image.MPImageContainer
    public void close() {
        this.bitmap.recycle();
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // com.google.mediapipe.framework.image.MPImageContainer
    public MPImageProperties getImageProperties() {
        return this.properties;
    }
}
