package androidx.datastore.core;

import defpackage.lq3;
import defpackage.mq3;
import defpackage.vs1;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(mq3 mq3Var, vs1 vs1Var);

    Object writeScope(lq3 lq3Var, vs1 vs1Var);
}
