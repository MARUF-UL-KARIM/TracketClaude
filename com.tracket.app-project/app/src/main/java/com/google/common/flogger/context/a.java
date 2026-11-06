package com.google.common.flogger.context;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Tags$Type tags$TypeA = Tags$Type.a(obj);
        Tags$Type tags$TypeA2 = Tags$Type.a(obj2);
        return tags$TypeA == tags$TypeA2 ? tags$TypeA.b(obj, obj2) : tags$TypeA.compareTo(tags$TypeA2);
    }
}
