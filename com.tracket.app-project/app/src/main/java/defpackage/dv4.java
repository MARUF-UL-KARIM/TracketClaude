package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class dv4 extends f6 {
    public final zv6 F;

    public dv4(int i, String str, String str2, f6 f6Var, zv6 zv6Var) {
        super(i, str, str2, f6Var);
        this.F = zv6Var;
    }

    @Override // defpackage.f6
    public final JSONObject p() throws JSONException {
        JSONObject jSONObjectP = super.p();
        zv6 zv6Var = this.F;
        if (zv6Var == null) {
            jSONObjectP.put("Response Info", "null");
            return jSONObjectP;
        }
        jSONObjectP.put("Response Info", zv6Var.b());
        return jSONObjectP;
    }

    @Override // defpackage.f6
    public final String toString() {
        try {
            return p().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
