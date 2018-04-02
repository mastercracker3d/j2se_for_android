/*
 * Copyright (c) 1999, 2007, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package java.beans;

/**
 * This is a support class to make it easier for people to provide BeanInfo
 * classes.
 * <p>
 * It defaults to providing "noop" information, and can be selectively overriden
 * to provide more explicit information on chosen topics. When the introspector
 * sees the "noop" values, it will apply low level introspection and design
 * patterns to automatically analyze the target bean.
 */

public class SimpleBeanInfo implements BeanInfo {

	public BeanDescriptor getBeanDescriptor() {
		return null;
	}

	public PropertyDescriptor[] getPropertyDescriptors() {
		return null;
	}

	public int getDefaultPropertyIndex() {
		return -1;
	}

	public EventSetDescriptor[] getEventSetDescriptors() {
		return null;
	}

	public int getDefaultEventIndex() {
		return -1;
	}

	public MethodDescriptor[] getMethodDescriptors() {
		return null;
	}

	public BeanInfo[] getAdditionalBeanInfo() {
		return null;
	}

	public java.awt.Image getIcon(int iconKind) {
		return null;
	}

	public java.awt.Image loadImage(final String resourceName) {
		return null;
	}

}