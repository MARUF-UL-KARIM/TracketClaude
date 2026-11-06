package defpackage;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class fkc implements hnc {
    public final /* synthetic */ int a;
    public final Bundle b;

    public /* synthetic */ fkc(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.hnc
    public final void i(Object obj) {
        int i = this.a;
        Bundle bundle = this.b;
        switch (i) {
            case 0:
                Bundle bundle2 = (Bundle) obj;
                if (!bundle.isEmpty()) {
                    bundle2.putBundle("installed_adapter_data", bundle);
                }
                break;
            case 1:
                Bundle bundle3 = (Bundle) obj;
                Bundle bundleE = ahe.e("device", bundle3);
                bundleE.putBundle("android_mem_info", bundle);
                bundle3.putBundle("device", bundleE);
                break;
            case 2:
                Bundle bundle4 = (Bundle) obj;
                if (bundle != null) {
                    bundle4.putAll(bundle);
                }
                break;
            case 3:
                Bundle bundle5 = (Bundle) obj;
                if (!bundle.isEmpty()) {
                    bundle5.putBundle("shared_pref", bundle);
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                if (bundle != null) {
                    try {
                        u9e.i("play_store", u9e.i("device", jSONObject)).put("parental_controls", pva.g.a.m(bundle));
                    } catch (JSONException unused) {
                        q9c.a("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }
}
