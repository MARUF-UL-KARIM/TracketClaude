package com.google.firebase.remoteconfig;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    public final int y;

    public FirebaseRemoteConfigServerException(String str) {
        super(str);
        this.y = -1;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, firebaseRemoteConfigServerException);
        this.y = i;
    }

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.y = i;
    }

    public FirebaseRemoteConfigServerException(String str, int i, int i2) {
        super(str);
        this.y = i;
    }
}
