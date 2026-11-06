package com.google.common.collect;

import defpackage.tq3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
enum Maps$EntryFunction implements tq3 {
    /* JADX INFO: Fake field, exist only in values array */
    EF2 { // from class: com.google.common.collect.Maps$EntryFunction.1
        @Override // defpackage.tq3
        public final Object apply(Object obj) {
            return ((Map.Entry) obj).getKey();
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF7 { // from class: com.google.common.collect.Maps$EntryFunction.2
        @Override // defpackage.tq3
        public final Object apply(Object obj) {
            return ((Map.Entry) obj).getValue();
        }
    }
}
