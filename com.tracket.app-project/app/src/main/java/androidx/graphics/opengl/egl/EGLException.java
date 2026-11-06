package androidx.graphics.opengl.egl;

import defpackage.rq2;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class EGLException extends RuntimeException {
    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Error: ");
        int i = rq2.a;
        String hexString = Integer.toHexString(0);
        hexString.getClass();
        sb.append(hexString);
        sb.append(", null");
        return sb.toString();
    }
}
