/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.pojos;


import cn.vertxup.ui.domain.tables.interfaces.IUiList;

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
public class UiList implements IUiList {

    private static final long serialVersionUID = 474757552;

    private String key;
    private String name;
    private String code;
    private String identifier;
    private String vQuery;
    private String vSearch;
    private String vTable;
    private String vSegment;
    private Boolean dynamicColumn;
    private Boolean dynamicSwitch;
    private String optionsAjax;
    private String optionsSubmit;
    private String options;
    private String classCombiner;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public UiList() {
    }

    public UiList(UiList value) {
        this.key = value.key;
        this.name = value.name;
        this.code = value.code;
        this.identifier = value.identifier;
        this.vQuery = value.vQuery;
        this.vSearch = value.vSearch;
        this.vTable = value.vTable;
        this.vSegment = value.vSegment;
        this.dynamicColumn = value.dynamicColumn;
        this.dynamicSwitch = value.dynamicSwitch;
        this.optionsAjax = value.optionsAjax;
        this.optionsSubmit = value.optionsSubmit;
        this.options = value.options;
        this.classCombiner = value.classCombiner;
        this.active = value.active;
        this.sigma = value.sigma;
        this.metadata = value.metadata;
        this.language = value.language;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public UiList(
        String key,
        String name,
        String code,
        String identifier,
        String vQuery,
        String vSearch,
        String vTable,
        String vSegment,
        Boolean dynamicColumn,
        Boolean dynamicSwitch,
        String optionsAjax,
        String optionsSubmit,
        String options,
        String classCombiner,
        Boolean active,
        String sigma,
        String metadata,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.identifier = identifier;
        this.vQuery = vQuery;
        this.vSearch = vSearch;
        this.vTable = vTable;
        this.vSegment = vSegment;
        this.dynamicColumn = dynamicColumn;
        this.dynamicSwitch = dynamicSwitch;
        this.optionsAjax = optionsAjax;
        this.optionsSubmit = optionsSubmit;
        this.options = options;
        this.classCombiner = classCombiner;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public UiList(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public UiList setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public UiList setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public UiList setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public UiList setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    @Override
    public String getVQuery() {
        return this.vQuery;
    }

    @Override
    public UiList setVQuery(String vQuery) {
        this.vQuery = vQuery;
        return this;
    }

    @Override
    public String getVSearch() {
        return this.vSearch;
    }

    @Override
    public UiList setVSearch(String vSearch) {
        this.vSearch = vSearch;
        return this;
    }

    @Override
    public String getVTable() {
        return this.vTable;
    }

    @Override
    public UiList setVTable(String vTable) {
        this.vTable = vTable;
        return this;
    }

    @Override
    public String getVSegment() {
        return this.vSegment;
    }

    @Override
    public UiList setVSegment(String vSegment) {
        this.vSegment = vSegment;
        return this;
    }

    @Override
    public Boolean getDynamicColumn() {
        return this.dynamicColumn;
    }

    @Override
    public UiList setDynamicColumn(Boolean dynamicColumn) {
        this.dynamicColumn = dynamicColumn;
        return this;
    }

    @Override
    public Boolean getDynamicSwitch() {
        return this.dynamicSwitch;
    }

    @Override
    public UiList setDynamicSwitch(Boolean dynamicSwitch) {
        this.dynamicSwitch = dynamicSwitch;
        return this;
    }

    @Override
    public String getOptionsAjax() {
        return this.optionsAjax;
    }

    @Override
    public UiList setOptionsAjax(String optionsAjax) {
        this.optionsAjax = optionsAjax;
        return this;
    }

    @Override
    public String getOptionsSubmit() {
        return this.optionsSubmit;
    }

    @Override
    public UiList setOptionsSubmit(String optionsSubmit) {
        this.optionsSubmit = optionsSubmit;
        return this;
    }

    @Override
    public String getOptions() {
        return this.options;
    }

    @Override
    public UiList setOptions(String options) {
        this.options = options;
        return this;
    }

    @Override
    public String getClassCombiner() {
        return this.classCombiner;
    }

    @Override
    public UiList setClassCombiner(String classCombiner) {
        this.classCombiner = classCombiner;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public UiList setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public UiList setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public UiList setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public UiList setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public UiList setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public UiList setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public UiList setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public UiList setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UiList (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(identifier);
        sb.append(", ").append(vQuery);
        sb.append(", ").append(vSearch);
        sb.append(", ").append(vTable);
        sb.append(", ").append(vSegment);
        sb.append(", ").append(dynamicColumn);
        sb.append(", ").append(dynamicSwitch);
        sb.append(", ").append(optionsAjax);
        sb.append(", ").append(optionsSubmit);
        sb.append(", ").append(options);
        sb.append(", ").append(classCombiner);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
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
    public void from(IUiList from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setIdentifier(from.getIdentifier());
        setVQuery(from.getVQuery());
        setVSearch(from.getVSearch());
        setVTable(from.getVTable());
        setVSegment(from.getVSegment());
        setDynamicColumn(from.getDynamicColumn());
        setDynamicSwitch(from.getDynamicSwitch());
        setOptionsAjax(from.getOptionsAjax());
        setOptionsSubmit(from.getOptionsSubmit());
        setOptions(from.getOptions());
        setClassCombiner(from.getClassCombiner());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
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
    public <E extends IUiList> E into(E into) {
        into.from(this);
        return into;
    }
}
