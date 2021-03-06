/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Db;
import cn.vertxup.fm.domain.Indexes;
import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.tables.records.FBillRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
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
public class FBill extends TableImpl<FBillRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.F_BILL</code>
     */
    public static final FBill F_BILL = new FBill();
    private static final long serialVersionUID = 678160224;
    /**
     * The column <code>DB_ETERNAL.F_BILL.KEY</code>. 「key」- 账单主键
     */
    public final TableField<FBillRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 账单主键");
    /**
     * The column <code>DB_ETERNAL.F_BILL.NAME</code>. 「name」- 账单标题
     */
    public final TableField<FBillRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 账单标题");
    /**
     * The column <code>DB_ETERNAL.F_BILL.CODE</code>. 「code」- 账单系统编号
     */
    public final TableField<FBillRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "「code」- 账单系统编号");
    /**
     * The column <code>DB_ETERNAL.F_BILL.SERIAL</code>. 「serial」- 账单流水线号
     */
    public final TableField<FBillRecord, String> SERIAL = createField("SERIAL", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "「serial」- 账单流水线号");
    /**
     * The column <code>DB_ETERNAL.F_BILL.TYPE</code>. 「type」- 账单类型
     */
    public final TableField<FBillRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「type」- 账单类型");
    /**
     * The column <code>DB_ETERNAL.F_BILL.CATEGORY</code>. 「category」- 账单类别
     */
    public final TableField<FBillRecord, String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「category」- 账单类别");
    /**
     * The column <code>DB_ETERNAL.F_BILL.AMOUNT</code>. 「amount」- 账单金额
     */
    public final TableField<FBillRecord, BigDecimal> AMOUNT = createField("AMOUNT", org.jooq.impl.SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amount」- 账单金额");
    /**
     * The column <code>DB_ETERNAL.F_BILL.COMMENT</code>. 「comment」 - 账单备注
     */
    public final TableField<FBillRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「comment」 - 账单备注");
    /**
     * The column <code>DB_ETERNAL.F_BILL.MODEL_ID</code>. 「modelId」- 关联的模型identifier，用于描述
     */
    public final TableField<FBillRecord, String> MODEL_ID = createField("MODEL_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.F_BILL.MODEL_KEY</code>. 「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<FBillRecord, String> MODEL_KEY = createField("MODEL_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.F_BILL.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    public final TableField<FBillRecord, String> ORDER_ID = createField("ORDER_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「orderId」- 订单对应的订单ID");
    /**
     * The column <code>DB_ETERNAL.F_BILL.BOOK_ID</code>. 「bookId」- 关联账本ID
     */
    public final TableField<FBillRecord, String> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「bookId」- 关联账本ID");
    /**
     * The column <code>DB_ETERNAL.F_BILL.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FBillRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.F_BILL.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FBillRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.F_BILL.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FBillRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.F_BILL.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FBillRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.F_BILL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FBillRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.F_BILL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FBillRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.F_BILL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FBillRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.F_BILL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FBillRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.F_BILL</code> table reference
     */
    public FBill() {
        this(DSL.name("F_BILL"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_BILL</code> table reference
     */
    public FBill(String alias) {
        this(DSL.name(alias), F_BILL);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_BILL</code> table reference
     */
    public FBill(Name alias) {
        this(alias, F_BILL);
    }

    private FBill(Name alias, Table<FBillRecord> aliased) {
        this(alias, aliased, null);
    }

    private FBill(Name alias, Table<FBillRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FBillRecord> getRecordType() {
        return FBillRecord.class;
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
        return Arrays.<Index>asList(Indexes.F_BILL_CODE, Indexes.F_BILL_PRIMARY, Indexes.F_BILL_SERIAL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FBillRecord> getPrimaryKey() {
        return Keys.KEY_F_BILL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FBillRecord>> getKeys() {
        return Arrays.<UniqueKey<FBillRecord>>asList(Keys.KEY_F_BILL_PRIMARY, Keys.KEY_F_BILL_CODE, Keys.KEY_F_BILL_SERIAL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FBill as(String alias) {
        return new FBill(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FBill as(Name alias) {
        return new FBill(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FBill rename(String name) {
        return new FBill(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FBill rename(Name name) {
        return new FBill(name, null);
    }
}
