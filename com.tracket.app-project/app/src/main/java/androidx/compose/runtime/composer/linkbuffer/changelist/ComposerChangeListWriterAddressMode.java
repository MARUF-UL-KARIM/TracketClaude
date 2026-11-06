package androidx.compose.runtime.composer.linkbuffer.changelist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ComposerChangeListWriterAddressMode {
    public static final /* synthetic */ ComposerChangeListWriterAddressMode[] y = {new ComposerChangeListWriterAddressMode("AbsoluteAddressing", 0), new ComposerChangeListWriterAddressMode("AnchorAddressing", 1), new ComposerChangeListWriterAddressMode("RelativeAddressing", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ComposerChangeListWriterAddressMode EF5;

    public static ComposerChangeListWriterAddressMode valueOf(String str) {
        return (ComposerChangeListWriterAddressMode) Enum.valueOf(ComposerChangeListWriterAddressMode.class, str);
    }

    public static ComposerChangeListWriterAddressMode[] values() {
        return (ComposerChangeListWriterAddressMode[]) y.clone();
    }
}
