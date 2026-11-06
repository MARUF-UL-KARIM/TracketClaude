package com.google.mediapipe.framework.image;

import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class MPImage implements Closeable {
    public static final int IMAGE_FORMAT_ALPHA = 8;
    public static final int IMAGE_FORMAT_JPEG = 9;
    public static final int IMAGE_FORMAT_NV12 = 3;
    public static final int IMAGE_FORMAT_NV21 = 4;
    public static final int IMAGE_FORMAT_RGB = 2;
    public static final int IMAGE_FORMAT_RGBA = 1;
    public static final int IMAGE_FORMAT_UNKNOWN = 0;
    public static final int IMAGE_FORMAT_VEC32F1 = 10;
    public static final int IMAGE_FORMAT_VEC32F2 = 11;
    public static final int IMAGE_FORMAT_YUV_420_888 = 7;
    public static final int IMAGE_FORMAT_YV12 = 5;
    public static final int IMAGE_FORMAT_YV21 = 6;
    public static final int STORAGE_TYPE_BITMAP = 1;
    public static final int STORAGE_TYPE_BYTEBUFFER = 2;
    public static final int STORAGE_TYPE_IMAGE_PROXY = 4;
    public static final int STORAGE_TYPE_MEDIA_IMAGE = 3;
    private final Map<MPImageProperties, MPImageContainer> containerMap;
    private final int height;
    private int referenceCount;
    private final long timestamp;
    private final int width;

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Internal {
        private final MPImage image;

        private Internal(MPImage mPImage) {
            this.image = mPImage;
        }

        public void acquire() {
            this.image.acquire();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MPImageFormat {
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StorageType {
    }

    public MPImage(MPImageContainer mPImageContainer, long j, int i, int i2) {
        HashMap map = new HashMap();
        this.containerMap = map;
        map.put(mPImageContainer.getImageProperties(), mPImageContainer);
        this.timestamp = j;
        this.width = i;
        this.height = i2;
        this.referenceCount = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void acquire() {
        this.referenceCount++;
    }

    public boolean addContainer(MPImageContainer mPImageContainer) {
        MPImageProperties imageProperties = mPImageContainer.getImageProperties();
        if (this.containerMap.containsKey(imageProperties)) {
            return false;
        }
        this.containerMap.put(imageProperties, mPImageContainer);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        int i = this.referenceCount - 1;
        this.referenceCount = i;
        if (i == 0) {
            Iterator<MPImageContainer> it = this.containerMap.values().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    public List<MPImageProperties> getContainedImageProperties() {
        return Collections.singletonList(getContainer().getImageProperties());
    }

    public MPImageContainer getContainer(int i) {
        for (Map.Entry<MPImageProperties, MPImageContainer> entry : this.containerMap.entrySet()) {
            if (entry.getKey().getStorageType() == i) {
                return entry.getValue();
            }
        }
        return null;
    }

    public int getHeight() {
        return this.height;
    }

    public Internal getInternal() {
        return new Internal();
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getWidth() {
        return this.width;
    }

    public MPImageContainer getContainer() {
        return this.containerMap.values().iterator().next();
    }

    public MPImageContainer getContainer(MPImageProperties mPImageProperties) {
        return this.containerMap.get(mPImageProperties);
    }
}
