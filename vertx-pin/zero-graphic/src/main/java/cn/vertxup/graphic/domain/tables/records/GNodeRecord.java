/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.records;


import cn.vertxup.graphic.domain.tables.GNode;
import cn.vertxup.graphic.domain.tables.interfaces.IGNode;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
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
public class GNodeRecord extends UpdatableRecordImpl<GNodeRecord> implements Record18<String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IGNode {

    private static final long serialVersionUID = 2025688550;

    /**
     * Create a detached GNodeRecord
     */
    public GNodeRecord() {
        super(GNode.G_NODE);
    }

    /**
     * Create a detached, initialised GNodeRecord
     */
    public GNodeRecord(String key, String name, BigDecimal x, BigDecimal y, String ui, String graphicId, String recordData, String recordKey, String recordComponent, String recordClass, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(GNode.G_NODE);

        set(0, key);
        set(1, name);
        set(2, x);
        set(3, y);
        set(4, ui);
        set(5, graphicId);
        set(6, recordData);
        set(7, recordKey);
        set(8, recordComponent);
        set(9, recordClass);
        set(10, sigma);
        set(11, language);
        set(12, active);
        set(13, metadata);
        set(14, createdAt);
        set(15, createdBy);
        set(16, updatedAt);
        set(17, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.KEY</code>. 「key」- 节点ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.KEY</code>. 「key」- 节点ID
     */
    @Override
    public GNodeRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.NAME</code>. 「name」- 节点呈现名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.NAME</code>. 「name」- 节点呈现名称
     */
    @Override
    public GNodeRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.X</code>. 「x」- 当前节点在图上的x坐标
     */
    @Override
    public BigDecimal getX() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.X</code>. 「x」- 当前节点在图上的x坐标
     */
    @Override
    public GNodeRecord setX(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.Y</code>. 「y」- 当前节点在图上的y坐标
     */
    @Override
    public BigDecimal getY() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.Y</code>. 「y」- 当前节点在图上的y坐标
     */
    @Override
    public GNodeRecord setY(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public String getUi() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.UI</code>. 「ui」- ui配置专用
     */
    @Override
    public GNodeRecord setUi(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.GRAPHIC_ID</code>. 「graphicId」- 它所关联的图实例ID
     */
    @Override
    public String getGraphicId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.GRAPHIC_ID</code>. 「graphicId」- 它所关联的图实例ID
     */
    @Override
    public GNodeRecord setGraphicId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.RECORD_DATA</code>. 「recordData」- 该节点存储的数据信息
     */
    @Override
    public String getRecordData() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.RECORD_DATA</code>. 「recordData」- 该节点存储的数据信息
     */
    @Override
    public GNodeRecord setRecordData(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    @Override
    public String getRecordKey() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    @Override
    public GNodeRecord setRecordKey(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.RECORD_COMPONENT</code>. 「recordComponent」- 记录处理组件
     */
    @Override
    public String getRecordComponent() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.RECORD_COMPONENT</code>. 「recordComponent」- 记录处理组件
     */
    @Override
    public GNodeRecord setRecordComponent(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.RECORD_CLASS</code>. 「recordClass」- 记录绑定Pojo类型
     */
    @Override
    public String getRecordClass() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.RECORD_CLASS</code>. 「recordClass」- 记录绑定Pojo类型
     */
    @Override
    public GNodeRecord setRecordClass(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public GNodeRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public GNodeRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public GNodeRecord setActive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public GNodeRecord setMetadata(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public GNodeRecord setCreatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public GNodeRecord setCreatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public GNodeRecord setUpdatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.G_NODE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.G_NODE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public GNodeRecord setUpdatedBy(String value) {
        set(17, value);
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
    public Row18<String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, BigDecimal, BigDecimal, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GNode.G_NODE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GNode.G_NODE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return GNode.G_NODE.X;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return GNode.G_NODE.Y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GNode.G_NODE.UI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GNode.G_NODE.GRAPHIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GNode.G_NODE.RECORD_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return GNode.G_NODE.RECORD_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return GNode.G_NODE.RECORD_COMPONENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return GNode.G_NODE.RECORD_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return GNode.G_NODE.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return GNode.G_NODE.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return GNode.G_NODE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return GNode.G_NODE.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field15() {
        return GNode.G_NODE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return GNode.G_NODE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field17() {
        return GNode.G_NODE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return GNode.G_NODE.UPDATED_BY;
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
    public BigDecimal component3() {
        return getX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGraphicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRecordData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRecordKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRecordComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getRecordClass();
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
    public BigDecimal value3() {
        return getX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGraphicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRecordData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRecordKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRecordComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getRecordClass();
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
    public GNodeRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value3(BigDecimal value) {
        setX(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value4(BigDecimal value) {
        setY(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value5(String value) {
        setUi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value6(String value) {
        setGraphicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value7(String value) {
        setRecordData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value8(String value) {
        setRecordKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value9(String value) {
        setRecordComponent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value10(String value) {
        setRecordClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value11(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value13(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value14(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value15(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value16(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord value17(LocalDateTime value) {
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
    public GNodeRecord value18(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GNodeRecord values(String value1, String value2, BigDecimal value3, BigDecimal value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Boolean value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17, String value18) {
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IGNode from) {
        setKey(from.getKey());
        setName(from.getName());
        setX(from.getX());
        setY(from.getY());
        setUi(from.getUi());
        setGraphicId(from.getGraphicId());
        setRecordData(from.getRecordData());
        setRecordKey(from.getRecordKey());
        setRecordComponent(from.getRecordComponent());
        setRecordClass(from.getRecordClass());
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
    public <E extends IGNode> E into(E into) {
        into.from(this);
        return into;
    }
}
