/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables;


import cn.vertxup.lbs.domain.Db;
import cn.vertxup.lbs.domain.Indexes;
import cn.vertxup.lbs.domain.Keys;
import cn.vertxup.lbs.domain.tables.records.LTentRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


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
public class LTent extends TableImpl<LTentRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.L_TENT</code>
     */
    public static final LTent L_TENT = new LTent();
    private static final long serialVersionUID = 1611848987;
    /**
     * The column <code>DB_ETERNAL.L_TENT.KEY</code>. 「key」- 主键
     */
    public final TableField<LTentRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 主键");
    /**
     * The column <code>DB_ETERNAL.L_TENT.NAME</code>. 「name」- 名称
     */
    public final TableField<LTentRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "「name」- 名称");
    /**
     * The column <code>DB_ETERNAL.L_TENT.CODE</code>. 「code」- 编码
     */
    public final TableField<LTentRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「code」- 编码");
    /**
     * The column <code>DB_ETERNAL.L_TENT.CONTACT_PHONE</code>. 「contactPhone」- 联系电话
     */
    public final TableField<LTentRecord, String> CONTACT_PHONE = createField("CONTACT_PHONE", org.jooq.impl.SQLDataType.VARCHAR(20), this, "「contactPhone」- 联系电话");
    /**
     * The column <code>DB_ETERNAL.L_TENT.CONTACT_NAME</code>. 「contactName」- 联系人姓名
     */
    public final TableField<LTentRecord, String> CONTACT_NAME = createField("CONTACT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「contactName」- 联系人姓名");
    /**
     * The column <code>DB_ETERNAL.L_TENT.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<LTentRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.L_TENT.ORDER</code>. 「order」- 排序
     */
    public final TableField<LTentRecord, Integer> ORDER = createField("ORDER", org.jooq.impl.SQLDataType.INTEGER, this, "「order」- 排序");
    /**
     * The column <code>DB_ETERNAL.L_TENT.LOCATION_ID</code>. 「locationId」- 关联地址ID
     */
    public final TableField<LTentRecord, String> LOCATION_ID = createField("LOCATION_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「locationId」- 关联地址ID");
    /**
     * The column <code>DB_ETERNAL.L_TENT.YARD_ID</code>. 「yardId」- 关联小区ID
     */
    public final TableField<LTentRecord, String> YARD_ID = createField("YARD_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「yardId」- 关联小区ID");
    /**
     * The column <code>DB_ETERNAL.L_TENT.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<LTentRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.L_TENT.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<LTentRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.L_TENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<LTentRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.L_TENT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<LTentRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.L_TENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<LTentRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.L_TENT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<LTentRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.L_TENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<LTentRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.L_TENT</code> table reference
     */
    public LTent() {
        this(DSL.name("L_TENT"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.L_TENT</code> table reference
     */
    public LTent(String alias) {
        this(DSL.name(alias), L_TENT);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.L_TENT</code> table reference
     */
    public LTent(Name alias) {
        this(alias, L_TENT);
    }

    private LTent(Name alias, Table<LTentRecord> aliased) {
        this(alias, aliased, null);
    }

    private LTent(Name alias, Table<LTentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LTentRecord> getRecordType() {
        return LTentRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.L_TENT_CODE, Indexes.L_TENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LTentRecord> getPrimaryKey() {
        return Keys.KEY_L_TENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LTentRecord>> getKeys() {
        return Arrays.<UniqueKey<LTentRecord>>asList(Keys.KEY_L_TENT_PRIMARY, Keys.KEY_L_TENT_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LTent as(String alias) {
        return new LTent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LTent as(Name alias) {
        return new LTent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LTent rename(String name) {
        return new LTent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LTent rename(Name name) {
        return new LTent(name, null);
    }
}
