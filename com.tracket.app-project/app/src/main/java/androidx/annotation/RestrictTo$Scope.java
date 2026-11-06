package androidx.annotation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class RestrictTo$Scope {
    public static final /* synthetic */ RestrictTo$Scope[] y = {new RestrictTo$Scope("LIBRARY", 0), new RestrictTo$Scope("LIBRARY_GROUP", 1), new RestrictTo$Scope("LIBRARY_GROUP_PREFIX", 2), new RestrictTo$Scope("GROUP_ID", 3), new RestrictTo$Scope("TESTS", 4), new RestrictTo$Scope("SUBCLASSES", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    RestrictTo$Scope EF5;

    public static RestrictTo$Scope valueOf(String str) {
        return (RestrictTo$Scope) Enum.valueOf(RestrictTo$Scope.class, str);
    }

    public static RestrictTo$Scope[] values() {
        return (RestrictTo$Scope[]) y.clone();
    }
}
