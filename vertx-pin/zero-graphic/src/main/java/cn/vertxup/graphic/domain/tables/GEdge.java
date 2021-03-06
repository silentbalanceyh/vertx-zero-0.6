/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables;


import cn.vertxup.graphic.domain.Db;
import cn.vertxup.graphic.domain.Indexes;
import cn.vertxup.graphic.domain.Keys;
import cn.vertxup.graphic.domain.tables.records.GEdgeRecord;
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
public class GEdge extends TableImpl<GEdgeRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.G_EDGE</code>
     */
    public static final GEdge G_EDGE = new GEdge();
    private static final long serialVersionUID = 1523343250;
    /**
     * The column <code>DB_ETERNAL.G_EDGE.KEY</code>. 「key」- 拓扑图边的ID
     */
    public final TableField<GEdgeRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 拓扑图边的ID");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.NAME</code>. 「name」- 边的名称
     */
    public final TableField<GEdgeRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 边的名称");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.TYPE</code>. 「type」- 拓扑图边的类型，描述关系本质
     */
    public final TableField<GEdgeRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「type」- 拓扑图边的类型，描述关系本质");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.SOURCE_KEY</code>. 「sourceKey」- 拓扑图开始节点
     */
    public final TableField<GEdgeRecord, String> SOURCE_KEY = createField("SOURCE_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「sourceKey」- 拓扑图开始节点");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.TARGET_KEY</code>. 「targetKey」- 拓扑图结束节点
     */
    public final TableField<GEdgeRecord, String> TARGET_KEY = createField("TARGET_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「targetKey」- 拓扑图结束节点");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.GRAPHIC_ID</code>. 「graphicId」- 当前关联拓扑图ID
     */
    public final TableField<GEdgeRecord, String> GRAPHIC_ID = createField("GRAPHIC_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「graphicId」- 当前关联拓扑图ID");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.UI</code>. 「ui」- ui配置专用
     */
    public final TableField<GEdgeRecord, String> UI = createField("UI", org.jooq.impl.SQLDataType.CLOB, this, "「ui」- ui配置专用");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    public final TableField<GEdgeRecord, String> RECORD_KEY = createField("RECORD_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「recordKey」- 记录主键");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.RECORD_DATA</code>. 「recordData」- 组中存储的数据信息
     */
    public final TableField<GEdgeRecord, String> RECORD_DATA = createField("RECORD_DATA", org.jooq.impl.SQLDataType.CLOB, this, "「recordData」- 组中存储的数据信息");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<GEdgeRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<GEdgeRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<GEdgeRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<GEdgeRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<GEdgeRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<GEdgeRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<GEdgeRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.G_EDGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<GEdgeRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.G_EDGE</code> table reference
     */
    public GEdge() {
        this(DSL.name("G_EDGE"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.G_EDGE</code> table reference
     */
    public GEdge(String alias) {
        this(DSL.name(alias), G_EDGE);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.G_EDGE</code> table reference
     */
    public GEdge(Name alias) {
        this(alias, G_EDGE);
    }

    private GEdge(Name alias, Table<GEdgeRecord> aliased) {
        this(alias, aliased, null);
    }

    private GEdge(Name alias, Table<GEdgeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GEdgeRecord> getRecordType() {
        return GEdgeRecord.class;
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
        return Arrays.<Index>asList(Indexes.G_EDGE_NAME, Indexes.G_EDGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GEdgeRecord> getPrimaryKey() {
        return Keys.KEY_G_EDGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GEdgeRecord>> getKeys() {
        return Arrays.<UniqueKey<GEdgeRecord>>asList(Keys.KEY_G_EDGE_PRIMARY, Keys.KEY_G_EDGE_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdge as(String alias) {
        return new GEdge(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GEdge as(Name alias) {
        return new GEdge(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GEdge rename(String name) {
        return new GEdge(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GEdge rename(Name name) {
        return new GEdge(name, null);
    }
}
