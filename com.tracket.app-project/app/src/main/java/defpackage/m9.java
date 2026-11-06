package defpackage;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class m9 extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = null;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                pw pwVar = (pw) this.b;
                int i2 = message.what;
                if (i2 == 1) {
                    ow owVar = (ow) message.obj;
                    try {
                        pwVar.y.queueInputBuffer(owVar.a, 0, owVar.b, owVar.d, owVar.e);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = pwVar.B;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    obj = owVar;
                } else if (i2 == 2) {
                    ow owVar2 = (ow) message.obj;
                    int i3 = owVar2.a;
                    MediaCodec.CryptoInfo cryptoInfo = owVar2.c;
                    long j = owVar2.d;
                    int i4 = owVar2.e;
                    try {
                        if (Build.VERSION.SDK_INT < 31) {
                            synchronized (pw.F) {
                                pwVar.y.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            }
                        } else {
                            pwVar.y.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                        }
                        break;
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = pwVar.B;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    obj = owVar2;
                } else if (i2 == 3) {
                    pwVar.C.c();
                } else if (i2 != 4) {
                    AtomicReference atomicReference3 = pwVar.B;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i2));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        pwVar.y.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = pwVar.B;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (obj != null) {
                    ArrayDeque arrayDeque = pw.E;
                    synchronized (arrayDeque) {
                        arrayDeque.add(obj);
                        break;
                    }
                    return;
                }
                return;
            default:
                c1f c1fVar = (c1f) this.b;
                int i5 = message.what;
                if (i5 == 1) {
                    b1f b1fVar = (b1f) message.obj;
                    try {
                        c1fVar.y.queueInputBuffer(b1fVar.a, 0, b1fVar.b, b1fVar.d, b1fVar.e);
                        break;
                    } catch (RuntimeException e4) {
                        AtomicReference atomicReference5 = c1fVar.B;
                        while (!atomicReference5.compareAndSet(null, e4) && atomicReference5.get() == null) {
                        }
                    }
                    obj = b1fVar;
                } else if (i5 == 2) {
                    b1f b1fVar2 = (b1f) message.obj;
                    int i6 = b1fVar2.a;
                    MediaCodec.CryptoInfo cryptoInfo2 = b1fVar2.c;
                    long j2 = b1fVar2.d;
                    int i7 = b1fVar2.e;
                    try {
                        if (Build.VERSION.SDK_INT < 31) {
                            synchronized (c1f.F) {
                                c1fVar.y.queueSecureInputBuffer(i6, 0, cryptoInfo2, j2, i7);
                            }
                        } else {
                            c1fVar.y.queueSecureInputBuffer(i6, 0, cryptoInfo2, j2, i7);
                        }
                        break;
                    } catch (RuntimeException e5) {
                        AtomicReference atomicReference6 = c1fVar.B;
                        while (!atomicReference6.compareAndSet(null, e5) && atomicReference6.get() == null) {
                        }
                    }
                    obj = b1fVar2;
                } else if (i5 == 3) {
                    c1fVar.C.a();
                } else if (i5 != 4) {
                    AtomicReference atomicReference7 = c1fVar.B;
                    IllegalStateException illegalStateException2 = new IllegalStateException(String.valueOf(i5));
                    while (!atomicReference7.compareAndSet(null, illegalStateException2) && atomicReference7.get() == null) {
                    }
                } else {
                    try {
                        c1fVar.y.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e6) {
                        AtomicReference atomicReference8 = c1fVar.B;
                        while (!atomicReference8.compareAndSet(null, e6) && atomicReference8.get() == null) {
                        }
                    }
                }
                if (obj != null) {
                    ArrayDeque arrayDeque2 = c1f.E;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(obj);
                        break;
                    }
                    return;
                }
                return;
        }
    }
}
