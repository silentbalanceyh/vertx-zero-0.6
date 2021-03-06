/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.interfaces;


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
public interface IGGraphic extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.KEY</code>. 「key」- 图ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.KEY</code>. 「key」- 图ID
     */
    public IGGraphic setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.NAME</code>. 「name」- 图名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.NAME</code>. 「name」- 图名称
     */
    public IGGraphic setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.CODE</code>. 「code」- neo4j 中的图的 label，符合 neo4j的图ID规范（使用一定命名规则）
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.CODE</code>. 「code」- neo4j 中的图的 label，符合 neo4j的图ID规范（使用一定命名规则）
     */
    public IGGraphic setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MODE</code>. 「mode」- 图模型 FLOW / TOPOLOGY / MIND / TREE
     */
    public String getMode();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MODE</code>. 「mode」- 图模型 FLOW / TOPOLOGY / MIND / TREE
     */
    public IGGraphic setMode(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.TYPE</code>. 「type」- 图类型 CIRCLE / DEFINE / INSTANCE 圈子、定义、实例，可扩展 tabular
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.TYPE</code>. 「type」- 图类型 CIRCLE / DEFINE / INSTANCE 圈子、定义、实例，可扩展 tabular
     */
    public IGGraphic setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.COMMENTS</code>. 「comments」- 图备注信息
     */
    public String getComments();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.COMMENTS</code>. 「comments」- 图备注信息
     */
    public IGGraphic setComments(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.OWNER_ID</code>. 「ownerId」- 图的拥有者，可管理该图信息的人员ID
     */
    public String getOwnerId();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.OWNER_ID</code>. 「ownerId」- 图的拥有者，可管理该图信息的人员ID
     */
    public IGGraphic setOwnerId(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.UI</code>. 「ui」- ui配置专用
     */
    public String getUi();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.UI</code>. 「ui」- ui配置专用
     */
    public IGGraphic setUi(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.GRAPHIC_ID</code>. 「graphicId」- 父图ID（当前图是父图的子图，独立管理，创建时需要）
     */
    public String getGraphicId();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.GRAPHIC_ID</code>. 「graphicId」- 父图ID（当前图是父图的子图，独立管理，创建时需要）
     */
    public IGGraphic setGraphicId(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MASTER</code>. 「master」- 主图（不可删除、父ID为NULL、模块级唯一）
     */
    public Boolean getMaster();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MASTER</code>. 「master」- 主图（不可删除、父ID为NULL、模块级唯一）
     */
    public IGGraphic setMaster(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    public IGGraphic setModelId(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public IGGraphic setModelKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_CATEGORY</code>. 「modelCategory」- 关联的category记录，只包含叶节点
     */
    public String getModelCategory();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.MODEL_CATEGORY</code>. 「modelCategory」- 关联的category记录，只包含叶节点
     */
    public IGGraphic setModelCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.SIGMA</code>. 「sigma」- 统一标识
     */
    public IGGraphic setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IGGraphic setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.ACTIVE</code>. 「active」- 是否启用
     */
    public IGGraphic setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IGGraphic setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IGGraphic setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IGGraphic setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IGGraphic setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.G_GRAPHIC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.G_GRAPHIC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IGGraphic setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IGGraphic
     */
    public void from(cn.vertxup.graphic.domain.tables.interfaces.IGGraphic from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IGGraphic
     */
    public <E extends cn.vertxup.graphic.domain.tables.interfaces.IGGraphic> E into(E into);

    default IGGraphic fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setMode(json.getString("MODE"));
        setType(json.getString("TYPE"));
        setComments(json.getString("COMMENTS"));
        setOwnerId(json.getString("OWNER_ID"));
        setUi(json.getString("UI"));
        setGraphicId(json.getString("GRAPHIC_ID"));
        setMaster(json.getBoolean("MASTER"));
        setModelId(json.getString("MODEL_ID"));
        setModelKey(json.getString("MODEL_KEY"));
        setModelCategory(json.getString("MODEL_CATEGORY"));
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
        json.put("NAME", getName());
        json.put("CODE", getCode());
        json.put("MODE", getMode());
        json.put("TYPE", getType());
        json.put("COMMENTS", getComments());
        json.put("OWNER_ID", getOwnerId());
        json.put("UI", getUi());
        json.put("GRAPHIC_ID", getGraphicId());
        json.put("MASTER", getMaster());
        json.put("MODEL_ID", getModelId());
        json.put("MODEL_KEY", getModelKey());
        json.put("MODEL_CATEGORY", getModelCategory());
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
