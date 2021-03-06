package network.thunder.core.communication.objects.messages.interfaces.factories;

import network.thunder.core.communication.objects.messages.impl.message.gossip.objects.P2PDataObject;
import network.thunder.core.communication.objects.messages.impl.message.sync.SyncGetMessage;
import network.thunder.core.communication.objects.messages.impl.message.sync.SyncSendMessage;

import java.util.List;

/**
 * Created by matsjerratsch on 30/11/2015.
 */
public interface SyncMessageFactory extends MessageFactory {
    SyncGetMessage getSyncGetMessage (int fragment);

    SyncSendMessage getSyncSendMessage (List<P2PDataObject> dataObjects);

}
