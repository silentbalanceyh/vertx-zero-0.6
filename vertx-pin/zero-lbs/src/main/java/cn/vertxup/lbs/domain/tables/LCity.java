/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables;


import cn.vertxup.lbs.domain.Db;
import cn.vertxup.lbs.domain.Indexes;
import cn.vertxup.lbs.domain.Keys;
import cn.vertxup.lbs.domain.tables.records.LCityRecord;
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
public class LCity extends TableImpl<LCityRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.L_CITY</code>
     */
    public static final LCity L_CITY = new LCity();
    private static final long serialVersionUID = -886171400;
    /**
     * The column <code>DB_ETERNAL.L_CITY.KEY</code>. 「key」- 主键
     */
    public final TableField<LCityRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 主键");
    /**
     * The column <code>DB_ETERNAL.L_CITY.NAME</code>. 「name」- 名称
     */
    public final TableField<LCityRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "「name」- 名称");
    /**
     * The column <code>DB_ETERNAL.L_CITY.CODE</code>. 「code」- 编码
     */
    public final TableField<LCityRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「code」- 编码");
    /**
     * The column <code>DB_ETERNAL.L_CITY.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<LCityRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.L_CITY.ORDER</code>. 「order」- 排序
     */
    public final TableField<LCityRecord, Integer> ORDER = createField("ORDER", org.jooq.impl.SQLDataType.INTEGER, this, "「order」- 排序");
    /**
     * The column <code>DB_ETERNAL.L_CITY.STATE_ID</code>. 「stateId」- 省会ID
     */
    public final TableField<LCityRecord, String> STATE_ID = createField("STATE_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「stateId」- 省会ID");
    /**
     * The column <code>DB_ETERNAL.L_CITY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<LCityRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.L_CITY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<LCityRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.L_CITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<LCityRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.L_CITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<LCityRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.L_CITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<LCityRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.L_CITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<LCityRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.L_CITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<LCityRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.L_CITY</code> table reference
     */
    public LCity() {
        this(DSL.name("L_CITY"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.L_CITY</code> table reference
     */
    public LCity(String alias) {
        this(DSL.name(alias), L_CITY);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.L_CITY</code> table reference
     */
    public LCity(Name alias) {
        this(alias, L_CITY);
    }

    private LCity(Name alias, Table<LCityRecord> aliased) {
        this(alias, aliased, null);
    }

    private LCity(Name alias, Table<LCityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LCityRecord> getRecordType() {
        return LCityRecord.class;
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
        return Arrays.<Index>asList(Indexes.L_CITY_CODE, Indexes.L_CITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LCityRecord> getPrimaryKey() {
        return Keys.KEY_L_CITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LCityRecord>> getKeys() {
        return Arrays.<UniqueKey<LCityRecord>>asList(Keys.KEY_L_CITY_PRIMARY, Keys.KEY_L_CITY_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LCity as(String alias) {
        return new LCity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LCity as(Name alias) {
        return new LCity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LCity rename(String name) {
        return new LCity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LCity rename(Name name) {
        return new LCity(name, null);
    }
}