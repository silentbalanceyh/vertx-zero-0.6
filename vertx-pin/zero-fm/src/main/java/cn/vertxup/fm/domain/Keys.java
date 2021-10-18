/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.fm.domain;


import cn.vertxup.fm.domain.tables.FBill;
import cn.vertxup.fm.domain.tables.FBillItem;
import cn.vertxup.fm.domain.tables.FBook;
import cn.vertxup.fm.domain.tables.FInvoice;
import cn.vertxup.fm.domain.tables.FPayTerm;
import cn.vertxup.fm.domain.tables.FPreAuthorize;
import cn.vertxup.fm.domain.tables.FReceivable;
import cn.vertxup.fm.domain.tables.FSettlement;
import cn.vertxup.fm.domain.tables.FSettlementItem;
import cn.vertxup.fm.domain.tables.FSubject;
import cn.vertxup.fm.domain.tables.records.FBillItemRecord;
import cn.vertxup.fm.domain.tables.records.FBillRecord;
import cn.vertxup.fm.domain.tables.records.FBookRecord;
import cn.vertxup.fm.domain.tables.records.FInvoiceRecord;
import cn.vertxup.fm.domain.tables.records.FPayTermRecord;
import cn.vertxup.fm.domain.tables.records.FPreAuthorizeRecord;
import cn.vertxup.fm.domain.tables.records.FReceivableRecord;
import cn.vertxup.fm.domain.tables.records.FSettlementItemRecord;
import cn.vertxup.fm.domain.tables.records.FSettlementRecord;
import cn.vertxup.fm.domain.tables.records.FSubjectRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>DB_ETERNAL</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FBillRecord> KEY_F_BILL_PRIMARY = UniqueKeys0.KEY_F_BILL_PRIMARY;
    public static final UniqueKey<FBillRecord> KEY_F_BILL_CODE = UniqueKeys0.KEY_F_BILL_CODE;
    public static final UniqueKey<FBillRecord> KEY_F_BILL_SERIAL = UniqueKeys0.KEY_F_BILL_SERIAL;
    public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_PRIMARY = UniqueKeys0.KEY_F_BILL_ITEM_PRIMARY;
    public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_CODE = UniqueKeys0.KEY_F_BILL_ITEM_CODE;
    public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_SERIAL = UniqueKeys0.KEY_F_BILL_ITEM_SERIAL;
    public static final UniqueKey<FBookRecord> KEY_F_BOOK_PRIMARY = UniqueKeys0.KEY_F_BOOK_PRIMARY;
    public static final UniqueKey<FBookRecord> KEY_F_BOOK_CODE = UniqueKeys0.KEY_F_BOOK_CODE;
    public static final UniqueKey<FBookRecord> KEY_F_BOOK_SERIAL = UniqueKeys0.KEY_F_BOOK_SERIAL;
    public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_PRIMARY = UniqueKeys0.KEY_F_INVOICE_PRIMARY;
    public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_CODE = UniqueKeys0.KEY_F_INVOICE_CODE;
    public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_INVOICE_NUMBER = UniqueKeys0.KEY_F_INVOICE_INVOICE_NUMBER;
    public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_INVOICE_SERIAL = UniqueKeys0.KEY_F_INVOICE_INVOICE_SERIAL;
    public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_PRIMARY = UniqueKeys0.KEY_F_PAY_TERM_PRIMARY;
    public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_NAME = UniqueKeys0.KEY_F_PAY_TERM_NAME;
    public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_CODE = UniqueKeys0.KEY_F_PAY_TERM_CODE;
    public static final UniqueKey<FPreAuthorizeRecord> KEY_F_PRE_AUTHORIZE_CODE = UniqueKeys0.KEY_F_PRE_AUTHORIZE_CODE;
    public static final UniqueKey<FPreAuthorizeRecord> KEY_F_PRE_AUTHORIZE_SERIAL = UniqueKeys0.KEY_F_PRE_AUTHORIZE_SERIAL;
    public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_PRIMARY = UniqueKeys0.KEY_F_RECEIVABLE_PRIMARY;
    public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_CODE = UniqueKeys0.KEY_F_RECEIVABLE_CODE;
    public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_SERIAL = UniqueKeys0.KEY_F_RECEIVABLE_SERIAL;
    public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_PRIMARY = UniqueKeys0.KEY_F_SETTLEMENT_PRIMARY;
    public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_CODE = UniqueKeys0.KEY_F_SETTLEMENT_CODE;
    public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_SERIAL = UniqueKeys0.KEY_F_SETTLEMENT_SERIAL;
    public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_PRIMARY = UniqueKeys0.KEY_F_SETTLEMENT_ITEM_PRIMARY;
    public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_CODE = UniqueKeys0.KEY_F_SETTLEMENT_ITEM_CODE;
    public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_SERIAL = UniqueKeys0.KEY_F_SETTLEMENT_ITEM_SERIAL;
    public static final UniqueKey<FSubjectRecord> KEY_F_SUBJECT_PRIMARY = UniqueKeys0.KEY_F_SUBJECT_PRIMARY;
    public static final UniqueKey<FSubjectRecord> KEY_F_SUBJECT_CODE = UniqueKeys0.KEY_F_SUBJECT_CODE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<FBillRecord> KEY_F_BILL_PRIMARY = Internal.createUniqueKey(FBill.F_BILL, "KEY_F_BILL_PRIMARY", FBill.F_BILL.KEY);
        public static final UniqueKey<FBillRecord> KEY_F_BILL_CODE = Internal.createUniqueKey(FBill.F_BILL, "KEY_F_BILL_CODE", FBill.F_BILL.CODE, FBill.F_BILL.ORDER_ID, FBill.F_BILL.SIGMA);
        public static final UniqueKey<FBillRecord> KEY_F_BILL_SERIAL = Internal.createUniqueKey(FBill.F_BILL, "KEY_F_BILL_SERIAL", FBill.F_BILL.SERIAL, FBill.F_BILL.ORDER_ID, FBill.F_BILL.SIGMA);
        public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_PRIMARY = Internal.createUniqueKey(FBillItem.F_BILL_ITEM, "KEY_F_BILL_ITEM_PRIMARY", FBillItem.F_BILL_ITEM.KEY);
        public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_CODE = Internal.createUniqueKey(FBillItem.F_BILL_ITEM, "KEY_F_BILL_ITEM_CODE", FBillItem.F_BILL_ITEM.CODE, FBillItem.F_BILL_ITEM.BILL_ID, FBillItem.F_BILL_ITEM.SIGMA);
        public static final UniqueKey<FBillItemRecord> KEY_F_BILL_ITEM_SERIAL = Internal.createUniqueKey(FBillItem.F_BILL_ITEM, "KEY_F_BILL_ITEM_SERIAL", FBillItem.F_BILL_ITEM.SERIAL, FBillItem.F_BILL_ITEM.BILL_ID, FBillItem.F_BILL_ITEM.SIGMA);
        public static final UniqueKey<FBookRecord> KEY_F_BOOK_PRIMARY = Internal.createUniqueKey(FBook.F_BOOK, "KEY_F_BOOK_PRIMARY", FBook.F_BOOK.KEY);
        public static final UniqueKey<FBookRecord> KEY_F_BOOK_CODE = Internal.createUniqueKey(FBook.F_BOOK, "KEY_F_BOOK_CODE", FBook.F_BOOK.CODE, FBook.F_BOOK.ORDER_ID, FBook.F_BOOK.SIGMA);
        public static final UniqueKey<FBookRecord> KEY_F_BOOK_SERIAL = Internal.createUniqueKey(FBook.F_BOOK, "KEY_F_BOOK_SERIAL", FBook.F_BOOK.SERIAL, FBook.F_BOOK.ORDER_ID, FBook.F_BOOK.SIGMA);
        public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_PRIMARY = Internal.createUniqueKey(FInvoice.F_INVOICE, "KEY_F_INVOICE_PRIMARY", FInvoice.F_INVOICE.KEY);
        public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_CODE = Internal.createUniqueKey(FInvoice.F_INVOICE, "KEY_F_INVOICE_CODE", FInvoice.F_INVOICE.CODE, FInvoice.F_INVOICE.SIGMA);
        public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_INVOICE_NUMBER = Internal.createUniqueKey(FInvoice.F_INVOICE, "KEY_F_INVOICE_INVOICE_NUMBER", FInvoice.F_INVOICE.INVOICE_NUMBER, FInvoice.F_INVOICE.SIGMA);
        public static final UniqueKey<FInvoiceRecord> KEY_F_INVOICE_INVOICE_SERIAL = Internal.createUniqueKey(FInvoice.F_INVOICE, "KEY_F_INVOICE_INVOICE_SERIAL", FInvoice.F_INVOICE.INVOICE_SERIAL, FInvoice.F_INVOICE.SIGMA);
        public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_PRIMARY = Internal.createUniqueKey(FPayTerm.F_PAY_TERM, "KEY_F_PAY_TERM_PRIMARY", FPayTerm.F_PAY_TERM.KEY);
        public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_NAME = Internal.createUniqueKey(FPayTerm.F_PAY_TERM, "KEY_F_PAY_TERM_NAME", FPayTerm.F_PAY_TERM.NAME, FPayTerm.F_PAY_TERM.SIGMA);
        public static final UniqueKey<FPayTermRecord> KEY_F_PAY_TERM_CODE = Internal.createUniqueKey(FPayTerm.F_PAY_TERM, "KEY_F_PAY_TERM_CODE", FPayTerm.F_PAY_TERM.CODE, FPayTerm.F_PAY_TERM.SIGMA);
        public static final UniqueKey<FPreAuthorizeRecord> KEY_F_PRE_AUTHORIZE_CODE = Internal.createUniqueKey(FPreAuthorize.F_PRE_AUTHORIZE, "KEY_F_PRE_AUTHORIZE_CODE", FPreAuthorize.F_PRE_AUTHORIZE.CODE, FPreAuthorize.F_PRE_AUTHORIZE.BILL_ID, FPreAuthorize.F_PRE_AUTHORIZE.SIGMA);
        public static final UniqueKey<FPreAuthorizeRecord> KEY_F_PRE_AUTHORIZE_SERIAL = Internal.createUniqueKey(FPreAuthorize.F_PRE_AUTHORIZE, "KEY_F_PRE_AUTHORIZE_SERIAL", FPreAuthorize.F_PRE_AUTHORIZE.SERIAL, FPreAuthorize.F_PRE_AUTHORIZE.BILL_ID, FPreAuthorize.F_PRE_AUTHORIZE.SIGMA);
        public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_PRIMARY = Internal.createUniqueKey(FReceivable.F_RECEIVABLE, "KEY_F_RECEIVABLE_PRIMARY", FReceivable.F_RECEIVABLE.KEY);
        public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_CODE = Internal.createUniqueKey(FReceivable.F_RECEIVABLE, "KEY_F_RECEIVABLE_CODE", FReceivable.F_RECEIVABLE.CODE, FReceivable.F_RECEIVABLE.SIGMA);
        public static final UniqueKey<FReceivableRecord> KEY_F_RECEIVABLE_SERIAL = Internal.createUniqueKey(FReceivable.F_RECEIVABLE, "KEY_F_RECEIVABLE_SERIAL", FReceivable.F_RECEIVABLE.SERIAL, FReceivable.F_RECEIVABLE.SIGMA);
        public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_PRIMARY = Internal.createUniqueKey(FSettlement.F_SETTLEMENT, "KEY_F_SETTLEMENT_PRIMARY", FSettlement.F_SETTLEMENT.KEY);
        public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_CODE = Internal.createUniqueKey(FSettlement.F_SETTLEMENT, "KEY_F_SETTLEMENT_CODE", FSettlement.F_SETTLEMENT.CODE, FSettlement.F_SETTLEMENT.ORDER_ID, FSettlement.F_SETTLEMENT.SIGMA);
        public static final UniqueKey<FSettlementRecord> KEY_F_SETTLEMENT_SERIAL = Internal.createUniqueKey(FSettlement.F_SETTLEMENT, "KEY_F_SETTLEMENT_SERIAL", FSettlement.F_SETTLEMENT.SERIAL, FSettlement.F_SETTLEMENT.ORDER_ID, FSettlement.F_SETTLEMENT.SIGMA);
        public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_PRIMARY = Internal.createUniqueKey(FSettlementItem.F_SETTLEMENT_ITEM, "KEY_F_SETTLEMENT_ITEM_PRIMARY", FSettlementItem.F_SETTLEMENT_ITEM.KEY);
        public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_CODE = Internal.createUniqueKey(FSettlementItem.F_SETTLEMENT_ITEM, "KEY_F_SETTLEMENT_ITEM_CODE", FSettlementItem.F_SETTLEMENT_ITEM.CODE, FSettlementItem.F_SETTLEMENT_ITEM.SETTLEMENT_ID, FSettlementItem.F_SETTLEMENT_ITEM.SIGMA);
        public static final UniqueKey<FSettlementItemRecord> KEY_F_SETTLEMENT_ITEM_SERIAL = Internal.createUniqueKey(FSettlementItem.F_SETTLEMENT_ITEM, "KEY_F_SETTLEMENT_ITEM_SERIAL", FSettlementItem.F_SETTLEMENT_ITEM.SERIAL, FSettlementItem.F_SETTLEMENT_ITEM.SETTLEMENT_ID, FSettlementItem.F_SETTLEMENT_ITEM.SIGMA);
        public static final UniqueKey<FSubjectRecord> KEY_F_SUBJECT_PRIMARY = Internal.createUniqueKey(FSubject.F_SUBJECT, "KEY_F_SUBJECT_PRIMARY", FSubject.F_SUBJECT.KEY);
        public static final UniqueKey<FSubjectRecord> KEY_F_SUBJECT_CODE = Internal.createUniqueKey(FSubject.F_SUBJECT, "KEY_F_SUBJECT_CODE", FSubject.F_SUBJECT.CODE, FSubject.F_SUBJECT.SIGMA);
    }
}
