/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*
import openxr.FB as FB_

val FB_android_surface_swapchain_create = "FBAndroidSurfaceSwapchainCreate".nativeClassXR("FB_android_surface_swapchain_create", type = "instance", postfix = FB_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_android_surface_swapchain_create_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_ANDROID_SURFACE_SWAPCHAIN_CREATE_EXTENSION_NAME".."XR_FB_android_surface_swapchain_create"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_ANDROID_SURFACE_SWAPCHAIN_CREATE_INFO_FB".."1000070000"
    )

    EnumConstant(
        "XrAndroidSurfaceSwapchainFlagBitsFB",

        "ANDROID_SURFACE_SWAPCHAIN_SYNCHRONOUS_BIT_FB".enum(0x00000001),
        "ANDROID_SURFACE_SWAPCHAIN_USE_TIMESTAMPS_BIT_FB".enum(0x00000002)
    )
}