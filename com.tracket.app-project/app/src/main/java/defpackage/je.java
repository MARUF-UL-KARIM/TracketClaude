package defpackage;

import android.content.ClipData;
import android.media.AudioDescriptor;
import android.media.AudioProfile;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class je {
    public static /* bridge */ /* synthetic */ AudioDescriptor d(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile e(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ ContentInfo.Builder f(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession h(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse k(Object obj) {
        return (ViewTranslationResponse) obj;
    }
}
