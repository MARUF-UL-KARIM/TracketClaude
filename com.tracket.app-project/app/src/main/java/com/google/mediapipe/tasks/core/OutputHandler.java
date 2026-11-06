package com.google.mediapipe.tasks.core;

import android.util.Log;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.tasks.core.TaskResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class OutputHandler<OutputT extends TaskResult, InputT> {
    private static final String TAG = "OutputHandler";
    protected OutputT cachedTaskResult;
    protected ErrorListener errorListener;
    private OutputPacketConverter<OutputT, InputT> outputPacketConverter;
    private ResultListener<OutputT, InputT> resultListener;
    private MediaPipeException cachedException = null;
    protected long latestOutputTimestamp = -1;
    private boolean handleTimestampBoundChanges = false;

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public interface OutputPacketConverter<OutputT extends TaskResult, InputT> {
        InputT convertToTaskInput(List<Packet> list);

        OutputT convertToTaskResult(List<Packet> list);
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public interface ProgressListener<OutputT> {
        void run(OutputT outputt, boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public interface PureResultListener<OutputT extends TaskResult> {
        void run(OutputT outputt);
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public interface ResultListener<OutputT extends TaskResult, InputT> {
        void run(OutputT outputt, InputT inputt);
    }

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public interface ValueListener<OutputT> {
        void run(OutputT outputt);
    }

    public long getLatestOutputTimestamp() {
        return this.latestOutputTimestamp;
    }

    public boolean handleTimestampBoundChanges() {
        return this.handleTimestampBoundChanges;
    }

    public OutputT retrieveCachedTaskResult() {
        MediaPipeException mediaPipeException = this.cachedException;
        if (mediaPipeException != null) {
            this.cachedException = null;
            throw mediaPipeException;
        }
        OutputT outputt = this.cachedTaskResult;
        this.cachedTaskResult = null;
        return outputt;
    }

    public void run(List<Packet> list) {
        try {
            OutputT outputt = (OutputT) this.outputPacketConverter.convertToTaskResult(list);
            if (this.resultListener == null) {
                this.cachedTaskResult = outputt;
                this.latestOutputTimestamp = list.get(0).getTimestamp();
            } else {
                this.resultListener.run(outputt, this.outputPacketConverter.convertToTaskInput(list));
            }
        } catch (MediaPipeException e) {
            this.cachedException = e;
            ErrorListener errorListener = this.errorListener;
            if (errorListener != null) {
                errorListener.onError(e);
                return;
            }
            Log.e(TAG, "Error occurs when getting MediaPipe task result. " + e);
        }
    }

    public void setErrorListener(ErrorListener errorListener) {
        this.errorListener = errorListener;
    }

    public void setHandleTimestampBoundChanges(boolean z) {
        this.handleTimestampBoundChanges = z;
    }

    public void setOutputPacketConverter(OutputPacketConverter<OutputT, InputT> outputPacketConverter) {
        this.outputPacketConverter = outputPacketConverter;
    }

    public void setResultListener(ResultListener<OutputT, InputT> resultListener) {
        this.resultListener = resultListener;
    }
}
