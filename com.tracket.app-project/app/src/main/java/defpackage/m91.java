package defpackage;

import kotlin.jvm.functions.Function0;
import org.jetbrains.skiko.CleanupKt;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m91 implements Function0 {
    public final /* synthetic */ int y;
    public final /* synthetic */ Runnable z;

    public /* synthetic */ m91(int i, Runnable runnable) {
        this.y = i;
        this.z = runnable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        Runnable runnable = this.z;
        switch (i) {
            case 0:
                return CleanupKt.cleanupExecutor$lambda$0$0(runnable);
            default:
                runnable.run();
                return ud9.a;
        }
    }
}
