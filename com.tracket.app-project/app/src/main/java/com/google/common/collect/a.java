package com.google.common.collect;

import defpackage.k1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Iterator {
    public final /* synthetic */ k1 C;
    public final Iterator y;
    public Object z = null;
    public Collection A = null;
    public Iterator B = Iterators$EmptyModifiableIterator.y;

    public a(k1 k1Var) {
        this.C = k1Var;
        this.y = k1Var.B.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y.hasNext() || this.B.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.B.hasNext()) {
            Map.Entry entry = (Map.Entry) this.y.next();
            this.z = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.A = collection;
            this.B = collection.iterator();
        }
        return this.B.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.B.remove();
        Collection collection = this.A;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.y.remove();
        }
        this.C.C--;
    }
}
