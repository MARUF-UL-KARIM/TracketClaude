package com.google.common.flogger.context;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
enum Tags$Type {
    y { // from class: com.google.common.flogger.context.Tags$Type.1
        @Override // com.google.common.flogger.context.Tags$Type
        public final int b(Object obj, Object obj2) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
    },
    z { // from class: com.google.common.flogger.context.Tags$Type.2
        @Override // com.google.common.flogger.context.Tags$Type
        public final int b(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    },
    A { // from class: com.google.common.flogger.context.Tags$Type.3
        @Override // com.google.common.flogger.context.Tags$Type
        public final int b(Object obj, Object obj2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
    },
    B { // from class: com.google.common.flogger.context.Tags$Type.4
        @Override // com.google.common.flogger.context.Tags$Type
        public final int b(Object obj, Object obj2) {
            return ((Double) obj).compareTo((Double) obj2);
        }
    };

    public static Tags$Type a(Object obj) {
        if (obj instanceof String) {
            return z;
        }
        if (obj instanceof Boolean) {
            return y;
        }
        if (obj instanceof Long) {
            return A;
        }
        if (obj instanceof Double) {
            return B;
        }
        throw new AssertionError("invalid tag type: " + obj.getClass());
    }

    public abstract int b(Object obj, Object obj2);
}
