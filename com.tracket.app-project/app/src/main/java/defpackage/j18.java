package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j18 {
    public static MessageDigest b;
    public final Object a;

    public j18(int i) {
        switch (i) {
            case 1:
                this.a = new Object();
                break;
            default:
                this.a = new Object();
                break;
        }
    }

    public abstract void a(vk7 vk7Var);

    public abstract void b();

    public abstract void c();

    public abstract xp3 d(vk7 vk7Var);

    public abstract void e(j61 j61Var);

    public MessageDigest f() {
        synchronized (this.a) {
            MessageDigest messageDigest = b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return b;
        }
    }
}
