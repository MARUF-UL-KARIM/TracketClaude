package defpackage;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class f75 implements ActionProvider.VisibilityListener {
    public qya a;
    public final ActionProvider b;

    public f75(i75 i75Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        qya qyaVar = this.a;
        if (qyaVar != null) {
            z65 z65Var = ((e75) qyaVar.y).n;
            z65Var.h = true;
            z65Var.p(true);
        }
    }
}
