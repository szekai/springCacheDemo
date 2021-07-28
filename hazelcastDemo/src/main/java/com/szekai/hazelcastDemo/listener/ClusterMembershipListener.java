package com.szekai.hazelcastDemo.listener;

import com.hazelcast.cluster.MembershipEvent;
import com.hazelcast.cluster.MembershipListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClusterMembershipListener implements MembershipListener {

    public void memberAdded(MembershipEvent membershipEvent) {
        log.info("Added: " + membershipEvent);
    }

    public void memberRemoved(MembershipEvent membershipEvent) {
        log.info("Removed: " + membershipEvent);
    }
}
