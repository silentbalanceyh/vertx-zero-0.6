/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.pojos;


import cn.vertxup.ui.domain.tables.interfaces.IVSearch;

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
public class VSearch implements IVSearch {

    private static final long serialVersionUID = -179886133;

    private String key;
    private Boolean enabled;
    private Boolean advanced;
    private String opRedo;
    private String opAdvanced;
    private String confirmClear;
    private String placeholder;
    private String cond;
    private String advancedWidth;
    private String advancedTitle;
    private String advancedNotice;

    public VSearch() {
    }

    public VSearch(VSearch value) {
        this.key = value.key;
        this.enabled = value.enabled;
        this.advanced = value.advanced;
        this.opRedo = value.opRedo;
        this.opAdvanced = value.opAdvanced;
        this.confirmClear = value.confirmClear;
        this.placeholder = value.placeholder;
        this.cond = value.cond;
        this.advancedWidth = value.advancedWidth;
        this.advancedTitle = value.advancedTitle;
        this.advancedNotice = value.advancedNotice;
    }

    public VSearch(
        String key,
        Boolean enabled,
        Boolean advanced,
        String opRedo,
        String opAdvanced,
        String confirmClear,
        String placeholder,
        String cond,
        String advancedWidth,
        String advancedTitle,
        String advancedNotice
    ) {
        this.key = key;
        this.enabled = enabled;
        this.advanced = advanced;
        this.opRedo = opRedo;
        this.opAdvanced = opAdvanced;
        this.confirmClear = confirmClear;
        this.placeholder = placeholder;
        this.cond = cond;
        this.advancedWidth = advancedWidth;
        this.advancedTitle = advancedTitle;
        this.advancedNotice = advancedNotice;
    }

    public VSearch(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public VSearch setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public Boolean getEnabled() {
        return this.enabled;
    }

    @Override
    public VSearch setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public Boolean getAdvanced() {
        return this.advanced;
    }

    @Override
    public VSearch setAdvanced(Boolean advanced) {
        this.advanced = advanced;
        return this;
    }

    @Override
    public String getOpRedo() {
        return this.opRedo;
    }

    @Override
    public VSearch setOpRedo(String opRedo) {
        this.opRedo = opRedo;
        return this;
    }

    @Override
    public String getOpAdvanced() {
        return this.opAdvanced;
    }

    @Override
    public VSearch setOpAdvanced(String opAdvanced) {
        this.opAdvanced = opAdvanced;
        return this;
    }

    @Override
    public String getConfirmClear() {
        return this.confirmClear;
    }

    @Override
    public VSearch setConfirmClear(String confirmClear) {
        this.confirmClear = confirmClear;
        return this;
    }

    @Override
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override
    public VSearch setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    @Override
    public String getCond() {
        return this.cond;
    }

    @Override
    public VSearch setCond(String cond) {
        this.cond = cond;
        return this;
    }

    @Override
    public String getAdvancedWidth() {
        return this.advancedWidth;
    }

    @Override
    public VSearch setAdvancedWidth(String advancedWidth) {
        this.advancedWidth = advancedWidth;
        return this;
    }

    @Override
    public String getAdvancedTitle() {
        return this.advancedTitle;
    }

    @Override
    public VSearch setAdvancedTitle(String advancedTitle) {
        this.advancedTitle = advancedTitle;
        return this;
    }

    @Override
    public String getAdvancedNotice() {
        return this.advancedNotice;
    }

    @Override
    public VSearch setAdvancedNotice(String advancedNotice) {
        this.advancedNotice = advancedNotice;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VSearch (");

        sb.append(key);
        sb.append(", ").append(enabled);
        sb.append(", ").append(advanced);
        sb.append(", ").append(opRedo);
        sb.append(", ").append(opAdvanced);
        sb.append(", ").append(confirmClear);
        sb.append(", ").append(placeholder);
        sb.append(", ").append(cond);
        sb.append(", ").append(advancedWidth);
        sb.append(", ").append(advancedTitle);
        sb.append(", ").append(advancedNotice);

        sb.append(")");
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IVSearch from) {
        setKey(from.getKey());
        setEnabled(from.getEnabled());
        setAdvanced(from.getAdvanced());
        setOpRedo(from.getOpRedo());
        setOpAdvanced(from.getOpAdvanced());
        setConfirmClear(from.getConfirmClear());
        setPlaceholder(from.getPlaceholder());
        setCond(from.getCond());
        setAdvancedWidth(from.getAdvancedWidth());
        setAdvancedTitle(from.getAdvancedTitle());
        setAdvancedNotice(from.getAdvancedNotice());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IVSearch> E into(E into) {
        into.from(this);
        return into;
    }
}