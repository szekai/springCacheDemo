package com.szekai.hazelcastDemo.listener;

import com.hazelcast.core.DistributedObject;
import com.hazelcast.core.DistributedObjectEvent;
import com.hazelcast.core.DistributedObjectListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExampleDistObjListener implements DistributedObjectListener {

    @Override
    public void distributedObjectCreated(DistributedObjectEvent event) {
        DistributedObject instance = event.getDistributedObject();
        log.info("Created " + instance.getName() + ", service=" + instance.getServiceName());
    }

    @Override
    public void distributedObjectDestroyed(DistributedObjectEvent event) {
        log.info("Destroyed " + event.getObjectName() + ", service=" + event.getServiceName());
    }
}
