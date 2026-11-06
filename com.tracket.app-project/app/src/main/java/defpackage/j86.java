package defpackage;

import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class j86 extends bl4 implements nq3 {
    public final /* synthetic */ ViewStructure y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j86(ViewStructure viewStructure) {
        super(4);
        this.y = viewStructure;
    }

    @Override // defpackage.nq3
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.y.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return ud9.a;
    }
}
