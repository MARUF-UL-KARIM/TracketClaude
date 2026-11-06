package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.i65;
import defpackage.uy1;
import defpackage.wy1;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventInterstitial extends uy1 {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, wy1 wy1Var, String str, i65 i65Var, Bundle bundle);

    void showInterstitial();
}
