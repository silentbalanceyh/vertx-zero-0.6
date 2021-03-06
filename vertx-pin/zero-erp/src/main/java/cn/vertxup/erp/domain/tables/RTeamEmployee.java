/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables;


import cn.vertxup.erp.domain.Db;
import cn.vertxup.erp.domain.Indexes;
import cn.vertxup.erp.domain.Keys;
import cn.vertxup.erp.domain.tables.records.RTeamEmployeeRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class RTeamEmployee extends TableImpl<RTeamEmployeeRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.R_TEAM_EMPLOYEE</code>
     */
    public static final RTeamEmployee R_TEAM_EMPLOYEE = new RTeamEmployee();
    private static final long serialVersionUID = 1513421266;
    /**
     * The column <code>DB_ETERNAL.R_TEAM_EMPLOYEE.TEAM_ID</code>. 「teamId」- 组的ID
     */
    public final TableField<RTeamEmployeeRecord, String> TEAM_ID = createField("TEAM_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「teamId」- 组的ID");
    /**
     * The column <code>DB_ETERNAL.R_TEAM_EMPLOYEE.EMPLOYEE_ID</code>. 「employeeId」- 员工ID
     */
    public final TableField<RTeamEmployeeRecord, String> EMPLOYEE_ID = createField("EMPLOYEE_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「employeeId」- 员工ID");
    /**
     * The column <code>DB_ETERNAL.R_TEAM_EMPLOYEE.COMMENT</code>. 「comment」- 关系备注
     */
    public final TableField<RTeamEmployeeRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「comment」- 关系备注");

    /**
     * Create a <code>DB_ETERNAL.R_TEAM_EMPLOYEE</code> table reference
     */
    public RTeamEmployee() {
        this(DSL.name("R_TEAM_EMPLOYEE"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.R_TEAM_EMPLOYEE</code> table reference
     */
    public RTeamEmployee(String alias) {
        this(DSL.name(alias), R_TEAM_EMPLOYEE);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.R_TEAM_EMPLOYEE</code> table reference
     */
    public RTeamEmployee(Name alias) {
        this(alias, R_TEAM_EMPLOYEE);
    }

    private RTeamEmployee(Name alias, Table<RTeamEmployeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private RTeamEmployee(Name alias, Table<RTeamEmployeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RTeamEmployeeRecord> getRecordType() {
        return RTeamEmployeeRecord.class;
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
        return Arrays.<Index>asList(Indexes.R_TEAM_EMPLOYEE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RTeamEmployeeRecord> getPrimaryKey() {
        return Keys.KEY_R_TEAM_EMPLOYEE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RTeamEmployeeRecord>> getKeys() {
        return Arrays.<UniqueKey<RTeamEmployeeRecord>>asList(Keys.KEY_R_TEAM_EMPLOYEE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RTeamEmployee as(String alias) {
        return new RTeamEmployee(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RTeamEmployee as(Name alias) {
        return new RTeamEmployee(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RTeamEmployee rename(String name) {
        return new RTeamEmployee(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RTeamEmployee rename(Name name) {
        return new RTeamEmployee(name, null);
    }
}
