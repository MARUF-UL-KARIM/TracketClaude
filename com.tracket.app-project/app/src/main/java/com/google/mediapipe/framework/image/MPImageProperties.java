package com.google.mediapipe.framework.image;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MPImageProperties {

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static abstract class Builder {
        public abstract MPImageProperties build();

        public abstract Builder setImageFormat(int i);

        public abstract Builder setStorageType(int i);
    }

    public static Builder builder() {
        return new C$AutoValue_MPImageProperties.Builder();
    }

    public abstract int getImageFormat();

    public abstract int getStorageType();

    public abstract int hashCode();
}
