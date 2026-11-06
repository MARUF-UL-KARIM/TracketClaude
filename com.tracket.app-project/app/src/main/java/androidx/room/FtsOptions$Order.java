package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class FtsOptions$Order {
    public static final /* synthetic */ FtsOptions$Order[] y = {new FtsOptions$Order("ASC", 0), new FtsOptions$Order("DESC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    FtsOptions$Order EF5;

    public static FtsOptions$Order valueOf(String str) {
        return (FtsOptions$Order) Enum.valueOf(FtsOptions$Order.class, str);
    }

    public static FtsOptions$Order[] values() {
        return (FtsOptions$Order[]) y.clone();
    }
}
