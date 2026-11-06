package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class fp8 implements pm4, Serializable {
    public final Object A;
    public Function0 y;
    public volatile Object z;

    public fp8(Function0 function0) {
        function0.getClass();
        this.y = function0;
        this.z = rw4.J;
        this.A = this;
    }

    @Override // defpackage.pm4
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.z;
        rw4 rw4Var = rw4.J;
        if (obj != rw4Var) {
            return obj;
        }
        synchronized (this.A) {
            objInvoke = this.z;
            if (objInvoke == rw4Var) {
                Function0 function0 = this.y;
                function0.getClass();
                objInvoke = function0.invoke();
                this.z = objInvoke;
                this.y = null;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.pm4
    public final boolean isInitialized() {
        return this.z != rw4.J;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
