package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.perf.metrics.Trace;
import java.util.ArrayList;
import org.jetbrains.skia.icu.CharProperties;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class j5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zN = false;
        int iP = 0;
        int iP2 = 0;
        boolean zN2 = false;
        int iP3 = 0;
        int iP4 = 0;
        c8a c8aVar = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListL = null;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayListL2 = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new k5(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                rq rqVar = new rq(parcel);
                rqVar.y = parcel.readByte() != 0;
                return rqVar;
            case 2:
                return new fp0(parcel);
            case 3:
                return new gp0(parcel);
            case 4:
                return new av1(parcel);
            case 5:
                return new q92(parcel.readInt());
            case 6:
                return new xo2(parcel);
            case 7:
                return new wo2(parcel);
            case 8:
                nm3 nm3Var = new nm3();
                nm3Var.y = parcel.readString();
                nm3Var.z = parcel.readInt();
                return nm3Var;
            case 9:
                sm3 sm3Var = new sm3();
                sm3Var.C = null;
                sm3Var.D = new ArrayList();
                sm3Var.E = new ArrayList();
                sm3Var.y = parcel.createStringArrayList();
                sm3Var.z = parcel.createStringArrayList();
                sm3Var.A = (fp0[]) parcel.createTypedArray(fp0.CREATOR);
                sm3Var.B = parcel.readInt();
                sm3Var.C = parcel.readString();
                sm3Var.D = parcel.createStringArrayList();
                sm3Var.E = parcel.createTypedArrayList(gp0.CREATOR);
                sm3Var.F = parcel.createTypedArrayList(nm3.CREATOR);
                return sm3Var;
            case 10:
                return new vm3(parcel);
            case 11:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new lc4((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 12:
                ri5 ri5Var = new ri5(parcel);
                ri5Var.y = parcel.readInt();
                return ri5Var;
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                return new xv5(parcel.readFloat());
            case 15:
                return new yv5(parcel.readInt());
            case 16:
                return new zv5(parcel.readLong());
            case 17:
                return new tz5(parcel);
            case 18:
                return new xz8(parcel.readLong(), parcel.readLong());
            case 19:
                return new Trace(parcel, false);
            case 20:
                int iV = vfe.v(parcel);
                int iP5 = 0;
                while (parcel.dataPosition() < iV) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        zN = vfe.n(parcel, i);
                    } else if (c != 2) {
                        vfe.t(parcel, i);
                    } else {
                        iP5 = vfe.p(parcel, i);
                    }
                }
                vfe.m(parcel, iV);
                return new wa5(iP5, zN);
            case 21:
                int iV2 = vfe.v(parcel);
                while (parcel.dataPosition() < iV2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iP4 = vfe.p(parcel, i2);
                    } else if (c2 != 2) {
                        vfe.t(parcel, i2);
                    } else {
                        arrayListL2 = vfe.l(parcel, i2, e95.CREATOR);
                    }
                }
                vfe.m(parcel, iV2);
                return new or8(iP4, arrayListL2);
            case 22:
                int iV3 = vfe.v(parcel);
                while (parcel.dataPosition() < iV3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        vfe.t(parcel, i3);
                    } else {
                        pendingIntent = (PendingIntent) vfe.g(parcel, i3, PendingIntent.CREATOR);
                    }
                }
                vfe.m(parcel, iV3);
                return new xa5(pendingIntent);
            case 23:
                int iV4 = vfe.v(parcel);
                int iP6 = 0;
                while (parcel.dataPosition() < iV4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iP3 = vfe.p(parcel, i4);
                    } else if (c3 == 2) {
                        iP6 = vfe.p(parcel, i4);
                    } else if (c3 != 3) {
                        vfe.t(parcel, i4);
                    } else {
                        intent = (Intent) vfe.g(parcel, i4, Intent.CREATOR);
                    }
                }
                vfe.m(parcel, iV4);
                return new r6a(iP3, iP6, intent);
            case CharProperties.NONCHARACTER_CODE_POINT /* 24 */:
                int iV5 = vfe.v(parcel);
                long jQ = 0;
                int iP7 = 0;
                String strH = null;
                String strH2 = null;
                String strH3 = null;
                String strH4 = null;
                Uri uri = null;
                String strH5 = null;
                String strH6 = null;
                ArrayList arrayListL3 = null;
                String strH7 = null;
                String strH8 = null;
                while (parcel.dataPosition() < iV5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            iP7 = vfe.p(parcel, i5);
                            break;
                        case 2:
                            strH = vfe.h(parcel, i5);
                            break;
                        case 3:
                            strH2 = vfe.h(parcel, i5);
                            break;
                        case 4:
                            strH3 = vfe.h(parcel, i5);
                            break;
                        case 5:
                            strH4 = vfe.h(parcel, i5);
                            break;
                        case 6:
                            uri = (Uri) vfe.g(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strH5 = vfe.h(parcel, i5);
                            break;
                        case '\b':
                            jQ = vfe.q(parcel, i5);
                            break;
                        case '\t':
                            strH6 = vfe.h(parcel, i5);
                            break;
                        case '\n':
                            arrayListL3 = vfe.l(parcel, i5, Scope.CREATOR);
                            break;
                        case 11:
                            strH7 = vfe.h(parcel, i5);
                            break;
                        case '\f':
                            strH8 = vfe.h(parcel, i5);
                            break;
                        default:
                            vfe.t(parcel, i5);
                            break;
                    }
                }
                vfe.m(parcel, iV5);
                return new GoogleSignInAccount(iP7, strH, strH2, strH3, strH4, uri, strH5, jQ, strH6, arrayListL3, strH7, strH8);
            case CharProperties.QUOTATION_MARK /* 25 */:
                int iV6 = vfe.v(parcel);
                String strH9 = null;
                String strH10 = null;
                while (parcel.dataPosition() < iV6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        arrayListL = vfe.l(parcel, i6, pa3.CREATOR);
                    } else if (c4 == 2) {
                        zN2 = vfe.n(parcel, i6);
                    } else if (c4 == 3) {
                        strH9 = vfe.h(parcel, i6);
                    } else if (c4 != 4) {
                        vfe.t(parcel, i6);
                    } else {
                        strH10 = vfe.h(parcel, i6);
                    }
                }
                vfe.m(parcel, iV6);
                return new so(arrayListL, zN2, strH9, strH10);
            case 26:
                int iV7 = vfe.v(parcel);
                boolean zN3 = false;
                while (parcel.dataPosition() < iV7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iP2 = vfe.p(parcel, i7);
                    } else if (c5 != 2) {
                        vfe.t(parcel, i7);
                    } else {
                        zN3 = vfe.n(parcel, i7);
                    }
                }
                vfe.m(parcel, iV7);
                return new za5(iP2, zN3);
            case 27:
                int iV8 = vfe.v(parcel);
                int iP8 = 0;
                int iP9 = 0;
                int iP10 = 0;
                Long lR = null;
                Long lR2 = null;
                while (parcel.dataPosition() < iV8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        iP8 = vfe.p(parcel, i8);
                    } else if (c6 == 2) {
                        iP9 = vfe.p(parcel, i8);
                    } else if (c6 == 3) {
                        lR = vfe.r(parcel, i8);
                    } else if (c6 == 4) {
                        lR2 = vfe.r(parcel, i8);
                    } else if (c6 != 5) {
                        vfe.t(parcel, i8);
                    } else {
                        iP10 = vfe.p(parcel, i8);
                    }
                }
                vfe.m(parcel, iV8);
                return new ab5(iP8, iP9, lR, lR2, iP10);
            case 28:
                int iV9 = vfe.v(parcel);
                String strH11 = null;
                while (parcel.dataPosition() < iV9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        arrayListJ = vfe.j(parcel, i9);
                    } else if (c7 != 2) {
                        vfe.t(parcel, i9);
                    } else {
                        strH11 = vfe.h(parcel, i9);
                    }
                }
                vfe.m(parcel, iV9);
                return new s7a(strH11, arrayListJ);
            default:
                int iV10 = vfe.v(parcel);
                while (parcel.dataPosition() < iV10) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        iP = vfe.p(parcel, i10);
                    } else if (c8 != 2) {
                        vfe.t(parcel, i10);
                    } else {
                        c8aVar = (c8a) vfe.g(parcel, i10, c8a.CREATOR);
                    }
                }
                vfe.m(parcel, iV10);
                return new v7a(iP, c8aVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new k5[i];
            case 1:
                return new rq[i];
            case 2:
                return new fp0[i];
            case 3:
                return new gp0[i];
            case 4:
                return new av1[i];
            case 5:
                return new q92[i];
            case 6:
                return new xo2[i];
            case 7:
                return new wo2[i];
            case 8:
                return new nm3[i];
            case 9:
                return new sm3[i];
            case 10:
                return new vm3[i];
            case 11:
                return new lc4[i];
            case 12:
                return new ri5[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new xv5[i];
            case 15:
                return new yv5[i];
            case 16:
                return new zv5[i];
            case 17:
                return new tz5[i];
            case 18:
                return new xz8[i];
            case 19:
                return new Trace[i];
            case 20:
                return new wa5[i];
            case 21:
                return new or8[i];
            case 22:
                return new xa5[i];
            case 23:
                return new r6a[i];
            case CharProperties.NONCHARACTER_CODE_POINT /* 24 */:
                return new GoogleSignInAccount[i];
            case CharProperties.QUOTATION_MARK /* 25 */:
                return new so[i];
            case 26:
                return new za5[i];
            case 27:
                return new ab5[i];
            case 28:
                return new s7a[i];
            default:
                return new v7a[i];
        }
    }
}
