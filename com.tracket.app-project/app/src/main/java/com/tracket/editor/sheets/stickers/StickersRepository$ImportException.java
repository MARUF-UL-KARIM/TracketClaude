package com.tracket.editor.sheets.stickers;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class StickersRepository$ImportException extends Exception {

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class FailedReadStickers extends StickersRepository$ImportException {
        public static final FailedReadStickers y = new FailedReadStickers();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FailedReadStickers);
        }

        public final int hashCode() {
            return 481922461;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "FailedReadStickers";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class FileTooLarge extends StickersRepository$ImportException {
        public static final FileTooLarge y = new FileTooLarge();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FileTooLarge);
        }

        public final int hashCode() {
            return -2031237865;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "FileTooLarge";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class NoStickersFound extends StickersRepository$ImportException {
        public static final NoStickersFound y = new NoStickersFound();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoStickersFound);
        }

        public final int hashCode() {
            return 749124695;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NoStickersFound";
        }
    }
}
