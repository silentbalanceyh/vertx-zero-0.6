/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.records;


import cn.vertxup.rbac.domain.tables.SResource;
import cn.vertxup.rbac.domain.tables.interfaces.ISResource;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class SResourceRecord extends UpdatableRecordImpl<SResourceRecord> implements ISResource {

    private static final long serialVersionUID = -1729959209;

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    @Override
    public SResourceRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    @Override
    public SResourceRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    @Override
    public SResourceRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    @Override
    public SResourceRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.IDENTIFIER</code>. 「identifier」- 当前资源所属的Model的标识
     */
    @Override
    public SResourceRecord setIdentifier(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.IDENTIFIER</code>. 「identifier」- 当前资源所属的Model的标识
     */
    @Override
    public String getIdentifier() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public SResourceRecord setComment(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public String getComment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    @Override
    public SResourceRecord setLevel(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    @Override
    public Integer getLevel() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    @Override
    public SResourceRecord setModeRole(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    @Override
    public String getModeRole() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    @Override
    public SResourceRecord setModeGroup(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    @Override
    public String getModeGroup() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.MODE_TREE</code>. 「modeTree」- 该资源处理树（用户组）的模式
     */
    @Override
    public SResourceRecord setModeTree(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.MODE_TREE</code>. 「modeTree」- 该资源处理树（用户组）的模式
     */
    @Override
    public String getModeTree() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.VIRTUAL</code>. 「virtual」- 虚拟资源
     */
    @Override
    public SResourceRecord setVirtual(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.VIRTUAL</code>. 「virtual」- 虚拟资源
     */
    @Override
    public Boolean getVirtual() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.SEEK_SYNTAX</code>. 「seekSyntax」- 访问者语法
     */
    @Override
    public SResourceRecord setSeekSyntax(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.SEEK_SYNTAX</code>. 「seekSyntax」- 访问者语法
     */
    @Override
    public String getSeekSyntax() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.SEEK_CONFIG</code>. 「seekConfig」- 访问者配置
     */
    @Override
    public SResourceRecord setSeekConfig(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.SEEK_CONFIG</code>. 「seekConfig」- 访问者配置
     */
    @Override
    public String getSeekConfig() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.SEEK_COMPONENT</code>. 「seekComponent」- 访问者组件
     */
    @Override
    public SResourceRecord setSeekComponent(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.SEEK_COMPONENT</code>. 「seekComponent」- 访问者组件
     */
    @Override
    public String getSeekComponent() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public SResourceRecord setSigma(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    @Override
    public SResourceRecord setCategory(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    @Override
    public String getCategory() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SResourceRecord setLanguage(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SResourceRecord setActive(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SResourceRecord setMetadata(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public SResourceRecord setCreatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public SResourceRecord setCreatedBy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public SResourceRecord setUpdatedAt(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public SResourceRecord setUpdatedBy(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISResource from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setType(from.getType());
        setIdentifier(from.getIdentifier());
        setComment(from.getComment());
        setLevel(from.getLevel());
        setModeRole(from.getModeRole());
        setModeGroup(from.getModeGroup());
        setModeTree(from.getModeTree());
        setVirtual(from.getVirtual());
        setSeekSyntax(from.getSeekSyntax());
        setSeekConfig(from.getSeekConfig());
        setSeekComponent(from.getSeekComponent());
        setSigma(from.getSigma());
        setCategory(from.getCategory());
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
    public <E extends ISResource> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SResourceRecord
     */
    public SResourceRecord() {
        super(SResource.S_RESOURCE);
    }

    /**
     * Create a detached, initialised SResourceRecord
     */
    public SResourceRecord(String key, String code, String name, String type, String identifier, String comment, Integer level, String modeRole, String modeGroup, String modeTree, Boolean virtual, String seekSyntax, String seekConfig, String seekComponent, String sigma, String category, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(SResource.S_RESOURCE);

        set(0, key);
        set(1, code);
        set(2, name);
        set(3, type);
        set(4, identifier);
        set(5, comment);
        set(6, level);
        set(7, modeRole);
        set(8, modeGroup);
        set(9, modeTree);
        set(10, virtual);
        set(11, seekSyntax);
        set(12, seekConfig);
        set(13, seekComponent);
        set(14, sigma);
        set(15, category);
        set(16, language);
        set(17, active);
        set(18, metadata);
        set(19, createdAt);
        set(20, createdBy);
        set(21, updatedAt);
        set(22, updatedBy);
    }
}