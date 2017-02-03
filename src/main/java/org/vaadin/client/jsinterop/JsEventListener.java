package org.vaadin.client.jsinterop;

import com.google.gwt.user.client.Event;

import jsinterop.annotations.JsFunction;

/**
 * JS Interop event listener to be added to {@link JsElement}.
 */
@JsFunction
public interface JsEventListener {

    /**
     * Event callback function.
     *
     * @param event
     *         Browser event.
     */
    public void onEvent(Event event);
}
