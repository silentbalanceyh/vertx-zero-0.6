/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.IRTeamEmployee;

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
public class RTeamEmployee implements IRTeamEmployee {

    private static final long serialVersionUID = 1459076827;

    private String teamId;
    private String employeeId;
    private String comment;

    public RTeamEmployee() {
    }

    public RTeamEmployee(RTeamEmployee value) {
        this.teamId = value.teamId;
        this.employeeId = value.employeeId;
        this.comment = value.comment;
    }

    public RTeamEmployee(
        String teamId,
        String employeeId,
        String comment
    ) {
        this.teamId = teamId;
        this.employeeId = employeeId;
        this.comment = comment;
    }

    public RTeamEmployee(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getTeamId() {
        return this.teamId;
    }

    @Override
    public RTeamEmployee setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    @Override
    public String getEmployeeId() {
        return this.employeeId;
    }

    @Override
    public RTeamEmployee setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public RTeamEmployee setComment(String comment) {
        this.comment = comment;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RTeamEmployee (");

        sb.append(teamId);
        sb.append(", ").append(employeeId);
        sb.append(", ").append(comment);

        sb.append(")");
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IRTeamEmployee from) {
        setTeamId(from.getTeamId());
        setEmployeeId(from.getEmployeeId());
        setComment(from.getComment());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IRTeamEmployee> E into(E into) {
        into.from(this);
        return into;
    }
}
