package org.jetbrains.skiko;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class WorkaroundSimpleOnGestureListener extends GestureDetector.SimpleOnGestureListener {
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return onFlingWorkaround(motionEvent, motionEvent2, f, f2);
    }

    public abstract boolean onFlingWorkaround(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return onScrollWorkaround(motionEvent, motionEvent2, f, f2);
    }

    public abstract boolean onScrollWorkaround(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);
}
