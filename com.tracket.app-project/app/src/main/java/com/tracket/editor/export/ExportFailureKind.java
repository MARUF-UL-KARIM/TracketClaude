package com.tracket.editor.export;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum ExportFailureKind {
    ENCODER_CAPABILITY("encoder_capability"),
    ENCODER_SETUP("encoder_setup"),
    ENCODER_RUNTIME("encoder_runtime"),
    /* JADX INFO: Fake field, exist only in values array */
    WRITER_NOT_READY("writer_not_ready"),
    /* JADX INFO: Fake field, exist only in values array */
    WRITER_APPEND_REJECTED("writer_append_rejected"),
    /* JADX INFO: Fake field, exist only in values array */
    WRITER_STOPPED("writer_stopped"),
    WRITER_FINISH("writer_finish"),
    PERSISTENCE_PHOTOS("persistence_photos"),
    PERSISTENCE_LOCAL("persistence_local"),
    LOW_STORAGE("low_storage"),
    LIFECYCLE_CANCELLED("lifecycle_cancelled"),
    UNEXPECTED("unexpected");

    public final String y;

    ExportFailureKind(String str) {
        this.y = str;
    }
}
