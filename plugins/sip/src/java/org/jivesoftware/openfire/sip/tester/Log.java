/*
 * Copyright (C) 2005-2008 Jive Software. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jivesoftware.openfire.sip.tester;

/**
 * Title: SIP Register Tester
 *
 * @author Thiago Rocha Camargo (thiago@jivesoftware.com)
 */

/**
 * Creates and writes out messages.
 */
public class Log {

    private static boolean debugger = false;

    static {
        if (System.getProperty("debugger") != null
                && System.getProperty("debugger").equals("true"))
            Log.debugger = true;
    }

    public static void debug(String message) {
        if (Log.debugger)
            System.out.println((message != null ? message : ""));
    }

    public static void debug(String method, String message) {
        if (Log.debugger)
            System.out.println((method != null ? method : "") + " - "
                    + (message != null ? message : ""));
    }

    public static void error(String method, Exception e) {
        System.out.println((method != null ? method : "") + " - "
                + (e != null ? e.toString() : ""));
    }

    public static void error(Exception e) {
        Log.error("", e);
    }

    public static void error(String method, Error e) {
        System.out.println((method != null ? method : "") + " - "
                + (e != null ? e.toString() : ""));
    }

    public static void error(String method, Throwable e) {
        System.out.println((method != null ? method : "") + " - "
                + (e != null ? e.toString() : ""));
    }

}