package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class km1 implements Map, aj4 {
    public final ConcurrentHashMap y = new ConcurrentHashMap(32);

    @Override // java.util.Map
    public final void clear() {
        this.y.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.y.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.y.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set setEntrySet = this.y.entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return obj.equals(this.y);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.y.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.y.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.y.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set setKeySet = this.y.keySet();
        setKeySet.getClass();
        return setKeySet;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.y.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        this.y.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.y.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.y.size();
    }

    public final String toString() {
        return "ConcurrentMapJvm by " + this.y;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collectionValues = this.y.values();
        collectionValues.getClass();
        return collectionValues;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return this.y.remove(obj, obj2);
    }
}
