package com.system.mass.mailing.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.core.client.GWT;

@RemoteServiceRelativePath("generator")
public interface GenService extends RemoteService {
    Integer generate();

    /**
     * Utility/Convenience class.
     * Use GenService.App.getInstance() to access static instance of GenServiceAsync
     */
    public static class App {
        private static final GenServiceAsync ourInstance = (GenServiceAsync) GWT.create(GenService.class);

        public static GenServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
