package kotlinx.coroutines.flow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class SharingCommand {
    public static final SharingCommand A;
    public static final /* synthetic */ SharingCommand[] B;
    public static final SharingCommand y;
    public static final SharingCommand z;

    static {
        SharingCommand sharingCommand = new SharingCommand("START", 0);
        y = sharingCommand;
        SharingCommand sharingCommand2 = new SharingCommand("STOP", 1);
        z = sharingCommand2;
        SharingCommand sharingCommand3 = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);
        A = sharingCommand3;
        B = new SharingCommand[]{sharingCommand, sharingCommand2, sharingCommand3};
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) B.clone();
    }
}
