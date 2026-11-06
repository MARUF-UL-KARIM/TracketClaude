package com.tracket;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle$State;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tracket.MainActivity;
import com.tracket.utils.AppPlatform;
import defpackage.a73;
import defpackage.a9;
import defpackage.ad6;
import defpackage.ar2;
import defpackage.at;
import defpackage.bd3;
import defpackage.bi8;
import defpackage.br2;
import defpackage.bx1;
import defpackage.c15;
import defpackage.cj1;
import defpackage.cp2;
import defpackage.cp6;
import defpackage.cr2;
import defpackage.dj1;
import defpackage.dr2;
import defpackage.ds4;
import defpackage.dw6;
import defpackage.eb4;
import defpackage.eg1;
import defpackage.er2;
import defpackage.ew6;
import defpackage.f0c;
import defpackage.f91;
import defpackage.fb4;
import defpackage.ff4;
import defpackage.fh;
import defpackage.fj4;
import defpackage.fr2;
import defpackage.gr2;
import defpackage.h3c;
import defpackage.hd7;
import defpackage.hl2;
import defpackage.hw6;
import defpackage.i6d;
import defpackage.ii8;
import defpackage.iq6;
import defpackage.k81;
import defpackage.l5;
import defpackage.lf9;
import defpackage.m46;
import defpackage.ml7;
import defpackage.mp8;
import defpackage.n36;
import defpackage.n5;
import defpackage.ns0;
import defpackage.nw0;
import defpackage.nz4;
import defpackage.ok4;
import defpackage.oo6;
import defpackage.or9;
import defpackage.pd6;
import defpackage.pda;
import defpackage.pg0;
import defpackage.pk6;
import defpackage.q3c;
import defpackage.rxe;
import defpackage.s0c;
import defpackage.sa8;
import defpackage.t14;
import defpackage.tj1;
import defpackage.tp3;
import defpackage.tt5;
import defpackage.tzb;
import defpackage.ua;
import defpackage.ud9;
import defpackage.uk1;
import defpackage.v8;
import defpackage.vn5;
import defpackage.vo;
import defpackage.vs1;
import defpackage.w97;
import defpackage.wo;
import defpackage.wo0;
import defpackage.xo;
import defpackage.xr4;
import defpackage.y5;
import defpackage.yh;
import defpackage.yj5;
import defpackage.ys;
import defpackage.yw1;
import defpackage.zf;
import defpackage.zob;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends xo implements m46 {
    public static final /* synthetic */ int b0 = 0;
    public final y5 Y;
    public final y5 Z;
    public w97 a0;

    public MainActivity() {
        ((q3c) this.B.z).s("androidx:appcompat", new vo(this));
        G(new wo(this));
        int i = 5;
        final int i2 = 0;
        this.Y = J(new n5(i), new l5(this) { // from class: qz4
            public final /* synthetic */ MainActivity z;

            {
                this.z = this;
            }

            @Override // defpackage.l5
            public final void d(Object obj) {
                int i3 = i2;
                MainActivity mainActivity = this.z;
                k5 k5Var = (k5) obj;
                switch (i3) {
                    case 0:
                        int i4 = MainActivity.b0;
                        k5Var.getClass();
                        tp3 tp3Var = tp3.a;
                        tp3.a();
                        int i5 = k5Var.y;
                        try {
                            if (i5 == -1) {
                                ib.a("app_update_required", new LinkedHashMap());
                            } else if (i5 == 0) {
                                try {
                                    ib.a("app_update_required_cancelled", new LinkedHashMap());
                                    break;
                                } catch (Throwable unused) {
                                }
                                mainActivity.finish();
                            } else {
                                ib.a("app_update_required_failed", new LinkedHashMap());
                            }
                        } catch (Throwable unused2) {
                            return;
                        }
                        break;
                    default:
                        int i6 = MainActivity.b0;
                        k5Var.getClass();
                        tp3 tp3Var2 = tp3.a;
                        tp3.a();
                        int i7 = k5Var.y;
                        try {
                            if (i7 == -1) {
                                ib.a("app_update_recommended", new LinkedHashMap());
                            } else if (i7 == 0) {
                                try {
                                    ib.a("app_update_recommended_cancelled", new LinkedHashMap());
                                    break;
                                } catch (Throwable unused3) {
                                }
                                pda.h(yj5.a(mainActivity), null, null, new c8(2, 13, null), 3);
                            } else {
                                ib.a("app_update_recommended_failed", new LinkedHashMap());
                            }
                        } catch (Throwable unused4) {
                            return;
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        this.Z = J(new n5(i), new l5(this) { // from class: qz4
            public final /* synthetic */ MainActivity z;

            {
                this.z = this;
            }

            @Override // defpackage.l5
            public final void d(Object obj) {
                int i4 = i3;
                MainActivity mainActivity = this.z;
                k5 k5Var = (k5) obj;
                switch (i4) {
                    case 0:
                        int i5 = MainActivity.b0;
                        k5Var.getClass();
                        tp3 tp3Var = tp3.a;
                        tp3.a();
                        int i6 = k5Var.y;
                        try {
                            if (i6 == -1) {
                                ib.a("app_update_required", new LinkedHashMap());
                            } else if (i6 == 0) {
                                try {
                                    ib.a("app_update_required_cancelled", new LinkedHashMap());
                                    break;
                                } catch (Throwable unused) {
                                }
                                mainActivity.finish();
                            } else {
                                ib.a("app_update_required_failed", new LinkedHashMap());
                            }
                        } catch (Throwable unused2) {
                            return;
                        }
                        break;
                    default:
                        int i7 = MainActivity.b0;
                        k5Var.getClass();
                        tp3 tp3Var2 = tp3.a;
                        tp3.a();
                        int i8 = k5Var.y;
                        try {
                            if (i8 == -1) {
                                ib.a("app_update_recommended", new LinkedHashMap());
                            } else if (i8 == 0) {
                                try {
                                    ib.a("app_update_recommended_cancelled", new LinkedHashMap());
                                    break;
                                } catch (Throwable unused3) {
                                }
                                pda.h(yj5.a(mainActivity), null, null, new c8(2, 13, null), 3);
                            } else {
                                ib.a("app_update_recommended_failed", new LinkedHashMap());
                            }
                        } catch (Throwable unused4) {
                            return;
                        }
                        break;
                }
            }
        });
    }

    public final void R(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1173264947) {
                if (iHashCode != -1173171990 || !action.equals("android.intent.action.VIEW")) {
                    return;
                }
            } else if (!action.equals("android.intent.action.SEND")) {
                return;
            }
            pda.h(yj5.a(this), null, null, new fh(intent, this, (vs1) null, 24), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x033a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0087  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    @Override // defpackage.xo, defpackage.cj1, defpackage.bj1, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        ml7 ml7Var;
        Object dw6Var;
        Integer numZ;
        Object objC;
        super.onCreate(bundle);
        final int i = 1;
        nz4 nz4Var = new nz4(i);
        final int i2 = 3;
        final hl2 hl2Var = new hl2(i2);
        vn5 vn5VarE = e();
        final a73 a73Var = new a73(0, this, cj1.class, "isChangingConfigurations", "isChangingConfigurations()Z", 0, 11);
        i6d i6dVar = this.B;
        if (((q3c) i6dVar.z).l("RootRetainedComponent") != null) {
            c15.n("Another retained component is already registered with the key: ".concat("RootRetainedComponent"));
            return;
        }
        ds4 ds4Var = this.y;
        ds4Var.getClass();
        i6d i6dVar2 = new i6d();
        i6dVar2.y = ds4Var;
        i6dVar2.z = new HashMap();
        q3c q3cVar = (q3c) i6dVar.z;
        Bundle bundleJ = q3cVar.j("RootRetainedComponent");
        if (bundleJ != null) {
            fj4 fj4VarSerializer = ml7.Companion.serializer();
            fj4VarSerializer.getClass();
            ClassLoader classLoader = bundleJ.getClassLoader();
            try {
                bundleJ.setClassLoader(lf9.class.getClassLoader());
                lf9 lf9Var = (lf9) bundleJ.getParcelable("STATE_KEEPER_STATE");
                bundleJ.setClassLoader(classLoader);
                if (lf9Var == null) {
                    objC = null;
                } else {
                    objC = lf9Var.y;
                    if (objC == null) {
                        byte[] bArr = (byte[]) lf9Var.z.getValue();
                        if (bArr != null) {
                            objC = zob.c(fj4VarSerializer, bArr);
                        } else {
                            objC = null;
                        }
                    }
                }
                ml7Var = (ml7) objC;
                if (ml7Var == null) {
                    ml7Var = null;
                }
            } catch (Throwable th) {
                bundleJ.setClassLoader(classLoader);
                throw th;
            }
        } else {
            ml7Var = null;
        }
        final q3c q3cVar2 = new q3c(ml7Var);
        q3cVar.s("RootRetainedComponent", new hd7() { // from class: yf
            @Override // defpackage.hd7
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                if (((Boolean) hl2Var.invoke()).booleanValue()) {
                    ml7 ml7VarV = q3cVar2.v();
                    fj4 fj4VarSerializer2 = ml7.Companion.serializer();
                    fj4VarSerializer2.getClass();
                    bundle2.putParcelable("STATE_KEEPER_STATE", new lf9(ml7VarV, new fp8(new tg(13, ml7VarV, fj4VarSerializer2))));
                }
                return bundle2;
            }
        });
        or9 or9VarO = o();
        final int i3 = 0;
        zf zfVar = new zf(i3);
        bx1 bx1Var = bx1.b;
        bx1Var.getClass();
        t14 t14Var = new t14(or9VarO, zfVar, bx1Var);
        f91 f91VarA = iq6.a(fb4.class);
        String strC = f91VarA.c();
        if (strC == null) {
            cp2.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        ua uaVar = ((fb4) t14Var.C(f91VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC))).b;
        nw0 nw0Var = nw0.a;
        boolean z = q3cVar2.i(nw0Var, "RetainedComponent_state_marker") == null;
        q3cVar2.r("RetainedComponent_state_marker", nw0Var, new oo6(5));
        if (z) {
            uaVar.getClass();
            hw6 hw6Var = (hw6) ((eb4) ((HashMap) uaVar.z).remove("RootRetainedComponent"));
            if (hw6Var != null) {
                ad6.b(hw6Var.y);
                hw6Var.onDestroy();
            }
        }
        eb4 hw6Var2 = (eb4) ((HashMap) uaVar.z).get("RootRetainedComponent");
        if (hw6Var2 == null) {
            hw6Var2 = new hw6((ml7) q3cVar2.i(ml7.Companion.serializer(), "RootRetainedComponent"), nz4Var);
            uaVar.m("RootRetainedComponent", hw6Var2);
        }
        final hw6 hw6Var3 = (hw6) hw6Var2;
        final int i4 = 2;
        i6dVar2.e(new xr4(new Function0() { // from class: iw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                ud9 ud9Var = ud9.a;
                hw6 hw6Var4 = hw6Var3;
                switch (i5) {
                    case 0:
                        ad6.a(hw6Var4.y);
                        return ud9Var;
                    case 1:
                        ad6.e(hw6Var4.y);
                        return ud9Var;
                    case 2:
                        ad6.d(hw6Var4.y);
                        return ud9Var;
                    default:
                        return hw6Var4.z.v();
                }
            }
        }, new Function0() { // from class: iw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                ud9 ud9Var = ud9.a;
                hw6 hw6Var4 = hw6Var3;
                switch (i5) {
                    case 0:
                        ad6.a(hw6Var4.y);
                        return ud9Var;
                    case 1:
                        ad6.e(hw6Var4.y);
                        return ud9Var;
                    case 2:
                        ad6.d(hw6Var4.y);
                        return ud9Var;
                    default:
                        return hw6Var4.z.v();
                }
            }
        }, new Function0() { // from class: iw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                ud9 ud9Var = ud9.a;
                hw6 hw6Var4 = hw6Var3;
                switch (i5) {
                    case 0:
                        ad6.a(hw6Var4.y);
                        return ud9Var;
                    case 1:
                        ad6.e(hw6Var4.y);
                        return ud9Var;
                    case 2:
                        ad6.d(hw6Var4.y);
                        return ud9Var;
                    default:
                        return hw6Var4.z.v();
                }
            }
        }, new Function0() { // from class: jw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                ud9 ud9Var = ud9.a;
                hw6 hw6Var4 = hw6Var3;
                a73 a73Var2 = a73Var;
                switch (i5) {
                    case 0:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.c(hw6Var4.y);
                        }
                        break;
                    case 1:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.f(hw6Var4.y);
                        }
                        break;
                    default:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.b(hw6Var4.y);
                        }
                        break;
                }
                return ud9Var;
            }
        }, new Function0() { // from class: jw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                ud9 ud9Var = ud9.a;
                hw6 hw6Var4 = hw6Var3;
                a73 a73Var2 = a73Var;
                switch (i5) {
                    case 0:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.c(hw6Var4.y);
                        }
                        break;
                    case 1:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.f(hw6Var4.y);
                        }
                        break;
                    default:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.b(hw6Var4.y);
                        }
                        break;
                }
                return ud9Var;
            }
        }, new Function0() { // from class: jw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                ud9 ud9Var = ud9.a;
                hw6 hw6Var4 = hw6Var3;
                a73 a73Var2 = a73Var;
                switch (i5) {
                    case 0:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.c(hw6Var4.y);
                        }
                        break;
                    case 1:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.f(hw6Var4.y);
                        }
                        break;
                    default:
                        if (!((Boolean) a73Var2.invoke()).booleanValue()) {
                            ad6.b(hw6Var4.y);
                        }
                        break;
                }
                return ud9Var;
            }
        }));
        q3cVar2.r("RootRetainedComponent", ml7.Companion.serializer(), new Function0() { // from class: iw6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                ud9 ud9Var = ud9.a;
                hw6 hw6Var4 = hw6Var3;
                switch (i5) {
                    case 0:
                        ad6.a(hw6Var4.y);
                        return ud9Var;
                    case 1:
                        ad6.e(hw6Var4.y);
                        return ud9Var;
                    case 2:
                        ad6.d(hw6Var4.y);
                        return ud9Var;
                    default:
                        return hw6Var4.z.v();
                }
            }
        });
        if (vn5VarE != null) {
            wo0 wo0Var = new wo0(hw6Var3.C);
            hw6Var3.B = new pk6(wo0Var, 7);
            vn5VarE.a(wo0Var, this);
        }
        this.a0 = (w97) hw6Var3.D;
        if ((getResources().getConfiguration().screenLayout & 15) < 3) {
            setRequestedOrientation(1);
        }
        if (bundle == null && getIntent() != null) {
            Intent intent = getIntent();
            intent.getClass();
            R(intent);
        }
        h3c.e(getWindow(), false);
        int i5 = ok4.g;
        mp8 mp8Var = new mp8(i5, i5, 2, new sa8(16));
        mp8 mp8Var2 = new mp8(i5, i5, 0, new sa8(17));
        dr2 dr2Var = br2.a;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        dr2 er2Var = br2.a;
        int i6 = 29;
        if (er2Var == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 35) {
                er2Var = new gr2();
            } else if (i7 >= 30) {
                er2Var = new fr2();
            } else {
                er2Var = i7 >= 29 ? new er2() : new dr2();
            }
            br2.a = er2Var;
        }
        dr2 dr2Var2 = er2Var;
        ns0 ns0Var = new ns0(dr2Var2, mp8Var, mp8Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i8 = 0;
        while (true) {
            if (i8 >= viewGroup.getChildCount()) {
                ar2 ar2Var = new ar2(ns0Var, viewGroup.getContext());
                ar2Var.setTag(dr2Var2);
                ar2Var.setVisibility(8);
                ar2Var.setWillNotDraw(true);
                viewGroup.addView(ar2Var);
                break;
            }
            int i9 = i8 + 1;
            View childAt = viewGroup.getChildAt(i8);
            if (childAt == null) {
                bd3.t();
                return;
            } else if (childAt.getTag() instanceof cr2) {
                break;
            } else {
                i8 = i9;
            }
        }
        ns0Var.run();
        Window window = getWindow();
        window.getClass();
        dr2Var2.a(window);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        tj1 tj1Var = new tj1(new yh(this, i6), true, 1695826219);
        ViewGroup.LayoutParams layoutParams = dj1.a;
        View childAt2 = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        uk1 uk1Var = childAt2 instanceof uk1 ? (uk1) childAt2 : null;
        if (uk1Var != null) {
            uk1Var.setParentCompositionContext(null);
            uk1Var.setContent(tj1Var);
        } else {
            uk1 uk1Var2 = new uk1(this);
            uk1Var2.setParentCompositionContext(null);
            uk1Var2.setContent(tj1Var);
            View decorView2 = getWindow().getDecorView();
            if (tzb.g(decorView2) == null) {
                decorView2.setTag(com.tracket.app.R.id.view_tree_lifecycle_owner, this);
            }
            if (s0c.e(decorView2) == null) {
                decorView2.setTag(com.tracket.app.R.id.view_tree_view_model_store_owner, this);
            }
            if (f0c.f(decorView2) == null) {
                decorView2.setTag(com.tracket.app.R.id.view_tree_saved_state_registry_owner, this);
            }
            setContentView(uk1Var2, dj1.a);
        }
        a9 a9Var = a9.a;
        a9.m = new WeakReference(this);
        pda.h(at.a, null, null, new v8(i4, 0, (vs1) null), 3);
        rxe.a = new WeakReference(this);
        w97 w97Var = this.a0;
        if (w97Var == null) {
            ff4.p("component");
            throw null;
        }
        boolean z2 = ys.z != w97Var;
        ys.z = w97Var;
        ds4 ds4Var2 = pd6.G.D;
        if (!ys.A) {
            ys.A = true;
            ds4Var2.a(ys.y);
        } else if (z2 && ds4Var2.i.compareTo(Lifecycle$State.B) >= 0) {
            w97Var.P("android_process");
        }
        if (pg0.a.containsKey("android")) {
            return;
        }
        try {
            String str = System.getenv("TRACKET_AUTOMATION_BIND_HOST");
            if (str == null) {
                str = "0.0.0.0";
            } else {
                if (bi8.N(str)) {
                    str = null;
                }
                if (str == null) {
                    str = "0.0.0.0";
                }
            }
            String str2 = str;
            String str3 = System.getenv("TRACKET_AUTOMATION_PORT");
            int iIntValue = (str3 == null || (numZ = ii8.z(str3)) == null) ? 8765 : numZ.intValue();
            w97 w97Var2 = this.a0;
            if (w97Var2 == null) {
                ff4.p("component");
                throw null;
            }
            dw6Var = Boolean.valueOf(pg0.a(w97Var2, str2, iIntValue, "android", "", false));
            Throwable thA = ew6.a(dw6Var);
            if (thA == null || (thA instanceof CancellationException)) {
                return;
            }
            Object obj = cp6.a;
            cp6.a("E", "MainActivity", "Failed to start debug automation runtime", thA);
            AppPlatform appPlatform = n36.a;
            yw1 yw1Var = yw1.a;
            String strConcat = "MainActivity: ".concat("Failed to start debug automation runtime");
            FirebaseCrashlytics firebaseCrashlyticsA = yw1.a();
            if (firebaseCrashlyticsA != null) {
                firebaseCrashlyticsA.log(strConcat);
            }
            yw1.c(thA);
        } catch (Throwable th2) {
            dw6Var = new dw6(th2);
        }
    }

    @Override // defpackage.xo, android.app.Activity
    public final void onDestroy() {
        Object dw6Var;
        try {
            pg0.b("android");
            dw6Var = ud9.a;
        } catch (Throwable th) {
            dw6Var = new dw6(th);
        }
        Throwable thA = ew6.a(dw6Var);
        if (thA != null && !(thA instanceof CancellationException)) {
            Object obj = cp6.a;
            cp6.a("E", "MainActivity", "Failed to stop debug automation runtime", thA);
            AppPlatform appPlatform = n36.a;
            yw1 yw1Var = yw1.a;
            String strConcat = "MainActivity: ".concat("Failed to stop debug automation runtime");
            FirebaseCrashlytics firebaseCrashlyticsA = yw1.a();
            if (firebaseCrashlyticsA != null) {
                firebaseCrashlyticsA.log(strConcat);
            }
            yw1.c(thA);
        }
        WeakReference weakReference = a9.m;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == this) {
            a9.m = null;
        }
        WeakReference weakReference2 = rxe.a;
        if ((weakReference2 != null ? (Activity) weakReference2.get() : null) == this) {
            rxe.a = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.cj1, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        R(intent);
    }

    @Override // defpackage.xo, android.app.Activity
    public final void onResume() {
        super.onResume();
        tp3 tp3Var = tp3.a;
        tp3.a();
    }

    @Override // defpackage.xo, android.app.Activity
    public final void onStart() {
        super.onStart();
        w97 w97Var = this.a0;
        if (w97Var != null) {
            w97Var.Q = false;
        } else {
            ff4.p("component");
            throw null;
        }
    }

    @Override // defpackage.xo, android.app.Activity
    public final void onStop() {
        super.onStop();
        w97 w97Var = this.a0;
        if (w97Var == null) {
            ff4.p("component");
            throw null;
        }
        w97Var.Q = w97Var.Q || ((k81) w97Var.W.j()).a != null;
        w97Var.T.s(eg1.N, new tt5(7));
    }
}
