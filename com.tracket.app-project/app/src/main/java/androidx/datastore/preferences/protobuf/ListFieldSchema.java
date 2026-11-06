package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface ListFieldSchema {
    void makeImmutableListAt(Object obj, long j);

    <L> void mergeListsAt(Object obj, Object obj2, long j);

    <L> List<L> mutableListAt(Object obj, long j);
}
