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
public interface IFBillItem extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.KEY</code>. 「key」- 账单明细主键
     */
    public IFBillItem setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.KEY</code>. 「key」- 账单明细主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.NAME</code>. 「name」 -  明细名称
     */
    public IFBillItem setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.NAME</code>. 「name」 -  明细名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.CODE</code>. 「code」 - 明细系统代码
     */
    public IFBillItem setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.CODE</code>. 「code」 - 明细系统代码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.SERIAL</code>. 「serial」 - 明细编号
     */
    public IFBillItem setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.SERIAL</code>. 「serial」 - 明细编号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.TYPE</code>. 「type」- 明细类型
     */
    public IFBillItem setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.TYPE</code>. 「type」- 明细类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public IFBillItem setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT</code>. 「amount」——价税合计，实际付款结果
     */
    public IFBillItem setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT</code>. 「amount」——价税合计，实际付款结果
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.COMMENT</code>. 「comment」 - 明细备注
     */
    public IFBillItem setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.COMMENT</code>. 「comment」 - 明细备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.MANUAL_NO</code>. 「manualNo」 - 手工单号（线下单号专用）
     */
    public IFBillItem setManualNo(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.MANUAL_NO</code>. 「manualNo」 - 手工单号（线下单号专用）
     */
    public String getManualNo();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.PRICE</code>. 「price」- 商品单价
     */
    public IFBillItem setPrice(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.PRICE</code>. 「price」- 商品单价
     */
    public BigDecimal getPrice();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.QUANTITY</code>. 「quantity」- 商品数量
     */
    public IFBillItem setQuantity(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.QUANTITY</code>. 「quantity」- 商品数量
     */
    public Integer getQuantity();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」——总价，理论计算结果
     */
    public IFBillItem setAmountTotal(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」——总价，理论计算结果
     */
    public BigDecimal getAmountTotal();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.DELAY</code>. 「delay」——是否S账
     */
    public IFBillItem setDelay(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.DELAY</code>. 「delay」——是否S账
     */
    public Boolean getDelay();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.DELAY_AT</code>. 「delayAt」——S账的最终期限
     */
    public IFBillItem setDelayAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.DELAY_AT</code>. 「delayAt」——S账的最终期限
     */
    public LocalDateTime getDelayAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_BY</code>. 「opBy」- 操作人员，关联员工ID
     */
    public IFBillItem setOpBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_BY</code>. 「opBy」- 操作人员，关联员工ID
     */
    public String getOpBy();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_NUMBER</code>. 「opNumber」- 操作人员工号
     */
    public IFBillItem setOpNumber(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_NUMBER</code>. 「opNumber」- 操作人员工号
     */
    public String getOpNumber();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_SHIFT</code>. 「opShift」- 操作班次（对接排班系统）
     */
    public IFBillItem setOpShift(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_SHIFT</code>. 「opShift」- 操作班次（对接排班系统）
     */
    public String getOpShift();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_AT</code>. 「opAt」- 操作时间
     */
    public IFBillItem setOpAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_AT</code>. 「opAt」- 操作时间
     */
    public LocalDateTime getOpAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.OP_TRANSFER</code>. 「opTransfer」- 流转信息描述填写
     */
    public IFBillItem setOpTransfer(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.OP_TRANSFER</code>. 「opTransfer」- 流转信息描述填写
     */
    public String getOpTransfer();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.RELATED_ID</code>. 「relatedId」- 关联ID（保留，原系统存在）
     */
    public IFBillItem setRelatedId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.RELATED_ID</code>. 「relatedId」- 关联ID（保留，原系统存在）
     */
    public String getRelatedId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.SETTLEMENT_ID</code>. 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    public IFBillItem setSettlementId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.SETTLEMENT_ID</code>. 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    public String getSettlementId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.BILL_ID</code>. 「billId」- 所属账单ID
     */
    public IFBillItem setBillId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.BILL_ID</code>. 「billId」- 所属账单ID
     */
    public String getBillId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.SUBJECT_ID</code>. 「subjectId」- 会计科目ID，依赖账单项选择结果
     */
    public IFBillItem setSubjectId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.SUBJECT_ID</code>. 「subjectId」- 会计科目ID，依赖账单项选择结果
     */
    public String getSubjectId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.PAY_TERM_ID</code>. 「payTermId」- 账单项ID
     */
    public IFBillItem setPayTermId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.PAY_TERM_ID</code>. 「payTermId」- 账单项ID
     */
    public String getPayTermId();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFBillItem setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IFBillItem setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public IFBillItem setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IFBillItem setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IFBillItem setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IFBillItem setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IFBillItem setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IFBillItem setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IFBillItem
     */
    public void from(cn.vertxup.fm.domain.tables.interfaces.IFBillItem from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IFBillItem
     */
    public <E extends cn.vertxup.fm.domain.tables.interfaces.IFBillItem> E into(E into);

    default IFBillItem fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setSerial(json.getString("SERIAL"));
        setType(json.getString("TYPE"));
        setStatus(json.getString("STATUS"));
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        setComment(json.getString("COMMENT"));
        setManualNo(json.getString("MANUAL_NO"));
        // Omitting unrecognized type java.math.BigDecimal for column PRICE!
        setQuantity(json.getInteger("QUANTITY"));
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT_TOTAL!
        setDelay(json.getBoolean("DELAY"));
        // Omitting unrecognized type java.time.LocalDateTime for column DELAY_AT!
        setOpBy(json.getString("OP_BY"));
        setOpNumber(json.getString("OP_NUMBER"));
        setOpShift(json.getString("OP_SHIFT"));
        // Omitting unrecognized type java.time.LocalDateTime for column OP_AT!
        setOpTransfer(json.getString("OP_TRANSFER"));
        setRelatedId(json.getString("RELATED_ID"));
        setSettlementId(json.getString("SETTLEMENT_ID"));
        setBillId(json.getString("BILL_ID"));
        setSubjectId(json.getString("SUBJECT_ID"));
        setPayTermId(json.getString("PAY_TERM_ID"));
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
        json.put("STATUS",getStatus());
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT!
        json.put("COMMENT",getComment());
        json.put("MANUAL_NO",getManualNo());
        // Omitting unrecognized type java.math.BigDecimal for column PRICE!
        json.put("QUANTITY",getQuantity());
        // Omitting unrecognized type java.math.BigDecimal for column AMOUNT_TOTAL!
        json.put("DELAY",getDelay());
        // Omitting unrecognized type java.time.LocalDateTime for column DELAY_AT!
        json.put("OP_BY",getOpBy());
        json.put("OP_NUMBER",getOpNumber());
        json.put("OP_SHIFT",getOpShift());
        // Omitting unrecognized type java.time.LocalDateTime for column OP_AT!
        json.put("OP_TRANSFER",getOpTransfer());
        json.put("RELATED_ID",getRelatedId());
        json.put("SETTLEMENT_ID",getSettlementId());
        json.put("BILL_ID",getBillId());
        json.put("SUBJECT_ID",getSubjectId());
        json.put("PAY_TERM_ID",getPayTermId());
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
