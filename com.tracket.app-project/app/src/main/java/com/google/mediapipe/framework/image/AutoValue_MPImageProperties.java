package com.google.mediapipe.framework.image;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_MPImageProperties extends C$AutoValue_MPImageProperties {
    private volatile transient int hashCode;
    private volatile transient boolean hashCode$Memoized;

    public AutoValue_MPImageProperties(int i, int i2) {
        super(i, i2);
    }

    @Override // com.google.mediapipe.framework.image.C$AutoValue_MPImageProperties
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoValue_MPImageProperties) && hashCode() == obj.hashCode() && super.equals(obj);
    }

    @Override // com.google.mediapipe.framework.image.C$AutoValue_MPImageProperties, com.google.mediapipe.framework.image.MPImageProperties
    public int hashCode() {
        if (!this.hashCode$Memoized) {
            synchronized (this) {
                try {
                    if (!this.hashCode$Memoized) {
                        this.hashCode = super.hashCode();
                        this.hashCode$Memoized = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.hashCode;
    }
}
