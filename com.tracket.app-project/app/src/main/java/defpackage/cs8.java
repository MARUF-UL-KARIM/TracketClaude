package defpackage;

import org.jetbrains.skia.TextBlob;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cs8 implements xp3 {
    public final /* synthetic */ int y;
    public final /* synthetic */ TextBlob z;

    public /* synthetic */ cs8(TextBlob textBlob, int i) {
        this.y = i;
        this.z = textBlob;
    }

    @Override // defpackage.xp3
    public final Object invoke(Object obj) {
        boolean z_get_blockBounds_$lambda$0;
        int i = this.y;
        TextBlob textBlob = this.z;
        switch (i) {
            case 0:
                z_get_blockBounds_$lambda$0 = TextBlob._get_blockBounds_$lambda$0(textBlob, obj);
                break;
            default:
                z_get_blockBounds_$lambda$0 = TextBlob._get_tightBounds_$lambda$0(textBlob, obj);
                break;
        }
        return Boolean.valueOf(z_get_blockBounds_$lambda$0);
    }
}
