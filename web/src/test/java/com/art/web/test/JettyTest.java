/**
 * 
 */
package com.art.web.test;

import org.eclipse.jetty.server.Server;

import com.art.web.test.handlers.HelloHandler;

/**
 * @author fengjing.yfj
 *
 */
public class JettyTest {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8070);
        server.setHandler(new HelloHandler());
        server.start();
        server.join();
    }

}
