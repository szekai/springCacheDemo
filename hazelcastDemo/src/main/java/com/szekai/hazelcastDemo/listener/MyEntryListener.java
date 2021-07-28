package com.szekai.hazelcastDemo.listener;

import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.map.MapEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyEntryListener  implements EntryListener<String, String> {

    @Override
    public void entryAdded(EntryEvent<String, String> event) {
        log.info("entryAdded: " + event);
    }

    @Override
    public void entryRemoved(EntryEvent<String, String> event) {
        log.info("entryRemoved: " + event);
    }

    @Override
    public void entryUpdated(EntryEvent<String, String> event) {
        log.info("entryUpdated: " + event);
    }

    @Override
    public void entryEvicted(EntryEvent<String, String> event) {
        log.info("entryEvicted: " + event);
    }

    @Override
    public void entryExpired(EntryEvent<String, String> event) {
        log.info("Entry expired: " + event);
    }

    @Override
    public void mapEvicted(MapEvent event) {
        log.info("mapEvicted:" + event);

    }

    @Override
    public void mapCleared(MapEvent event) {
        log.info("mapCleared: " + event);
    }
}
