package androidx.datastore.core;

import defpackage.lq3;
import defpackage.qf3;
import defpackage.vs1;
import defpackage.xp3;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface InterProcessCoordinator {
    qf3 getUpdateNotifications();

    Object getVersion(vs1 vs1Var);

    Object incrementAndGetVersion(vs1 vs1Var);

    <T> Object lock(xp3 xp3Var, vs1 vs1Var);

    <T> Object tryLock(lq3 lq3Var, vs1 vs1Var);
}
