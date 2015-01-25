package com.system.mass.mailing.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;

public class GwtModule implements EntryPoint {

    public void onModuleLoad() {
        Button btn = new Button("btn2");
        RootPanel.get().add(btn);

        btn.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                GenService.App.getInstance().generate(new AsyncCallback<Integer>() {

                    @Override
                    public void onFailure(Throwable caught) {
                    }

                    @Override
                    public void onSuccess(Integer result) {
                        Window.alert("" + result);
                    }
                });
            }
        });
    }
}
