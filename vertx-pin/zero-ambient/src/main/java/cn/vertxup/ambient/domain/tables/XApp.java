/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Db;
import cn.vertxup.ambient.domain.Indexes;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.tables.records.XAppRecord;
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
public class XApp extends TableImpl<XAppRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.X_APP</code>
     */
    public static final XApp X_APP = new XApp();
    private static final long serialVersionUID = -2028863582;
    /**
     * The column <code>DB_ETERNAL.X_APP.KEY</code>. 「key」- 应用程序主键
     */
    public final TableField<XAppRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 应用程序主键");
    /**
     * The column <code>DB_ETERNAL.X_APP.NAME</code>. 「name」- 应用程序名称
     */
    public final TableField<XAppRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 应用程序名称");
    /**
     * The column <code>DB_ETERNAL.X_APP.CODE</code>. 「code」- 应用程序编码
     */
    public final TableField<XAppRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「code」- 应用程序编码");
    /**
     * The column <code>DB_ETERNAL.X_APP.TITLE</code>. 「title」- 应用程序标题
     */
    public final TableField<XAppRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「title」- 应用程序标题");
    /**
     * The column <code>DB_ETERNAL.X_APP.LOGO</code>. 「logo」- 应用程序图标
     */
    public final TableField<XAppRecord, String> LOGO = createField("LOGO", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「logo」- 应用程序图标");
    /**
     * The column <code>DB_ETERNAL.X_APP.ICP</code>. 「icp」- ICP备案号
     */
    public final TableField<XAppRecord, String> ICP = createField("ICP", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「icp」- ICP备案号");
    /**
     * The column <code>DB_ETERNAL.X_APP.COPY_RIGHT</code>. 「copyRight」- CopyRight版权信息
     */
    public final TableField<XAppRecord, String> COPY_RIGHT = createField("COPY_RIGHT", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「copyRight」- CopyRight版权信息");
    /**
     * The column <code>DB_ETERNAL.X_APP.EMAIL</code>. 「email」- 应用Email信息
     */
    public final TableField<XAppRecord, String> EMAIL = createField("EMAIL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「email」- 应用Email信息");
    /**
     * The column <code>DB_ETERNAL.X_APP.DOMAIN</code>. 「domain」- 应用程序所在域
     */
    public final TableField<XAppRecord, String> DOMAIN = createField("DOMAIN", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「domain」- 应用程序所在域");
    /**
     * The column <code>DB_ETERNAL.X_APP.APP_PORT</code>. 「appPort」- 应用程序端口号，和SOURCE的端口号区别开
     */
    public final TableField<XAppRecord, Integer> APP_PORT = createField("APP_PORT", org.jooq.impl.SQLDataType.INTEGER, this, "「appPort」- 应用程序端口号，和SOURCE的端口号区别开");
    /**
     * The column <code>DB_ETERNAL.X_APP.URL_ENTRY</code>. 「urlEntry」— 应用程序入口页面（登录页）
     */
    public final TableField<XAppRecord, String> URL_ENTRY = createField("URL_ENTRY", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「urlEntry」— 应用程序入口页面（登录页）");
    /**
     * The column <code>DB_ETERNAL.X_APP.URL_MAIN</code>. 「urlMain」- 应用程序内置主页（带安全）
     */
    public final TableField<XAppRecord, String> URL_MAIN = createField("URL_MAIN", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「urlMain」- 应用程序内置主页（带安全）");
    /**
     * The column <code>DB_ETERNAL.X_APP.PATH</code>. 「path」- 应用程序路径
     */
    public final TableField<XAppRecord, String> PATH = createField("PATH", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「path」- 应用程序路径");
    /**
     * The column <code>DB_ETERNAL.X_APP.ROUTE</code>. 「route」- 后端API的根路径，启动时需要
     */
    public final TableField<XAppRecord, String> ROUTE = createField("ROUTE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「route」- 后端API的根路径，启动时需要");
    /**
     * The column <code>DB_ETERNAL.X_APP.APP_KEY</code>. 「appKey」- 应用程序专用唯一hashKey
     */
    public final TableField<XAppRecord, String> APP_KEY = createField("APP_KEY", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「appKey」- 应用程序专用唯一hashKey");
    /**
     * The column <code>DB_ETERNAL.X_APP.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XAppRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.X_APP.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XAppRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.X_APP.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XAppRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.X_APP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XAppRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.X_APP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XAppRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.X_APP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XAppRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.X_APP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XAppRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.X_APP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XAppRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.X_APP</code> table reference
     */
    public XApp() {
        this(DSL.name("X_APP"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_APP</code> table reference
     */
    public XApp(String alias) {
        this(DSL.name(alias), X_APP);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_APP</code> table reference
     */
    public XApp(Name alias) {
        this(alias, X_APP);
    }

    private XApp(Name alias, Table<XAppRecord> aliased) {
        this(alias, aliased, null);
    }

    private XApp(Name alias, Table<XAppRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XAppRecord> getRecordType() {
        return XAppRecord.class;
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
        return Arrays.<Index>asList(Indexes.X_APP_CODE, Indexes.X_APP_IDX_X_APP_NAME, Indexes.X_APP_NAME, Indexes.X_APP_PATH, Indexes.X_APP_PATH_2, Indexes.X_APP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XAppRecord> getPrimaryKey() {
        return Keys.KEY_X_APP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XAppRecord>> getKeys() {
        return Arrays.<UniqueKey<XAppRecord>>asList(Keys.KEY_X_APP_PRIMARY, Keys.KEY_X_APP_NAME, Keys.KEY_X_APP_CODE, Keys.KEY_X_APP_PATH, Keys.KEY_X_APP_PATH_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XApp as(String alias) {
        return new XApp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XApp as(Name alias) {
        return new XApp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XApp rename(String name) {
        return new XApp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XApp rename(Name name) {
        return new XApp(name, null);
    }
}
