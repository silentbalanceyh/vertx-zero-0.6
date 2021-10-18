/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.pojos;


import cn.vertxup.atom.domain.tables.interfaces.IMTpl;

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
public class MTpl implements IMTpl {

    private static final long serialVersionUID = 907553537;

    private String key;
    private String name;
    private String code;
    private String type;
    private String tplCategory;
    private String tplIntegration;
    private String tplAcl;
    private String tplAclVisit;
    private String tplModel;
    private String tplEntity;
    private String tplApi;
    private String tplJob;
    private String tplUi;
    private String tplUiList;
    private String tplUiForm;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public MTpl() {
    }

    public MTpl(MTpl value) {
        this.key = value.key;
        this.name = value.name;
        this.code = value.code;
        this.type = value.type;
        this.tplCategory = value.tplCategory;
        this.tplIntegration = value.tplIntegration;
        this.tplAcl = value.tplAcl;
        this.tplAclVisit = value.tplAclVisit;
        this.tplModel = value.tplModel;
        this.tplEntity = value.tplEntity;
        this.tplApi = value.tplApi;
        this.tplJob = value.tplJob;
        this.tplUi = value.tplUi;
        this.tplUiList = value.tplUiList;
        this.tplUiForm = value.tplUiForm;
        this.sigma = value.sigma;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public MTpl(
        String key,
        String name,
        String code,
        String type,
        String tplCategory,
        String tplIntegration,
        String tplAcl,
        String tplAclVisit,
        String tplModel,
        String tplEntity,
        String tplApi,
        String tplJob,
        String tplUi,
        String tplUiList,
        String tplUiForm,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.type = type;
        this.tplCategory = tplCategory;
        this.tplIntegration = tplIntegration;
        this.tplAcl = tplAcl;
        this.tplAclVisit = tplAclVisit;
        this.tplModel = tplModel;
        this.tplEntity = tplEntity;
        this.tplApi = tplApi;
        this.tplJob = tplJob;
        this.tplUi = tplUi;
        this.tplUiList = tplUiList;
        this.tplUiForm = tplUiForm;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public MTpl(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public MTpl setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public MTpl setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public MTpl setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public MTpl setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getTplCategory() {
        return this.tplCategory;
    }

    @Override
    public MTpl setTplCategory(String tplCategory) {
        this.tplCategory = tplCategory;
        return this;
    }

    @Override
    public String getTplIntegration() {
        return this.tplIntegration;
    }

    @Override
    public MTpl setTplIntegration(String tplIntegration) {
        this.tplIntegration = tplIntegration;
        return this;
    }

    @Override
    public String getTplAcl() {
        return this.tplAcl;
    }

    @Override
    public MTpl setTplAcl(String tplAcl) {
        this.tplAcl = tplAcl;
        return this;
    }

    @Override
    public String getTplAclVisit() {
        return this.tplAclVisit;
    }

    @Override
    public MTpl setTplAclVisit(String tplAclVisit) {
        this.tplAclVisit = tplAclVisit;
        return this;
    }

    @Override
    public String getTplModel() {
        return this.tplModel;
    }

    @Override
    public MTpl setTplModel(String tplModel) {
        this.tplModel = tplModel;
        return this;
    }

    @Override
    public String getTplEntity() {
        return this.tplEntity;
    }

    @Override
    public MTpl setTplEntity(String tplEntity) {
        this.tplEntity = tplEntity;
        return this;
    }

    @Override
    public String getTplApi() {
        return this.tplApi;
    }

    @Override
    public MTpl setTplApi(String tplApi) {
        this.tplApi = tplApi;
        return this;
    }

    @Override
    public String getTplJob() {
        return this.tplJob;
    }

    @Override
    public MTpl setTplJob(String tplJob) {
        this.tplJob = tplJob;
        return this;
    }

    @Override
    public String getTplUi() {
        return this.tplUi;
    }

    @Override
    public MTpl setTplUi(String tplUi) {
        this.tplUi = tplUi;
        return this;
    }

    @Override
    public String getTplUiList() {
        return this.tplUiList;
    }

    @Override
    public MTpl setTplUiList(String tplUiList) {
        this.tplUiList = tplUiList;
        return this;
    }

    @Override
    public String getTplUiForm() {
        return this.tplUiForm;
    }

    @Override
    public MTpl setTplUiForm(String tplUiForm) {
        this.tplUiForm = tplUiForm;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public MTpl setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public MTpl setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public MTpl setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public MTpl setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public MTpl setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public MTpl setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public MTpl setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public MTpl setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MTpl (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(tplCategory);
        sb.append(", ").append(tplIntegration);
        sb.append(", ").append(tplAcl);
        sb.append(", ").append(tplAclVisit);
        sb.append(", ").append(tplModel);
        sb.append(", ").append(tplEntity);
        sb.append(", ").append(tplApi);
        sb.append(", ").append(tplJob);
        sb.append(", ").append(tplUi);
        sb.append(", ").append(tplUiList);
        sb.append(", ").append(tplUiForm);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
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
    public void from(IMTpl from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setTplCategory(from.getTplCategory());
        setTplIntegration(from.getTplIntegration());
        setTplAcl(from.getTplAcl());
        setTplAclVisit(from.getTplAclVisit());
        setTplModel(from.getTplModel());
        setTplEntity(from.getTplEntity());
        setTplApi(from.getTplApi());
        setTplJob(from.getTplJob());
        setTplUi(from.getTplUi());
        setTplUiList(from.getTplUiList());
        setTplUiForm(from.getTplUiForm());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IMTpl> E into(E into) {
        into.from(this);
        return into;
    }
}