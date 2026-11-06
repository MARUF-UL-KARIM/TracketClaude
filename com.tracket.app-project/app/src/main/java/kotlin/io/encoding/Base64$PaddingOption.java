package kotlin.io.encoding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Base64$PaddingOption {
    public static final /* synthetic */ Base64$PaddingOption[] y = {new Base64$PaddingOption("PRESENT", 0), new Base64$PaddingOption("ABSENT", 1), new Base64$PaddingOption("PRESENT_OPTIONAL", 2), new Base64$PaddingOption("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Base64$PaddingOption EF5;

    public static Base64$PaddingOption valueOf(String str) {
        return (Base64$PaddingOption) Enum.valueOf(Base64$PaddingOption.class, str);
    }

    public static Base64$PaddingOption[] values() {
        return (Base64$PaddingOption[]) y.clone();
    }
}
