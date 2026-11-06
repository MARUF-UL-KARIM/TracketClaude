package kotlinx.serialization.json;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class JsonException extends SerializationException {
    public final String y;

    public JsonException(String str) {
        super(str);
        this.y = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.y;
    }
}
