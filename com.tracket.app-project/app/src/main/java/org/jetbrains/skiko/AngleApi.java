package org.jetbrains.skiko;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class AngleApi {
    public static final AngleApi INSTANCE = new AngleApi();
    private static final int GL_VENDOR = 7936;
    private static final int GL_RENDERER = 7937;
    private static final int GL_VERSION = 7938;

    private AngleApi() {
    }

    public final int getGL_RENDERER() {
        return GL_RENDERER;
    }

    public final int getGL_VENDOR() {
        return GL_VENDOR;
    }

    public final int getGL_VERSION() {
        return GL_VERSION;
    }

    public final native String glGetString(int i);
}
