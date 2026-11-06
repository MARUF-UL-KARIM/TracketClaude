package org.apache.commons.math3.ode.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class EventHandler$Action {
    public static final /* synthetic */ EventHandler$Action[] y = {new EventHandler$Action("STOP", 0), new EventHandler$Action("RESET_STATE", 1), new EventHandler$Action("RESET_DERIVATIVES", 2), new EventHandler$Action("CONTINUE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    EventHandler$Action EF5;

    public static EventHandler$Action valueOf(String str) {
        return (EventHandler$Action) Enum.valueOf(EventHandler$Action.class, str);
    }

    public static EventHandler$Action[] values() {
        return (EventHandler$Action[]) y.clone();
    }
}
