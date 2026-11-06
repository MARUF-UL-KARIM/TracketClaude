package androidx.loader.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ModernAsyncTask$Status {
    public static final /* synthetic */ ModernAsyncTask$Status[] y = {new ModernAsyncTask$Status("PENDING", 0), new ModernAsyncTask$Status("RUNNING", 1), new ModernAsyncTask$Status("FINISHED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ModernAsyncTask$Status EF5;

    public static ModernAsyncTask$Status valueOf(String str) {
        return (ModernAsyncTask$Status) Enum.valueOf(ModernAsyncTask$Status.class, str);
    }

    public static ModernAsyncTask$Status[] values() {
        return (ModernAsyncTask$Status[]) y.clone();
    }
}
