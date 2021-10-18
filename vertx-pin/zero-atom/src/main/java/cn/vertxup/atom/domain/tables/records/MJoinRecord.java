/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.records;


import cn.vertxup.atom.domain.tables.MJoin;
import cn.vertxup.atom.domain.tables.interfaces.IMJoin;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MJoinRecord extends UpdatableRecordImpl<MJoinRecord> implements Record5<String, String, String, Integer, String>, IMJoin {

    private static final long serialVersionUID = -1172406117;

    /**
     * Create a detached MJoinRecord
     */
    public MJoinRecord() {
        super(MJoin.M_JOIN);
    }

    /**
     * Create a detached, initialised MJoinRecord
     */
    public MJoinRecord(String model, String entity, String entityKey, Integer priority, String namespace) {
        super(MJoin.M_JOIN);

        set(0, model);
        set(1, entity);
        set(2, entityKey);
        set(3, priority);
        set(4, namespace);
    }

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.MODEL</code>. 「model」- 模型identifier
     */
    @Override
    public String getModel() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.MODEL</code>. 「model」- 模型identifier
     */
    @Override
    public MJoinRecord setModel(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.ENTITY</code>. 「entity」- 实体identifier
     */
    @Override
    public String getEntity() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.ENTITY</code>. 「entity」- 实体identifier
     */
    @Override
    public MJoinRecord setEntity(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.ENTITY_KEY</code>. 「entityKey」- 实体主键字段名
     */
    @Override
    public String getEntityKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.ENTITY_KEY</code>. 「entityKey」- 实体主键字段名
     */
    @Override
    public MJoinRecord setEntityKey(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.PRIORITY</code>. 「priority」- 优先级
     */
    @Override
    public Integer getPriority() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.PRIORITY</code>. 「priority」- 优先级
     */
    @Override
    public MJoinRecord setPriority(Integer value) {
        set(3, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.M_JOIN.NAMESPACE</code>. 「namespace」- 名空间（和App绑定的）
     */
    @Override
    public String getNamespace() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.M_JOIN.NAMESPACE</code>. 「namespace」- 名空间（和App绑定的）
     */
    @Override
    public MJoinRecord setNamespace(String value) {
        set(4, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MJoin.M_JOIN.MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MJoin.M_JOIN.ENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MJoin.M_JOIN.ENTITY_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MJoin.M_JOIN.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MJoin.M_JOIN.NAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEntityKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEntityKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MJoinRecord value1(String value) {
        setModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MJoinRecord value2(String value) {
        setEntity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MJoinRecord value3(String value) {
        setEntityKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MJoinRecord value4(Integer value) {
        setPriority(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public MJoinRecord value5(String value) {
        setNamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MJoinRecord values(String value1, String value2, String value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IMJoin from) {
        setModel(from.getModel());
        setEntity(from.getEntity());
        setEntityKey(from.getEntityKey());
        setPriority(from.getPriority());
        setNamespace(from.getNamespace());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IMJoin> E into(E into) {
        into.from(this);
        return into;
    }
}