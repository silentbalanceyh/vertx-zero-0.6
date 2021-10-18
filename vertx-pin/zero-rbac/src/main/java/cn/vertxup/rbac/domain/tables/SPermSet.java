/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.SPermSetRecord;
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
public class SPermSet extends TableImpl<SPermSetRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.S_PERM_SET</code>
     */
    public static final SPermSet S_PERM_SET = new SPermSet();
    private static final long serialVersionUID = -1700358776;
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.KEY</code>. 「key」- 权限集ID
     */
    public final TableField<SPermSetRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 权限集ID");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.NAME</code>. 「name」- 权限集名称
     */
    public final TableField<SPermSetRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 权限集名称");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.CODE</code>. 「code」- 权限集关联权限代码
     */
    public final TableField<SPermSetRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「code」- 权限集关联权限代码");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.TYPE</code>. 「type」- 权限集类型
     */
    public final TableField<SPermSetRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「type」- 权限集类型");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.SIGMA</code>. 「sigma」- 绑定的统一标识
     */
    public final TableField<SPermSetRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「sigma」- 绑定的统一标识");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SPermSetRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SPermSetRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.COMMENT</code>. 「comment」- 权限集说明
     */
    public final TableField<SPermSetRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「comment」- 权限集说明");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SPermSetRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SPermSetRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SPermSetRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SPermSetRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.S_PERM_SET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SPermSetRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.S_PERM_SET</code> table reference
     */
    public SPermSet() {
        this(DSL.name("S_PERM_SET"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_PERM_SET</code> table reference
     */
    public SPermSet(String alias) {
        this(DSL.name(alias), S_PERM_SET);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_PERM_SET</code> table reference
     */
    public SPermSet(Name alias) {
        this(alias, S_PERM_SET);
    }

    private SPermSet(Name alias, Table<SPermSetRecord> aliased) {
        this(alias, aliased, null);
    }

    private SPermSet(Name alias, Table<SPermSetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SPermSetRecord> getRecordType() {
        return SPermSetRecord.class;
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
        return Arrays.<Index>asList(Indexes.S_PERM_SET_NAME, Indexes.S_PERM_SET_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SPermSetRecord> getPrimaryKey() {
        return Keys.KEY_S_PERM_SET_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SPermSetRecord>> getKeys() {
        return Arrays.<UniqueKey<SPermSetRecord>>asList(Keys.KEY_S_PERM_SET_PRIMARY, Keys.KEY_S_PERM_SET_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermSet as(String alias) {
        return new SPermSet(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermSet as(Name alias) {
        return new SPermSet(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SPermSet rename(String name) {
        return new SPermSet(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SPermSet rename(Name name) {
        return new SPermSet(name, null);
    }
}