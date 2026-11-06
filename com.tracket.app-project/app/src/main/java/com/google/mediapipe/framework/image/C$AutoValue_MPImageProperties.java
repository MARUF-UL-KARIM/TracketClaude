package com.google.mediapipe.framework.image;

import defpackage.cp2;
import defpackage.zd2;

/* JADX INFO: renamed from: com.google.mediapipe.framework.image.$AutoValue_MPImageProperties, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
abstract class C$AutoValue_MPImageProperties extends MPImageProperties {
    private final int imageFormat;
    private final int storageType;

    /* JADX INFO: renamed from: com.google.mediapipe.framework.image.$AutoValue_MPImageProperties$Builder */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static class Builder extends MPImageProperties.Builder {
        private Integer imageFormat;
        private Integer storageType;

        @Override // com.google.mediapipe.framework.image.MPImageProperties.Builder
        public MPImageProperties build() {
            String strConcat = this.imageFormat == null ? " imageFormat" : "";
            if (this.storageType == null) {
                strConcat = strConcat.concat(" storageType");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_MPImageProperties(this.imageFormat.intValue(), this.storageType.intValue());
            }
            cp2.n("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.mediapipe.framework.image.MPImageProperties.Builder
        public MPImageProperties.Builder setImageFormat(int i) {
            this.imageFormat = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.mediapipe.framework.image.MPImageProperties.Builder
        public MPImageProperties.Builder setStorageType(int i) {
            this.storageType = Integer.valueOf(i);
            return this;
        }
    }

    public C$AutoValue_MPImageProperties(int i, int i2) {
        this.imageFormat = i;
        this.storageType = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MPImageProperties) {
            MPImageProperties mPImageProperties = (MPImageProperties) obj;
            if (this.imageFormat == mPImageProperties.getImageFormat() && this.storageType == mPImageProperties.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mediapipe.framework.image.MPImageProperties
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // com.google.mediapipe.framework.image.MPImageProperties
    public int getStorageType() {
        return this.storageType;
    }

    @Override // com.google.mediapipe.framework.image.MPImageProperties
    public int hashCode() {
        return this.storageType ^ ((this.imageFormat ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MPImageProperties{imageFormat=");
        sb.append(this.imageFormat);
        sb.append(", storageType=");
        return zd2.o(sb, this.storageType, "}");
    }
}
