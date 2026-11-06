package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class x34 implements Comparable {
    public static final x34 A;
    public static final x34 B;
    public static final x34 C;
    public static final x34 D;
    public static final x34 E;
    public static final x34 F;
    public static final x34 G;
    public static final x34 H;
    public static final List I;
    public final int y;
    public final String z;

    static {
        x34 x34Var = new x34(100, "Continue");
        x34 x34Var2 = new x34(101, "Switching Protocols");
        x34 x34Var3 = new x34(102, "Processing");
        x34 x34Var4 = new x34(200, "OK");
        A = x34Var4;
        x34 x34Var5 = new x34(201, "Created");
        x34 x34Var6 = new x34(202, "Accepted");
        x34 x34Var7 = new x34(203, "Non-Authoritative Information");
        x34 x34Var8 = new x34(204, "No Content");
        x34 x34Var9 = new x34(205, "Reset Content");
        x34 x34Var10 = new x34(206, "Partial Content");
        B = x34Var10;
        x34 x34Var11 = new x34(207, "Multi-Status");
        x34 x34Var12 = new x34(300, "Multiple Choices");
        x34 x34Var13 = new x34(301, "Moved Permanently");
        C = x34Var13;
        x34 x34Var14 = new x34(302, "Found");
        D = x34Var14;
        x34 x34Var15 = new x34(303, "See Other");
        E = x34Var15;
        x34 x34Var16 = new x34(304, "Not Modified");
        x34 x34Var17 = new x34(305, "Use Proxy");
        x34 x34Var18 = new x34(306, "Switch Proxy");
        x34 x34Var19 = new x34(307, "Temporary Redirect");
        F = x34Var19;
        x34 x34Var20 = new x34(308, "Permanent Redirect");
        G = x34Var20;
        x34 x34Var21 = new x34(400, "Bad Request");
        x34 x34Var22 = new x34(401, "Unauthorized");
        H = x34Var22;
        List listK = tc1.k(x34Var, x34Var2, x34Var3, x34Var4, x34Var5, x34Var6, x34Var7, x34Var8, x34Var9, x34Var10, x34Var11, x34Var12, x34Var13, x34Var14, x34Var15, x34Var16, x34Var17, x34Var18, x34Var19, x34Var20, x34Var21, x34Var22, new x34(402, "Payment Required"), new x34(403, "Forbidden"), new x34(404, "Not Found"), new x34(405, "Method Not Allowed"), new x34(406, "Not Acceptable"), new x34(407, "Proxy Authentication Required"), new x34(408, "Request Timeout"), new x34(409, "Conflict"), new x34(410, "Gone"), new x34(411, "Length Required"), new x34(412, "Precondition Failed"), new x34(413, "Payload Too Large"), new x34(414, "Request-URI Too Long"), new x34(415, "Unsupported Media Type"), new x34(416, "Requested Range Not Satisfiable"), new x34(417, "Expectation Failed"), new x34(422, "Unprocessable Entity"), new x34(423, "Locked"), new x34(424, "Failed Dependency"), new x34(425, "Too Early"), new x34(426, "Upgrade Required"), new x34(429, "Too Many Requests"), new x34(431, "Request Header Fields Too Large"), new x34(500, "Internal Server Error"), new x34(501, "Not Implemented"), new x34(502, "Bad Gateway"), new x34(503, "Service Unavailable"), new x34(504, "Gateway Timeout"), new x34(505, "HTTP Version Not Supported"), new x34(506, "Variant Also Negotiates"), new x34(507, "Insufficient Storage"));
        I = listK;
        List list = listK;
        int iE = x05.e(tc1.e(list, 10));
        if (iE < 16) {
            iE = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iE);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((x34) obj).y), obj);
        }
    }

    public x34(int i, String str) {
        str.getClass();
        this.y = i;
        this.z = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x34 x34Var = (x34) obj;
        x34Var.getClass();
        return this.y - x34Var.y;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x34) && ((x34) obj).y == this.y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y);
    }

    public final String toString() {
        return this.y + ' ' + this.z;
    }
}
