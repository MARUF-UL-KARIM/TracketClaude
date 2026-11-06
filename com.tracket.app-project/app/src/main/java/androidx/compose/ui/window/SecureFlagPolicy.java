package androidx.compose.ui.window;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SecureFlagPolicy {
    public static final /* synthetic */ SecureFlagPolicy[] A;
    public static final SecureFlagPolicy y;
    public static final SecureFlagPolicy z;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        y = secureFlagPolicy;
        SecureFlagPolicy secureFlagPolicy2 = new SecureFlagPolicy("SecureOn", 1);
        z = secureFlagPolicy2;
        A = new SecureFlagPolicy[]{secureFlagPolicy, secureFlagPolicy2, new SecureFlagPolicy("SecureOff", 2)};
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) A.clone();
    }
}
