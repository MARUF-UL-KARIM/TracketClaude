package defpackage;

import com.google.mediapipe.tasks.core.ErrorListener;
import com.google.mediapipe.tasks.core.OutputHandler;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m93 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ OutputHandler b;

    public /* synthetic */ m93(OutputHandler outputHandler, int i) {
        this.a = i;
        this.b = outputHandler;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        OutputHandler outputHandler = this.b;
        switch (i) {
            case 0:
                outputHandler.setResultListener((OutputHandler.ResultListener) obj);
                break;
            default:
                outputHandler.setErrorListener((ErrorListener) obj);
                break;
        }
    }
}
