/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.EIdentity;
import cn.vertxup.erp.domain.tables.interfaces.IEIdentity;
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
public class EIdentityRecord extends UpdatableRecordImpl<EIdentityRecord> implements IEIdentity {

    private static final long serialVersionUID = 1244236681;

    /**
     * Create a detached EIdentityRecord
     */
    public EIdentityRecord() {
        super(EIdentity.E_IDENTITY);
    }

    /**
     * Create a detached, initialised EIdentityRecord
     */
    public EIdentityRecord(String key, String code, String type, String status, String country, String nativePlace, String nation, String address, String realname, LocalDateTime birthday, String driverLicense, String carPlate, String passport, Boolean gender, String marital, String contactMobile, String contactPhone, String contactAddress, String contactEmail, String urgentName, String urgentPhone, String ecQq, String ecAlipay, String ecWechat, String idcType, String idcNumber, String idcAddress, LocalDateTime idcExpiredAt, String idcFront, String idcBack, String idcIssuer, LocalDateTime idcIssueAt, Boolean verified, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(EIdentity.E_IDENTITY);

        set(0, key);
        set(1, code);
        set(2, type);
        set(3, status);
        set(4, country);
        set(5, nativePlace);
        set(6, nation);
        set(7, address);
        set(8, realname);
        set(9, birthday);
        set(10, driverLicense);
        set(11, carPlate);
        set(12, passport);
        set(13, gender);
        set(14, marital);
        set(15, contactMobile);
        set(16, contactPhone);
        set(17, contactAddress);
        set(18, contactEmail);
        set(19, urgentName);
        set(20, urgentPhone);
        set(21, ecQq);
        set(22, ecAlipay);
        set(23, ecWechat);
        set(24, idcType);
        set(25, idcNumber);
        set(26, idcAddress);
        set(27, idcExpiredAt);
        set(28, idcFront);
        set(29, idcBack);
        set(30, idcIssuer);
        set(31, idcIssueAt);
        set(32, verified);
        set(33, metadata);
        set(34, active);
        set(35, sigma);
        set(36, language);
        set(37, createdAt);
        set(38, createdBy);
        set(39, updatedAt);
        set(40, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.KEY</code>. 「key」- 身份主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.KEY</code>. 「key」- 身份主键
     */
    @Override
    public EIdentityRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CODE</code>. 「code」- 系统编号
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CODE</code>. 「code」- 系统编号
     */
    @Override
    public EIdentityRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.TYPE</code>. 「type」- 身份类型/档案类型
     */
    @Override
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.TYPE</code>. 「type」- 身份类型/档案类型
     */
    @Override
    public EIdentityRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.STATUS</code>. 「status」- 档案状态
     */
    @Override
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.STATUS</code>. 「status」- 档案状态
     */
    @Override
    public EIdentityRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.COUNTRY</code>. 「country」- 国籍
     */
    @Override
    public String getCountry() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.COUNTRY</code>. 「country」- 国籍
     */
    @Override
    public EIdentityRecord setCountry(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.NATIVE_PLACE</code>. 「nativePlace」- 籍贯
     */
    @Override
    public String getNativePlace() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.NATIVE_PLACE</code>. 「nativePlace」- 籍贯
     */
    @Override
    public EIdentityRecord setNativePlace(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.NATION</code>. 「nation」- 民族
     */
    @Override
    public String getNation() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.NATION</code>. 「nation」- 民族
     */
    @Override
    public EIdentityRecord setNation(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.ADDRESS</code>. 「address」- 居住地址
     */
    @Override
    public String getAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.ADDRESS</code>. 「address」- 居住地址
     */
    @Override
    public EIdentityRecord setAddress(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.REALNAME</code>. 「realname」- 真实姓名
     */
    @Override
    public String getRealname() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.REALNAME</code>. 「realname」- 真实姓名
     */
    @Override
    public EIdentityRecord setRealname(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.BIRTHDAY</code>. 「birthday」- 生日
     */
    @Override
    public LocalDateTime getBirthday() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.BIRTHDAY</code>. 「birthday」- 生日
     */
    @Override
    public EIdentityRecord setBirthday(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.DRIVER_LICENSE</code>. 「driverLicense」- 驾驶证
     */
    @Override
    public String getDriverLicense() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.DRIVER_LICENSE</code>. 「driverLicense」- 驾驶证
     */
    @Override
    public EIdentityRecord setDriverLicense(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CAR_PLATE</code>. 「carPlate」- 常用车牌
     */
    @Override
    public String getCarPlate() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CAR_PLATE</code>. 「carPlate」- 常用车牌
     */
    @Override
    public EIdentityRecord setCarPlate(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.PASSPORT</code>. 「passport」- 护照
     */
    @Override
    public String getPassport() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.PASSPORT</code>. 「passport」- 护照
     */
    @Override
    public EIdentityRecord setPassport(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.GENDER</code>. 「gender」- 性别
     */
    @Override
    public Boolean getGender() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.GENDER</code>. 「gender」- 性别
     */
    @Override
    public EIdentityRecord setGender(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.MARITAL</code>. 「marital」- 婚姻状况
     */
    @Override
    public String getMarital() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.MARITAL</code>. 「marital」- 婚姻状况
     */
    @Override
    public EIdentityRecord setMarital(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_MOBILE</code>. 「contactMobile」- 联系手机
     */
    @Override
    public String getContactMobile() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_MOBILE</code>. 「contactMobile」- 联系手机
     */
    @Override
    public EIdentityRecord setContactMobile(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_PHONE</code>. 「contactPhone」- 座机
     */
    @Override
    public String getContactPhone() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_PHONE</code>. 「contactPhone」- 座机
     */
    @Override
    public EIdentityRecord setContactPhone(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_ADDRESS</code>. 「contactAddress」- 联系地址
     */
    @Override
    public String getContactAddress() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_ADDRESS</code>. 「contactAddress」- 联系地址
     */
    @Override
    public EIdentityRecord setContactAddress(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_EMAIL</code>. 「contactEmail」- 联系Email
     */
    @Override
    public String getContactEmail() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CONTACT_EMAIL</code>. 「contactEmail」- 联系Email
     */
    @Override
    public EIdentityRecord setContactEmail(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.URGENT_NAME</code>. 「urgentName」- 紧急联系人
     */
    @Override
    public String getUrgentName() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.URGENT_NAME</code>. 「urgentName」- 紧急联系人
     */
    @Override
    public EIdentityRecord setUrgentName(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.URGENT_PHONE</code>. 「urgentPhone」- 紧急联系电话
     */
    @Override
    public String getUrgentPhone() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.URGENT_PHONE</code>. 「urgentPhone」- 紧急联系电话
     */
    @Override
    public EIdentityRecord setUrgentPhone(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.EC_QQ</code>. 「ecQq」- QQ号码
     */
    @Override
    public String getEcQq() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.EC_QQ</code>. 「ecQq」- QQ号码
     */
    @Override
    public EIdentityRecord setEcQq(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.EC_ALIPAY</code>. 「ecAlipay」- 支付宝
     */
    @Override
    public String getEcAlipay() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.EC_ALIPAY</code>. 「ecAlipay」- 支付宝
     */
    @Override
    public EIdentityRecord setEcAlipay(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.EC_WECHAT</code>. 「ecWechat」- 微信
     */
    @Override
    public String getEcWechat() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.EC_WECHAT</code>. 「ecWechat」- 微信
     */
    @Override
    public EIdentityRecord setEcWechat(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_TYPE</code>. 「idcType」- 证件类型
     */
    @Override
    public String getIdcType() {
        return (String) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_TYPE</code>. 「idcType」- 证件类型
     */
    @Override
    public EIdentityRecord setIdcType(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_NUMBER</code>. 「idcNumber」- 证件号
     */
    @Override
    public String getIdcNumber() {
        return (String) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_NUMBER</code>. 「idcNumber」- 证件号
     */
    @Override
    public EIdentityRecord setIdcNumber(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_ADDRESS</code>. 「idcAddress」- 证件地址
     */
    @Override
    public String getIdcAddress() {
        return (String) get(26);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_ADDRESS</code>. 「idcAddress」- 证件地址
     */
    @Override
    public EIdentityRecord setIdcAddress(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_EXPIRED_AT</code>. 「idcExpiredAt」- 证件过期时间
     */
    @Override
    public LocalDateTime getIdcExpiredAt() {
        return (LocalDateTime) get(27);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_EXPIRED_AT</code>. 「idcExpiredAt」- 证件过期时间
     */
    @Override
    public EIdentityRecord setIdcExpiredAt(LocalDateTime value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_FRONT</code>. 「idcFront」- 证件正面附件
     */
    @Override
    public String getIdcFront() {
        return (String) get(28);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_FRONT</code>. 「idcFront」- 证件正面附件
     */
    @Override
    public EIdentityRecord setIdcFront(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_BACK</code>. 「idcBack」- 证件背面附件
     */
    @Override
    public String getIdcBack() {
        return (String) get(29);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_BACK</code>. 「idcBack」- 证件背面附件
     */
    @Override
    public EIdentityRecord setIdcBack(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_ISSUER</code>. 「idcIssuer」- 证件签发机构
     */
    @Override
    public String getIdcIssuer() {
        return (String) get(30);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_ISSUER</code>. 「idcIssuer」- 证件签发机构
     */
    @Override
    public EIdentityRecord setIdcIssuer(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.IDC_ISSUE_AT</code>. 「idcIssueAt」- 证件签发时间
     */
    @Override
    public LocalDateTime getIdcIssueAt() {
        return (LocalDateTime) get(31);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.IDC_ISSUE_AT</code>. 「idcIssueAt」- 证件签发时间
     */
    @Override
    public EIdentityRecord setIdcIssueAt(LocalDateTime value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.VERIFIED</code>. 「verified」- 是否验证、备案
     */
    @Override
    public Boolean getVerified() {
        return (Boolean) get(32);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.VERIFIED</code>. 「verified」- 是否验证、备案
     */
    @Override
    public EIdentityRecord setVerified(Boolean value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(33);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EIdentityRecord setMetadata(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(34);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EIdentityRecord setActive(Boolean value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(35);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public EIdentityRecord setSigma(String value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(36);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EIdentityRecord setLanguage(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(37);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EIdentityRecord setCreatedAt(LocalDateTime value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(38);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EIdentityRecord setCreatedBy(String value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(39);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EIdentityRecord setUpdatedAt(LocalDateTime value) {
        set(39, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.E_IDENTITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(40);
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.E_IDENTITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EIdentityRecord setUpdatedBy(String value) {
        set(40, value);
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
    public void from(IEIdentity from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setCountry(from.getCountry());
        setNativePlace(from.getNativePlace());
        setNation(from.getNation());
        setAddress(from.getAddress());
        setRealname(from.getRealname());
        setBirthday(from.getBirthday());
        setDriverLicense(from.getDriverLicense());
        setCarPlate(from.getCarPlate());
        setPassport(from.getPassport());
        setGender(from.getGender());
        setMarital(from.getMarital());
        setContactMobile(from.getContactMobile());
        setContactPhone(from.getContactPhone());
        setContactAddress(from.getContactAddress());
        setContactEmail(from.getContactEmail());
        setUrgentName(from.getUrgentName());
        setUrgentPhone(from.getUrgentPhone());
        setEcQq(from.getEcQq());
        setEcAlipay(from.getEcAlipay());
        setEcWechat(from.getEcWechat());
        setIdcType(from.getIdcType());
        setIdcNumber(from.getIdcNumber());
        setIdcAddress(from.getIdcAddress());
        setIdcExpiredAt(from.getIdcExpiredAt());
        setIdcFront(from.getIdcFront());
        setIdcBack(from.getIdcBack());
        setIdcIssuer(from.getIdcIssuer());
        setIdcIssueAt(from.getIdcIssueAt());
        setVerified(from.getVerified());
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
    public <E extends IEIdentity> E into(E into) {
        into.from(this);
        return into;
    }
}