package com.google.firebase.sessions.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class SessionSubscriber$Name {
    public static final /* synthetic */ SessionSubscriber$Name[] A;
    public static final SessionSubscriber$Name y;
    public static final SessionSubscriber$Name z;

    static {
        SessionSubscriber$Name sessionSubscriber$Name = new SessionSubscriber$Name("CRASHLYTICS", 0);
        y = sessionSubscriber$Name;
        SessionSubscriber$Name sessionSubscriber$Name2 = new SessionSubscriber$Name("PERFORMANCE", 1);
        z = sessionSubscriber$Name2;
        A = new SessionSubscriber$Name[]{sessionSubscriber$Name, sessionSubscriber$Name2, new SessionSubscriber$Name("MATT_SAYS_HI", 2)};
    }

    public static SessionSubscriber$Name valueOf(String str) {
        return (SessionSubscriber$Name) Enum.valueOf(SessionSubscriber$Name.class, str);
    }

    public static SessionSubscriber$Name[] values() {
        return (SessionSubscriber$Name[]) A.clone();
    }
}
