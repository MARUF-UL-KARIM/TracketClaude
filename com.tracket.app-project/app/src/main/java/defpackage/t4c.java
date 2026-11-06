package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface t4c {
    void H(String str);

    void N();

    void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b(View view);

    JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    boolean d();

    void e();

    void f(Bundle bundle);

    void g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType);

    void h();

    void i(View view);

    void j(lxb lxbVar);

    void k();

    void l();

    JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void n(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i);

    void o(Bundle bundle);

    void p(g0c g0cVar);

    void r(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void s(r9b r9bVar);

    void t(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    boolean u(Bundle bundle);

    int v();

    void w(View view, MotionEvent motionEvent);

    boolean z();
}
