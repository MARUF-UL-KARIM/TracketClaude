package javax.annotation.meta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class When {
    public static final /* synthetic */ When[] y = {new When("ALWAYS", 0), new When("UNKNOWN", 1), new When("MAYBE", 2), new When("NEVER", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    When EF5;

    public static When valueOf(String str) {
        return (When) Enum.valueOf(When.class, str);
    }

    public static When[] values() {
        return (When[]) y.clone();
    }
}
