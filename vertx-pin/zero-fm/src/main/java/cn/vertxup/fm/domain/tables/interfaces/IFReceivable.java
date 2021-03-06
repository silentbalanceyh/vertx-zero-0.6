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
public interface IFReceivable extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.KEY</code>. 「key」- 应收账单主键ID
     */
    public IFReceivable setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.KEY</code>. 「key」- 应收账单主键ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.NAME</code>. 「name」 - 应收单标题
     */
    public IFReceivable setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.NAME</code>. 「name」 - 应收单标题
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.CODE</code>. 「code」 - 应收单编号
     */
    public IFReceivable setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.CODE</code>. 「code」 - 应收单编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.SERIAL</code>. 「serial」 - 应收单据号
     */
    public IFReceivable setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.SERIAL</code>. 「serial」 - 应收单据号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public IFReceivable setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.COMMENT</code>. 「comment」 - 结算单备注
     */
    public IFReceivable setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.COMMENT</code>. 「comment」 - 结算单备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.SIGN_NAME</code>. 「signName」签单人姓名
     */
    public IFReceivable setSignName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.SIGN_NAME</code>. 「signName」签单人姓名
     */
    public String getSignName();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    public IFReceivable setSignMobile(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    public String getSignMobile();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.FINISHED</code>. 「finished」- 是否完成
     */
    public IFReceivable setFinished(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.FINISHED</code>. 「finished」- 是否完成
     */
    public Boolean getFinished();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    public IFReceivable setFinishedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    public LocalDateTime getFinishedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    public IFReceivable setCustomerId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    public String getCustomerId();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFReceivable setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IFReceivable setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.ACTIVE</code>. 「active」- 是否启用
     */
    public IFReceivable setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IFReceivable setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IFReceivable setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IFReceivable setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IFReceivable setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IFReceivable setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFReceivable
     */
    public void from(cn.vertxup.fm.domain.tables.interfaces.IFReceivable from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFReceivable
     */
    public <E extends cn.vertxup.fm.domain.tables.interfaces.IFReceivable> E into(E into);

    default IFReceivable fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setSerial(json.getString("SERIAL"));
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        setComment(json.getString("COMMENT"));
        setSignName(json.getString("SIGN_NAME"));
        setSignMobile(json.getString("SIGN_MOBILE"));
        setFinished(json.getBoolean("FINISHED"));
        // Omitting unrecognized type java.time.LocalDateTime for column FINISHED_AT!
        setCustomerId(json.getString("CUSTOMER_ID"));
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
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        json.put("COMMENT",getComment());
        json.put("SIGN_NAME",getSignName());
        json.put("SIGN_MOBILE",getSignMobile());
        json.put("FINISHED",getFinished());
        // Omitting unrecognized type java.time.LocalDateTime for column FINISHED_AT!
        json.put("CUSTOMER_ID",getCustomerId());
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
