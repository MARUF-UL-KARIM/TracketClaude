package com.google.mediapipe.framework;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public interface TextureFrame extends TextureReleaseCallback {
    int getFormat();

    int getHeight();

    int getTextureName();

    long getTimestamp();

    int getWidth();

    void release();

    @Override // com.google.mediapipe.framework.TextureReleaseCallback
    void release(GlSyncToken glSyncToken);

    default void retain() {
        throw new UnsupportedOperationException();
    }

    default boolean supportsRetain() {
        return false;
    }
}
