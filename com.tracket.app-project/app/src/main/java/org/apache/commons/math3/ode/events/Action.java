package org.apache.commons.math3.ode.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Action {
    public static final /* synthetic */ Action[] y = {new Action("STOP", 0), new Action("RESET_STATE", 1), new Action("RESET_DERIVATIVES", 2), new Action("CONTINUE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Action EF5;

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) y.clone();
    }
}
