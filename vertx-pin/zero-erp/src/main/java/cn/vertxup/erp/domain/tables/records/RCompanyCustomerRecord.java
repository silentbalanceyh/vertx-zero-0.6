/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.RCompanyCustomer;
import cn.vertxup.erp.domain.tables.interfaces.IRCompanyCustomer;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class RCompanyCustomerRecord extends UpdatableRecordImpl<RCompanyCustomerRecord> implements Record3<String, String, String>, IRCompanyCustomer {

    private static final long serialVersionUID = -128349621;

    /**
     * Create a detached RCompanyCustomerRecord
     */
    public RCompanyCustomerRecord() {
        super(RCompanyCustomer.R_COMPANY_CUSTOMER);
    }

    /**
     * Create a detached, initialised RCompanyCustomerRecord
     */
    public RCompanyCustomerRecord(String companyId, String customerId, String comment) {
        super(RCompanyCustomer.R_COMPANY_CUSTOMER);

        set(0, companyId);
        set(1, customerId);
        set(2, comment);
    }

    /**
     * Getter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.COMPANY_ID</code>. 「companyId」- 企业的ID
     */
    @Override
    public String getCompanyId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.COMPANY_ID</code>. 「companyId」- 企业的ID
     */
    @Override
    public RCompanyCustomerRecord setCompanyId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.CUSTOMER_ID</code>. 「customerId」- 客户信息的ID
     */
    @Override
    public String getCustomerId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.CUSTOMER_ID</code>. 「customerId」- 客户信息的ID
     */
    @Override
    public RCompanyCustomerRecord setCustomerId(String value) {
        set(1, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.COMMENT</code>. 「comment」- 关系备注
     */
    @Override
    public String getComment() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.R_COMPANY_CUSTOMER.COMMENT</code>. 「comment」- 关系备注
     */
    @Override
    public RCompanyCustomerRecord setComment(String value) {
        set(2, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RCompanyCustomer.R_COMPANY_CUSTOMER.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RCompanyCustomer.R_COMPANY_CUSTOMER.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RCompanyCustomer.R_COMPANY_CUSTOMER.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCompanyCustomerRecord value1(String value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCompanyCustomerRecord value2(String value) {
        setCustomerId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public RCompanyCustomerRecord value3(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RCompanyCustomerRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IRCompanyCustomer from) {
        setCompanyId(from.getCompanyId());
        setCustomerId(from.getCustomerId());
        setComment(from.getComment());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IRCompanyCustomer> E into(E into) {
        into.from(this);
        return into;
    }
}
