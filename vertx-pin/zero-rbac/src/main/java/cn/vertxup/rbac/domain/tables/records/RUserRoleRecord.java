/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.records;


import cn.vertxup.rbac.domain.tables.RUserRole;
import cn.vertxup.rbac.domain.tables.interfaces.IRUserRole;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RUserRoleRecord extends UpdatableRecordImpl<RUserRoleRecord> implements Record3<String, String, Integer>, IRUserRole {

    private static final long serialVersionUID = -1564124458;

    /**
     * Setter for <code>DB_ETERNAL.R_USER_ROLE.USER_ID</code>. 「userId」- 关联用户ID
     */
    @Override
    public RUserRoleRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_USER_ROLE.USER_ID</code>. 「userId」- 关联用户ID
     */
    @Override
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_USER_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    @Override
    public RUserRoleRecord setRoleId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_USER_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    @Override
    public String getRoleId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_USER_ROLE.PRIORITY</code>. 「priority」- 角色优先级
     */
    @Override
    public RUserRoleRecord setPriority(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_USER_ROLE.PRIORITY</code>. 「priority」- 角色优先级
     */
    @Override
    public Integer getPriority() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RUserRole.R_USER_ROLE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RUserRole.R_USER_ROLE.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RUserRole.R_USER_ROLE.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RUserRoleRecord value1(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RUserRoleRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RUserRoleRecord value3(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RUserRoleRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IRUserRole from) {
        setUserId(from.getUserId());
        setRoleId(from.getRoleId());
        setPriority(from.getPriority());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IRUserRole> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RUserRoleRecord
     */
    public RUserRoleRecord() {
        super(RUserRole.R_USER_ROLE);
    }

    /**
     * Create a detached, initialised RUserRoleRecord
     */
    public RUserRoleRecord(String userId, String roleId, Integer priority) {
        super(RUserRole.R_USER_ROLE);

        set(0, userId);
        set(1, roleId);
        set(2, priority);
    }
}