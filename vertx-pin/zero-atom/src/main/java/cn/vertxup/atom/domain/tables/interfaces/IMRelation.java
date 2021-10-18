/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.interfaces;


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
public interface IMRelation extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.KEY</code>. 「key」- 关系定义的主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.KEY</code>. 「key」- 关系定义的主键
     */
    public IMRelation setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.TYPE</code>. 「type」- 关系类型 - 来自（字典）
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.TYPE</code>. 「type」- 关系类型 - 来自（字典）
     */
    public IMRelation setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.UPSTREAM</code>. 「upstream」- 当前关系是 upstream，表示上级
     */
    public String getUpstream();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.UPSTREAM</code>. 「upstream」- 当前关系是 upstream，表示上级
     */
    public IMRelation setUpstream(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.DOWNSTREAM</code>. 「downstream」- 当前关系是 downstream，表示下级
     */
    public String getDownstream();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.DOWNSTREAM</code>. 「downstream」- 当前关系是 downstream，表示下级
     */
    public IMRelation setDownstream(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.COMMENTS</code>. 「comments」- 关系定义的描述信息
     */
    public String getComments();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.COMMENTS</code>. 「comments」- 关系定义的描述信息
     */
    public IMRelation setComments(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.SIGMA</code>. 「sigma」- 统一标识
     */
    public IMRelation setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IMRelation setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.ACTIVE</code>. 「active」- 是否启用
     */
    public IMRelation setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IMRelation setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IMRelation setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IMRelation setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IMRelation setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.M_RELATION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.M_RELATION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IMRelation setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IMRelation
     */
    public void from(cn.vertxup.atom.domain.tables.interfaces.IMRelation from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IMRelation
     */
    public <E extends cn.vertxup.atom.domain.tables.interfaces.IMRelation> E into(E into);

    default IMRelation fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setType(json.getString("TYPE"));
        setUpstream(json.getString("UPSTREAM"));
        setDownstream(json.getString("DOWNSTREAM"));
        setComments(json.getString("COMMENTS"));
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
        json.put("TYPE", getType());
        json.put("UPSTREAM", getUpstream());
        json.put("DOWNSTREAM", getDownstream());
        json.put("COMMENTS", getComments());
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