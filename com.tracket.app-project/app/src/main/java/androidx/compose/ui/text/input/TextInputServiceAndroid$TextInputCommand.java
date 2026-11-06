package androidx.compose.ui.text.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class TextInputServiceAndroid$TextInputCommand {
    public static final TextInputServiceAndroid$TextInputCommand A;
    public static final TextInputServiceAndroid$TextInputCommand B;
    public static final /* synthetic */ TextInputServiceAndroid$TextInputCommand[] C;
    public static final TextInputServiceAndroid$TextInputCommand y;
    public static final TextInputServiceAndroid$TextInputCommand z;

    static {
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand = new TextInputServiceAndroid$TextInputCommand("StartInput", 0);
        y = textInputServiceAndroid$TextInputCommand;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = new TextInputServiceAndroid$TextInputCommand("StopInput", 1);
        z = textInputServiceAndroid$TextInputCommand2;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand3 = new TextInputServiceAndroid$TextInputCommand("ShowKeyboard", 2);
        A = textInputServiceAndroid$TextInputCommand3;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand4 = new TextInputServiceAndroid$TextInputCommand("HideKeyboard", 3);
        B = textInputServiceAndroid$TextInputCommand4;
        C = new TextInputServiceAndroid$TextInputCommand[]{textInputServiceAndroid$TextInputCommand, textInputServiceAndroid$TextInputCommand2, textInputServiceAndroid$TextInputCommand3, textInputServiceAndroid$TextInputCommand4};
    }

    public static TextInputServiceAndroid$TextInputCommand valueOf(String str) {
        return (TextInputServiceAndroid$TextInputCommand) Enum.valueOf(TextInputServiceAndroid$TextInputCommand.class, str);
    }

    public static TextInputServiceAndroid$TextInputCommand[] values() {
        return (TextInputServiceAndroid$TextInputCommand[]) C.clone();
    }
}
