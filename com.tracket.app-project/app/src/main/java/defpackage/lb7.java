package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public interface lb7 extends AutoCloseable {
    void E(int i, String str);

    String U(int i);

    void b(int i, double d);

    boolean f0();

    void g(int i, long j);

    byte[] getBlob(int i);

    default boolean getBoolean() {
        return getLong(0) != 0;
    }

    int getColumnCount();

    String getColumnName(int i);

    default List getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(getColumnName(i));
        }
        return arrayList;
    }

    double getDouble(int i);

    long getLong(int i);

    int h0(int i);

    void i(int i);

    boolean isNull(int i);

    void l();

    void reset();
}
