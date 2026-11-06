package com.pairip.application;

import android.content.Context;
import com.pairip.licensecheck.LicenseClient;
import com.tracket.TracketApp;

/* JADX INFO: loaded from: classes2.dex */
public class Application extends TracketApp {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tracket.TracketApp, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
