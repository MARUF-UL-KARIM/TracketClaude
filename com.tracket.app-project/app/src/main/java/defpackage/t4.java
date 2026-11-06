package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t4 implements Function0 {
    public final /* synthetic */ int y;
    public final /* synthetic */ Float z;

    public /* synthetic */ t4(int i, Float f) {
        this.y = i;
        this.z = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        Float f = this.z;
        switch (i) {
            default:
                f.floatValue();
            case 0:
                return f;
        }
    }
}
