/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openxr;

public class XrSpace extends DispatchableHandleDevice {

    public XrSpace(long handle, XrSession session) {
        super(handle, session.getCapabilities());
    }

    public XrSpace(long handle, XRCapabilitiesSession capabilities) {
        super(handle, capabilities);
    }
}