package androidx.datastore.core;

import android.content.Context;
import androidx.datastore.core.util.DirectBootUtil_androidKt;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class DeviceProtectedDataStoreFile {
    public static final File deviceProtectedDataStoreFile(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(DirectBootUtil_androidKt.requireDeviceProtectedStorageContext(context).getFilesDir(), "datastore/".concat(str));
    }
}
