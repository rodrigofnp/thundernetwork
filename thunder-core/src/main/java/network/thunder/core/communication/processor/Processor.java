package network.thunder.core.communication.processor;

import network.thunder.core.communication.Message;
import network.thunder.core.communication.objects.messages.MessageExecutor;

/**
 * Created by matsjerratsch on 27/11/2015.
 */
public abstract class Processor {
    public void onInboundMessage (Message message) {

    }

    public void onOutboundMessage (Message message) {

    }

    public abstract void onLayerActive (MessageExecutor messageExecutor);

    public void onLayerClose () {

    }

    public boolean consumesInboundMessage (Object object) {
        return true;
    }

    public boolean consumesOutboundMessage (Object object) {
        return true;
    }

}
