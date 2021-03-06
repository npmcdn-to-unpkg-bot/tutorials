/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/INTEL/framebuffer_CMAA.txt">INTEL_framebuffer_CMAA</a> extension.
 * 
 * <p>Multisampling is a mechanism to antialias all GL primitives and is part of the GL specification.</p>
 * 
 * <p>Better visual quality can be achieved by applying multisampling. However, on certain platforms it comes at a high performance cost. In general, the
 * greater number of samples per pixel, the bigger the cost.</p>
 * 
 * <p>Conservative Morphological Anti-Aliasing (CMAA) is an alternative approach to antialiasing, which operates on the final image. This post processing
 * technique results in image quality comparable to multisampling at much lower cost and better performance.</p>
 * 
 * <p>This extension incorporates an optimized CMAA algorithm implementation into the GL implementation.</p>
 * 
 * <p>For more information on CMAA refer to <a href="http://software.intel.com">http://software.intel.com</a>.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public class INTELFramebufferCMAA {

	protected INTELFramebufferCMAA() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glApplyFramebufferAttachmentCMAAINTEL
		);
	}

	// --- [ glApplyFramebufferAttachmentCMAAINTEL ] ---

	/**
	 * Requests the post processing of current draw buffers pertaining to the framebuffer bound to the {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER} target according to the
	 * Conservative Morphological Anti-Aliasing algorithm.
	 */
	public static void glApplyFramebufferAttachmentCMAAINTEL() {
		long __functionAddress = GL.getCapabilities().glApplyFramebufferAttachmentCMAAINTEL;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

}