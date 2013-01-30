package com.foreyet.libusb4j.examples;

import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import org.beblue.jna.usb.*;

public class Application {
    public static void main(String[] args) throws Exception {
        ArgumentParser parser = ArgumentParsers.newArgumentParser("usb4jExamples")
                .defaultHelp(true)
                .description("Run example code from libusb4j");
        parser.addArgument("--jnaInfo")
                .setDefault(false)
                .help("Show struct-info found by libusb4j");

        Namespace ns = null;
        try {
            ns = parser.parseArgs(args);
        } catch (ArgumentParserException e) {
            parser.handleError(e);
            System.exit(1);
        }

        if (ns.getBoolean("jnaInfo")) {
            jnaInfo();
        }
    }

    static void jnaInfo() {
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