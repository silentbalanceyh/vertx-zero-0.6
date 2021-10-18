/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IEIdentity;

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
public class EIdentity implements IEIdentity {

    private static final long serialVersionUID = -1456995710;

    private String key;
    private String code;
    private String type;
    private String status;
    private String country;
    private String nativePlace;
    private String nation;
    private String address;
    private String realname;
    private LocalDateTime birthday;
    private String driverLicense;
    private String carPlate;
    private String passport;
    private Boolean gender;
    private String marital;
    private String contactMobile;
    private String contactPhone;
    private String contactAddress;
    private String contactEmail;
    private String urgentName;
    private String urgentPhone;
    private String ecQq;
    private String ecAlipay;
    private String ecWechat;
    private String idcType;
    private String idcNumber;
    private String idcAddress;
    private LocalDateTime idcExpiredAt;
    private String idcFront;
    private String idcBack;
    private String idcIssuer;
    private LocalDateTime idcIssueAt;
    private Boolean verified;
    private String metadata;
    private Boolean active;
    private String sigma;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public EIdentity() {
    }

    public EIdentity(EIdentity value) {
        this.key = value.key;
        this.code = value.code;
        this.type = value.type;
        this.status = value.status;
        this.country = value.country;
        this.nativePlace = value.nativePlace;
        this.nation = value.nation;
        this.address = value.address;
        this.realname = value.realname;
        this.birthday = value.birthday;
        this.driverLicense = value.driverLicense;
        this.carPlate = value.carPlate;
        this.passport = value.passport;
        this.gender = value.gender;
        this.marital = value.marital;
        this.contactMobile = value.contactMobile;
        this.contactPhone = value.contactPhone;
        this.contactAddress = value.contactAddress;
        this.contactEmail = value.contactEmail;
        this.urgentName = value.urgentName;
        this.urgentPhone = value.urgentPhone;
        this.ecQq = value.ecQq;
        this.ecAlipay = value.ecAlipay;
        this.ecWechat = value.ecWechat;
        this.idcType = value.idcType;
        this.idcNumber = value.idcNumber;
        this.idcAddress = value.idcAddress;
        this.idcExpiredAt = value.idcExpiredAt;
        this.idcFront = value.idcFront;
        this.idcBack = value.idcBack;
        this.idcIssuer = value.idcIssuer;
        this.idcIssueAt = value.idcIssueAt;
        this.verified = value.verified;
        this.metadata = value.metadata;
        this.active = value.active;
        this.sigma = value.sigma;
        this.language = value.language;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public EIdentity(
        String key,
        String code,
        String type,
        String status,
        String country,
        String nativePlace,
        String nation,
        String address,
        String realname,
        LocalDateTime birthday,
        String driverLicense,
        String carPlate,
        String passport,
        Boolean gender,
        String marital,
        String contactMobile,
        String contactPhone,
        String contactAddress,
        String contactEmail,
        String urgentName,
        String urgentPhone,
        String ecQq,
        String ecAlipay,
        String ecWechat,
        String idcType,
        String idcNumber,
        String idcAddress,
        LocalDateTime idcExpiredAt,
        String idcFront,
        String idcBack,
        String idcIssuer,
        LocalDateTime idcIssueAt,
        Boolean verified,
        String metadata,
        Boolean active,
        String sigma,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.code = code;
        this.type = type;
        this.status = status;
        this.country = country;
        this.nativePlace = nativePlace;
        this.nation = nation;
        this.address = address;
        this.realname = realname;
        this.birthday = birthday;
        this.driverLicense = driverLicense;
        this.carPlate = carPlate;
        this.passport = passport;
        this.gender = gender;
        this.marital = marital;
        this.contactMobile = contactMobile;
        this.contactPhone = contactPhone;
        this.contactAddress = contactAddress;
        this.contactEmail = contactEmail;
        this.urgentName = urgentName;
        this.urgentPhone = urgentPhone;
        this.ecQq = ecQq;
        this.ecAlipay = ecAlipay;
        this.ecWechat = ecWechat;
        this.idcType = idcType;
        this.idcNumber = idcNumber;
        this.idcAddress = idcAddress;
        this.idcExpiredAt = idcExpiredAt;
        this.idcFront = idcFront;
        this.idcBack = idcBack;
        this.idcIssuer = idcIssuer;
        this.idcIssueAt = idcIssueAt;
        this.verified = verified;
        this.metadata = metadata;
        this.active = active;
        this.sigma = sigma;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public EIdentity(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public EIdentity setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public EIdentity setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public EIdentity setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public EIdentity setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public EIdentity setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String getNativePlace() {
        return this.nativePlace;
    }

    @Override
    public EIdentity setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
        return this;
    }

    @Override
    public String getNation() {
        return this.nation;
    }

    @Override
    public EIdentity setNation(String nation) {
        this.nation = nation;
        return this;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public EIdentity setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String getRealname() {
        return this.realname;
    }

    @Override
    public EIdentity setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    @Override
    public LocalDateTime getBirthday() {
        return this.birthday;
    }

    @Override
    public EIdentity setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public String getDriverLicense() {
        return this.driverLicense;
    }

    @Override
    public EIdentity setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
        return this;
    }

    @Override
    public String getCarPlate() {
        return this.carPlate;
    }

    @Override
    public EIdentity setCarPlate(String carPlate) {
        this.carPlate = carPlate;
        return this;
    }

    @Override
    public String getPassport() {
        return this.passport;
    }

    @Override
    public EIdentity setPassport(String passport) {
        this.passport = passport;
        return this;
    }

    @Override
    public Boolean getGender() {
        return this.gender;
    }

    @Override
    public EIdentity setGender(Boolean gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String getMarital() {
        return this.marital;
    }

    @Override
    public EIdentity setMarital(String marital) {
        this.marital = marital;
        return this;
    }

    @Override
    public String getContactMobile() {
        return this.contactMobile;
    }

    @Override
    public EIdentity setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }

    @Override
    public String getContactPhone() {
        return this.contactPhone;
    }

    @Override
    public EIdentity setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    @Override
    public String getContactAddress() {
        return this.contactAddress;
    }

    @Override
    public EIdentity setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
        return this;
    }

    @Override
    public String getContactEmail() {
        return this.contactEmail;
    }

    @Override
    public EIdentity setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    @Override
    public String getUrgentName() {
        return this.urgentName;
    }

    @Override
    public EIdentity setUrgentName(String urgentName) {
        this.urgentName = urgentName;
        return this;
    }

    @Override
    public String getUrgentPhone() {
        return this.urgentPhone;
    }

    @Override
    public EIdentity setUrgentPhone(String urgentPhone) {
        this.urgentPhone = urgentPhone;
        return this;
    }

    @Override
    public String getEcQq() {
        return this.ecQq;
    }

    @Override
    public EIdentity setEcQq(String ecQq) {
        this.ecQq = ecQq;
        return this;
    }

    @Override
    public String getEcAlipay() {
        return this.ecAlipay;
    }

    @Override
    public EIdentity setEcAlipay(String ecAlipay) {
        this.ecAlipay = ecAlipay;
        return this;
    }

    @Override
    public String getEcWechat() {
        return this.ecWechat;
    }

    @Override
    public EIdentity setEcWechat(String ecWechat) {
        this.ecWechat = ecWechat;
        return this;
    }

    @Override
    public String getIdcType() {
        return this.idcType;
    }

    @Override
    public EIdentity setIdcType(String idcType) {
        this.idcType = idcType;
        return this;
    }

    @Override
    public String getIdcNumber() {
        return this.idcNumber;
    }

    @Override
    public EIdentity setIdcNumber(String idcNumber) {
        this.idcNumber = idcNumber;
        return this;
    }

    @Override
    public String getIdcAddress() {
        return this.idcAddress;
    }

    @Override
    public EIdentity setIdcAddress(String idcAddress) {
        this.idcAddress = idcAddress;
        return this;
    }

    @Override
    public LocalDateTime getIdcExpiredAt() {
        return this.idcExpiredAt;
    }

    @Override
    public EIdentity setIdcExpiredAt(LocalDateTime idcExpiredAt) {
        this.idcExpiredAt = idcExpiredAt;
        return this;
    }

    @Override
    public String getIdcFront() {
        return this.idcFront;
    }

    @Override
    public EIdentity setIdcFront(String idcFront) {
        this.idcFront = idcFront;
        return this;
    }

    @Override
    public String getIdcBack() {
        return this.idcBack;
    }

    @Override
    public EIdentity setIdcBack(String idcBack) {
        this.idcBack = idcBack;
        return this;
    }

    @Override
    public String getIdcIssuer() {
        return this.idcIssuer;
    }

    @Override
    public EIdentity setIdcIssuer(String idcIssuer) {
        this.idcIssuer = idcIssuer;
        return this;
    }

    @Override
    public LocalDateTime getIdcIssueAt() {
        return this.idcIssueAt;
    }

    @Override
    public EIdentity setIdcIssueAt(LocalDateTime idcIssueAt) {
        this.idcIssueAt = idcIssueAt;
        return this;
    }

    @Override
    public Boolean getVerified() {
        return this.verified;
    }

    @Override
    public EIdentity setVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public EIdentity setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public EIdentity setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public EIdentity setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public EIdentity setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public EIdentity setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public EIdentity setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public EIdentity setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public EIdentity setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EIdentity (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(country);
        sb.append(", ").append(nativePlace);
        sb.append(", ").append(nation);
        sb.append(", ").append(address);
        sb.append(", ").append(realname);
        sb.append(", ").append(birthday);
        sb.append(", ").append(driverLicense);
        sb.append(", ").append(carPlate);
        sb.append(", ").append(passport);
        sb.append(", ").append(gender);
        sb.append(", ").append(marital);
        sb.append(", ").append(contactMobile);
        sb.append(", ").append(contactPhone);
        sb.append(", ").append(contactAddress);
        sb.append(", ").append(contactEmail);
        sb.append(", ").append(urgentName);
        sb.append(", ").append(urgentPhone);
        sb.append(", ").append(ecQq);
        sb.append(", ").append(ecAlipay);
        sb.append(", ").append(ecWechat);
        sb.append(", ").append(idcType);
        sb.append(", ").append(idcNumber);
        sb.append(", ").append(idcAddress);
        sb.append(", ").append(idcExpiredAt);
        sb.append(", ").append(idcFront);
        sb.append(", ").append(idcBack);
        sb.append(", ").append(idcIssuer);
        sb.append(", ").append(idcIssueAt);
        sb.append(", ").append(verified);
        sb.append(", ").append(metadata);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

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