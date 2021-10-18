/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Db;
import cn.vertxup.ambient.domain.Indexes;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.tables.records.XTodoRecord;
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
public class XTodo extends TableImpl<XTodoRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.X_TODO</code>
     */
    public static final XTodo X_TODO = new XTodo();
    private static final long serialVersionUID = -2101134055;
    /**
     * The column <code>DB_ETERNAL.X_TODO.KEY</code>. 「key」- 待办主键
     */
    public final TableField<XTodoRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 待办主键");
    /**
     * The column <code>DB_ETERNAL.X_TODO.SERIAL</code>. 「serial」- 待办编号，使用 X_NUMBER 生成
     */
    public final TableField<XTodoRecord, String> SERIAL = createField("SERIAL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「serial」- 待办编号，使用 X_NUMBER 生成");
    /**
     * The column <code>DB_ETERNAL.X_TODO.NAME</code>. 「name」- 待办名称（标题）
     */
    public final TableField<XTodoRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 待办名称（标题）");
    /**
     * The column <code>DB_ETERNAL.X_TODO.CODE</code>. 「code」- 待办系统码
     */
    public final TableField<XTodoRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「code」- 待办系统码");
    /**
     * The column <code>DB_ETERNAL.X_TODO.ICON</code>. 「icon」- 待办显示的图标
     */
    public final TableField<XTodoRecord, String> ICON = createField("ICON", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「icon」- 待办显示的图标");
    /**
     * The column <code>DB_ETERNAL.X_TODO.STATUS</code>. 「status」- 待办状态
     */
    public final TableField<XTodoRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「status」- 待办状态");
    /**
     * The column <code>DB_ETERNAL.X_TODO.TODO_URL</code>. 「todoUrl」- 待办路径
     */
    public final TableField<XTodoRecord, String> TODO_URL = createField("TODO_URL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「todoUrl」- 待办路径");
    /**
     * The column <code>DB_ETERNAL.X_TODO.TYPE</code>. 「type」- 待办类型
     */
    public final TableField<XTodoRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「type」- 待办类型");
    /**
     * The column <code>DB_ETERNAL.X_TODO.EXPIRED_AT</code>. 「expiredAt」- 超时时间
     */
    public final TableField<XTodoRecord, LocalDateTime> EXPIRED_AT = createField("EXPIRED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「expiredAt」- 超时时间");
    /**
     * The column <code>DB_ETERNAL.X_TODO.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    public final TableField<XTodoRecord, String> MODEL_ID = createField("MODEL_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.X_TODO.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<XTodoRecord, String> MODEL_KEY = createField("MODEL_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.X_TODO.MODEL_CATEGORY</code>. 「modelCategory」- 关联的category记录，只包含叶节点
     */
    public final TableField<XTodoRecord, String> MODEL_CATEGORY = createField("MODEL_CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelCategory」- 关联的category记录，只包含叶节点");
    /**
     * The column <code>DB_ETERNAL.X_TODO.TO_GROUP</code>. 「toGroup」- 待办指定组
     */
    public final TableField<XTodoRecord, String> TO_GROUP = createField("TO_GROUP", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「toGroup」- 待办指定组");
    /**
     * The column <code>DB_ETERNAL.X_TODO.TO_USER</code>. 「toUser」- 待办指定人
     */
    public final TableField<XTodoRecord, String> TO_USER = createField("TO_USER", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「toUser」- 待办指定人");
    /**
     * The column <code>DB_ETERNAL.X_TODO.TO_ROLE</code>. 「toRole」- 待办角色（集体）
     */
    public final TableField<XTodoRecord, String> TO_ROLE = createField("TO_ROLE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「toRole」- 待办角色（集体）");
    /**
     * The column <code>DB_ETERNAL.X_TODO.ASSIGNED_BY</code>. 「assignedBy」- 待办指派人
     */
    public final TableField<XTodoRecord, String> ASSIGNED_BY = createField("ASSIGNED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「assignedBy」- 待办指派人");
    /**
     * The column <code>DB_ETERNAL.X_TODO.ACCEPTED_BY</code>. 「acceptedBy」- 待办接收人
     */
    public final TableField<XTodoRecord, String> ACCEPTED_BY = createField("ACCEPTED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「acceptedBy」- 待办接收人");
    /**
     * The column <code>DB_ETERNAL.X_TODO.FINISHED_BY</code>. 「finishedBy」- 待办完成人
     */
    public final TableField<XTodoRecord, String> FINISHED_BY = createField("FINISHED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「finishedBy」- 待办完成人");
    /**
     * The column <code>DB_ETERNAL.X_TODO.TRACE_ID</code>. 「traceId」- 同一个流程的待办执行分组
     */
    public final TableField<XTodoRecord, String> TRACE_ID = createField("TRACE_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「traceId」- 同一个流程的待办执行分组");
    /**
     * The column <code>DB_ETERNAL.X_TODO.PARENT_ID</code>. 「parentId」- 待办支持父子集结构，父待办执行时候子待办同样执行
     */
    public final TableField<XTodoRecord, String> PARENT_ID = createField("PARENT_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「parentId」- 待办支持父子集结构，父待办执行时候子待办同样执行");
    /**
     * The column <code>DB_ETERNAL.X_TODO.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XTodoRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.X_TODO.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XTodoRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.X_TODO.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XTodoRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.X_TODO.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XTodoRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.X_TODO.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XTodoRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.X_TODO.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XTodoRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.X_TODO.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XTodoRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.X_TODO.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XTodoRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.X_TODO</code> table reference
     */
    public XTodo() {
        this(DSL.name("X_TODO"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_TODO</code> table reference
     */
    public XTodo(String alias) {
        this(DSL.name(alias), X_TODO);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_TODO</code> table reference
     */
    public XTodo(Name alias) {
        this(alias, X_TODO);
    }

    private XTodo(Name alias, Table<XTodoRecord> aliased) {
        this(alias, aliased, null);
    }

    private XTodo(Name alias, Table<XTodoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XTodoRecord> getRecordType() {
        return XTodoRecord.class;
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
        return Arrays.<Index>asList(Indexes.X_TODO_IDXM_X_TODO_SIGMA_STATUS, Indexes.X_TODO_IDXM_X_TODO_SIGMA_TYPE_STATUS, Indexes.X_TODO_PRIMARY, Indexes.X_TODO_SIGMA, Indexes.X_TODO_SIGMA_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XTodoRecord> getPrimaryKey() {
        return Keys.KEY_X_TODO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XTodoRecord>> getKeys() {
        return Arrays.<UniqueKey<XTodoRecord>>asList(Keys.KEY_X_TODO_PRIMARY, Keys.KEY_X_TODO_SIGMA_2, Keys.KEY_X_TODO_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XTodo as(String alias) {
        return new XTodo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XTodo as(Name alias) {
        return new XTodo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XTodo rename(String name) {
        return new XTodo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XTodo rename(Name name) {
        return new XTodo(name, null);
    }
}
