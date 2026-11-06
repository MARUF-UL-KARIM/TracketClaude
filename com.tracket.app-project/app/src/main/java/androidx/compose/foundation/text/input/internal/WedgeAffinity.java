package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class WedgeAffinity {
    public static final /* synthetic */ WedgeAffinity[] y = {new WedgeAffinity("Start", 0), new WedgeAffinity("End", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    WedgeAffinity EF5;

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) y.clone();
    }
}
