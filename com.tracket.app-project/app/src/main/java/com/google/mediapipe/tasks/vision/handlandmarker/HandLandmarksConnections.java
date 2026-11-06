package com.google.mediapipe.tasks.vision.handlandmarker;

import com.google.mediapipe.tasks.components.containers.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class HandLandmarksConnections {
    static final Set<Connection> HAND_CONNECTIONS;
    static final Set<Connection> HAND_INDEX_FINGER_CONNECTIONS;
    static final Set<Connection> HAND_MIDDLE_FINGER_CONNECTIONS;
    static final Set<Connection> HAND_PALM_CONNECTIONS;
    static final Set<Connection> HAND_PINKY_FINGER_CONNECTIONS;
    static final Set<Connection> HAND_RING_FINGER_CONNECTIONS;
    static final Set<Connection> HAND_THUMB_CONNECTIONS;

    static {
        Set<Connection> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(Connection.create(0, 1), Connection.create(0, 5), Connection.create(9, 13), Connection.create(13, 17), Connection.create(5, 9), Connection.create(0, 17))));
        HAND_PALM_CONNECTIONS = setUnmodifiableSet;
        Set<Connection> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(Arrays.asList(Connection.create(1, 2), Connection.create(2, 3), Connection.create(3, 4))));
        HAND_THUMB_CONNECTIONS = setUnmodifiableSet2;
        Set<Connection> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(Arrays.asList(Connection.create(5, 6), Connection.create(6, 7), Connection.create(7, 8))));
        HAND_INDEX_FINGER_CONNECTIONS = setUnmodifiableSet3;
        Set<Connection> setUnmodifiableSet4 = Collections.unmodifiableSet(new HashSet(Arrays.asList(Connection.create(9, 10), Connection.create(10, 11), Connection.create(11, 12))));
        HAND_MIDDLE_FINGER_CONNECTIONS = setUnmodifiableSet4;
        Set<Connection> setUnmodifiableSet5 = Collections.unmodifiableSet(new HashSet(Arrays.asList(Connection.create(13, 14), Connection.create(14, 15), Connection.create(15, 16))));
        HAND_RING_FINGER_CONNECTIONS = setUnmodifiableSet5;
        Set<Connection> setUnmodifiableSet6 = Collections.unmodifiableSet(new HashSet(Arrays.asList(Connection.create(17, 18), Connection.create(18, 19), Connection.create(19, 20))));
        HAND_PINKY_FINGER_CONNECTIONS = setUnmodifiableSet6;
        HAND_CONNECTIONS = Collections.unmodifiableSet((Set) Stream.of((Object[]) new Stream[]{setUnmodifiableSet.stream(), setUnmodifiableSet2.stream(), setUnmodifiableSet3.stream(), setUnmodifiableSet4.stream(), setUnmodifiableSet5.stream(), setUnmodifiableSet6.stream()}).flatMap(new a()).collect(Collectors.toSet()));
    }

    private HandLandmarksConnections() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stream lambda$static$0(Stream stream) {
        return stream;
    }
}
