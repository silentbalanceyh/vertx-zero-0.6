/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain.tables.interfaces;


import javax.annotation.Generated;
import java.io.Serializable;
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
public interface IIService extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.KEY</code>. 「key」- 服务ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.KEY</code>. 「key」- 服务ID
     */
    public IIService setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.NAMESPACE</code>. 「namespace」- 服务所在名空间
     */
    public String getNamespace();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.NAMESPACE</code>. 「namespace」- 服务所在名空间
     */
    public IIService setNamespace(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.NAME</code>. 「name」- 服务名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.NAME</code>. 「name」- 服务名称
     */
    public IIService setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.COMMENT</code>. 「comment」- 备注信息
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.COMMENT</code>. 「comment」- 备注信息
     */
    public IIService setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IS_WORKFLOW</code>. 「isWorkflow」- 是否驱动工作流引擎
     */
    public Boolean getIsWorkflow();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IS_WORKFLOW</code>. 「isWorkflow」- 是否驱动工作流引擎
     */
    public IIService setIsWorkflow(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IS_GRAPHIC</code>. 「isGraphic」- 是否驱动图引擎
     */
    public Boolean getIsGraphic();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IS_GRAPHIC</code>. 「isGraphic」- 是否驱动图引擎
     */
    public IIService setIsGraphic(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IN_SCRIPT</code>. 「inScript」- 本次不使用，加载脚本引擎ScriptEngine前置脚本
     */
    public String getInScript();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IN_SCRIPT</code>. 「inScript」- 本次不使用，加载脚本引擎ScriptEngine前置脚本
     */
    public IIService setInScript(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.OUT_SCRIPT</code>. 「outScript」- 本次不使用，加载脚本引擎ScriptEngine后置脚本
     */
    public String getOutScript();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.OUT_SCRIPT</code>. 「outScript」- 本次不使用，加载脚本引擎ScriptEngine后置脚本
     */
    public IIService setOutScript(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_TYPE</code>. 「channelType」- 通道类型：ADAPTOR / CONNECTOR / ACTOR / DIRECTOR / DEFINE
     */
    public String getChannelType();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_TYPE</code>. 「channelType」- 通道类型：ADAPTOR / CONNECTOR / ACTOR / DIRECTOR / DEFINE
     */
    public IIService setChannelType(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_COMPONENT</code>. 「channelComponent」- 自定义通道专用组件
     */
    public String getChannelComponent();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_COMPONENT</code>. 「channelComponent」- 自定义通道专用组件
     */
    public IIService setChannelComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_CONFIG</code>. 「channelConfig」- 通道（自定义）配置信息，Channel专用
     */
    public String getChannelConfig();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CHANNEL_CONFIG</code>. 「channelConfig」- 通道（自定义）配置信息，Channel专用
     */
    public IIService setChannelConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CONFIG_INTEGRATION</code>. 「configIntegration」- 集成配置信息，第三方专用
     */
    public String getConfigIntegration();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CONFIG_INTEGRATION</code>. 「configIntegration」- 集成配置信息，第三方专用
     */
    public IIService setConfigIntegration(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CONFIG_DATABASE</code>. 「configDatabase」- 数据库配置，当前通道访问的Database
     */
    public String getConfigDatabase();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CONFIG_DATABASE</code>. 「configDatabase」- 数据库配置，当前通道访问的Database
     */
    public IIService setConfigDatabase(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.DICT_CONFIG</code>. 「dictConfig」- 字典的配置信息
     */
    public String getDictConfig();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.DICT_CONFIG</code>. 「dictConfig」- 字典的配置信息
     */
    public IIService setDictConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.DICT_COMPONENT</code>. 「dictComponent」- 字典配置中的插件
     */
    public String getDictComponent();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.DICT_COMPONENT</code>. 「dictComponent」- 字典配置中的插件
     */
    public IIService setDictComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.DICT_EPSILON</code>. 「dictEpsilon」- 字典的消费配置
     */
    public String getDictEpsilon();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.DICT_EPSILON</code>. 「dictEpsilon」- 字典的消费配置
     */
    public IIService setDictEpsilon(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.MAPPING_CONFIG</code>. 「mappingConfig」- 映射专用配置
     */
    public String getMappingConfig();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.MAPPING_CONFIG</code>. 「mappingConfig」- 映射专用配置
     */
    public IIService setMappingConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.MAPPING_MODE</code>. 「mappingMode」- 映射的模式
     */
    public String getMappingMode();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.MAPPING_MODE</code>. 「mappingMode」- 映射的模式
     */
    public IIService setMappingMode(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.MAPPING_COMPONENT</code>. 「mappingComponent」- 映射组件类型
     */
    public String getMappingComponent();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.MAPPING_COMPONENT</code>. 「mappingComponent」- 映射组件类型
     */
    public IIService setMappingComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.SERVICE_RECORD</code>. 「serviceRecord」- 服务记录定义
     */
    public String getServiceRecord();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.SERVICE_RECORD</code>. 「serviceRecord」- 服务记录定义
     */
    public IIService setServiceRecord(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.SERVICE_COMPONENT</code>. 「serviceComponent」- 服务组件定义
     */
    public String getServiceComponent();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.SERVICE_COMPONENT</code>. 「serviceComponent」- 服务组件定义
     */
    public IIService setServiceComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.SERVICE_CONFIG</code>. 「serviceConfig」- 业务组件配置，业务组件专用
     */
    public String getServiceConfig();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.SERVICE_CONFIG</code>. 「serviceConfig」- 业务组件配置，业务组件专用
     */
    public IIService setServiceConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IDENTIFIER</code>. 「identifier」- 当前类型描述的Model的标识
     */
    public String getIdentifier();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IDENTIFIER</code>. 「identifier」- 当前类型描述的Model的标识
     */
    public IIService setIdentifier(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.IDENTIFIER_COMPONENT</code>. 「identifierComponent」- 当前业务接口使用的标识选择器
     */
    public String getIdentifierComponent();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.IDENTIFIER_COMPONENT</code>. 「identifierComponent」- 当前业务接口使用的标识选择器
     */
    public IIService setIdentifierComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.RULE_UNIQUE</code>. 「ruleUnique」- 第二标识规则，当前通道的专用标识规则RuleUnique
     */
    public String getRuleUnique();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.RULE_UNIQUE</code>. 「ruleUnique」- 第二标识规则，当前通道的专用标识规则RuleUnique
     */
    public IIService setRuleUnique(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IIService setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IIService setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.ACTIVE</code>. 「active」- 是否启用
     */
    public IIService setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IIService setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IIService setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IIService setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IIService setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.I_SERVICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.I_SERVICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IIService setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IIService
     */
    public void from(cn.vertxup.jet.domain.tables.interfaces.IIService from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IIService
     */
    public <E extends cn.vertxup.jet.domain.tables.interfaces.IIService> E into(E into);

    default IIService fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setNamespace(json.getString("NAMESPACE"));
        setName(json.getString("NAME"));
        setComment(json.getString("COMMENT"));
        setIsWorkflow(json.getBoolean("IS_WORKFLOW"));
        setIsGraphic(json.getBoolean("IS_GRAPHIC"));
        setInScript(json.getString("IN_SCRIPT"));
        setOutScript(json.getString("OUT_SCRIPT"));
        setChannelType(json.getString("CHANNEL_TYPE"));
        setChannelComponent(json.getString("CHANNEL_COMPONENT"));
        setChannelConfig(json.getString("CHANNEL_CONFIG"));
        setConfigIntegration(json.getString("CONFIG_INTEGRATION"));
        setConfigDatabase(json.getString("CONFIG_DATABASE"));
        setDictConfig(json.getString("DICT_CONFIG"));
        setDictComponent(json.getString("DICT_COMPONENT"));
        setDictEpsilon(json.getString("DICT_EPSILON"));
        setMappingConfig(json.getString("MAPPING_CONFIG"));
        setMappingMode(json.getString("MAPPING_MODE"));
        setMappingComponent(json.getString("MAPPING_COMPONENT"));
        setServiceRecord(json.getString("SERVICE_RECORD"));
        setServiceComponent(json.getString("SERVICE_COMPONENT"));
        setServiceConfig(json.getString("SERVICE_CONFIG"));
        setIdentifier(json.getString("IDENTIFIER"));
        setIdentifierComponent(json.getString("IDENTIFIER_COMPONENT"));
        setRuleUnique(json.getString("RULE_UNIQUE"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        setActive(json.getBoolean("ACTIVE"));
        setMetadata(json.getString("METADATA"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("NAMESPACE", getNamespace());
        json.put("NAME", getName());
        json.put("COMMENT", getComment());
        json.put("IS_WORKFLOW", getIsWorkflow());
        json.put("IS_GRAPHIC", getIsGraphic());
        json.put("IN_SCRIPT", getInScript());
        json.put("OUT_SCRIPT", getOutScript());
        json.put("CHANNEL_TYPE", getChannelType());
        json.put("CHANNEL_COMPONENT", getChannelComponent());
        json.put("CHANNEL_CONFIG", getChannelConfig());
        json.put("CONFIG_INTEGRATION", getConfigIntegration());
        json.put("CONFIG_DATABASE", getConfigDatabase());
        json.put("DICT_CONFIG", getDictConfig());
        json.put("DICT_COMPONENT", getDictComponent());
        json.put("DICT_EPSILON", getDictEpsilon());
        json.put("MAPPING_CONFIG", getMappingConfig());
        json.put("MAPPING_MODE", getMappingMode());
        json.put("MAPPING_COMPONENT", getMappingComponent());
        json.put("SERVICE_RECORD", getServiceRecord());
        json.put("SERVICE_COMPONENT", getServiceComponent());
        json.put("SERVICE_CONFIG", getServiceConfig());
        json.put("IDENTIFIER", getIdentifier());
        json.put("IDENTIFIER_COMPONENT", getIdentifierComponent());
        json.put("RULE_UNIQUE", getRuleUnique());
        json.put("SIGMA", getSigma());
        json.put("LANGUAGE", getLanguage());
        json.put("ACTIVE", getActive());
        json.put("METADATA", getMetadata());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY", getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
