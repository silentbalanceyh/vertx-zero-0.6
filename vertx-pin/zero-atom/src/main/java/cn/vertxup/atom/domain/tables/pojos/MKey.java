/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.pojos;


import cn.vertxup.atom.domain.tables.interfaces.IMKey;

import javax.annotation.Generated;
import java.time.LocalDateTime;


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
public class MKey implements IMKey {

    private static final long serialVersionUID = -1746892253;

    private String key;
    private String name;
    private String type;
    private String columns;
    private String entityId;
    private String comments;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public MKey() {
    }

    public MKey(MKey value) {
        this.key = value.key;
        this.name = value.name;
        this.type = value.type;
        this.columns = value.columns;
        this.entityId = value.entityId;
        this.comments = value.comments;
        this.sigma = value.sigma;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public MKey(
        String key,
        String name,
        String type,
        String columns,
        String entityId,
        String comments,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.type = type;
        this.columns = columns;
        this.entityId = entityId;
        this.comments = comments;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public MKey(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public MKey setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public MKey setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public MKey setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getColumns() {
        return this.columns;
    }

    @Override
    public MKey setColumns(String columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public String getEntityId() {
        return this.entityId;
    }

    @Override
    public MKey setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @Override
    public String getComments() {
        return this.comments;
    }

    @Override
    public MKey setComments(String comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public MKey setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public MKey setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public MKey setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public MKey setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public MKey setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public MKey setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public MKey setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public MKey setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MKey (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(columns);
        sb.append(", ").append(entityId);
        sb.append(", ").append(comments);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IMKey from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setColumns(from.getColumns());
        setEntityId(from.getEntityId());
        setComments(from.getComments());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IMKey> E into(E into) {
        into.from(this);
        return into;
    }
}
