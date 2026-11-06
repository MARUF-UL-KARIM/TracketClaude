package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wc1 implements Function0 {
    public final /* synthetic */ int y;
    public final /* synthetic */ List z;

    public /* synthetic */ wc1(int i, List list) {
        this.y = i;
        switch (i) {
            case 1:
                this.z = list;
                break;
            default:
                this.z = list;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.y;
        List list = this.z;
        switch (i) {
            case 0:
                return list.iterator();
            default:
                return list;
        }
    }
}
