package com.google.mediapipe.framework.image;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
class ByteBufferImageContainer implements MPImageContainer {
    private final ByteBuffer buffer;
    private final MPImageProperties properties;

    public ByteBufferImageContainer(ByteBuffer byteBuffer, int i) {
        this.buffer = byteBuffer;
        this.properties = MPImageProperties.builder().setStorageType(2).setImageFormat(i).build();
    }

    public ByteBuffer getByteBuffer() {
        return this.buffer;
    }

    public int getImageFormat() {
        return this.properties.getImageFormat();
    }

    @Override // com.google.mediapipe.framework.image.MPImageContainer
    public MPImageProperties getImageProperties() {
        return this.properties;
    }

    @Override // com.google.mediapipe.framework.image.MPImageContainer
    public void close() {
    }
}
