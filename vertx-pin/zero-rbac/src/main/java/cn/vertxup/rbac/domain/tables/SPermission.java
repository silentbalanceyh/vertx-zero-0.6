/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.SPermissionRecord;
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
public class SPermission extends TableImpl<SPermissionRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.S_PERMISSION</code>
     */
    public static final SPermission S_PERMISSION = new SPermission();
    private static final long serialVersionUID = -1669858205;
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.KEY</code>. 「key」- 权限ID
     */
    public final TableField<SPermissionRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 权限ID");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.NAME</code>. 「name」- 权限名称
     */
    public final TableField<SPermissionRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 权限名称");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.CODE</code>. 「code」- 权限系统码
     */
    public final TableField<SPermissionRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「code」- 权限系统码");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.IDENTIFIER</code>. 「identifier」- 当前权限所属的Model的标识
     */
    public final TableField<SPermissionRecord, String> IDENTIFIER = createField("IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「identifier」- 当前权限所属的Model的标识");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.SIGMA</code>. 「sigma」- 绑定的统一标识
     */
    public final TableField<SPermissionRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「sigma」- 绑定的统一标识");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SPermissionRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SPermissionRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.COMMENT</code>. 「comment」- 权限说明
     */
    public final TableField<SPermissionRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「comment」- 权限说明");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SPermissionRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SPermissionRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SPermissionRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SPermissionRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.S_PERMISSION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SPermissionRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.S_PERMISSION</code> table reference
     */
    public SPermission() {
        this(DSL.name("S_PERMISSION"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_PERMISSION</code> table reference
     */
    public SPermission(String alias) {
        this(DSL.name(alias), S_PERMISSION);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_PERMISSION</code> table reference
     */
    public SPermission(Name alias) {
        this(alias, S_PERMISSION);
    }

    private SPermission(Name alias, Table<SPermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SPermission(Name alias, Table<SPermissionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SPermissionRecord> getRecordType() {
        return SPermissionRecord.class;
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
        return Arrays.<Index>asList(Indexes.S_PERMISSION_CODE, Indexes.S_PERMISSION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SPermissionRecord> getPrimaryKey() {
        return Keys.KEY_S_PERMISSION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SPermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<SPermissionRecord>>asList(Keys.KEY_S_PERMISSION_PRIMARY, Keys.KEY_S_PERMISSION_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermission as(String alias) {
        return new SPermission(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermission as(Name alias) {
        return new SPermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SPermission rename(String name) {
        return new SPermission(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SPermission rename(Name name) {
        return new SPermission(name, null);
    }
}
