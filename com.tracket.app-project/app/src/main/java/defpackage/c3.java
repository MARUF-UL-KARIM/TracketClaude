package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends ClickableSpan {
    public final int A;
    public final int y;
    public final u3 z;

    public c3(int i, u3 u3Var, int i2) {
        this.y = i;
        this.z = u3Var;
        this.A = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.y);
        this.z.a.performAction(this.A, bundle);
    }
}
