package defpackage;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ck6 implements jf9 {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public bb3 d;
    public final rl5 e;

    public /* synthetic */ ck6(rl5 rl5Var, int i) {
        this.a = i;
        this.e = rl5Var;
    }

    @Override // defpackage.jf9
    public final jf9 b(String str) {
        int i = this.a;
        rl5 rl5Var = this.e;
        switch (i) {
            case 0:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((ak6) rl5Var).i(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((yla) rl5Var).c(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((ykb) rl5Var).c(this.d, str, this.c);
                return this;
        }
    }

    @Override // defpackage.jf9
    public final jf9 c(boolean z) {
        int i = this.a;
        rl5 rl5Var = this.e;
        switch (i) {
            case 0:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((ak6) rl5Var).c(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((yla) rl5Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((ykb) rl5Var).h(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }
}
