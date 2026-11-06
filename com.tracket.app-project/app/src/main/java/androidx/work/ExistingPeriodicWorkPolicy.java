package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ExistingPeriodicWorkPolicy {
    public static final /* synthetic */ ExistingPeriodicWorkPolicy[] y = {new ExistingPeriodicWorkPolicy("REPLACE", 0), new ExistingPeriodicWorkPolicy("KEEP", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ExistingPeriodicWorkPolicy EF5;

    public static ExistingPeriodicWorkPolicy valueOf(String str) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, str);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) y.clone();
    }
}
