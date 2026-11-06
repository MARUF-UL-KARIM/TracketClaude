package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class o94 implements pm4, Serializable {
    public final /* synthetic */ int y = 0;
    public final Object z;

    public o94(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.z = patternCompile;
    }

    public s15 a(int i, String str) {
        Matcher matcherRegion = ((Pattern) this.z).matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new s15(matcherRegion, str);
        }
        return null;
    }

    public boolean b(CharSequence charSequence) {
        charSequence.getClass();
        return ((Pattern) this.z).matcher(charSequence).matches();
    }

    public String c(String str, xp3 xp3Var) {
        str.getClass();
        Matcher matcher = ((Pattern) this.z).matcher(str);
        matcher.getClass();
        int i = 0;
        s15 s15Var = !matcher.find(0) ? null : new s15(matcher, str);
        if (s15Var == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, s15Var.b().y);
            sb.append((CharSequence) xp3Var.invoke(s15Var));
            i = s15Var.b().z + 1;
            s15Var = s15Var.c();
            if (i >= length) {
                break;
            }
        } while (s15Var != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public String d(String str, String str2) {
        String strReplaceAll = ((Pattern) this.z).matcher(str).replaceAll(str2);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    @Override // defpackage.pm4
    public Object getValue() {
        return this.z;
    }

    @Override // defpackage.pm4
    public boolean isInitialized() {
        return true;
    }

    public final String toString() {
        int i = this.y;
        Object obj = this.z;
        switch (i) {
            case 0:
                return String.valueOf(obj);
            default:
                String string = ((Pattern) obj).toString();
                string.getClass();
                return string;
        }
    }

    public o94(Object obj) {
        this.z = obj;
    }
}
