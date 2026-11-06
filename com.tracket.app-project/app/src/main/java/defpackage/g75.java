package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class g75 extends FrameLayout implements oc1 {
    public final CollapsibleActionView y;

    /* JADX WARN: Multi-variable type inference failed */
    public g75(View view) {
        super(view.getContext());
        this.y = (CollapsibleActionView) view;
        addView(view);
    }
}
