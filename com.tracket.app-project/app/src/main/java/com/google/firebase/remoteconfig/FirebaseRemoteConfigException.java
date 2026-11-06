package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class Code {
        public static final /* synthetic */ Code[] y = {new Code("UNKNOWN", 0), new Code("CONFIG_UPDATE_STREAM_ERROR", 1), new Code("CONFIG_UPDATE_MESSAGE_INVALID", 2), new Code("CONFIG_UPDATE_NOT_FETCHED", 3), new Code("CONFIG_UPDATE_UNAVAILABLE", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        Code EF5;

        public static Code valueOf(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        public static Code[] values() {
            return (Code[]) y.clone();
        }
    }
}
