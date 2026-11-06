package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class wmb implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager a;
    public final jmb b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f = 1.0f;

    public wmb(Context context, jmb jmbVar) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = jmbVar;
    }

    public final void a() {
        boolean z = this.d;
        jmb jmbVar = this.b;
        AudioManager audioManager = this.a;
        if (!z || this.e || this.f <= 0.0f) {
            if (this.c) {
                if (audioManager != null) {
                    this.c = audioManager.abandonAudioFocus(this) == 0;
                }
                jmbVar.y();
                return;
            }
            return;
        }
        if (this.c) {
            return;
        }
        if (audioManager != null) {
            this.c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        jmbVar.y();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.y();
    }
}
