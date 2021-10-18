/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.interfaces;


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
public interface IXTabular extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    public IXTabular setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    public IXTabular setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    public IXTabular setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    public IXTabular setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    public String getIcon();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    public IXTabular setIcon(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    public Integer getSort();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    public IXTabular setSort(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    public IXTabular setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public String getAppId();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public IXTabular setAppId(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    public IXTabular setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXTabular setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    public IXTabular setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXTabular setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXTabular setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXTabular setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXTabular setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXTabular setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IXTabular
     */
    public void from(cn.vertxup.ambient.domain.tables.interfaces.IXTabular from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IXTabular
     */
    public <E extends cn.vertxup.ambient.domain.tables.interfaces.IXTabular> E into(E into);

    default IXTabular fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setType(json.getString("TYPE"));
        setIcon(json.getString("ICON"));
        setSort(json.getInteger("SORT"));
        setComment(json.getString("COMMENT"));
        setAppId(json.getString("APP_ID"));
        setActive(json.getBoolean("ACTIVE"));
        setSigma(json.getString("SIGMA"));
        setMetadata(json.getString("METADATA"));
        setLanguage(json.getString("LANGUAGE"));
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
        json.put("TYPE", getType());
        json.put("ICON", getIcon());
        json.put("SORT", getSort());
        json.put("COMMENT", getComment());
        json.put("APP_ID", getAppId());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("METADATA", getMetadata());
        json.put("LANGUAGE", getLanguage());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY", getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}
