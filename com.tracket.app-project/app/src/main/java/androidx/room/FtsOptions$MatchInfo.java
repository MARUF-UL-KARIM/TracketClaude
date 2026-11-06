package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class FtsOptions$MatchInfo {
    public static final /* synthetic */ FtsOptions$MatchInfo[] y = {new FtsOptions$MatchInfo("FTS3", 0), new FtsOptions$MatchInfo("FTS4", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    FtsOptions$MatchInfo EF5;

    public static FtsOptions$MatchInfo valueOf(String str) {
        return (FtsOptions$MatchInfo) Enum.valueOf(FtsOptions$MatchInfo.class, str);
    }

    public static FtsOptions$MatchInfo[] values() {
        return (FtsOptions$MatchInfo[]) y.clone();
    }
}
