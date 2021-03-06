/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.OUserRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class OUser extends TableImpl<OUserRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.O_USER</code>
     */
    public static final OUser O_USER = new OUser();
    private static final long serialVersionUID = 104744383;
    /**
     * The column <code>DB_ETERNAL.O_USER.KEY</code>. 「key」- OAuth用户ID
     */
    public final TableField<OUserRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- OAuth用户ID");
    /**
     * The column <code>DB_ETERNAL.O_USER.REDIRECT_URI</code>. 「redirectUri」- 回调重定向地址
     */
    public final TableField<OUserRecord, String> REDIRECT_URI = createField("REDIRECT_URI", org.jooq.impl.SQLDataType.CLOB, this, "「redirectUri」- 回调重定向地址");
    /**
     * The column <code>DB_ETERNAL.O_USER.CODE</code>. 「code」- 系统编号
     */
    public final TableField<OUserRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「code」- 系统编号");
    /**
     * The column <code>DB_ETERNAL.O_USER.CLIENT_SECRET</code>. 「clientSecret」- 客户端密钥
     */
    public final TableField<OUserRecord, String> CLIENT_SECRET = createField("CLIENT_SECRET", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「clientSecret」- 客户端密钥");
    /**
     * The column <code>DB_ETERNAL.O_USER.CLIENT_ID</code>. 「clientId」- 客户端ID
     */
    public final TableField<OUserRecord, String> CLIENT_ID = createField("CLIENT_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「clientId」- 客户端ID");
    /**
     * The column <code>DB_ETERNAL.O_USER.GRANT_TYPE</code>. 「grantType」- 认证方式
     */
    public final TableField<OUserRecord, String> GRANT_TYPE = createField("GRANT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「grantType」- 认证方式");
    /**
     * The column <code>DB_ETERNAL.O_USER.SCOPE</code>. 「scope」- 对应名空间，以应用为中心
     */
    public final TableField<OUserRecord, String> SCOPE = createField("SCOPE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「scope」- 对应名空间，以应用为中心");
    /**
     * The column <code>DB_ETERNAL.O_USER.STATE</code>. 「state」- 客户端状态
     */
    public final TableField<OUserRecord, String> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「state」- 客户端状态");
    /**
     * The column <code>DB_ETERNAL.O_USER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<OUserRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.O_USER.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<OUserRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.O_USER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<OUserRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * Create a <code>DB_ETERNAL.O_USER</code> table reference
     */
    public OUser() {
        this(DSL.name("O_USER"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.O_USER</code> table reference
     */
    public OUser(String alias) {
        this(DSL.name(alias), O_USER);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.O_USER</code> table reference
     */
    public OUser(Name alias) {
        this(alias, O_USER);
    }

    private OUser(Name alias, Table<OUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private OUser(Name alias, Table<OUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OUserRecord> getRecordType() {
        return OUserRecord.class;
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
        return Arrays.<Index>asList(Indexes.O_USER_CLIENT_ID, Indexes.O_USER_CLIENT_SECRET, Indexes.O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_APP, Indexes.O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_FULL, Indexes.O_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OUserRecord> getPrimaryKey() {
        return Keys.KEY_O_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OUserRecord>> getKeys() {
        return Arrays.<UniqueKey<OUserRecord>>asList(Keys.KEY_O_USER_PRIMARY, Keys.KEY_O_USER_CLIENT_SECRET, Keys.KEY_O_USER_CLIENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OUser as(String alias) {
        return new OUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OUser as(Name alias) {
        return new OUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OUser rename(String name) {
        return new OUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OUser rename(Name name) {
        return new OUser(name, null);
    }
}
