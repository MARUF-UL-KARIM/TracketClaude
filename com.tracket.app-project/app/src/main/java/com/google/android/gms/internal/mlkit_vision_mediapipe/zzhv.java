package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class zzhv {
    private long zza;

    private zzhv(long j) {
        this.zza = j;
    }

    public static zzhv zzd(long j) {
        return new zzhv(j);
    }

    private final native long zzf(long j);

    private final native long zzg(long j);

    private final native void zzh(long j);

    public long zza() {
        return this.zza;
    }

    public final long zzb() {
        return zzg(this.zza);
    }

    public final zzhv zzc() {
        return new zzhv(zzf(this.zza));
    }

    public void zze() {
        long j = this.zza;
        if (j != 0) {
            zzh(j);
            this.zza = 0L;
        }
    }
}
