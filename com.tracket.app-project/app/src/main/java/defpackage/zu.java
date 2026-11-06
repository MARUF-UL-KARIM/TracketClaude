package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class zu {
    public final char a;
    public final List b;
    public final ArrayList c;

    /* JADX WARN: Multi-variable type inference failed */
    public zu(char c, List list, ArrayList arrayList) {
        this.a = c;
        this.b = list;
        this.c = arrayList;
        zu[] zuVarArr = new zu[256];
        for (int i = 0; i < 256; i++) {
            ArrayList arrayList2 = this.c;
            int size = arrayList2.size();
            Object obj = null;
            boolean z = false;
            int i2 = 0;
            Object obj2 = null;
            while (true) {
                if (i2 >= size) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                } else {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    if (((zu) obj3).a == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = obj3;
                    }
                }
            }
            zuVarArr[i] = obj;
        }
    }
}
