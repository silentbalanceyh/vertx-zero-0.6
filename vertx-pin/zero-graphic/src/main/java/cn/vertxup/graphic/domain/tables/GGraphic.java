/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables;


import cn.vertxup.graphic.domain.Db;
import cn.vertxup.graphic.domain.Indexes;
import cn.vertxup.graphic.domain.Keys;
import cn.vertxup.graphic.domain.tables.records.GGraphicRecord;
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
public class GGraphic extends TableImpl<GGraphicRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.G_GRAPHIC</code>
     */
    public static final GGraphic G_GRAPHIC = new GGraphic();
    private static final long serialVersionUID = 821979445;
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.KEY</code>. 「key」- 图ID
     */
    public final TableField<GGraphicRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 图ID");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.NAME</code>. 「name」- 图名称
     */
    public final TableField<GGraphicRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 图名称");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.CODE</code>. 「code」- neo4j 中的图的 label，符合 neo4j的图ID规范（使用一定命名规则）
     */
    public final TableField<GGraphicRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「code」- neo4j 中的图的 label，符合 neo4j的图ID规范（使用一定命名规则）");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.MODE</code>. 「mode」- 图模型 FLOW / TOPOLOGY / MIND / TREE
     */
    public final TableField<GGraphicRecord, String> MODE = createField("MODE", org.jooq.impl.SQLDataType.VARCHAR(20), this, "「mode」- 图模型 FLOW / TOPOLOGY / MIND / TREE");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.TYPE</code>. 「type」- 图类型 CIRCLE / DEFINE / INSTANCE 圈子、定义、实例，可扩展 tabular
     */
    public final TableField<GGraphicRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「type」- 图类型 CIRCLE / DEFINE / INSTANCE 圈子、定义、实例，可扩展 tabular");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.COMMENTS</code>. 「comments」- 图备注信息
     */
    public final TableField<GGraphicRecord, String> COMMENTS = createField("COMMENTS", org.jooq.impl.SQLDataType.CLOB, this, "「comments」- 图备注信息");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.OWNER_ID</code>. 「ownerId」- 图的拥有者，可管理该图信息的人员ID
     */
    public final TableField<GGraphicRecord, String> OWNER_ID = createField("OWNER_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「ownerId」- 图的拥有者，可管理该图信息的人员ID");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.UI</code>. 「ui」- ui配置专用
     */
    public final TableField<GGraphicRecord, String> UI = createField("UI", org.jooq.impl.SQLDataType.CLOB, this, "「ui」- ui配置专用");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.GRAPHIC_ID</code>. 「graphicId」- 父图ID（当前图是父图的子图，独立管理，创建时需要）
     */
    public final TableField<GGraphicRecord, String> GRAPHIC_ID = createField("GRAPHIC_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「graphicId」- 父图ID（当前图是父图的子图，独立管理，创建时需要）");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.MASTER</code>. 「master」- 主图（不可删除、父ID为NULL、模块级唯一）
     */
    public final TableField<GGraphicRecord, Boolean> MASTER = createField("MASTER", org.jooq.impl.SQLDataType.BIT, this, "「master」- 主图（不可删除、父ID为NULL、模块级唯一）");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    public final TableField<GGraphicRecord, String> MODEL_ID = createField("MODEL_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<GGraphicRecord, String> MODEL_KEY = createField("MODEL_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.MODEL_CATEGORY</code>. 「modelCategory」- 关联的category记录，只包含叶节点
     */
    public final TableField<GGraphicRecord, String> MODEL_CATEGORY = createField("MODEL_CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelCategory」- 关联的category记录，只包含叶节点");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<GGraphicRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<GGraphicRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<GGraphicRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<GGraphicRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<GGraphicRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<GGraphicRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<GGraphicRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.G_GRAPHIC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<GGraphicRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.G_GRAPHIC</code> table reference
     */
    public GGraphic() {
        this(DSL.name("G_GRAPHIC"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.G_GRAPHIC</code> table reference
     */
    public GGraphic(String alias) {
        this(DSL.name(alias), G_GRAPHIC);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.G_GRAPHIC</code> table reference
     */
    public GGraphic(Name alias) {
        this(alias, G_GRAPHIC);
    }

    private GGraphic(Name alias, Table<GGraphicRecord> aliased) {
        this(alias, aliased, null);
    }

    private GGraphic(Name alias, Table<GGraphicRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GGraphicRecord> getRecordType() {
        return GGraphicRecord.class;
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
        return Arrays.<Index>asList(Indexes.G_GRAPHIC_CODE, Indexes.G_GRAPHIC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GGraphicRecord> getPrimaryKey() {
        return Keys.KEY_G_GRAPHIC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GGraphicRecord>> getKeys() {
        return Arrays.<UniqueKey<GGraphicRecord>>asList(Keys.KEY_G_GRAPHIC_PRIMARY, Keys.KEY_G_GRAPHIC_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphic as(String alias) {
        return new GGraphic(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GGraphic as(Name alias) {
        return new GGraphic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GGraphic rename(String name) {
        return new GGraphic(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GGraphic rename(Name name) {
        return new GGraphic(name, null);
    }
}
