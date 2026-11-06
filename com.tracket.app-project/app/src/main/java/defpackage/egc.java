package defpackage;

import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzju;
import org.jetbrains.skia.icu.CharProperties;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class egc {
    public static final egc b = new egc(0);
    public static final egc c = new egc(1);
    public static final egc d = new egc(2);
    public static final egc e = new egc(3);
    public static final egc f = new egc(4);
    public static final egc g = new egc(5);
    public static final egc h = new egc(6);
    public static final egc i = new egc(7);
    public static final egc j = new egc(8);
    public final /* synthetic */ int a;

    public /* synthetic */ egc(int i2) {
        this.a = i2;
    }

    public final boolean a(int i2) {
        zzju zzjuVar;
        switch (this.a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                            case 22:
                            case 23:
                            case CharProperties.NONCHARACTER_CODE_POINT /* 24 */:
                            case CharProperties.QUOTATION_MARK /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                            case CharProperties.UNIFIED_IDEOGRAPH /* 29 */:
                            case CharProperties.UPPERCASE /* 30 */:
                            case 31:
                            case CharProperties.XID_CONTINUE /* 32 */:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case CharProperties.NFKD_INERT /* 38 */:
                            case 39:
                                break;
                            default:
                                return false;
                        }
                        break;
                }
                return true;
            case 2:
                return zzjn.a(i2) != null;
            case 3:
                if (i2 == 0) {
                    zzjuVar = zzju.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i2 == 1) {
                    zzjuVar = zzju.PURCHASES_UPDATED_ACTION;
                } else if (i2 == 2) {
                    zzjuVar = zzju.LOCAL_PURCHASES_UPDATED_ACTION;
                } else if (i2 == 3) {
                    zzjuVar = zzju.ALTERNATIVE_BILLING_ACTION;
                } else if (i2 != 4) {
                    zzjuVar = i2 != 5 ? null : zzju.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                } else {
                    zzjuVar = zzju.IN_APP_BILLING_RESULT_UPDATE_ACTION;
                }
                return zzjuVar != null;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 7:
                return i2 == 0 || i2 == 1;
            default:
                return i2 == 0 || i2 == 1;
        }
    }
}
