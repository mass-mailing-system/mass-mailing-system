package com.system.mass.mailing.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.system.mass.mailing.gwt.client.GenService;

public class GenServiceImpl extends RemoteServiceServlet implements GenService {

    @Override
    public Integer generate() {
        return (int) (Math.random() * 10000);
    }
}