package com.google.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Distribution$BucketOptions$OptionsCase {
    public static final /* synthetic */ Distribution$BucketOptions$OptionsCase[] y = {new Distribution$BucketOptions$OptionsCase("LINEAR_BUCKETS", 0), new Distribution$BucketOptions$OptionsCase("EXPONENTIAL_BUCKETS", 1), new Distribution$BucketOptions$OptionsCase("EXPLICIT_BUCKETS", 2), new Distribution$BucketOptions$OptionsCase("OPTIONS_NOT_SET", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Distribution$BucketOptions$OptionsCase EF5;

    public static Distribution$BucketOptions$OptionsCase valueOf(String str) {
        return (Distribution$BucketOptions$OptionsCase) Enum.valueOf(Distribution$BucketOptions$OptionsCase.class, str);
    }

    public static Distribution$BucketOptions$OptionsCase[] values() {
        return (Distribution$BucketOptions$OptionsCase[]) y.clone();
    }
}
