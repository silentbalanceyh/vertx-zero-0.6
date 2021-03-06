/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables;


import cn.vertxup.atom.domain.Db;
import cn.vertxup.atom.domain.Indexes;
import cn.vertxup.atom.domain.Keys;
import cn.vertxup.atom.domain.tables.records.MModelRecord;
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
public class MModel extends TableImpl<MModelRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.M_MODEL</code>
     */
    public static final MModel M_MODEL = new MModel();
    private static final long serialVersionUID = -1136546758;
    /**
     * The column <code>DB_ETERNAL.M_MODEL.KEY</code>. 「key」- 模型ID
     */
    public final TableField<MModelRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 模型ID");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.IDENTIFIER</code>. 「identifier」- 当前模型全局唯一ID
     */
    public final TableField<MModelRecord, String> IDENTIFIER = createField("IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「identifier」- 当前模型全局唯一ID");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.NAMESPACE</code>. 「namespace」- 当前模型使用的名空间
     */
    public final TableField<MModelRecord, String> NAMESPACE = createField("NAMESPACE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「namespace」- 当前模型使用的名空间");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.NAME</code>. 「name」- 当前模型的名称
     */
    public final TableField<MModelRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 当前模型的名称");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.ALIAS</code>. 「alias」- 模型别名（业务名）
     */
    public final TableField<MModelRecord, String> ALIAS = createField("ALIAS", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「alias」- 模型别名（业务名）");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.TYPE</code>. 「type」- 当前模型的类型信息
     */
    public final TableField<MModelRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「type」- 当前模型的类型信息");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.COMMENTS</code>. 「comments」- 当前模型的描述信息
     */
    public final TableField<MModelRecord, String> COMMENTS = createField("COMMENTS", org.jooq.impl.SQLDataType.CLOB, this, "「comments」- 当前模型的描述信息");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.CATEGORY_TREE</code>. 「categoryTree」- 当前模型所属的类型树
     */
    public final TableField<MModelRecord, String> CATEGORY_TREE = createField("CATEGORY_TREE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「categoryTree」- 当前模型所属的类型树");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.CATEGORY_ID</code>. 「categoryId」- 关联的类型的ID
     */
    public final TableField<MModelRecord, String> CATEGORY_ID = createField("CATEGORY_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「categoryId」- 关联的类型的ID");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.RULE_UNIQUE</code>. 「ruleUnique」- 当前模型的标识规则
     */
    public final TableField<MModelRecord, String> RULE_UNIQUE = createField("RULE_UNIQUE", org.jooq.impl.SQLDataType.CLOB, this, "「ruleUnique」- 当前模型的标识规则");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.IS_TRACK</code>. 「isTrack」- 该组件为 track 表示执行 ACTIVITY 的变更监控功能（生成变更历史）
     */
    public final TableField<MModelRecord, Boolean> IS_TRACK = createField("IS_TRACK", org.jooq.impl.SQLDataType.BIT, this, "「isTrack」- 该组件为 track 表示执行 ACTIVITY 的变更监控功能（生成变更历史）");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.SPIDER</code>. 「spider」- 主图格式，存储当前模型为起点的图层Json数据，每个模型只有一张
     */
    public final TableField<MModelRecord, String> SPIDER = createField("SPIDER", org.jooq.impl.SQLDataType.CLOB, this, "「spider」- 主图格式，存储当前模型为起点的图层Json数据，每个模型只有一张");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.SPIDER_COMPONENT</code>. 「spiderComponent」- 在主图格式上存在的插件信息，用于处理主图格式的内容
     */
    public final TableField<MModelRecord, String> SPIDER_COMPONENT = createField("SPIDER_COMPONENT", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「spiderComponent」- 在主图格式上存在的插件信息，用于处理主图格式的内容");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<MModelRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<MModelRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<MModelRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<MModelRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<MModelRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<MModelRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<MModelRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.M_MODEL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<MModelRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.M_MODEL</code> table reference
     */
    public MModel() {
        this(DSL.name("M_MODEL"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.M_MODEL</code> table reference
     */
    public MModel(String alias) {
        this(DSL.name(alias), M_MODEL);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.M_MODEL</code> table reference
     */
    public MModel(Name alias) {
        this(alias, M_MODEL);
    }

    private MModel(Name alias, Table<MModelRecord> aliased) {
        this(alias, aliased, null);
    }

    private MModel(Name alias, Table<MModelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MModelRecord> getRecordType() {
        return MModelRecord.class;
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
        return Arrays.<Index>asList(Indexes.M_MODEL_NAMESPACE, Indexes.M_MODEL_NAMESPACE_2, Indexes.M_MODEL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MModelRecord> getPrimaryKey() {
        return Keys.KEY_M_MODEL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MModelRecord>> getKeys() {
        return Arrays.<UniqueKey<MModelRecord>>asList(Keys.KEY_M_MODEL_PRIMARY, Keys.KEY_M_MODEL_NAMESPACE, Keys.KEY_M_MODEL_NAMESPACE_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModel as(String alias) {
        return new MModel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MModel as(Name alias) {
        return new MModel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MModel rename(String name) {
        return new MModel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MModel rename(Name name) {
        return new MModel(name, null);
    }
}
