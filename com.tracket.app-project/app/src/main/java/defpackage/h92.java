package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h92 implements z86 {
    public final /* synthetic */ int y;

    @Override // defpackage.z86
    public final boolean apply(Object obj) {
        switch (this.y) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
