package org.jetbrains.skia;

import defpackage.mq3;
import defpackage.ud9;
import defpackage.xq3;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Codec$imageInfo$1 extends xq3 implements mq3 {
    public static final Codec$imageInfo$1 INSTANCE = new Codec$imageInfo$1();

    public Codec$imageInfo$1() {
        super(3, CodecKt.class, "Codec_nGetImageInfo", "Codec_nGetImageInfo(JLjava/lang/Object;Ljava/lang/Object;)V", 1);
    }

    @Override // defpackage.mq3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).longValue(), obj2, obj3);
        return ud9.a;
    }

    public final void invoke(long j, Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        CodecKt.Codec_nGetImageInfo(j, obj, obj2);
    }
}
