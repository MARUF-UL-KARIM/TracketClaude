package com.google.mediapipe.framework.image;

import android.media.Image;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
class MediaImageContainer implements MPImageContainer {
    private final Image mediaImage;
    private final MPImageProperties properties;

    public MediaImageContainer(Image image) {
        this.mediaImage = image;
        this.properties = MPImageProperties.builder().setStorageType(3).setImageFormat(convertFormatCode(image.getFormat())).build();
    }

    public static int convertFormatCode(int i) {
        if (i == 42) {
            return 1;
        }
        if (i == 41) {
            return 2;
        }
        if (i != 35) {
            return i != 256 ? 0 : 9;
        }
        return 7;
    }

    @Override // com.google.mediapipe.framework.image.MPImageContainer
    public void close() {
        this.mediaImage.close();
    }

    public Image getImage() {
        return this.mediaImage;
    }

    @Override // com.google.mediapipe.framework.image.MPImageContainer
    public MPImageProperties getImageProperties() {
        return this.properties;
    }
}
