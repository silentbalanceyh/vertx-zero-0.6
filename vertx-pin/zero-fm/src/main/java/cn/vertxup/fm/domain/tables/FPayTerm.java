/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Db;
import cn.vertxup.fm.domain.Indexes;
import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.tables.records.FPayTermRecord;
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
public class FPayTerm extends TableImpl<FPayTermRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.F_PAY_TERM</code>
     */
    public static final FPayTerm F_PAY_TERM = new FPayTerm();
    private static final long serialVersionUID = -1384967986;
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.KEY</code>. 「key」- 账单项
     */
    public final TableField<FPayTermRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 账单项");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.NAME</code>. 「name」- 账单项名称
     */
    public final TableField<FPayTermRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "「name」- 账单项名称");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.CODE</code>. 「code」- 账单项编号
     */
    public final TableField<FPayTermRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "「code」- 账单项编号");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.TYPE</code>. 「type」- 账单项类型：付款类/消费类
     */
    public final TableField<FPayTermRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「type」- 账单项类型：付款类/消费类");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.CATEGORY</code>. 「category」- 账单项类别
     */
    public final TableField<FPayTermRecord, String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「category」- 账单项类别");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.HELP_CODE</code>. 「helpCode」- 助记码
     */
    public final TableField<FPayTermRecord, String> HELP_CODE = createField("HELP_CODE", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「helpCode」- 助记码");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.LEAF</code>. 「leaf」- 是否明细
     */
    public final TableField<FPayTermRecord, Boolean> LEAF = createField("LEAF", org.jooq.impl.SQLDataType.BIT, this, "「leaf」- 是否明细");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.COMMENT</code>. 「comment」 - 账单项备注
     */
    public final TableField<FPayTermRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「comment」 - 账单项备注");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.PARENT_ID</code>. 「parentId」- 父账单项
     */
    public final TableField<FPayTermRecord, String> PARENT_ID = createField("PARENT_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「parentId」- 父账单项");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.SUBJECT_ID</code>. 「subjectId」- 会计科目关联ID
     */
    public final TableField<FPayTermRecord, String> SUBJECT_ID = createField("SUBJECT_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「subjectId」- 会计科目关联ID");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.LOCKED</code>. 「locked」- 是否锁定
     */
    public final TableField<FPayTermRecord, Boolean> LOCKED = createField("LOCKED", org.jooq.impl.SQLDataType.BIT, this, "「locked」- 是否锁定");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FPayTermRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FPayTermRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FPayTermRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FPayTermRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FPayTermRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FPayTermRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FPayTermRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.F_PAY_TERM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FPayTermRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.F_PAY_TERM</code> table reference
     */
    public FPayTerm() {
        this(DSL.name("F_PAY_TERM"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_PAY_TERM</code> table reference
     */
    public FPayTerm(String alias) {
        this(DSL.name(alias), F_PAY_TERM);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_PAY_TERM</code> table reference
     */
    public FPayTerm(Name alias) {
        this(alias, F_PAY_TERM);
    }

    private FPayTerm(Name alias, Table<FPayTermRecord> aliased) {
        this(alias, aliased, null);
    }

    private FPayTerm(Name alias, Table<FPayTermRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FPayTermRecord> getRecordType() {
        return FPayTermRecord.class;
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
        return Arrays.<Index>asList(Indexes.F_PAY_TERM_CODE, Indexes.F_PAY_TERM_NAME, Indexes.F_PAY_TERM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FPayTermRecord> getPrimaryKey() {
        return Keys.KEY_F_PAY_TERM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FPayTermRecord>> getKeys() {
        return Arrays.<UniqueKey<FPayTermRecord>>asList(Keys.KEY_F_PAY_TERM_PRIMARY, Keys.KEY_F_PAY_TERM_NAME, Keys.KEY_F_PAY_TERM_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FPayTerm as(String alias) {
        return new FPayTerm(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FPayTerm as(Name alias) {
        return new FPayTerm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FPayTerm rename(String name) {
        return new FPayTerm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FPayTerm rename(Name name) {
        return new FPayTerm(name, null);
    }
}
