/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.pojos;


import cn.vertxup.atom.domain.tables.interfaces.IMField;

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
public class MField implements IMField {

    private static final long serialVersionUID = 1649109873;

    private String key;
    private String name;
    private String type;
    private String columnName;
    private String columnType;
    private Boolean isPrimary;
    private Boolean isNullable;
    private Integer length;
    private Integer precision;
    private String format;
    private String inComponent;
    private String outComponent;
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

    public MField() {
    }

    public MField(MField value) {
        this.key = value.key;
        this.name = value.name;
        this.type = value.type;
        this.columnName = value.columnName;
        this.columnType = value.columnType;
        this.isPrimary = value.isPrimary;
        this.isNullable = value.isNullable;
        this.length = value.length;
        this.precision = value.precision;
        this.format = value.format;
        this.inComponent = value.inComponent;
        this.outComponent = value.outComponent;
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

    public MField(
        String key,
        String name,
        String type,
        String columnName,
        String columnType,
        Boolean isPrimary,
        Boolean isNullable,
        Integer length,
        Integer precision,
        String format,
        String inComponent,
        String outComponent,
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
        this.columnName = columnName;
        this.columnType = columnType;
        this.isPrimary = isPrimary;
        this.isNullable = isNullable;
        this.length = length;
        this.precision = precision;
        this.format = format;
        this.inComponent = inComponent;
        this.outComponent = outComponent;
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

    public MField(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public MField setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public MField setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public MField setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getColumnName() {
        return this.columnName;
    }

    @Override
    public MField setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    @Override
    public String getColumnType() {
        return this.columnType;
    }

    @Override
    public MField setColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    @Override
    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    @Override
    public MField setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    @Override
    public Boolean getIsNullable() {
        return this.isNullable;
    }

    @Override
    public MField setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }

    @Override
    public Integer getLength() {
        return this.length;
    }

    @Override
    public MField setLength(Integer length) {
        this.length = length;
        return this;
    }

    @Override
    public Integer getPrecision() {
        return this.precision;
    }

    @Override
    public MField setPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    @Override
    public String getFormat() {
        return this.format;
    }

    @Override
    public MField setFormat(String format) {
        this.format = format;
        return this;
    }

    @Override
    public String getInComponent() {
        return this.inComponent;
    }

    @Override
    public MField setInComponent(String inComponent) {
        this.inComponent = inComponent;
        return this;
    }

    @Override
    public String getOutComponent() {
        return this.outComponent;
    }

    @Override
    public MField setOutComponent(String outComponent) {
        this.outComponent = outComponent;
        return this;
    }

    @Override
    public String getEntityId() {
        return this.entityId;
    }

    @Override
    public MField setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @Override
    public String getComments() {
        return this.comments;
    }

    @Override
    public MField setComments(String comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public MField setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public MField setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public MField setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public MField setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public MField setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public MField setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public MField setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public MField setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MField (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(columnName);
        sb.append(", ").append(columnType);
        sb.append(", ").append(isPrimary);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(length);
        sb.append(", ").append(precision);
        sb.append(", ").append(format);
        sb.append(", ").append(inComponent);
        sb.append(", ").append(outComponent);
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
    public void from(IMField from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setColumnName(from.getColumnName());
        setColumnType(from.getColumnType());
        setIsPrimary(from.getIsPrimary());
        setIsNullable(from.getIsNullable());
        setLength(from.getLength());
        setPrecision(from.getPrecision());
        setFormat(from.getFormat());
        setInComponent(from.getInComponent());
        setOutComponent(from.getOutComponent());
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
    public <E extends IMField> E into(E into) {
        into.from(this);
        return into;
    }
}
