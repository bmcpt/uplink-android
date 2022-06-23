package io.bytebeam.uplink;

import io.bytebeam.uplink.types.UplinkPayload;

public class NativeApi {
    static {
        System.loadLibrary("uplink_android");
    }

    public static native long createUplink(
            String authConfig,
            String uplinkConfig,
            ActionSubscriber actionCallback
    );

    public static native void destroyUplink(long uplink);

    public static native void sendData(long uplink, UplinkPayload payload);
}