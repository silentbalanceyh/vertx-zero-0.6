/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.fm.domain.tables.records;


import cn.vertxup.fm.domain.tables.FReceivable;
import cn.vertxup.fm.domain.tables.interfaces.IFReceivable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FReceivableRecord extends UpdatableRecordImpl<FReceivableRecord> implements Record19<String, String, String, String, BigDecimal, String, String, String, Boolean, LocalDateTime, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFReceivable {

    private static final long serialVersionUID = -952291281;

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.KEY</code>. 「key」- 应收账单主键ID
     */
    @Override
    public FReceivableRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.KEY</code>. 「key」- 应收账单主键ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.NAME</code>. 「name」 - 应收单标题
     */
    @Override
    public FReceivableRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.NAME</code>. 「name」 - 应收单标题
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.CODE</code>. 「code」 - 应收单编号
     */
    @Override
    public FReceivableRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.CODE</code>. 「code」 - 应收单编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.SERIAL</code>. 「serial」 - 应收单据号
     */
    @Override
    public FReceivableRecord setSerial(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.SERIAL</code>. 「serial」 - 应收单据号
     */
    @Override
    public String getSerial() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public FReceivableRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.COMMENT</code>. 「comment」 - 结算单备注
     */
    @Override
    public FReceivableRecord setComment(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.COMMENT</code>. 「comment」 - 结算单备注
     */
    @Override
    public String getComment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public FReceivableRecord setSignName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public String getSignName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public FReceivableRecord setSignMobile(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public String getSignMobile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public FReceivableRecord setFinished(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public Boolean getFinished() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public FReceivableRecord setFinishedAt(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public LocalDateTime getFinishedAt() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    @Override
    public FReceivableRecord setCustomerId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    @Override
    public String getCustomerId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FReceivableRecord setSigma(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FReceivableRecord setLanguage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FReceivableRecord setActive(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FReceivableRecord setMetadata(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FReceivableRecord setCreatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FReceivableRecord setCreatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FReceivableRecord setUpdatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_RECEIVABLE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FReceivableRecord setUpdatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_RECEIVABLE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, BigDecimal, String, String, String, Boolean, LocalDateTime, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, BigDecimal, String, String, String, Boolean, LocalDateTime, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FReceivable.F_RECEIVABLE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FReceivable.F_RECEIVABLE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FReceivable.F_RECEIVABLE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FReceivable.F_RECEIVABLE.SERIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return FReceivable.F_RECEIVABLE.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FReceivable.F_RECEIVABLE.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FReceivable.F_RECEIVABLE.SIGN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FReceivable.F_RECEIVABLE.SIGN_MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return FReceivable.F_RECEIVABLE.FINISHED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return FReceivable.F_RECEIVABLE.FINISHED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return FReceivable.F_RECEIVABLE.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return FReceivable.F_RECEIVABLE.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return FReceivable.F_RECEIVABLE.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return FReceivable.F_RECEIVABLE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return FReceivable.F_RECEIVABLE.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field16() {
        return FReceivable.F_RECEIVABLE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return FReceivable.F_RECEIVABLE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field18() {
        return FReceivable.F_RECEIVABLE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return FReceivable.F_RECEIVABLE.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSerial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSignName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSignMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getFinished();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component10() {
        return getFinishedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component16() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component18() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSerial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSignName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSignMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getFinished();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getFinishedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value16() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value18() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value4(String value) {
        setSerial(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value6(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value7(String value) {
        setSignName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value8(String value) {
        setSignMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value9(Boolean value) {
        setFinished(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value10(LocalDateTime value) {
        setFinishedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value11(String value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value12(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value13(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value14(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value15(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value16(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value17(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value18(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord value19(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FReceivableRecord values(String value1, String value2, String value3, String value4, BigDecimal value5, String value6, String value7, String value8, Boolean value9, LocalDateTime value10, String value11, String value12, String value13, Boolean value14, String value15, LocalDateTime value16, String value17, LocalDateTime value18, String value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IFReceivable from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setSignName(from.getSignName());
        setSignMobile(from.getSignMobile());
        setFinished(from.getFinished());
        setFinishedAt(from.getFinishedAt());
        setCustomerId(from.getCustomerId());
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
    public <E extends IFReceivable> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FReceivableRecord
     */
    public FReceivableRecord() {
        super(FReceivable.F_RECEIVABLE);
    }

    /**
     * Create a detached, initialised FReceivableRecord
     */
    public FReceivableRecord(String key, String name, String code, String serial, BigDecimal amount, String comment, String signName, String signMobile, Boolean finished, LocalDateTime finishedAt, String customerId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FReceivable.F_RECEIVABLE);

        set(0, key);
        set(1, name);
        set(2, code);
        set(3, serial);
        set(4, amount);
        set(5, comment);
        set(6, signName);
        set(7, signMobile);
        set(8, finished);
        set(9, finishedAt);
        set(10, customerId);
        set(11, sigma);
        set(12, language);
        set(13, active);
        set(14, metadata);
        set(15, createdAt);
        set(16, createdBy);
        set(17, updatedAt);
        set(18, updatedBy);
    }
}
