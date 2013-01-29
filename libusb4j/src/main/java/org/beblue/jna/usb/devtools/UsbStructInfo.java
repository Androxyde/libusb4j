/*
 * libusb4j - libusb for java using JNA.
 * Copyright (C) 2008  Mario Boikov <mario@beblue.org>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.beblue.jna.usb.devtools;

import org.beblue.jna.usb.*;

/**
 * Prints detailed information about all usb structures.
 *
 * @author Mario Boikov
 */
public class UsbStructInfo {

    public static void main(String[] args) {
        System.out.println("usb_bus == " + new usb_bus().toString());

        System.out.println("usb_cfg_desc == " + new usb_config_descriptor().toString());

        System.out.println("usb_dev_handle == " + new usb_dev_handle().toString());

        System.out.println("usb_dev_desc == " + new usb_device_descriptor().toString());

        System.out.println("usb_device == " + new usb_device().toString());

        System.out.println("usb_endpoint_desc == " + new usb_endpoint_descriptor().toString());

        System.out.println("usb_interface_desc == " + new usb_interface_descriptor().toString());

        System.out.println("usb_interface == " + new usb_interface().toString());
    }
}
