/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.records;


import cn.vertxup.ui.domain.tables.UiLayout;
import cn.vertxup.ui.domain.tables.interfaces.IUiLayout;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
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
public class UiLayoutRecord extends UpdatableRecordImpl<UiLayoutRecord> implements Record11<String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IUiLayout {

    private static final long serialVersionUID = 1147289007;

    /**
     * Create a detached UiLayoutRecord
     */
    public UiLayoutRecord() {
        super(UiLayout.UI_LAYOUT);
    }

    /**
     * Create a detached, initialised UiLayoutRecord
     */
    public UiLayoutRecord(String key, String name, String config, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(UiLayout.UI_LAYOUT);

        set(0, key);
        set(1, name);
        set(2, config);
        set(3, active);
        set(4, sigma);
        set(5, metadata);
        set(6, language);
        set(7, createdAt);
        set(8, createdBy);
        set(9, updatedAt);
        set(10, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.KEY</code>. 「key」- Tpl模板唯一主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.KEY</code>. 「key」- Tpl模板唯一主键
     */
    @Override
    public UiLayoutRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.NAME</code>. 「name」- Tpl模板名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.NAME</code>. 「name」- Tpl模板名称
     */
    @Override
    public UiLayoutRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.CONFIG</code>. 「config」- 主配置
     */
    @Override
    public String getConfig() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.CONFIG</code>. 「config」- 主配置
     */
    @Override
    public UiLayoutRecord setConfig(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public UiLayoutRecord setActive(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public UiLayoutRecord setSigma(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public UiLayoutRecord setMetadata(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public UiLayoutRecord setLanguage(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public UiLayoutRecord setCreatedAt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public UiLayoutRecord setCreatedBy(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public UiLayoutRecord setUpdatedAt(LocalDateTime value) {
        set(9, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.UI_LAYOUT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.UI_LAYOUT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public UiLayoutRecord setUpdatedBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UiLayout.UI_LAYOUT.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UiLayout.UI_LAYOUT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UiLayout.UI_LAYOUT.CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return UiLayout.UI_LAYOUT.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UiLayout.UI_LAYOUT.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UiLayout.UI_LAYOUT.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UiLayout.UI_LAYOUT.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return UiLayout.UI_LAYOUT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return UiLayout.UI_LAYOUT.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return UiLayout.UI_LAYOUT.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UiLayout.UI_LAYOUT.UPDATED_BY;
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
        return getConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component8() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component10() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
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
        return getConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value3(String value) {
        setConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value4(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value5(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value6(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value7(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value8(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value9(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value10(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord value11(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiLayoutRecord values(String value1, String value2, String value3, Boolean value4, String value5, String value6, String value7, LocalDateTime value8, String value9, LocalDateTime value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IUiLayout from) {
        setKey(from.getKey());
        setName(from.getName());
        setConfig(from.getConfig());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IUiLayout> E into(E into) {
        into.from(this);
        return into;
    }
}
