package defpackage;

import androidx.datastore.core.FileStorage;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb3 implements Function0 {
    public final /* synthetic */ int y;
    public final /* synthetic */ File z;

    public /* synthetic */ lb3(File file, int i) {
        this.y = i;
        this.z = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        File file = this.z;
        switch (i) {
            case 0:
                return FileStorage.createConnection$lambda$1(file);
            default:
                file.delete();
                return ud9.a;
        }
    }
}
