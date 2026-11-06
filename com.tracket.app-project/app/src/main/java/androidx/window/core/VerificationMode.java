package androidx.window.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class VerificationMode {
    public static final /* synthetic */ VerificationMode[] y = {new VerificationMode("STRICT", 0), new VerificationMode("LOG", 1), new VerificationMode("QUIET", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    VerificationMode EF5;

    public static VerificationMode valueOf(String str) {
        return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) y.clone();
    }
}
