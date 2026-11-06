package androidx.datastore.core;

import defpackage.vs1;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, vs1 vs1Var);

    Object writeTo(T t, OutputStream outputStream, vs1 vs1Var);
}
