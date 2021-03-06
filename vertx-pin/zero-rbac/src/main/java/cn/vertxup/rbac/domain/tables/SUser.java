/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.SUserRecord;
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
public class SUser extends TableImpl<SUserRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.S_USER</code>
     */
    public static final SUser S_USER = new SUser();
    private static final long serialVersionUID = 1899960993;
    /**
     * The column <code>DB_ETERNAL.S_USER.KEY</code>. 「key」- 用户ID
     */
    public final TableField<SUserRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 用户ID");
    /**
     * The column <code>DB_ETERNAL.S_USER.USERNAME</code>. 「username」- 用户登录账号
     */
    public final TableField<SUserRecord, String> USERNAME = createField("USERNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「username」- 用户登录账号");
    /**
     * The column <code>DB_ETERNAL.S_USER.REALNAME</code>. 「realname」- 用户真实姓名
     */
    public final TableField<SUserRecord, String> REALNAME = createField("REALNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「realname」- 用户真实姓名");
    /**
     * The column <code>DB_ETERNAL.S_USER.ALIAS</code>. 「alias」- 用户昵称
     */
    public final TableField<SUserRecord, String> ALIAS = createField("ALIAS", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「alias」- 用户昵称");
    /**
     * The column <code>DB_ETERNAL.S_USER.MOBILE</code>. 「mobile」- 用户登录手机
     */
    public final TableField<SUserRecord, String> MOBILE = createField("MOBILE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「mobile」- 用户登录手机");
    /**
     * The column <code>DB_ETERNAL.S_USER.EMAIL</code>. 「email」- 用户登录EMAIL地址
     */
    public final TableField<SUserRecord, String> EMAIL = createField("EMAIL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「email」- 用户登录EMAIL地址");
    /**
     * The column <code>DB_ETERNAL.S_USER.PASSWORD</code>. 「password」- 用户登录密码
     */
    public final TableField<SUserRecord, String> PASSWORD = createField("PASSWORD", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「password」- 用户登录密码");
    /**
     * The column <code>DB_ETERNAL.S_USER.MODEL_ID</code>. 「modelId」- 组所关联的模型identifier，用于描述
     */
    public final TableField<SUserRecord, String> MODEL_ID = createField("MODEL_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「modelId」- 组所关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.S_USER.MODEL_KEY</code>. 「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<SUserRecord, String> MODEL_KEY = createField("MODEL_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.S_USER.CATEGORY</code>. 「category」- 用户分类
     */
    public final TableField<SUserRecord, String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「category」- 用户分类");
    /**
     * The column <code>DB_ETERNAL.S_USER.SIGMA</code>. 「sigma」- 用户绑定的统一标识
     */
    public final TableField<SUserRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 用户绑定的统一标识");
    /**
     * The column <code>DB_ETERNAL.S_USER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SUserRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.S_USER.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SUserRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.S_USER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SUserRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.S_USER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SUserRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.S_USER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SUserRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.S_USER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SUserRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.S_USER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SUserRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.S_USER</code> table reference
     */
    public SUser() {
        this(DSL.name("S_USER"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_USER</code> table reference
     */
    public SUser(String alias) {
        this(DSL.name(alias), S_USER);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_USER</code> table reference
     */
    public SUser(Name alias) {
        this(alias, S_USER);
    }

    private SUser(Name alias, Table<SUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private SUser(Name alias, Table<SUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SUserRecord> getRecordType() {
        return SUserRecord.class;
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
        return Arrays.<Index>asList(Indexes.S_USER_IDX_S_USER_USERNAME, Indexes.S_USER_PRIMARY, Indexes.S_USER_USERNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SUserRecord> getPrimaryKey() {
        return Keys.KEY_S_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SUserRecord>> getKeys() {
        return Arrays.<UniqueKey<SUserRecord>>asList(Keys.KEY_S_USER_PRIMARY, Keys.KEY_S_USER_USERNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SUser as(String alias) {
        return new SUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SUser as(Name alias) {
        return new SUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SUser rename(String name) {
        return new SUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SUser rename(Name name) {
        return new SUser(name, null);
    }
}
