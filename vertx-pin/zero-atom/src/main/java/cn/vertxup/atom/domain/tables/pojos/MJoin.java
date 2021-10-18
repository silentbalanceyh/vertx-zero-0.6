/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.pojos;


import cn.vertxup.atom.domain.tables.interfaces.IMJoin;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MJoin implements IMJoin {

    private static final long serialVersionUID = -792443262;

    private String model;
    private String entity;
    private String entityKey;
    private Integer priority;
    private String namespace;

    public MJoin() {
    }

    public MJoin(MJoin value) {
        this.model = value.model;
        this.entity = value.entity;
        this.entityKey = value.entityKey;
        this.priority = value.priority;
        this.namespace = value.namespace;
    }

    public MJoin(
        String model,
        String entity,
        String entityKey,
        Integer priority,
        String namespace
    ) {
        this.model = model;
        this.entity = entity;
        this.entityKey = entityKey;
        this.priority = priority;
        this.namespace = namespace;
    }

    public MJoin(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public MJoin setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public String getEntity() {
        return this.entity;
    }

    @Override
    public MJoin setEntity(String entity) {
        this.entity = entity;
        return this;
    }

    @Override
    public String getEntityKey() {
        return this.entityKey;
    }

    @Override
    public MJoin setEntityKey(String entityKey) {
        this.entityKey = entityKey;
        return this;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public MJoin setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String getNamespace() {
        return this.namespace;
    }

    @Override
    public MJoin setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MJoin (");

        sb.append(model);
        sb.append(", ").append(entity);
        sb.append(", ").append(entityKey);
        sb.append(", ").append(priority);
        sb.append(", ").append(namespace);

        sb.append(")");
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IMJoin from) {
        setModel(from.getModel());
        setEntity(from.getEntity());
        setEntityKey(from.getEntityKey());
        setPriority(from.getPriority());
        setNamespace(from.getNamespace());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IMJoin> E into(E into) {
        into.from(this);
        return into;
    }
}