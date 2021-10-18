/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.EEmployee;
import cn.vertxup.erp.domain.tables.interfaces.IEEmployee;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
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
public class EEmployeeRecord extends UpdatableRecordImpl<EEmployeeRecord> implements Record22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String>, IEEmployee {

    private static final long serialVersionUID = 1309380676;

    /**
     * Create a detached EEmployeeRecord
     */
    public EEmployeeRecord() {
        super(EEmployee.E_EMPLOYEE);
    }

    /**
     * Create a detached, initialised EEmployeeRecord
     */
    public EEmployeeRecord(String key, String companyId, String deptId, String teamId, String identityId, String viceName, String viceEmail, String viceMobile, String workNumber, String workTitle, String workLocation, String workPhone, String workExtension, String type, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(EEmployee.E_EMPLOYEE);

        set(0, key);
        set(1, companyId);
        set(2, deptId);
        set(3, teamId);
        set(4, identityId);
        set(5, viceName);
        set(6, viceEmail);
        set(7, viceMobile);
        set(8, workNumber);
        set(9, workTitle);
        set(10, workLocation);
        set(11, workPhone);
        set(12, workExtension);
        set(13, type);
        set(14, metadata);
        set(15, active);
        set(16, sigma);
        set(17, language);
        set(18, createdAt);
        set(19, createdBy);
        set(20, updatedAt);
        set(21, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.KEY</code>. 「key」- 员工主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.KEY</code>. 「key」- 员工主键
     */
    @Override
    public EEmployeeRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public String getCompanyId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.COMPANY_ID</code>. 「companyId」- 所属公司
     */
    @Override
    public EEmployeeRecord setCompanyId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public String getDeptId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.DEPT_ID</code>. 「deptId」- 所属部门
     */
    @Override
    public EEmployeeRecord setDeptId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.TEAM_ID</code>. 「teamId」- 所属组
     */
    @Override
    public String getTeamId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.TEAM_ID</code>. 「teamId」- 所属组
     */
    @Override
    public EEmployeeRecord setTeamId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.IDENTITY_ID</code>. 「identityId」- 关联档案
     */
    @Override
    public String getIdentityId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.IDENTITY_ID</code>. 「identityId」- 关联档案
     */
    @Override
    public EEmployeeRecord setIdentityId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_NAME</code>. 「viceName」- 员工姓名
     */
    @Override
    public String getViceName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_NAME</code>. 「viceName」- 员工姓名
     */
    @Override
    public EEmployeeRecord setViceName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_EMAIL</code>. 「viceEmail」- 员工邮箱
     */
    @Override
    public String getViceEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_EMAIL</code>. 「viceEmail」- 员工邮箱
     */
    @Override
    public EEmployeeRecord setViceEmail(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_MOBILE</code>. 「viceMobile」- 员工手机
     */
    @Override
    public String getViceMobile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.VICE_MOBILE</code>. 「viceMobile」- 员工手机
     */
    @Override
    public EEmployeeRecord setViceMobile(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_NUMBER</code>. 「workNumber」- 工号
     */
    @Override
    public String getWorkNumber() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_NUMBER</code>. 「workNumber」- 工号
     */
    @Override
    public EEmployeeRecord setWorkNumber(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_TITLE</code>. 「workTitle」- 头衔
     */
    @Override
    public String getWorkTitle() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_TITLE</code>. 「workTitle」- 头衔
     */
    @Override
    public EEmployeeRecord setWorkTitle(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_LOCATION</code>. 「workLocation」- 办公地点
     */
    @Override
    public String getWorkLocation() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_LOCATION</code>. 「workLocation」- 办公地点
     */
    @Override
    public EEmployeeRecord setWorkLocation(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_PHONE</code>. 「workPhone」- 办公电话
     */
    @Override
    public String getWorkPhone() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_PHONE</code>. 「workPhone」- 办公电话
     */
    @Override
    public EEmployeeRecord setWorkPhone(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_EXTENSION</code>. 「workExtension」- 分机号
     */
    @Override
    public String getWorkExtension() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.WORK_EXTENSION</code>. 「workExtension」- 分机号
     */
    @Override
    public EEmployeeRecord setWorkExtension(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.TYPE</code>. 「type」- 员工分类
     */
    @Override
    public String getType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.TYPE</code>. 「type」- 员工分类
     */
    @Override
    public EEmployeeRecord setType(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EEmployeeRecord setMetadata(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EEmployeeRecord setActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public String getSigma() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public EEmployeeRecord setSigma(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EEmployeeRecord setLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EEmployeeRecord setCreatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EEmployeeRecord setCreatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EEmployeeRecord setUpdatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.E_EMPLOYEE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EEmployeeRecord setUpdatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EEmployee.E_EMPLOYEE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EEmployee.E_EMPLOYEE.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EEmployee.E_EMPLOYEE.DEPT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EEmployee.E_EMPLOYEE.TEAM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EEmployee.E_EMPLOYEE.IDENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EEmployee.E_EMPLOYEE.VICE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EEmployee.E_EMPLOYEE.VICE_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EEmployee.E_EMPLOYEE.VICE_MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EEmployee.E_EMPLOYEE.WORK_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EEmployee.E_EMPLOYEE.WORK_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EEmployee.E_EMPLOYEE.WORK_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return EEmployee.E_EMPLOYEE.WORK_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return EEmployee.E_EMPLOYEE.WORK_EXTENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return EEmployee.E_EMPLOYEE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return EEmployee.E_EMPLOYEE.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return EEmployee.E_EMPLOYEE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return EEmployee.E_EMPLOYEE.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return EEmployee.E_EMPLOYEE.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field19() {
        return EEmployee.E_EMPLOYEE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return EEmployee.E_EMPLOYEE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field21() {
        return EEmployee.E_EMPLOYEE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field22() {
        return EEmployee.E_EMPLOYEE.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDeptId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTeamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getViceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getViceEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getViceMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getWorkNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getWorkTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getWorkLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getWorkPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getWorkExtension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component19() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component21() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component22() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDeptId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTeamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getViceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getViceEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getViceMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getWorkNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getWorkTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getWorkLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getWorkPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getWorkExtension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value19() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value21() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value22() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value2(String value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value3(String value) {
        setDeptId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value4(String value) {
        setTeamId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value5(String value) {
        setIdentityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value6(String value) {
        setViceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value7(String value) {
        setViceEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value8(String value) {
        setViceMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value9(String value) {
        setWorkNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value10(String value) {
        setWorkTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value11(String value) {
        setWorkLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value12(String value) {
        setWorkPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value13(String value) {
        setWorkExtension(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value14(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value15(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value16(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value17(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value18(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value19(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value20(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value21(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord value22(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EEmployeeRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, Boolean value16, String value17, String value18, LocalDateTime value19, String value20, LocalDateTime value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IEEmployee from) {
        setKey(from.getKey());
        setCompanyId(from.getCompanyId());
        setDeptId(from.getDeptId());
        setTeamId(from.getTeamId());
        setIdentityId(from.getIdentityId());
        setViceName(from.getViceName());
        setViceEmail(from.getViceEmail());
        setViceMobile(from.getViceMobile());
        setWorkNumber(from.getWorkNumber());
        setWorkTitle(from.getWorkTitle());
        setWorkLocation(from.getWorkLocation());
        setWorkPhone(from.getWorkPhone());
        setWorkExtension(from.getWorkExtension());
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
    public <E extends IEEmployee> E into(E into) {
        into.from(this);
        return into;
    }
}