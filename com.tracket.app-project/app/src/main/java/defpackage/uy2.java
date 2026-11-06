package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class uy2 implements TextWatcher {
    public boolean A = true;
    public final EditText y;
    public ty2 z;

    public uy2(EditText editText) {
        this.y = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            dy2 dy2VarA = dy2.a();
            if (editableText == null) {
                length = 0;
            } else {
                dy2VarA.getClass();
                length = editableText.length();
            }
            dy2VarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.y;
        if (!editText.isInEditMode() && this.A && dy2.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = dy2.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    dy2.a().g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            dy2 dy2VarA = dy2.a();
            ty2 ty2Var = this.z;
            if (ty2Var == null) {
                ty2Var = new ty2(editText);
                this.z = ty2Var;
            }
            dy2VarA.h(ty2Var);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
