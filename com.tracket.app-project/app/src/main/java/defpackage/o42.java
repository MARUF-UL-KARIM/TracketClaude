package defpackage;

import android.content.Context;
import androidx.datastore.core.DeviceProtectedDataStoreFile;
import androidx.datastore.migrations.SharedPreferencesMigration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o42 implements Function0 {
    public final /* synthetic */ String A;
    public final /* synthetic */ int y;
    public final /* synthetic */ Context z;

    public /* synthetic */ o42(int i, Context context, String str) {
        this.y = i;
        this.z = context;
        this.A = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        String str = this.A;
        Context context = this.z;
        switch (i) {
            case 0:
                return DeviceProtectedDataStoreFile.deviceProtectedDataStoreFile(context, str);
            default:
                return SharedPreferencesMigration._init_$lambda$0(context, str);
        }
    }
}
