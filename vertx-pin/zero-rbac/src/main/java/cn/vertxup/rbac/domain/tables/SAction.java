/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.SActionRecord;
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
public class SAction extends TableImpl<SActionRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.S_ACTION</code>
     */
    public static final SAction S_ACTION = new SAction();
    private static final long serialVersionUID = -940402587;
    /**
     * The column <code>DB_ETERNAL.S_ACTION.KEY</code>. 「key」- 操作ID
     */
    public final TableField<SActionRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 操作ID");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.NAME</code>. 「name」- 操作名称
     */
    public final TableField<SActionRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 操作名称");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.CODE</code>. 「code」- 操作码
     */
    public final TableField<SActionRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「code」- 操作码");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.RESOURCE_ID</code>. 「resourceId」- 操作关联资源ID
     */
    public final TableField<SActionRecord, String> RESOURCE_ID = createField("RESOURCE_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「resourceId」- 操作关联资源ID");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.PERMISSION_ID</code>. 「permissionId」- 操作所属权限
     */
    public final TableField<SActionRecord, String> PERMISSION_ID = createField("PERMISSION_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「permissionId」- 操作所属权限");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.LEVEL</code>. 「level」- 操作级别, ACL控制
     */
    public final TableField<SActionRecord, Integer> LEVEL = createField("LEVEL", org.jooq.impl.SQLDataType.INTEGER, this, "「level」- 操作级别, ACL控制");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.URI</code>. 「uri」- 资源地址
     */
    public final TableField<SActionRecord, String> URI = createField("URI", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「uri」- 资源地址");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.METHOD</code>. 「method」- 资源方法
     */
    public final TableField<SActionRecord, String> METHOD = createField("METHOD", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「method」- 资源方法");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<SActionRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.RENEWAL_CREDIT</code>. 「renewalCredit」- 被刷新的凭证
     */
    public final TableField<SActionRecord, String> RENEWAL_CREDIT = createField("RENEWAL_CREDIT", org.jooq.impl.SQLDataType.CLOB, this, "「renewalCredit」- 被刷新的凭证");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SActionRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SActionRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SActionRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.COMMENT</code>. 「action」- 操作说明
     */
    public final TableField<SActionRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「action」- 操作说明");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SActionRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SActionRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SActionRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.S_ACTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SActionRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.S_ACTION</code> table reference
     */
    public SAction() {
        this(DSL.name("S_ACTION"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_ACTION</code> table reference
     */
    public SAction(String alias) {
        this(DSL.name(alias), S_ACTION);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_ACTION</code> table reference
     */
    public SAction(Name alias) {
        this(alias, S_ACTION);
    }

    private SAction(Name alias, Table<SActionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SAction(Name alias, Table<SActionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SActionRecord> getRecordType() {
        return SActionRecord.class;
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
        return Arrays.<Index>asList(Indexes.S_ACTION_CODE, Indexes.S_ACTION_IDXM_S_ACTION_SIGMA_URI_METHOD, Indexes.S_ACTION_IDXM_S_ACTION_URI_METHOD, Indexes.S_ACTION_IDX_S_ACTION_PERMISSION_ID, Indexes.S_ACTION_PRIMARY, Indexes.S_ACTION_RESOURCE_ID, Indexes.S_ACTION_URI);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SActionRecord> getPrimaryKey() {
        return Keys.KEY_S_ACTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SActionRecord>> getKeys() {
        return Arrays.<UniqueKey<SActionRecord>>asList(Keys.KEY_S_ACTION_PRIMARY, Keys.KEY_S_ACTION_CODE, Keys.KEY_S_ACTION_RESOURCE_ID, Keys.KEY_S_ACTION_URI);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SAction as(String alias) {
        return new SAction(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SAction as(Name alias) {
        return new SAction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SAction rename(String name) {
        return new SAction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SAction rename(Name name) {
        return new SAction(name, null);
    }
}