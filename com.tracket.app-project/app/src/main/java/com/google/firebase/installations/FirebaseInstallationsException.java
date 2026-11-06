package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Status {
        public static final /* synthetic */ Status[] y = {new Status("BAD_CONFIG", 0), new Status("UNAVAILABLE", 1), new Status("TOO_MANY_REQUESTS", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Status EF5;

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) y.clone();
        }
    }
}
