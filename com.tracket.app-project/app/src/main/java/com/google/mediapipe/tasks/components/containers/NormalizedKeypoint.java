package com.google.mediapipe.tasks.components.containers;

import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NormalizedKeypoint {
    private static final float TOLERANCE = 1.0E-6f;

    public static NormalizedKeypoint create(float f, float f2) {
        return new AutoValue_NormalizedKeypoint(f, f2, Optional.empty(), Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NormalizedKeypoint)) {
            return false;
        }
        NormalizedKeypoint normalizedKeypoint = (NormalizedKeypoint) obj;
        return Math.abs(normalizedKeypoint.x() - x()) < TOLERANCE && Math.abs(normalizedKeypoint.x() - y()) < TOLERANCE;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(x()), Float.valueOf(y()), label(), score());
    }

    public abstract Optional<String> label();

    public abstract Optional<Float> score();

    public final String toString() {
        StringBuilder sb = new StringBuilder("<Normalized Keypoint (x=");
        sb.append(x());
        sb.append(" y=");
        sb.append(y());
        sb.append(" label= ");
        sb.append(label().orElse("null"));
        sb.append(" score=");
        sb.append(score().isPresent() ? score().get() : "null");
        sb.append(")>");
        return sb.toString();
    }

    public abstract float x();

    public abstract float y();

    public static NormalizedKeypoint create(float f, float f2, Optional<String> optional, Optional<Float> optional2) {
        return new AutoValue_NormalizedKeypoint(f, f2, optional, optional2);
    }
}
