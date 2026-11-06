package com.tracket.rendering.presenters.visuals;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'H' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ShapeOverlayPresenter$ShapeHandle {
    public static final ShapeOverlayPresenter$ShapeHandle A;
    public static final ShapeOverlayPresenter$ShapeHandle B;
    public static final ShapeOverlayPresenter$ShapeHandle C;
    public static final ShapeOverlayPresenter$ShapeHandle D;
    public static final ShapeOverlayPresenter$ShapeHandle E;
    public static final ShapeOverlayPresenter$ShapeHandle F;
    public static final ShapeOverlayPresenter$ShapeHandle G;
    public static final ShapeOverlayPresenter$ShapeHandle H;
    public static final ShapeOverlayPresenter$ShapeHandle I;
    public static final ShapeOverlayPresenter$ShapeHandle J;
    public static final /* synthetic */ ShapeOverlayPresenter$ShapeHandle[] K;
    public final int y;
    public final int z;

    static {
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle = new ShapeOverlayPresenter$ShapeHandle("TOP_LEFT", 0, -1, -1);
        A = shapeOverlayPresenter$ShapeHandle;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle2 = new ShapeOverlayPresenter$ShapeHandle("TOP", 1, 0, -1, 1);
        B = shapeOverlayPresenter$ShapeHandle2;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle3 = new ShapeOverlayPresenter$ShapeHandle("TOP_RIGHT", 2, 1, -1);
        C = shapeOverlayPresenter$ShapeHandle3;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle4 = new ShapeOverlayPresenter$ShapeHandle("RIGHT", 3, 1, 0, 2);
        D = shapeOverlayPresenter$ShapeHandle4;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle5 = new ShapeOverlayPresenter$ShapeHandle("BOTTOM_RIGHT", 4, 1, 1);
        E = shapeOverlayPresenter$ShapeHandle5;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle6 = new ShapeOverlayPresenter$ShapeHandle("BOTTOM", 5, 0, 1, 1);
        F = shapeOverlayPresenter$ShapeHandle6;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle7 = new ShapeOverlayPresenter$ShapeHandle("BOTTOM_LEFT", 6, -1, 1);
        G = shapeOverlayPresenter$ShapeHandle7;
        int i = 0;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle8 = new ShapeOverlayPresenter$ShapeHandle("LEFT", 7, -1, i, 2);
        H = shapeOverlayPresenter$ShapeHandle8;
        int i2 = 0;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle9 = new ShapeOverlayPresenter$ShapeHandle("FEATHER", 8, i, i2, 3);
        I = shapeOverlayPresenter$ShapeHandle9;
        ShapeOverlayPresenter$ShapeHandle shapeOverlayPresenter$ShapeHandle10 = new ShapeOverlayPresenter$ShapeHandle("CORNER_RADIUS", 9, i2, 0, 3);
        J = shapeOverlayPresenter$ShapeHandle10;
        K = new ShapeOverlayPresenter$ShapeHandle[]{shapeOverlayPresenter$ShapeHandle, shapeOverlayPresenter$ShapeHandle2, shapeOverlayPresenter$ShapeHandle3, shapeOverlayPresenter$ShapeHandle4, shapeOverlayPresenter$ShapeHandle5, shapeOverlayPresenter$ShapeHandle6, shapeOverlayPresenter$ShapeHandle7, shapeOverlayPresenter$ShapeHandle8, shapeOverlayPresenter$ShapeHandle9, shapeOverlayPresenter$ShapeHandle10};
    }

    public /* synthetic */ ShapeOverlayPresenter$ShapeHandle(String str, int i, int i2, int i3, int i4) {
        this(str, i, (i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    public static ShapeOverlayPresenter$ShapeHandle valueOf(String str) {
        return (ShapeOverlayPresenter$ShapeHandle) Enum.valueOf(ShapeOverlayPresenter$ShapeHandle.class, str);
    }

    public static ShapeOverlayPresenter$ShapeHandle[] values() {
        return (ShapeOverlayPresenter$ShapeHandle[]) K.clone();
    }

    public ShapeOverlayPresenter$ShapeHandle(String str, int i, int i2, int i3) {
        super(str, i);
        this.y = i2;
        this.z = i3;
    }
}
