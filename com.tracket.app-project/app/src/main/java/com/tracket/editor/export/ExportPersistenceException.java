package com.tracket.editor.export;

import defpackage.wd0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ExportPersistenceException extends Exception {
    public final ExportPersistenceStage y;
    public final ExportPersistenceFailureKind z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExportPersistenceException(ExportPersistenceStage exportPersistenceStage, ExportPersistenceFailureKind exportPersistenceFailureKind, Exception exc) {
        String strName = exportPersistenceStage.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = exportPersistenceFailureKind.name().toLowerCase(locale);
        lowerCase2.getClass();
        super(wd0.l("Export persistence failed at ", lowerCase, ": ", lowerCase2), exc);
        this.y = exportPersistenceStage;
        this.z = exportPersistenceFailureKind;
    }
}
