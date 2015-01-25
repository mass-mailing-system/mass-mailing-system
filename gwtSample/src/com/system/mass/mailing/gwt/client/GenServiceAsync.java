package com.system.mass.mailing.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GenServiceAsync {

    void generate(AsyncCallback<Integer> callback);

}
