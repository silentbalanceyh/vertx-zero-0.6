/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain.tables.pojos;


import cn.vertxup.jet.domain.tables.interfaces.IIService;

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
public class IService implements IIService {

    private static final long serialVersionUID = 637752053;

    private String key;
    private String namespace;
    private String name;
    private String comment;
    private Boolean isWorkflow;
    private Boolean isGraphic;
    private String inScript;
    private String outScript;
    private String channelType;
    private String channelComponent;
    private String channelConfig;
    private String configIntegration;
    private String configDatabase;
    private String dictConfig;
    private String dictComponent;
    private String dictEpsilon;
    private String mappingConfig;
    private String mappingMode;
    private String mappingComponent;
    private String serviceRecord;
    private String serviceComponent;
    private String serviceConfig;
    private String identifier;
    private String identifierComponent;
    private String ruleUnique;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public IService() {
    }

    public IService(IService value) {
        this.key = value.key;
        this.namespace = value.namespace;
        this.name = value.name;
        this.comment = value.comment;
        this.isWorkflow = value.isWorkflow;
        this.isGraphic = value.isGraphic;
        this.inScript = value.inScript;
        this.outScript = value.outScript;
        this.channelType = value.channelType;
        this.channelComponent = value.channelComponent;
        this.channelConfig = value.channelConfig;
        this.configIntegration = value.configIntegration;
        this.configDatabase = value.configDatabase;
        this.dictConfig = value.dictConfig;
        this.dictComponent = value.dictComponent;
        this.dictEpsilon = value.dictEpsilon;
        this.mappingConfig = value.mappingConfig;
        this.mappingMode = value.mappingMode;
        this.mappingComponent = value.mappingComponent;
        this.serviceRecord = value.serviceRecord;
        this.serviceComponent = value.serviceComponent;
        this.serviceConfig = value.serviceConfig;
        this.identifier = value.identifier;
        this.identifierComponent = value.identifierComponent;
        this.ruleUnique = value.ruleUnique;
        this.sigma = value.sigma;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public IService(
        String key,
        String namespace,
        String name,
        String comment,
        Boolean isWorkflow,
        Boolean isGraphic,
        String inScript,
        String outScript,
        String channelType,
        String channelComponent,
        String channelConfig,
        String configIntegration,
        String configDatabase,
        String dictConfig,
        String dictComponent,
        String dictEpsilon,
        String mappingConfig,
        String mappingMode,
        String mappingComponent,
        String serviceRecord,
        String serviceComponent,
        String serviceConfig,
        String identifier,
        String identifierComponent,
        String ruleUnique,
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
        this.namespace = namespace;
        this.name = name;
        this.comment = comment;
        this.isWorkflow = isWorkflow;
        this.isGraphic = isGraphic;
        this.inScript = inScript;
        this.outScript = outScript;
        this.channelType = channelType;
        this.channelComponent = channelComponent;
        this.channelConfig = channelConfig;
        this.configIntegration = configIntegration;
        this.configDatabase = configDatabase;
        this.dictConfig = dictConfig;
        this.dictComponent = dictComponent;
        this.dictEpsilon = dictEpsilon;
        this.mappingConfig = mappingConfig;
        this.mappingMode = mappingMode;
        this.mappingComponent = mappingComponent;
        this.serviceRecord = serviceRecord;
        this.serviceComponent = serviceComponent;
        this.serviceConfig = serviceConfig;
        this.identifier = identifier;
        this.identifierComponent = identifierComponent;
        this.ruleUnique = ruleUnique;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public IService(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public IService setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getNamespace() {
        return this.namespace;
    }

    @Override
    public IService setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IService setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public IService setComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public Boolean getIsWorkflow() {
        return this.isWorkflow;
    }

    @Override
    public IService setIsWorkflow(Boolean isWorkflow) {
        this.isWorkflow = isWorkflow;
        return this;
    }

    @Override
    public Boolean getIsGraphic() {
        return this.isGraphic;
    }

    @Override
    public IService setIsGraphic(Boolean isGraphic) {
        this.isGraphic = isGraphic;
        return this;
    }

    @Override
    public String getInScript() {
        return this.inScript;
    }

    @Override
    public IService setInScript(String inScript) {
        this.inScript = inScript;
        return this;
    }

    @Override
    public String getOutScript() {
        return this.outScript;
    }

    @Override
    public IService setOutScript(String outScript) {
        this.outScript = outScript;
        return this;
    }

    @Override
    public String getChannelType() {
        return this.channelType;
    }

    @Override
    public IService setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    @Override
    public String getChannelComponent() {
        return this.channelComponent;
    }

    @Override
    public IService setChannelComponent(String channelComponent) {
        this.channelComponent = channelComponent;
        return this;
    }

    @Override
    public String getChannelConfig() {
        return this.channelConfig;
    }

    @Override
    public IService setChannelConfig(String channelConfig) {
        this.channelConfig = channelConfig;
        return this;
    }

    @Override
    public String getConfigIntegration() {
        return this.configIntegration;
    }

    @Override
    public IService setConfigIntegration(String configIntegration) {
        this.configIntegration = configIntegration;
        return this;
    }

    @Override
    public String getConfigDatabase() {
        return this.configDatabase;
    }

    @Override
    public IService setConfigDatabase(String configDatabase) {
        this.configDatabase = configDatabase;
        return this;
    }

    @Override
    public String getDictConfig() {
        return this.dictConfig;
    }

    @Override
    public IService setDictConfig(String dictConfig) {
        this.dictConfig = dictConfig;
        return this;
    }

    @Override
    public String getDictComponent() {
        return this.dictComponent;
    }

    @Override
    public IService setDictComponent(String dictComponent) {
        this.dictComponent = dictComponent;
        return this;
    }

    @Override
    public String getDictEpsilon() {
        return this.dictEpsilon;
    }

    @Override
    public IService setDictEpsilon(String dictEpsilon) {
        this.dictEpsilon = dictEpsilon;
        return this;
    }

    @Override
    public String getMappingConfig() {
        return this.mappingConfig;
    }

    @Override
    public IService setMappingConfig(String mappingConfig) {
        this.mappingConfig = mappingConfig;
        return this;
    }

    @Override
    public String getMappingMode() {
        return this.mappingMode;
    }

    @Override
    public IService setMappingMode(String mappingMode) {
        this.mappingMode = mappingMode;
        return this;
    }

    @Override
    public String getMappingComponent() {
        return this.mappingComponent;
    }

    @Override
    public IService setMappingComponent(String mappingComponent) {
        this.mappingComponent = mappingComponent;
        return this;
    }

    @Override
    public String getServiceRecord() {
        return this.serviceRecord;
    }

    @Override
    public IService setServiceRecord(String serviceRecord) {
        this.serviceRecord = serviceRecord;
        return this;
    }

    @Override
    public String getServiceComponent() {
        return this.serviceComponent;
    }

    @Override
    public IService setServiceComponent(String serviceComponent) {
        this.serviceComponent = serviceComponent;
        return this;
    }

    @Override
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    @Override
    public IService setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public IService setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    @Override
    public String getIdentifierComponent() {
        return this.identifierComponent;
    }

    @Override
    public IService setIdentifierComponent(String identifierComponent) {
        this.identifierComponent = identifierComponent;
        return this;
    }

    @Override
    public String getRuleUnique() {
        return this.ruleUnique;
    }

    @Override
    public IService setRuleUnique(String ruleUnique) {
        this.ruleUnique = ruleUnique;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public IService setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public IService setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public IService setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public IService setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public IService setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public IService setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public IService setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public IService setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IService (");

        sb.append(key);
        sb.append(", ").append(namespace);
        sb.append(", ").append(name);
        sb.append(", ").append(comment);
        sb.append(", ").append(isWorkflow);
        sb.append(", ").append(isGraphic);
        sb.append(", ").append(inScript);
        sb.append(", ").append(outScript);
        sb.append(", ").append(channelType);
        sb.append(", ").append(channelComponent);
        sb.append(", ").append(channelConfig);
        sb.append(", ").append(configIntegration);
        sb.append(", ").append(configDatabase);
        sb.append(", ").append(dictConfig);
        sb.append(", ").append(dictComponent);
        sb.append(", ").append(dictEpsilon);
        sb.append(", ").append(mappingConfig);
        sb.append(", ").append(mappingMode);
        sb.append(", ").append(mappingComponent);
        sb.append(", ").append(serviceRecord);
        sb.append(", ").append(serviceComponent);
        sb.append(", ").append(serviceConfig);
        sb.append(", ").append(identifier);
        sb.append(", ").append(identifierComponent);
        sb.append(", ").append(ruleUnique);
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
    public void from(IIService from) {
        setKey(from.getKey());
        setNamespace(from.getNamespace());
        setName(from.getName());
        setComment(from.getComment());
        setIsWorkflow(from.getIsWorkflow());
        setIsGraphic(from.getIsGraphic());
        setInScript(from.getInScript());
        setOutScript(from.getOutScript());
        setChannelType(from.getChannelType());
        setChannelComponent(from.getChannelComponent());
        setChannelConfig(from.getChannelConfig());
        setConfigIntegration(from.getConfigIntegration());
        setConfigDatabase(from.getConfigDatabase());
        setDictConfig(from.getDictConfig());
        setDictComponent(from.getDictComponent());
        setDictEpsilon(from.getDictEpsilon());
        setMappingConfig(from.getMappingConfig());
        setMappingMode(from.getMappingMode());
        setMappingComponent(from.getMappingComponent());
        setServiceRecord(from.getServiceRecord());
        setServiceComponent(from.getServiceComponent());
        setServiceConfig(from.getServiceConfig());
        setIdentifier(from.getIdentifier());
        setIdentifierComponent(from.getIdentifierComponent());
        setRuleUnique(from.getRuleUnique());
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
    public <E extends IIService> E into(E into) {
        into.from(this);
        return into;
    }
}