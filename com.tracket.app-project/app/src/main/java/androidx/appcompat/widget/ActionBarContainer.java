package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tracket.app.R;
import defpackage.dn6;
import defpackage.i4;
import defpackage.jg7;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public View A;
    public Drawable B;
    public Drawable C;
    public Drawable D;
    public final boolean E;
    public boolean F;
    public final int G;
    public boolean y;
    public View z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        setBackground(new i4(this, 0));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn6.a);
        this.B = typedArrayObtainStyledAttributes.getDrawable(0);
        this.C = typedArrayObtainStyledAttributes.getDrawable(2);
        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.E = true;
            this.D = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.E ? !(this.B != null || this.C != null) : this.D == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.B;
        if (drawable != null && drawable.isStateful()) {
            this.B.setState(getDrawableState());
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null && drawable2.isStateful()) {
            this.C.setState(getDrawableState());
        }
        Drawable drawable3 = this.D;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.D.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.D;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.z = findViewById(R.id.action_bar);
        this.A = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.y || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.E) {
            Drawable drawable = this.D;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.B == null) {
                z2 = false;
            } else if (this.z.getVisibility() == 0) {
                this.B.setBounds(this.z.getLeft(), this.z.getTop(), this.z.getRight(), this.z.getBottom());
            } else {
                View view = this.A;
                if (view == null || view.getVisibility() != 0) {
                    this.B.setBounds(0, 0, 0, 0);
                } else {
                    this.B.setBounds(this.A.getLeft(), this.A.getTop(), this.A.getRight(), this.A.getBottom());
                }
            }
            this.F = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.z == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.G) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.z == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.B);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.z;
            if (view != null) {
                this.B.setBounds(view.getLeft(), this.z.getTop(), this.z.getRight(), this.z.getBottom());
            }
        }
        boolean z = false;
        if (!this.E ? !(this.B != null || this.C != null) : this.D == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.D;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.D);
        }
        this.D = drawable;
        boolean z = this.E;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.D) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.B != null || this.C != null) : this.D == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.C);
        }
        this.C = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.F && this.C != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.E ? !(this.B != null || this.C != null) : this.D == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.y = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.C;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.D;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.B;
        boolean z = this.E;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.C && this.F) {
            return true;
        }
        return (drawable == this.D && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(jg7 jg7Var) {
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
