package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
enum FileSectionType {
    z("DEX_FILES"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("EXTRA_DESCRIPTORS"),
    A("CLASSES"),
    B("METHODS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF53("AGGREGATION_COUNT");

    public final long y;

    FileSectionType(String str) {
        this.y = j;
    }
}
