package io.ktor.http.content;

import defpackage.x34;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VersionCheckResult {
    public static final /* synthetic */ VersionCheckResult[] y;

    /* JADX INFO: Fake field, exist only in values array */
    VersionCheckResult EF7;

    static {
        x34 x34Var = x34.A;
        y = new VersionCheckResult[]{new VersionCheckResult("OK", 0), new VersionCheckResult("NOT_MODIFIED", 1), new VersionCheckResult("PRECONDITION_FAILED", 2)};
    }

    public static VersionCheckResult valueOf(String str) {
        return (VersionCheckResult) Enum.valueOf(VersionCheckResult.class, str);
    }

    public static VersionCheckResult[] values() {
        return (VersionCheckResult[]) y.clone();
    }
}
