package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public interface qi4 extends pi4 {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    gj4 getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
