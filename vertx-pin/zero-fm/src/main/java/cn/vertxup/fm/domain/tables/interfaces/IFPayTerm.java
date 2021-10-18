/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.fm.domain.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFPayTerm extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.KEY</code>. 「key」- 账单项
     */
    public IFPayTerm setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.KEY</code>. 「key」- 账单项
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.NAME</code>. 「name」- 账单项名称
     */
    public IFPayTerm setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.NAME</code>. 「name」- 账单项名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.CODE</code>. 「code」- 账单项编号
     */
    public IFPayTerm setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.CODE</code>. 「code」- 账单项编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.TYPE</code>. 「type」- 账单项类型：付款类/消费类
     */
    public IFPayTerm setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.TYPE</code>. 「type」- 账单项类型：付款类/消费类
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.CATEGORY</code>. 「category」- 账单项类别
     */
    public IFPayTerm setCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.CATEGORY</code>. 「category」- 账单项类别
     */
    public String getCategory();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.HELP_CODE</code>. 「helpCode」- 助记码
     */
    public IFPayTerm setHelpCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.HELP_CODE</code>. 「helpCode」- 助记码
     */
    public String getHelpCode();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.LEAF</code>. 「leaf」- 是否明细
     */
    public IFPayTerm setLeaf(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.LEAF</code>. 「leaf」- 是否明细
     */
    public Boolean getLeaf();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.COMMENT</code>. 「comment」 - 账单项备注
     */
    public IFPayTerm setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.COMMENT</code>. 「comment」 - 账单项备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.PARENT_ID</code>. 「parentId」- 父账单项
     */
    public IFPayTerm setParentId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.PARENT_ID</code>. 「parentId」- 父账单项
     */
    public String getParentId();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.SUBJECT_ID</code>. 「subjectId」- 会计科目关联ID
     */
    public IFPayTerm setSubjectId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.SUBJECT_ID</code>. 「subjectId」- 会计科目关联ID
     */
    public String getSubjectId();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.LOCKED</code>. 「locked」- 是否锁定
     */
    public IFPayTerm setLocked(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.LOCKED</code>. 「locked」- 是否锁定
     */
    public Boolean getLocked();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFPayTerm setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IFPayTerm setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.ACTIVE</code>. 「active」- 是否启用
     */
    public IFPayTerm setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IFPayTerm setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IFPayTerm setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IFPayTerm setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IFPayTerm setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_PAY_TERM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IFPayTerm setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_PAY_TERM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFPayTerm
     */
    public void from(cn.vertxup.fm.domain.tables.interfaces.IFPayTerm from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFPayTerm
     */
    public <E extends cn.vertxup.fm.domain.tables.interfaces.IFPayTerm> E into(E into);

    default IFPayTerm fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setType(json.getString("TYPE"));
        setCategory(json.getString("CATEGORY"));
        setHelpCode(json.getString("HELP_CODE"));
        setLeaf(json.getBoolean("LEAF"));
        setComment(json.getString("COMMENT"));
        setParentId(json.getString("PARENT_ID"));
        setSubjectId(json.getString("SUBJECT_ID"));
        setLocked(json.getBoolean("LOCKED"));
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
        json.put("KEY",getKey());
        json.put("NAME",getName());
        json.put("CODE",getCode());
        json.put("TYPE",getType());
        json.put("CATEGORY",getCategory());
        json.put("HELP_CODE",getHelpCode());
        json.put("LEAF",getLeaf());
        json.put("COMMENT",getComment());
        json.put("PARENT_ID",getParentId());
        json.put("SUBJECT_ID",getSubjectId());
        json.put("LOCKED",getLocked());
        json.put("SIGMA",getSigma());
        json.put("LANGUAGE",getLanguage());
        json.put("ACTIVE",getActive());
        json.put("METADATA",getMetadata());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY",getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY",getUpdatedBy());
        return json;
    }

}
