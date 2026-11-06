package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class nj1 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final fp8 f;
    public final fp8 g;

    public nj1(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = new fp8(new Function0(this) { // from class: lj1
            public final /* synthetic */ nj1 z;

            {
                this.z = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                cz2 cz2Var = cz2.y;
                int i3 = 0;
                nj1 nj1Var = this.z;
                switch (i2) {
                    case 0:
                        List list6 = nj1Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            sc1.u((List) ((Function0) list6.get(i3)).invoke(), arrayList);
                            i3++;
                        }
                        nj1Var.d = cz2Var;
                        return arrayList;
                    default:
                        List list7 = nj1Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            sc1.u((List) ((Function0) list7.get(i3)).invoke(), arrayList2);
                            i3++;
                        }
                        nj1Var.e = cz2Var;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = new fp8(new Function0(this) { // from class: lj1
            public final /* synthetic */ nj1 z;

            {
                this.z = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                cz2 cz2Var = cz2.y;
                int i4 = 0;
                nj1 nj1Var = this.z;
                switch (i3) {
                    case 0:
                        List list6 = nj1Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i4 < size) {
                            sc1.u((List) ((Function0) list6.get(i4)).invoke(), arrayList);
                            i4++;
                        }
                        nj1Var.d = cz2Var;
                        return arrayList;
                    default:
                        List list7 = nj1Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i4 < size2) {
                            sc1.u((List) ((Function0) list7.get(i4)).invoke(), arrayList2);
                            i4++;
                        }
                        nj1Var.e = cz2Var;
                        return arrayList2;
                }
            }
        });
    }
}
