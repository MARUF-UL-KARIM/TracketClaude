package io.ktor.client.plugins.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ValidateStatus {
    public static final /* synthetic */ ValidateStatus[] y = {new ValidateStatus("ShouldValidate", 0), new ValidateStatus("ShouldNotValidate", 1), new ValidateStatus("ShouldWarn", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ValidateStatus EF5;

    public static ValidateStatus valueOf(String str) {
        return (ValidateStatus) Enum.valueOf(ValidateStatus.class, str);
    }

    public static ValidateStatus[] values() {
        return (ValidateStatus[]) y.clone();
    }
}
