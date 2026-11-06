package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class y5 extends wre {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ sre d;

    public /* synthetic */ y5(aj1 aj1Var, String str, sre sreVar, int i) {
        this.a = i;
        this.b = aj1Var;
        this.c = str;
        this.d = sreVar;
    }

    @Override // defpackage.wre
    public final void a(Object obj, dic dicVar) throws Exception {
        int i = this.a;
        sre sreVar = this.d;
        String str = this.c;
        aj1 aj1Var = this.b;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = aj1Var.b;
                ArrayList arrayList = aj1Var.d;
                Object obj2 = linkedHashMap.get(str);
                n5 n5Var = (n5) sreVar;
                if (obj2 == null) {
                    c15.t("Attempting to launch an unregistered ActivityResultLauncher with contract ", n5Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    aj1Var.b(iIntValue, n5Var, obj, dicVar);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = aj1Var.d;
                Object obj3 = aj1Var.b.get(str);
                if (obj3 == null) {
                    c15.t("Attempting to launch an unregistered ActivityResultLauncher with contract ", sreVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    aj1Var.b(iIntValue2, sreVar, obj, dicVar);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void f() {
        this.b.e(this.c);
    }
}
