package org.apache.commons.math3.optim.linear;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public enum Relationship {
    /* JADX INFO: Fake field, exist only in values array */
    EQ("="),
    /* JADX INFO: Fake field, exist only in values array */
    LEQ("<="),
    /* JADX INFO: Fake field, exist only in values array */
    GEQ(">=");

    public final String y;

    Relationship(String str) {
        this.y = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.y;
    }
}
