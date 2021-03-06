/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.fm.domain.tables.interfaces;


import java.io.Serializable;
import java.math.BigDecimal;
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
public interface IFBook extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.KEY</code>. 「key」- 账本主键ID
     */
    public IFBook setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.KEY</code>. 「key」- 账本主键ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.NAME</code>. 「name」 - 账本名称
     */
    public IFBook setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.NAME</code>. 「name」 - 账本名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CODE</code>. 「code」 - 账本的系统编号
     */
    public IFBook setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CODE</code>. 「code」 - 账本的系统编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.SERIAL</code>. 「serial」 - 财务系统账本编号
     */
    public IFBook setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.SERIAL</code>. 「serial」 - 财务系统账本编号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.TYPE</code>. 「type」 - 账本类型
     */
    public IFBook setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.TYPE</code>. 「type」 - 账本类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.MAJOR</code>. 「major」- 主账本标识
     */
    public IFBook setMajor(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.MAJOR</code>. 「major」- 主账本标识
     */
    public Boolean getMajor();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.AMOUNT</code>. 「amount」- 交易金额，正数：应收，负数：应退，最终计算总金额
     */
    public IFBook setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.AMOUNT</code>. 「amount」- 交易金额，正数：应收，负数：应退，最终计算总金额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.COMMENT</code>. 「comment」 - 账本备注
     */
    public IFBook setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.COMMENT</code>. 「comment」 - 账本备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CHECKED</code>. 「checked」- 是否检查
     */
    public IFBook setChecked(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CHECKED</code>. 「checked」- 是否检查
     */
    public Boolean getChecked();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CHECKED_DESC</code>. 「checkedDesc」 - 账本检查描述信息
     */
    public IFBook setCheckedDesc(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CHECKED_DESC</code>. 「checkedDesc」 - 账本检查描述信息
     */
    public String getCheckedDesc();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.EXCEED</code>. 「exceed」- 是否加收
     */
    public IFBook setExceed(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.EXCEED</code>. 「exceed」- 是否加收
     */
    public Boolean getExceed();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.EXCEED_DESC</code>. 「exceedDesc」 - 账本加收描述信息
     */
    public IFBook setExceedDesc(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.EXCEED_DESC</code>. 「exceedDesc」 - 账本加收描述信息
     */
    public String getExceedDesc();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.PRE_AUTHORIZE_ID</code>. 「preAuthorizeId」- 关联预授权
     */
    public IFBook setPreAuthorizeId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.PRE_AUTHORIZE_ID</code>. 「preAuthorizeId」- 关联预授权
     */
    public String getPreAuthorizeId();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.PRE_AUTHORIZE</code>. 「preAuthorize」- 是否预授权
     */
    public IFBook setPreAuthorize(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.PRE_AUTHORIZE</code>. 「preAuthorize」- 是否预授权
     */
    public Boolean getPreAuthorize();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.PRE_AUTHORIZE_DESC</code>. 「preAuthorizeDesc」 - 预授权描述信息
     */
    public IFBook setPreAuthorizeDesc(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.PRE_AUTHORIZE_DESC</code>. 「preAuthorizeDesc」 - 预授权描述信息
     */
    public String getPreAuthorizeDesc();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    public IFBook setModelId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    public String getModelId();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public IFBook setModelKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public String getModelKey();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.PARENT_ID</code>. 「parentId」- 子账本专用，引用父账本ID
     */
    public IFBook setParentId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.PARENT_ID</code>. 「parentId」- 子账本专用，引用父账本ID
     */
    public String getParentId();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    public IFBook setOrderId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    public String getOrderId();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFBook setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IFBook setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.ACTIVE</code>. 「active」- 是否启用
     */
    public IFBook setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IFBook setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IFBook setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IFBook setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IFBook setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BOOK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IFBook setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BOOK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFBook
     */
    public void from(cn.vertxup.fm.domain.tables.interfaces.IFBook from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFBook
     */
    public <E extends cn.vertxup.fm.domain.tables.interfaces.IFBook> E into(E into);

    default IFBook fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setSerial(json.getString("SERIAL"));
        setType(json.getString("TYPE"));
        setMajor(json.getBoolean("MAJOR"));
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        setComment(json.getString("COMMENT"));
        setChecked(json.getBoolean("CHECKED"));
        setCheckedDesc(json.getString("CHECKED_DESC"));
        setExceed(json.getBoolean("EXCEED"));
        setExceedDesc(json.getString("EXCEED_DESC"));
        setPreAuthorizeId(json.getString("PRE_AUTHORIZE_ID"));
        setPreAuthorize(json.getBoolean("PRE_AUTHORIZE"));
        setPreAuthorizeDesc(json.getString("PRE_AUTHORIZE_DESC"));
        setModelId(json.getString("MODEL_ID"));
        setModelKey(json.getString("MODEL_KEY"));
        setParentId(json.getString("PARENT_ID"));
        setOrderId(json.getString("ORDER_ID"));
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
        json.put("SERIAL",getSerial());
        json.put("TYPE",getType());
        json.put("MAJOR",getMajor());
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        json.put("COMMENT",getComment());
        json.put("CHECKED",getChecked());
        json.put("CHECKED_DESC",getCheckedDesc());
        json.put("EXCEED",getExceed());
        json.put("EXCEED_DESC",getExceedDesc());
        json.put("PRE_AUTHORIZE_ID",getPreAuthorizeId());
        json.put("PRE_AUTHORIZE",getPreAuthorize());
        json.put("PRE_AUTHORIZE_DESC",getPreAuthorizeDesc());
        json.put("MODEL_ID",getModelId());
        json.put("MODEL_KEY",getModelKey());
        json.put("PARENT_ID",getParentId());
        json.put("ORDER_ID",getOrderId());
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
