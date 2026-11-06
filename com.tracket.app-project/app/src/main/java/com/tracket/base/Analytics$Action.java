package com.tracket.base;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum Analytics$Action {
    ADD_OVERLAY("add_overlay"),
    ADD_AUDIO("add_audio"),
    ADD_TEXT("add_text"),
    ADD_SHAPE("add_shape"),
    ADD_STICKER("add_sticker"),
    ADD_CLIP("add_clip"),
    /* JADX INFO: Fake field, exist only in values array */
    EDIT_CLIP("edit_clip"),
    SPLIT("split"),
    CONNECT("connect"),
    DELETE("delete"),
    FILTER("filter"),
    CLEAR("clear"),
    EDIT("edit"),
    STYLE("style"),
    ANALYZE("analyze"),
    COPY("copy"),
    COPY_TO_MAIN("copy_main"),
    COPY_TO_OVERLAY("copy_overlay"),
    ATTACH("attach"),
    DETACH("detach"),
    REPLACE("replace"),
    REPLACE_OVERLAY("replace_overlay"),
    REPLACE_TEXT("replace_text"),
    REPLACE_SHAPE("replace_shape"),
    REPLACE_STICKER("replace_sticker"),
    SPEED("speed"),
    BLEND("blend"),
    VOLUME("volume"),
    EXTRACT_AUDIO("extract_audio"),
    FADE("fade"),
    EFFECTS("effects"),
    MASK("cutout"),
    CAMERA_TRACKING("camera_tracking"),
    MOTION_TRACKING("motion_tracking"),
    STABILIZER("stabilizer"),
    POSE("pose"),
    CROP("crop"),
    ADJUST("adjust"),
    FLIP_HORIZONTAL("flip_horizontal"),
    FLIP_VERTICAL("flip_vertical"),
    FREEZE("freeze"),
    REVERSE("reverse");

    public final String y;

    Analytics$Action(String str) {
        this.y = str;
    }
}
