package com.google.common.base;

import defpackage.z86;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
enum Predicates$ObjectPredicate implements z86 {
    y { // from class: com.google.common.base.Predicates$ObjectPredicate.1
        @Override // defpackage.z86
        public final boolean apply(Object obj) {
            return true;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.alwaysTrue()";
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF9 { // from class: com.google.common.base.Predicates$ObjectPredicate.2
        @Override // defpackage.z86
        public final boolean apply(Object obj) {
            return false;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.alwaysFalse()";
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF14 { // from class: com.google.common.base.Predicates$ObjectPredicate.3
        @Override // defpackage.z86
        public final boolean apply(Object obj) {
            return obj == null;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.isNull()";
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF19 { // from class: com.google.common.base.Predicates$ObjectPredicate.4
        @Override // defpackage.z86
        public final boolean apply(Object obj) {
            return obj != null;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.notNull()";
        }
    }
}
