package com.google.mediapipe.tasks.components.containers;

import defpackage.bd3;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_NormalizedKeypoint extends NormalizedKeypoint {
    private final Optional<String> label;
    private final Optional<Float> score;
    private final float x;
    private final float y;

    public AutoValue_NormalizedKeypoint(float f, float f2, Optional<String> optional, Optional<Float> optional2) {
        this.x = f;
        this.y = f2;
        if (optional == null) {
            bd3.w("Null label");
            throw null;
        }
        this.label = optional;
        if (optional2 != null) {
            this.score = optional2;
        } else {
            bd3.w("Null score");
            throw null;
        }
    }

    @Override // com.google.mediapipe.tasks.components.containers.NormalizedKeypoint
    public Optional<String> label() {
        return this.label;
    }

    @Override // com.google.mediapipe.tasks.components.containers.NormalizedKeypoint
    public Optional<Float> score() {
        return this.score;
    }

    @Override // com.google.mediapipe.tasks.components.containers.NormalizedKeypoint
    public float x() {
        return this.x;
    }

    @Override // com.google.mediapipe.tasks.components.containers.NormalizedKeypoint
    public float y() {
        return this.y;
    }
}
