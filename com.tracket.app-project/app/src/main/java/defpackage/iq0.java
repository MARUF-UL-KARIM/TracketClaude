package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class iq0 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final iq0 C = new iq0();
    public final AtomicBoolean y = new AtomicBoolean();
    public final AtomicBoolean z = new AtomicBoolean();
    public final ArrayList A = new ArrayList();
    public boolean B = false;

    public static void b(Application application) {
        iq0 iq0Var = C;
        synchronized (iq0Var) {
            try {
                if (!iq0Var.B) {
                    application.registerActivityLifecycleCallbacks(iq0Var);
                    application.registerComponentCallbacks(iq0Var);
                    iq0Var.B = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(hq0 hq0Var) {
        synchronized (C) {
            this.A.add(hq0Var);
        }
    }

    public final void c(boolean z) {
        synchronized (C) {
            try {
                ArrayList arrayList = this.A;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((hq0) obj).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.y.compareAndSet(true, false);
        this.z.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.y.compareAndSet(true, false);
        this.z.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.y.compareAndSet(false, true)) {
            this.z.set(true);
            c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
