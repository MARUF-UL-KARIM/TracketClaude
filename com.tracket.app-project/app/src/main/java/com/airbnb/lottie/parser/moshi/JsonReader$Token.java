package com.airbnb.lottie.parser.moshi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class JsonReader$Token {
    public static final JsonReader$Token A;
    public static final JsonReader$Token B;
    public static final JsonReader$Token C;
    public static final JsonReader$Token D;
    public static final JsonReader$Token E;
    public static final JsonReader$Token F;
    public static final JsonReader$Token G;
    public static final JsonReader$Token H;
    public static final /* synthetic */ JsonReader$Token[] I;
    public static final JsonReader$Token y;
    public static final JsonReader$Token z;

    static {
        JsonReader$Token jsonReader$Token = new JsonReader$Token("BEGIN_ARRAY", 0);
        y = jsonReader$Token;
        JsonReader$Token jsonReader$Token2 = new JsonReader$Token("END_ARRAY", 1);
        z = jsonReader$Token2;
        JsonReader$Token jsonReader$Token3 = new JsonReader$Token("BEGIN_OBJECT", 2);
        A = jsonReader$Token3;
        JsonReader$Token jsonReader$Token4 = new JsonReader$Token("END_OBJECT", 3);
        B = jsonReader$Token4;
        JsonReader$Token jsonReader$Token5 = new JsonReader$Token("NAME", 4);
        C = jsonReader$Token5;
        JsonReader$Token jsonReader$Token6 = new JsonReader$Token("STRING", 5);
        D = jsonReader$Token6;
        JsonReader$Token jsonReader$Token7 = new JsonReader$Token("NUMBER", 6);
        E = jsonReader$Token7;
        JsonReader$Token jsonReader$Token8 = new JsonReader$Token("BOOLEAN", 7);
        F = jsonReader$Token8;
        JsonReader$Token jsonReader$Token9 = new JsonReader$Token("NULL", 8);
        G = jsonReader$Token9;
        JsonReader$Token jsonReader$Token10 = new JsonReader$Token("END_DOCUMENT", 9);
        H = jsonReader$Token10;
        I = new JsonReader$Token[]{jsonReader$Token, jsonReader$Token2, jsonReader$Token3, jsonReader$Token4, jsonReader$Token5, jsonReader$Token6, jsonReader$Token7, jsonReader$Token8, jsonReader$Token9, jsonReader$Token10};
    }

    public static JsonReader$Token valueOf(String str) {
        return (JsonReader$Token) Enum.valueOf(JsonReader$Token.class, str);
    }

    public static JsonReader$Token[] values() {
        return (JsonReader$Token[]) I.clone();
    }
}
