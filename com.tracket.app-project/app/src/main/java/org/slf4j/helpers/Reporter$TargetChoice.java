package org.slf4j.helpers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
final class Reporter$TargetChoice {
    public static final /* synthetic */ Reporter$TargetChoice[] A;
    public static final Reporter$TargetChoice y;
    public static final Reporter$TargetChoice z;

    static {
        Reporter$TargetChoice reporter$TargetChoice = new Reporter$TargetChoice("Stderr", 0);
        y = reporter$TargetChoice;
        Reporter$TargetChoice reporter$TargetChoice2 = new Reporter$TargetChoice("Stdout", 1);
        z = reporter$TargetChoice2;
        A = new Reporter$TargetChoice[]{reporter$TargetChoice, reporter$TargetChoice2};
    }

    public static Reporter$TargetChoice valueOf(String str) {
        return (Reporter$TargetChoice) Enum.valueOf(Reporter$TargetChoice.class, str);
    }

    public static Reporter$TargetChoice[] values() {
        return (Reporter$TargetChoice[]) A.clone();
    }
}
