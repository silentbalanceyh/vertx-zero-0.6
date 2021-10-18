/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.OAccessTokenRecord;
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
public class OAccessToken extends TableImpl<OAccessTokenRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.O_ACCESS_TOKEN</code>
     */
    public static final OAccessToken O_ACCESS_TOKEN = new OAccessToken();
    private static final long serialVersionUID = 1128497261;
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.KEY</code>. 「key」- 令牌主键
     */
    public final TableField<OAccessTokenRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 令牌主键");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.TOKEN</code>. 「token」- 用户的Token信息
     */
    public final TableField<OAccessTokenRecord, byte[]> TOKEN = createField("TOKEN", org.jooq.impl.SQLDataType.BLOB, this, "「token」- 用户的Token信息");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.AUTH</code>. 「auth」- 用户的ID的 byte[] 信息
     */
    public final TableField<OAccessTokenRecord, byte[]> AUTH = createField("AUTH", org.jooq.impl.SQLDataType.BLOB, this, "「auth」- 用户的ID的 byte[] 信息");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.EXPIRED_TIME</code>. 「expiredTime」- 用户的Token过期时间
     */
    public final TableField<OAccessTokenRecord, Long> EXPIRED_TIME = createField("EXPIRED_TIME", org.jooq.impl.SQLDataType.BIGINT, this, "「expiredTime」- 用户的Token过期时间");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.REFRESH_TOKEN</code>. 「refreshToken」- 用户的刷新令牌
     */
    public final TableField<OAccessTokenRecord, byte[]> REFRESH_TOKEN = createField("REFRESH_TOKEN", org.jooq.impl.SQLDataType.BLOB, this, "「refreshToken」- 用户的刷新令牌");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<OAccessTokenRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<OAccessTokenRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<OAccessTokenRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<OAccessTokenRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.O_ACCESS_TOKEN.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<OAccessTokenRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * Create a <code>DB_ETERNAL.O_ACCESS_TOKEN</code> table reference
     */
    public OAccessToken() {
        this(DSL.name("O_ACCESS_TOKEN"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.O_ACCESS_TOKEN</code> table reference
     */
    public OAccessToken(String alias) {
        this(DSL.name(alias), O_ACCESS_TOKEN);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.O_ACCESS_TOKEN</code> table reference
     */
    public OAccessToken(Name alias) {
        this(alias, O_ACCESS_TOKEN);
    }

    private OAccessToken(Name alias, Table<OAccessTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private OAccessToken(Name alias, Table<OAccessTokenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OAccessTokenRecord> getRecordType() {
        return OAccessTokenRecord.class;
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
        return Arrays.<Index>asList(Indexes.O_ACCESS_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OAccessTokenRecord> getPrimaryKey() {
        return Keys.KEY_O_ACCESS_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OAccessTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<OAccessTokenRecord>>asList(Keys.KEY_O_ACCESS_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessToken as(String alias) {
        return new OAccessToken(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAccessToken as(Name alias) {
        return new OAccessToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OAccessToken rename(String name) {
        return new OAccessToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OAccessToken rename(Name name) {
        return new OAccessToken(name, null);
    }
}
