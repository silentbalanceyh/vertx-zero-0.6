/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain.tables.pojos;


import cn.vertxup.jet.domain.tables.interfaces.IIApi;

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
public class IApi implements IIApi {

    private static final long serialVersionUID = -1038406780;

    private String key;
    private String name;
    private String uri;
    private String method;
    private String consumes;
    private String produces;
    private Boolean secure;
    private String comment;
    private String type;
    private String paramMode;
    private String paramRequired;
    private String paramContained;
    private String inRule;
    private String inMapping;
    private String inPlug;
    private String inScript;
    private String outWriter;
    private String workerType;
    private String workerAddress;
    private String workerConsumer;
    private String workerClass;
    private String workerJs;
    private String serviceId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public IApi() {
    }

    public IApi(IApi value) {
        this.key = value.key;
        this.name = value.name;
        this.uri = value.uri;
        this.method = value.method;
        this.consumes = value.consumes;
        this.produces = value.produces;
        this.secure = value.secure;
        this.comment = value.comment;
        this.type = value.type;
        this.paramMode = value.paramMode;
        this.paramRequired = value.paramRequired;
        this.paramContained = value.paramContained;
        this.inRule = value.inRule;
        this.inMapping = value.inMapping;
        this.inPlug = value.inPlug;
        this.inScript = value.inScript;
        this.outWriter = value.outWriter;
        this.workerType = value.workerType;
        this.workerAddress = value.workerAddress;
        this.workerConsumer = value.workerConsumer;
        this.workerClass = value.workerClass;
        this.workerJs = value.workerJs;
        this.serviceId = value.serviceId;
        this.sigma = value.sigma;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public IApi(
        String key,
        String name,
        String uri,
        String method,
        String consumes,
        String produces,
        Boolean secure,
        String comment,
        String type,
        String paramMode,
        String paramRequired,
        String paramContained,
        String inRule,
        String inMapping,
        String inPlug,
        String inScript,
        String outWriter,
        String workerType,
        String workerAddress,
        String workerConsumer,
        String workerClass,
        String workerJs,
        String serviceId,
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
        this.uri = uri;
        this.method = method;
        this.consumes = consumes;
        this.produces = produces;
        this.secure = secure;
        this.comment = comment;
        this.type = type;
        this.paramMode = paramMode;
        this.paramRequired = paramRequired;
        this.paramContained = paramContained;
        this.inRule = inRule;
        this.inMapping = inMapping;
        this.inPlug = inPlug;
        this.inScript = inScript;
        this.outWriter = outWriter;
        this.workerType = workerType;
        this.workerAddress = workerAddress;
        this.workerConsumer = workerConsumer;
        this.workerClass = workerClass;
        this.workerJs = workerJs;
        this.serviceId = serviceId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public IApi(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public IApi setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IApi setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getUri() {
        return this.uri;
    }

    @Override
    public IApi setUri(String uri) {
        this.uri = uri;
        return this;
    }

    @Override
    public String getMethod() {
        return this.method;
    }

    @Override
    public IApi setMethod(String method) {
        this.method = method;
        return this;
    }

    @Override
    public String getConsumes() {
        return this.consumes;
    }

    @Override
    public IApi setConsumes(String consumes) {
        this.consumes = consumes;
        return this;
    }

    @Override
    public String getProduces() {
        return this.produces;
    }

    @Override
    public IApi setProduces(String produces) {
        this.produces = produces;
        return this;
    }

    @Override
    public Boolean getSecure() {
        return this.secure;
    }

    @Override
    public IApi setSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public IApi setComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public IApi setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getParamMode() {
        return this.paramMode;
    }

    @Override
    public IApi setParamMode(String paramMode) {
        this.paramMode = paramMode;
        return this;
    }

    @Override
    public String getParamRequired() {
        return this.paramRequired;
    }

    @Override
    public IApi setParamRequired(String paramRequired) {
        this.paramRequired = paramRequired;
        return this;
    }

    @Override
    public String getParamContained() {
        return this.paramContained;
    }

    @Override
    public IApi setParamContained(String paramContained) {
        this.paramContained = paramContained;
        return this;
    }

    @Override
    public String getInRule() {
        return this.inRule;
    }

    @Override
    public IApi setInRule(String inRule) {
        this.inRule = inRule;
        return this;
    }

    @Override
    public String getInMapping() {
        return this.inMapping;
    }

    @Override
    public IApi setInMapping(String inMapping) {
        this.inMapping = inMapping;
        return this;
    }

    @Override
    public String getInPlug() {
        return this.inPlug;
    }

    @Override
    public IApi setInPlug(String inPlug) {
        this.inPlug = inPlug;
        return this;
    }

    @Override
    public String getInScript() {
        return this.inScript;
    }

    @Override
    public IApi setInScript(String inScript) {
        this.inScript = inScript;
        return this;
    }

    @Override
    public String getOutWriter() {
        return this.outWriter;
    }

    @Override
    public IApi setOutWriter(String outWriter) {
        this.outWriter = outWriter;
        return this;
    }

    @Override
    public String getWorkerType() {
        return this.workerType;
    }

    @Override
    public IApi setWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }

    @Override
    public String getWorkerAddress() {
        return this.workerAddress;
    }

    @Override
    public IApi setWorkerAddress(String workerAddress) {
        this.workerAddress = workerAddress;
        return this;
    }

    @Override
    public String getWorkerConsumer() {
        return this.workerConsumer;
    }

    @Override
    public IApi setWorkerConsumer(String workerConsumer) {
        this.workerConsumer = workerConsumer;
        return this;
    }

    @Override
    public String getWorkerClass() {
        return this.workerClass;
    }

    @Override
    public IApi setWorkerClass(String workerClass) {
        this.workerClass = workerClass;
        return this;
    }

    @Override
    public String getWorkerJs() {
        return this.workerJs;
    }

    @Override
    public IApi setWorkerJs(String workerJs) {
        this.workerJs = workerJs;
        return this;
    }

    @Override
    public String getServiceId() {
        return this.serviceId;
    }

    @Override
    public IApi setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public IApi setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public IApi setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public IApi setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public IApi setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public IApi setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public IApi setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public IApi setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public IApi setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IApi (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(uri);
        sb.append(", ").append(method);
        sb.append(", ").append(consumes);
        sb.append(", ").append(produces);
        sb.append(", ").append(secure);
        sb.append(", ").append(comment);
        sb.append(", ").append(type);
        sb.append(", ").append(paramMode);
        sb.append(", ").append(paramRequired);
        sb.append(", ").append(paramContained);
        sb.append(", ").append(inRule);
        sb.append(", ").append(inMapping);
        sb.append(", ").append(inPlug);
        sb.append(", ").append(inScript);
        sb.append(", ").append(outWriter);
        sb.append(", ").append(workerType);
        sb.append(", ").append(workerAddress);
        sb.append(", ").append(workerConsumer);
        sb.append(", ").append(workerClass);
        sb.append(", ").append(workerJs);
        sb.append(", ").append(serviceId);
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
    public void from(IIApi from) {
        setKey(from.getKey());
        setName(from.getName());
        setUri(from.getUri());
        setMethod(from.getMethod());
        setConsumes(from.getConsumes());
        setProduces(from.getProduces());
        setSecure(from.getSecure());
        setComment(from.getComment());
        setType(from.getType());
        setParamMode(from.getParamMode());
        setParamRequired(from.getParamRequired());
        setParamContained(from.getParamContained());
        setInRule(from.getInRule());
        setInMapping(from.getInMapping());
        setInPlug(from.getInPlug());
        setInScript(from.getInScript());
        setOutWriter(from.getOutWriter());
        setWorkerType(from.getWorkerType());
        setWorkerAddress(from.getWorkerAddress());
        setWorkerConsumer(from.getWorkerConsumer());
        setWorkerClass(from.getWorkerClass());
        setWorkerJs(from.getWorkerJs());
        setServiceId(from.getServiceId());
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
    public <E extends IIApi> E into(E into) {
        into.from(this);
        return into;
    }
}
