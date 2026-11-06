package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class hjb extends n2 {
    public static final Parcelable.Creator<hjb> CREATOR = new sib(2);
    public final String y;
    public final int z;

    public hjb(String str, int i) {
        this.y = str;
        this.z = i;
    }

    public static hjb a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new hjb(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hjb)) {
            return false;
        }
        hjb hjbVar = (hjb) obj;
        return hxb.d(this.y, hjbVar.y) && hxb.d(Integer.valueOf(this.z), Integer.valueOf(hjbVar.z));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.y, Integer.valueOf(this.z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.j(parcel, 2, this.y);
        zfe.p(parcel, 3, 4);
        parcel.writeInt(this.z);
        zfe.s(parcel, iR);
    }
}
