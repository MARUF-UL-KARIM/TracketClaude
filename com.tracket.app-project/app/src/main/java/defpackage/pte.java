package defpackage;

import com.tracket.projects.data.assets.VideoColorTransfer;
import com.tracket.rendering.color.AndroidHdrInputTransfer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pte {
    public static String a(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM = iu1.m("<", str2, " threw ");
                    sbM.append(e.getClass().getName());
                    sbM.append(">");
                    string = sbM.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final AndroidHdrInputTransfer b(li9 li9Var) {
        if (li9Var != null && li9Var.a() && li9Var.b == VideoColorTransfer.B) {
            return AndroidHdrInputTransfer.HLG;
        }
        if (li9Var != null && li9Var.a() && li9Var.b == VideoColorTransfer.C) {
            return AndroidHdrInputTransfer.PQ;
        }
        return (li9Var != null ? li9Var.b : null) == VideoColorTransfer.z ? AndroidHdrInputTransfer.SRGB : AndroidHdrInputTransfer.BT709;
    }
}
