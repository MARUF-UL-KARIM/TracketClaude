package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class cs4 {
    public Lifecycle$State a;
    public wr4 b;

    public final void a(as4 as4Var, Lifecycle$Event lifecycle$Event) {
        Lifecycle$State lifecycle$StateA = lifecycle$Event.a();
        Lifecycle$State lifecycle$State = this.a;
        if (lifecycle$StateA.compareTo(lifecycle$State) < 0) {
            lifecycle$State = lifecycle$StateA;
        }
        this.a = lifecycle$State;
        this.b.d(as4Var, lifecycle$Event);
        this.a = lifecycle$StateA;
    }
}
