package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements xp3 {
    public final /* synthetic */ int y;
    public final /* synthetic */ Collection z;

    public /* synthetic */ d2(int i, Collection collection) {
        this.y = i;
        this.z = collection;
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.y;
        Collection<?> collection = this.z;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
