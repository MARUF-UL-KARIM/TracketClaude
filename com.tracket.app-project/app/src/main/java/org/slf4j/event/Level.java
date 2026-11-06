package org.slf4j.event;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public enum Level {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("ERROR", "ERROR"),
    A("WARN", "WARN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("INFO", "INFO"),
    B("DEBUG", "DEBUG"),
    C("TRACE", "TRACE");

    public final int y;
    public final String z;

    Level(String str, String str2) {
        this.y = i;
        this.z = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.z;
    }
}
