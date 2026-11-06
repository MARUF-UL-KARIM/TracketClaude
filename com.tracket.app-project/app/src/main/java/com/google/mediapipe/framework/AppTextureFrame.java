package com.google.mediapipe.framework;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class AppTextureFrame implements TextureFrame {
    private static final int DEFAULT_FORMAT = 6408;
    private final int format;
    private final int height;
    private boolean inUse;
    private boolean legacyInUse;
    private GlSyncToken releaseSyncToken;
    private final int textureName;
    private long timestamp;
    private final int width;

    public AppTextureFrame(int i, int i2, int i3, int i4) {
        this.timestamp = Long.MIN_VALUE;
        this.inUse = false;
        this.legacyInUse = false;
        this.releaseSyncToken = null;
        this.textureName = i;
        this.width = i2;
        this.height = i3;
        this.format = i4;
    }

    public void finalize() {
        GlSyncToken glSyncToken = this.releaseSyncToken;
        if (glSyncToken != null) {
            glSyncToken.release();
            this.releaseSyncToken = null;
        }
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public int getFormat() {
        return this.format;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public int getHeight() {
        return this.height;
    }

    @Deprecated
    public boolean getInUse() {
        boolean z;
        synchronized (this) {
            z = this.legacyInUse;
        }
        return z;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public int getTextureName() {
        return this.textureName;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public int getWidth() {
        return this.width;
    }

    public boolean isNotYetReleased() {
        boolean z;
        synchronized (this) {
            try {
                z = this.inUse && this.releaseSyncToken == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public void release(GlSyncToken glSyncToken) {
        synchronized (this) {
            try {
                GlSyncToken glSyncToken2 = this.releaseSyncToken;
                if (glSyncToken2 != null) {
                    glSyncToken2.release();
                    this.releaseSyncToken = null;
                }
                this.releaseSyncToken = glSyncToken;
                this.legacyInUse = false;
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setInUse() {
        synchronized (this) {
            try {
                GlSyncToken glSyncToken = this.releaseSyncToken;
                if (glSyncToken != null) {
                    glSyncToken.release();
                    this.releaseSyncToken = null;
                }
                this.inUse = true;
                this.legacyInUse = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void waitUntilReleased() {
        GlSyncToken glSyncToken;
        synchronized (this) {
            while (this.inUse && this.releaseSyncToken == null) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            glSyncToken = this.releaseSyncToken;
            if (glSyncToken != null) {
                this.inUse = false;
                this.releaseSyncToken = null;
            } else {
                glSyncToken = null;
            }
        }
        if (glSyncToken != null) {
            glSyncToken.waitOnCpu();
            glSyncToken.release();
        }
    }

    public void waitUntilReleasedWithGpuSync() {
        GlSyncToken glSyncToken;
        synchronized (this) {
            while (this.inUse && this.releaseSyncToken == null) {
                try {
                    wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            glSyncToken = this.releaseSyncToken;
            if (glSyncToken != null) {
                this.inUse = false;
                this.releaseSyncToken = null;
            } else {
                glSyncToken = null;
            }
        }
        if (glSyncToken != null) {
            glSyncToken.waitOnGpu();
            glSyncToken.release();
        }
    }

    public AppTextureFrame(int i, int i2, int i3) {
        this(i, i2, i3, 6408);
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public void release() {
        synchronized (this) {
            this.inUse = false;
            this.legacyInUse = false;
            notifyAll();
        }
    }
}
