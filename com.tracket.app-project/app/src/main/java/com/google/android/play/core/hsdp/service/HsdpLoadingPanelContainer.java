package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class HsdpLoadingPanelContainer extends FrameLayout {
    public Runnable y;

    public HsdpLoadingPanelContainer(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Runnable runnable = this.y;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.y);
        }
    }

    public void setOnConfigurationChangedListener(Runnable runnable) {
        this.y = runnable;
    }

    public HsdpLoadingPanelContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
