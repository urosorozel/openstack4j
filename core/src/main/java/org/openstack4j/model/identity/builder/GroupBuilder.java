package org.openstack4j.model.identity.builder;

import java.util.Map;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.identity.Group;

/**
 * A Builder which creates a identity v3 group
 * 
 * 
 */
public interface GroupBuilder extends Builder<GroupBuilder, Group> {

    /**
     * @see Group#getId()
     */
    GroupBuilder id(String id);

    /**
     * @see Group#getName()
     */
    GroupBuilder name(String name);

    /**
     * @see Group#getId()
     */
    GroupBuilder description(String description);

    /**
     * @see Group#getDomainId()
     */
    GroupBuilder domainId(String domainId);

    /**
     * @see Group#getLinks()
     */
    GroupBuilder links(Map<String, String> links);

}