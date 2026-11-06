package defpackage;

import com.tracket.projects.MediaPickerAccessIssue;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ks2 extends ns2 {
    public final MediaPickerAccessIssue a;

    public ks2(MediaPickerAccessIssue mediaPickerAccessIssue) {
        this.a = mediaPickerAccessIssue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks2) && this.a == ((ks2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MediaPickerAccessIssueDetected(issue=" + this.a + ")";
    }
}
