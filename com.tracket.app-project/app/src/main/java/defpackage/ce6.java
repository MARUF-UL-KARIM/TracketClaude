package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ce6 {
    public final ArrayList a;

    public ce6(h8b h8bVar) {
        l8b k8bVar;
        this.a = new ArrayList();
        try {
            h8bVar.zza();
        } catch (RemoteException e) {
            q9c.g("", e);
        }
        try {
            ArrayList arrayListZzb = h8bVar.zzb();
            int size = arrayListZzb.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListZzb.get(i);
                i++;
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    k8bVar = iInterfaceQueryLocalInterface instanceof l8b ? (l8b) iInterfaceQueryLocalInterface : new k8b(iBinder);
                } else {
                    k8bVar = null;
                }
                if (k8bVar != null) {
                    this.a.add(new m8b(k8bVar));
                }
            }
        } catch (RemoteException e2) {
            q9c.g("", e2);
        }
    }

    public ce6(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new be6(jSONObjectOptJSONObject));
                }
            }
        }
        this.a = arrayList;
    }
}
