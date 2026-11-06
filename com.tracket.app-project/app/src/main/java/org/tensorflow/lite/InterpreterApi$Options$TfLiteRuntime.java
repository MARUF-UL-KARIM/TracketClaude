package org.tensorflow.lite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class InterpreterApi$Options$TfLiteRuntime {
    public static final /* synthetic */ InterpreterApi$Options$TfLiteRuntime[] y = {new InterpreterApi$Options$TfLiteRuntime("FROM_APPLICATION_ONLY", 0), new InterpreterApi$Options$TfLiteRuntime("FROM_SYSTEM_ONLY", 1), new InterpreterApi$Options$TfLiteRuntime("PREFER_SYSTEM_OVER_APPLICATION", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    InterpreterApi$Options$TfLiteRuntime EF5;

    public static InterpreterApi$Options$TfLiteRuntime valueOf(String str) {
        return (InterpreterApi$Options$TfLiteRuntime) Enum.valueOf(InterpreterApi$Options$TfLiteRuntime.class, str);
    }

    public static InterpreterApi$Options$TfLiteRuntime[] values() {
        return (InterpreterApi$Options$TfLiteRuntime[]) y.clone();
    }
}
