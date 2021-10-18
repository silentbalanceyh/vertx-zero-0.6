/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.pojos;


import cn.vertxup.graphic.domain.tables.interfaces.IGCluster;

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
public class GCluster implements IGCluster {

    private static final long serialVersionUID = -1863378902;

    private String key;
    private String name;
    private Integer x;
    private Integer y;
    private String graphicId;
    private String ui;
    private String recordKey;
    private String recordData;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public GCluster() {
    }

    public GCluster(GCluster value) {
        this.key = value.key;
        this.name = value.name;
        this.x = value.x;
        this.y = value.y;
        this.graphicId = value.graphicId;
        this.ui = value.ui;
        this.recordKey = value.recordKey;
        this.recordData = value.recordData;
        this.sigma = value.sigma;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public GCluster(
        String key,
        String name,
        Integer x,
        Integer y,
        String graphicId,
        String ui,
        String recordKey,
        String recordData,
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
        this.x = x;
        this.y = y;
        this.graphicId = graphicId;
        this.ui = ui;
        this.recordKey = recordKey;
        this.recordData = recordData;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public GCluster(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public GCluster setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public GCluster setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Integer getX() {
        return this.x;
    }

    @Override
    public GCluster setX(Integer x) {
        this.x = x;
        return this;
    }

    @Override
    public Integer getY() {
        return this.y;
    }

    @Override
    public GCluster setY(Integer y) {
        this.y = y;
        return this;
    }

    @Override
    public String getGraphicId() {
        return this.graphicId;
    }

    @Override
    public GCluster setGraphicId(String graphicId) {
        this.graphicId = graphicId;
        return this;
    }

    @Override
    public String getUi() {
        return this.ui;
    }

    @Override
    public GCluster setUi(String ui) {
        this.ui = ui;
        return this;
    }

    @Override
    public String getRecordKey() {
        return this.recordKey;
    }

    @Override
    public GCluster setRecordKey(String recordKey) {
        this.recordKey = recordKey;
        return this;
    }

    @Override
    public String getRecordData() {
        return this.recordData;
    }

    @Override
    public GCluster setRecordData(String recordData) {
        this.recordData = recordData;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public GCluster setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public GCluster setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public GCluster setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public GCluster setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public GCluster setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public GCluster setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public GCluster setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public GCluster setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GCluster (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(x);
        sb.append(", ").append(y);
        sb.append(", ").append(graphicId);
        sb.append(", ").append(ui);
        sb.append(", ").append(recordKey);
        sb.append(", ").append(recordData);
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
    public void from(IGCluster from) {
        setKey(from.getKey());
        setName(from.getName());
        setX(from.getX());
        setY(from.getY());
        setGraphicId(from.getGraphicId());
        setUi(from.getUi());
        setRecordKey(from.getRecordKey());
        setRecordData(from.getRecordData());
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
    public <E extends IGCluster> E into(E into) {
        into.from(this);
        return into;
    }
}
