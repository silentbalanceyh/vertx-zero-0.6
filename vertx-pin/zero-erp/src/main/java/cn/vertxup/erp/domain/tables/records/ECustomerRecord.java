/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.ECustomer;
import cn.vertxup.erp.domain.tables.interfaces.IECustomer;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;


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
public class ECustomerRecord extends UpdatableRecordImpl<ECustomerRecord> implements IECustomer {

    private static final long serialVersionUID = 1059819432;

    /**
     * Create a detached ECustomerRecord
     */
    public ECustomerRecord() {
        super(ECustomer.E_CUSTOMER);
    }

    /**
     * Create a detached, initialised ECustomerRecord
     */
    public ECustomerRecord(String key, String comment, String name, String title, String code, String taxCode, String taxTitle, String contactName, String contactPhone, String contactEmail, String contactOnline, String email, String fax, String homepage, String logo, String phone, String address, Boolean runUp, String type, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(ECustomer.E_CUSTOMER);

        set(0, key);
        set(1, comment);
        set(2, name);
        set(3, title);
        set(4, code);
        set(5, taxCode);
        set(6, taxTitle);
        set(7, contactName);
        set(8, contactPhone);
        set(9, contactEmail);
        set(10, contactOnline);
        set(11, email);
        set(12, fax);
        set(13, homepage);
        set(14, logo);
        set(15, phone);
        set(16, address);
        set(17, runUp);
        set(18, type);
        set(19, metadata);
        set(20, active);
        set(21, sigma);
        set(22, language);
        set(23, createdAt);
        set(24, createdBy);
        set(25, updatedAt);
        set(26, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.KEY</code>. ???key???- ??????ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.KEY</code>. ???key???- ??????ID
     */
    @Override
    public ECustomerRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.COMMENT</code>. ???comment???- ????????????
     */
    @Override
    public String getComment() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.COMMENT</code>. ???comment???- ????????????
     */
    @Override
    public ECustomerRecord setComment(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.NAME</code>. ???name???- ????????????
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.NAME</code>. ???name???- ????????????
     */
    @Override
    public ECustomerRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.TITLE</code>. ???title???- ??????????????????
     */
    @Override
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.TITLE</code>. ???title???- ??????????????????
     */
    @Override
    public ECustomerRecord setTitle(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CODE</code>. ???code???- ????????????
     */
    @Override
    public String getCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CODE</code>. ???code???- ????????????
     */
    @Override
    public ECustomerRecord setCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.TAX_CODE</code>. ???taxCode???- ??????
     */
    @Override
    public String getTaxCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.TAX_CODE</code>. ???taxCode???- ??????
     */
    @Override
    public ECustomerRecord setTaxCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.TAX_TITLE</code>. ???taxTitle???- ????????????
     */
    @Override
    public String getTaxTitle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.TAX_TITLE</code>. ???taxTitle???- ????????????
     */
    @Override
    public ECustomerRecord setTaxTitle(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_NAME</code>. ???contactName???- ???????????????
     */
    @Override
    public String getContactName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_NAME</code>. ???contactName???- ???????????????
     */
    @Override
    public ECustomerRecord setContactName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_PHONE</code>. ???contactPhone???- ???????????????
     */
    @Override
    public String getContactPhone() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_PHONE</code>. ???contactPhone???- ???????????????
     */
    @Override
    public ECustomerRecord setContactPhone(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_EMAIL</code>. ???contactEmail???- ?????????Email
     */
    @Override
    public String getContactEmail() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_EMAIL</code>. ???contactEmail???- ?????????Email
     */
    @Override
    public ECustomerRecord setContactEmail(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_ONLINE</code>. ???contactOnline???- ??????????????????
     */
    @Override
    public String getContactOnline() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CONTACT_ONLINE</code>. ???contactOnline???- ??????????????????
     */
    @Override
    public ECustomerRecord setContactOnline(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.EMAIL</code>. ???email???- ????????????
     */
    @Override
    public String getEmail() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.EMAIL</code>. ???email???- ????????????
     */
    @Override
    public ECustomerRecord setEmail(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.FAX</code>. ???fax???- ?????????
     */
    @Override
    public String getFax() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.FAX</code>. ???fax???- ?????????
     */
    @Override
    public ECustomerRecord setFax(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.HOMEPAGE</code>. ???homepage???- ????????????
     */
    @Override
    public String getHomepage() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.HOMEPAGE</code>. ???homepage???- ????????????
     */
    @Override
    public ECustomerRecord setHomepage(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.LOGO</code>. ???logo???- ??????????????? attachment Key
     */
    @Override
    public String getLogo() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.LOGO</code>. ???logo???- ??????????????? attachment Key
     */
    @Override
    public ECustomerRecord setLogo(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.PHONE</code>. ???phone???- ????????????
     */
    @Override
    public String getPhone() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.PHONE</code>. ???phone???- ????????????
     */
    @Override
    public ECustomerRecord setPhone(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.ADDRESS</code>. ???address???- ????????????
     */
    @Override
    public String getAddress() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.ADDRESS</code>. ???address???- ????????????
     */
    @Override
    public ECustomerRecord setAddress(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.RUN_UP</code>. ???runUp???- ????????????
     */
    @Override
    public Boolean getRunUp() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.RUN_UP</code>. ???runUp???- ????????????
     */
    @Override
    public ECustomerRecord setRunUp(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.TYPE</code>. ???type???- ????????????????????????????????????????????????
     */
    @Override
    public String getType() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.TYPE</code>. ???type???- ????????????????????????????????????????????????
     */
    @Override
    public ECustomerRecord setType(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.METADATA</code>. ???metadata???- ????????????
     */
    @Override
    public String getMetadata() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.METADATA</code>. ???metadata???- ????????????
     */
    @Override
    public ECustomerRecord setMetadata(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.ACTIVE</code>. ???active???- ????????????
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.ACTIVE</code>. ???active???- ????????????
     */
    @Override
    public ECustomerRecord setActive(Boolean value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.SIGMA</code>. ???sigma???- ????????????????????????????????????
     */
    @Override
    public String getSigma() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.SIGMA</code>. ???sigma???- ????????????????????????????????????
     */
    @Override
    public ECustomerRecord setSigma(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.LANGUAGE</code>. ???language???- ???????????????
     */
    @Override
    public String getLanguage() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.LANGUAGE</code>. ???language???- ???????????????
     */
    @Override
    public ECustomerRecord setLanguage(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CREATED_AT</code>. ???createdAt???- ????????????
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CREATED_AT</code>. ???createdAt???- ????????????
     */
    @Override
    public ECustomerRecord setCreatedAt(LocalDateTime value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.CREATED_BY</code>. ???createdBy???- ?????????
     */
    @Override
    public String getCreatedBy() {
        return (String) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.CREATED_BY</code>. ???createdBy???- ?????????
     */
    @Override
    public ECustomerRecord setCreatedBy(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.UPDATED_AT</code>. ???updatedAt???- ????????????
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.UPDATED_AT</code>. ???updatedAt???- ????????????
     */
    @Override
    public ECustomerRecord setUpdatedAt(LocalDateTime value) {
        set(25, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.E_CUSTOMER.UPDATED_BY</code>. ???updatedBy???- ?????????
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(26);
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.E_CUSTOMER.UPDATED_BY</code>. ???updatedBy???- ?????????
     */
    @Override
    public ECustomerRecord setUpdatedBy(String value) {
        set(26, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IECustomer from) {
        setKey(from.getKey());
        setComment(from.getComment());
        setName(from.getName());
        setTitle(from.getTitle());
        setCode(from.getCode());
        setTaxCode(from.getTaxCode());
        setTaxTitle(from.getTaxTitle());
        setContactName(from.getContactName());
        setContactPhone(from.getContactPhone());
        setContactEmail(from.getContactEmail());
        setContactOnline(from.getContactOnline());
        setEmail(from.getEmail());
        setFax(from.getFax());
        setHomepage(from.getHomepage());
        setLogo(from.getLogo());
        setPhone(from.getPhone());
        setAddress(from.getAddress());
        setRunUp(from.getRunUp());
        setType(from.getType());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IECustomer> E into(E into) {
        into.from(this);
        return into;
    }
}
