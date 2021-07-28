package com.szekai.hazelcastDemo.listener;

import com.hazelcast.core.LifecycleEvent;
import com.hazelcast.core.LifecycleListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NodeLifecycleListener implements LifecycleListener {
    @Override
    public void stateChanged(LifecycleEvent event) {
        log.info(event.toString());
    }
}
