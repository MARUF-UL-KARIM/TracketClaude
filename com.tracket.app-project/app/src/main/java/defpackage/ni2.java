package defpackage;

import android.content.Context;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager$AdvertisedMemoryTier;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager$AvailableMemoryTier;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager$AvailableProcessorTier;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ni2 {
    public final Context a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicReference c = new AtomicReference(DeviceTierManager$AdvertisedMemoryTier.UNKNOWN);
    public final AtomicReference d = new AtomicReference(DeviceTierManager$AvailableMemoryTier.UNKNOWN);
    public final AtomicReference e = new AtomicReference(DeviceTierManager$AvailableProcessorTier.UNKNOWN);

    public ni2(Context context) {
        this.a = context;
    }
}
