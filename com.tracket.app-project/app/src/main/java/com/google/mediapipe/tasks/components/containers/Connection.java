package com.google.mediapipe.tasks.components.containers;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Connection {
    public static Connection create(int i, int i2) {
        return new AutoValue_Connection(i, i2);
    }

    public abstract int end();

    public abstract int start();
}
