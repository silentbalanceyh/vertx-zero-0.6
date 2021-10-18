/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Db;
import cn.vertxup.fm.domain.Indexes;
import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.tables.records.FBillItemRecord;
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
public class FBillItem extends TableImpl<FBillItemRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.F_BILL_ITEM</code>
     */
    public static final FBillItem F_BILL_ITEM = new FBillItem();
    private static final long serialVersionUID = -91571836;
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.KEY</code>. 「key」- 账单明细主键
     */
    public final TableField<FBillItemRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 账单明细主键");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.NAME</code>. 「name」 -  明细名称
     */
    public final TableField<FBillItemRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "「name」 -  明细名称");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.CODE</code>. 「code」 - 明细系统代码
     */
    public final TableField<FBillItemRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "「code」 - 明细系统代码");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.SERIAL</code>. 「serial」 - 明细编号
     */
    public final TableField<FBillItemRecord, String> SERIAL = createField("SERIAL", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "「serial」 - 明细编号");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.TYPE</code>. 「type」- 明细类型
     */
    public final TableField<FBillItemRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「type」- 明细类型");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.STATUS</code>. 「status」- 明细状态
     */
    public final TableField<FBillItemRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「status」- 明细状态");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT</code>. 「amount」——价税合计，实际付款结果
     */
    public final TableField<FBillItemRecord, BigDecimal> AMOUNT = createField("AMOUNT", org.jooq.impl.SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amount」——价税合计，实际付款结果");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.COMMENT</code>. 「comment」 - 明细备注
     */
    public final TableField<FBillItemRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「comment」 - 明细备注");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.MANUAL_NO</code>. 「manualNo」 - 手工单号（线下单号专用）
     */
    public final TableField<FBillItemRecord, String> MANUAL_NO = createField("MANUAL_NO", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「manualNo」 - 手工单号（线下单号专用）");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.PRICE</code>. 「price」- 商品单价
     */
    public final TableField<FBillItemRecord, BigDecimal> PRICE = createField("PRICE", org.jooq.impl.SQLDataType.DECIMAL(18, 2).nullable(false), this, "「price」- 商品单价");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.QUANTITY</code>. 「quantity」- 商品数量
     */
    public final TableField<FBillItemRecord, Integer> QUANTITY = createField("QUANTITY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "「quantity」- 商品数量");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.AMOUNT_TOTAL</code>. 「amountTotal」——总价，理论计算结果
     */
    public final TableField<FBillItemRecord, BigDecimal> AMOUNT_TOTAL = createField("AMOUNT_TOTAL", org.jooq.impl.SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amountTotal」——总价，理论计算结果");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.DELAY</code>. 「delay」——是否S账
     */
    public final TableField<FBillItemRecord, Boolean> DELAY = createField("DELAY", org.jooq.impl.SQLDataType.BIT, this, "「delay」——是否S账");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.DELAY_AT</code>. 「delayAt」——S账的最终期限
     */
    public final TableField<FBillItemRecord, LocalDateTime> DELAY_AT = createField("DELAY_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「delayAt」——S账的最终期限");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.OP_BY</code>. 「opBy」- 操作人员，关联员工ID
     */
    public final TableField<FBillItemRecord, String> OP_BY = createField("OP_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「opBy」- 操作人员，关联员工ID");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.OP_NUMBER</code>. 「opNumber」- 操作人员工号
     */
    public final TableField<FBillItemRecord, String> OP_NUMBER = createField("OP_NUMBER", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「opNumber」- 操作人员工号");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.OP_SHIFT</code>. 「opShift」- 操作班次（对接排班系统）
     */
    public final TableField<FBillItemRecord, String> OP_SHIFT = createField("OP_SHIFT", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「opShift」- 操作班次（对接排班系统）");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.OP_AT</code>. 「opAt」- 操作时间
     */
    public final TableField<FBillItemRecord, LocalDateTime> OP_AT = createField("OP_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「opAt」- 操作时间");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.OP_TRANSFER</code>. 「opTransfer」- 流转信息描述填写
     */
    public final TableField<FBillItemRecord, String> OP_TRANSFER = createField("OP_TRANSFER", org.jooq.impl.SQLDataType.CLOB, this, "「opTransfer」- 流转信息描述填写");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.RELATED_ID</code>. 「relatedId」- 关联ID（保留，原系统存在）
     */
    public final TableField<FBillItemRecord, String> RELATED_ID = createField("RELATED_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「relatedId」- 关联ID（保留，原系统存在）");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.SETTLEMENT_ID</code>. 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    public final TableField<FBillItemRecord, String> SETTLEMENT_ID = createField("SETTLEMENT_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「settlementId」- 结算单ID，该字段有值标识已经结算");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.BILL_ID</code>. 「billId」- 所属账单ID
     */
    public final TableField<FBillItemRecord, String> BILL_ID = createField("BILL_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「billId」- 所属账单ID");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.SUBJECT_ID</code>. 「subjectId」- 会计科目ID，依赖账单项选择结果
     */
    public final TableField<FBillItemRecord, String> SUBJECT_ID = createField("SUBJECT_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「subjectId」- 会计科目ID，依赖账单项选择结果");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.PAY_TERM_ID</code>. 「payTermId」- 账单项ID
     */
    public final TableField<FBillItemRecord, String> PAY_TERM_ID = createField("PAY_TERM_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「payTermId」- 账单项ID");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FBillItemRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FBillItemRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FBillItemRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FBillItemRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FBillItemRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FBillItemRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FBillItemRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.F_BILL_ITEM.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FBillItemRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.F_BILL_ITEM</code> table reference
     */
    public FBillItem() {
        this(DSL.name("F_BILL_ITEM"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_BILL_ITEM</code> table reference
     */
    public FBillItem(String alias) {
        this(DSL.name(alias), F_BILL_ITEM);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_BILL_ITEM</code> table reference
     */
    public FBillItem(Name alias) {
        this(alias, F_BILL_ITEM);
    }

    private FBillItem(Name alias, Table<FBillItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private FBillItem(Name alias, Table<FBillItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FBillItemRecord> getRecordType() {
        return FBillItemRecord.class;
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
        return Arrays.<Index>asList(Indexes.F_BILL_ITEM_CODE, Indexes.F_BILL_ITEM_PRIMARY, Indexes.F_BILL_ITEM_SERIAL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FBillItemRecord> getPrimaryKey() {
        return Keys.KEY_F_BILL_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FBillItemRecord>> getKeys() {
        return Arrays.<UniqueKey<FBillItemRecord>>asList(Keys.KEY_F_BILL_ITEM_PRIMARY, Keys.KEY_F_BILL_ITEM_CODE, Keys.KEY_F_BILL_ITEM_SERIAL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FBillItem as(String alias) {
        return new FBillItem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FBillItem as(Name alias) {
        return new FBillItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FBillItem rename(String name) {
        return new FBillItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FBillItem rename(Name name) {
        return new FBillItem(name, null);
    }
}
