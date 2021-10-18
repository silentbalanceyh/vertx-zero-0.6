/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.fm.domain.tables.records;


import cn.vertxup.fm.domain.tables.FSubject;
import cn.vertxup.fm.domain.tables.interfaces.IFSubject;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class FSubjectRecord extends UpdatableRecordImpl<FSubjectRecord> implements Record18<String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFSubject {

    private static final long serialVersionUID = 1480488560;

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.KEY</code>. 「key」- 会计科目ID
     */
    @Override
    public FSubjectRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.KEY</code>. 「key」- 会计科目ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.NAME</code>. 「name」 -  会计科目名称
     */
    @Override
    public FSubjectRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.NAME</code>. 「name」 -  会计科目名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.CODE</code>. 「code」 - 会计科目系统编号
     */
    @Override
    public FSubjectRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.CODE</code>. 「code」 - 会计科目系统编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.SERIAL</code>. 「serial」 - 会计科目编号
     */
    @Override
    public FSubjectRecord setSerial(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.SERIAL</code>. 「serial」 - 会计科目编号
     */
    @Override
    public String getSerial() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.CATEGORY</code>. 「category」 - 会计科目关联类别，直接对接类型树
     */
    @Override
    public FSubjectRecord setCategory(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.CATEGORY</code>. 「category」 - 会计科目关联类别，直接对接类型树
     */
    @Override
    public String getCategory() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.HELP_CODE</code>. 「helpCode」- 会计科目助记码
     */
    @Override
    public FSubjectRecord setHelpCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.HELP_CODE</code>. 「helpCode」- 会计科目助记码
     */
    @Override
    public String getHelpCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.COMMENT</code>. 「comment」 - 会计科目备注
     */
    @Override
    public FSubjectRecord setComment(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.COMMENT</code>. 「comment」 - 会计科目备注
     */
    @Override
    public String getComment() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.OWNER</code>. 「owner」- 科目方向：OUT-借方 / IN-贷方
     */
    @Override
    public FSubjectRecord setOwner(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.OWNER</code>. 「owner」- 科目方向：OUT-借方 / IN-贷方
     */
    @Override
    public String getOwner() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.COMPANY_ID</code>. 「companyId」- 会计科目所属公司
     */
    @Override
    public FSubjectRecord setCompanyId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.COMPANY_ID</code>. 「companyId」- 会计科目所属公司
     */
    @Override
    public String getCompanyId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.PARENT_ID</code>. 「parentId」- 会计科目父科目
     */
    @Override
    public FSubjectRecord setParentId(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.PARENT_ID</code>. 「parentId」- 会计科目父科目
     */
    @Override
    public String getParentId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FSubjectRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FSubjectRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FSubjectRecord setActive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FSubjectRecord setMetadata(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FSubjectRecord setCreatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FSubjectRecord setCreatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FSubjectRecord setUpdatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.F_SUBJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FSubjectRecord setUpdatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.F_SUBJECT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FSubject.F_SUBJECT.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FSubject.F_SUBJECT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FSubject.F_SUBJECT.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FSubject.F_SUBJECT.SERIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FSubject.F_SUBJECT.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FSubject.F_SUBJECT.HELP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FSubject.F_SUBJECT.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FSubject.F_SUBJECT.OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return FSubject.F_SUBJECT.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FSubject.F_SUBJECT.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return FSubject.F_SUBJECT.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return FSubject.F_SUBJECT.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return FSubject.F_SUBJECT.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return FSubject.F_SUBJECT.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field15() {
        return FSubject.F_SUBJECT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return FSubject.F_SUBJECT.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field17() {
        return FSubject.F_SUBJECT.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return FSubject.F_SUBJECT.UPDATED_BY;
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
    public String component5() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getHelpCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component15() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component17() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
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
    public String value5() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHelpCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value15() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value17() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value4(String value) {
        setSerial(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value5(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value6(String value) {
        setHelpCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value7(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value8(String value) {
        setOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value9(String value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value10(String value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value11(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value13(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value14(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value15(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value16(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value17(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord value18(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FSubjectRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Boolean value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IFSubject from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setCategory(from.getCategory());
        setHelpCode(from.getHelpCode());
        setComment(from.getComment());
        setOwner(from.getOwner());
        setCompanyId(from.getCompanyId());
        setParentId(from.getParentId());
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
    public <E extends IFSubject> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FSubjectRecord
     */
    public FSubjectRecord() {
        super(FSubject.F_SUBJECT);
    }

    /**
     * Create a detached, initialised FSubjectRecord
     */
    public FSubjectRecord(String key, String name, String code, String serial, String category, String helpCode, String comment, String owner, String companyId, String parentId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FSubject.F_SUBJECT);

        set(0, key);
        set(1, name);
        set(2, code);
        set(3, serial);
        set(4, category);
        set(5, helpCode);
        set(6, comment);
        set(7, owner);
        set(8, companyId);
        set(9, parentId);
        set(10, sigma);
        set(11, language);
        set(12, active);
        set(13, metadata);
        set(14, createdAt);
        set(15, createdBy);
        set(16, updatedAt);
        set(17, updatedBy);
    }
}
