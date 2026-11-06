package defpackage;

import org.jetbrains.skia.Path;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qw5 implements xp3 {
    public final /* synthetic */ int y;
    public final /* synthetic */ Path z;

    public /* synthetic */ qw5(Path path, int i) {
        this.y = i;
        this.z = path;
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        boolean z_get_isRRect_$lambda$0;
        int i = this.y;
        Path path = this.z;
        switch (i) {
            case 0:
                z_get_isRRect_$lambda$0 = Path._get_isRRect_$lambda$0(path, obj);
                break;
            case 1:
                z_get_isRRect_$lambda$0 = Path._get_isRect_$lambda$0(path, obj);
                break;
            case 2:
                z_get_isRRect_$lambda$0 = Path._get_isOval_$lambda$0(path, obj);
                break;
            default:
                z_get_isRRect_$lambda$0 = Path._get_asLine_$lambda$0(path, obj);
                break;
        }
        return Boolean.valueOf(z_get_isRRect_$lambda$0);
    }
}
