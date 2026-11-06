package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class RegexOption {
    public static final /* synthetic */ RegexOption[] y = {new RegexOption("IGNORE_CASE", 0), new RegexOption("MULTILINE", 1), new RegexOption("LITERAL", 2), new RegexOption("UNIX_LINES", 3), new RegexOption("COMMENTS", 4), new RegexOption("DOT_MATCHES_ALL", 5), new RegexOption("CANON_EQ", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    RegexOption EF5;

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) y.clone();
    }
}
