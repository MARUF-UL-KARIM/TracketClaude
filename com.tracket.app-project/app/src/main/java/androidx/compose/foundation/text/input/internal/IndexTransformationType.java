package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class IndexTransformationType {
    public static final /* synthetic */ IndexTransformationType[] y = {new IndexTransformationType("Untransformed", 0), new IndexTransformationType("Insertion", 1), new IndexTransformationType("Replacement", 2), new IndexTransformationType("Deletion", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    IndexTransformationType EF5;

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) y.clone();
    }
}
