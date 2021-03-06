/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openxr

import openxr.templates.*
import org.lwjgl.generator.*

/**
 * Includes #defines that are not generated by vulkangen
 */
fun templateCustomization() {
    XR10.apply {
        IntConstant(
            "API Constants",

            "TRUE".."1",
            "FALSE".."0",
            "MAX_EXTENSION_NAME_SIZE".."128",
            "MAX_API_LAYER_NAME_SIZE".."256",
            "MAX_API_LAYER_DESCRIPTION_SIZE".."256",
            "MAX_SYSTEM_NAME_SIZE".."256",
            "MAX_APPLICATION_NAME_SIZE".."128",
            "MAX_ENGINE_NAME_SIZE".."128",
            "MAX_RUNTIME_NAME_SIZE".."128",
            "MAX_PATH_LENGTH".."256",
            "MAX_STRUCTURE_NAME_SIZE".."64",
            "MAX_RESULT_STRING_SIZE".."64",
            "MAX_GRAPHICS_APIS_SUPPORTED".."32",
            "MAX_ACTION_SET_NAME_SIZE".."64",
            "MAX_ACTION_NAME_SIZE".."64",
            "MAX_LOCALIZED_ACTION_SET_NAME_SIZE".."128",
            "MAX_LOCALIZED_ACTION_NAME_SIZE".."128",
            "MIN_COMPOSITION_LAYERS_SUPPORTED".."16"
        )

        LongConstant(
            "",
            "INFINITE_DURATION".."0x7fffffffffffffffL"
        )

        LongConstant(
            """
            XR_CURRENT_API_VERSION is the current version of the OpenXR API.
            """,

            "CURRENT_API_VERSION".."XR_MAKE_VERSION(1, 0, 14)"
        )

        macro(expression = "((major & 0xffffL) << 48) | ((minor & 0xffffL) << 32) | patch")..uint64_t(
            "XR_MAKE_VERSION",
            """
            Constructs an API version number.

            This macro <b>can</b> be used when constructing the ##XrApplicationInfo{@code ::pname:apiVersion} parameter passed to #CreateInstance().
            """,

            uint32_t("major", "the major version number"),
            uint32_t("minor", "the minor version number"),
            uint32_t("patch", "the patch version number"),

            noPrefix = true
        )
    }
}