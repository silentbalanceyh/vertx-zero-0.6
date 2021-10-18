/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.interfaces;


import javax.annotation.Generated;
import java.io.Serializable;
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
public interface IXNumber extends Serializable {

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.KEY</code>. 「key」- 主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.KEY</code>. 「key」- 主键
     */
    public IXNumber setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.CODE</code>. 「code」- 编码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.CODE</code>. 「code」- 编码
     */
    public IXNumber setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.COMMENT</code>. 「comment」- 编号备注信息，用于描述编号数据,comment,S_COMMENT
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.COMMENT</code>. 「comment」- 编号备注信息，用于描述编号数据,comment,S_COMMENT
     */
    public IXNumber setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.CURRENT</code>. 「current」编号当前值，对应${seed}，每次变化时current提取后更新为：current + step或current - step,current,L_CURRENT
     */
    public Long getCurrent();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.CURRENT</code>. 「current」编号当前值，对应${seed}，每次变化时current提取后更新为：current + step或current - step,current,L_CURRENT
     */
    public IXNumber setCurrent(Long value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.FORMAT</code>. 「format」格式信息，用于处理最终格式：,format,S_FORMAT
     */
    public String getFormat();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.FORMAT</code>. 「format」格式信息，用于处理最终格式：,format,S_FORMAT
     */
    public IXNumber setFormat(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.IDENTIFIER</code>. 「identifier」编号对应的identifier，用于查询当前identifier使用的序号信息,identifier,S_IDENTIFIER
     */
    public String getIdentifier();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.IDENTIFIER</code>. 「identifier」编号对应的identifier，用于查询当前identifier使用的序号信息,identifier,S_IDENTIFIER
     */
    public IXNumber setIdentifier(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.PREFIX</code>. 「prefix」编号前缀,prefix,S_PREFIX
     */
    public String getPrefix();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.PREFIX</code>. 「prefix」编号前缀,prefix,S_PREFIX
     */
    public IXNumber setPrefix(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.SUFFIX</code>. 「suffix」编号后缀,suffix,S_SUFFIX
     */
    public String getSuffix();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.SUFFIX</code>. 「suffix」编号后缀,suffix,S_SUFFIX
     */
    public IXNumber setSuffix(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.TIME</code>. 「time」时间对应Pattern，对应${time}：YYYY-MM-DD HH:mm:ss用于描述时间格式生成序号时间部分,time,S_TIME
     */
    public String getTime();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.TIME</code>. 「time」时间对应Pattern，对应${time}：YYYY-MM-DD HH:mm:ss用于描述时间格式生成序号时间部分,time,S_TIME
     */
    public IXNumber setTime(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.LENGTH</code>. 「length」编号长度，编号长度不包含prefix和suffix部分,length,I_LENGTH
     */
    public Integer getLength();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.LENGTH</code>. 「length」编号长度，编号长度不包含prefix和suffix部分,length,I_LENGTH
     */
    public IXNumber setLength(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.STEP</code>. 「step」编号的步进系数，每次按照step进行变化,step,I_STEP
     */
    public Integer getStep();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.STEP</code>. 「step」编号的步进系数，每次按照step进行变化,step,I_STEP
     */
    public IXNumber setStep(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.DECREMENT</code>. 「decrement」递增/递减？如果为true则递减，为false则是递增,decrement,IS_DECREMENT
     */
    public Boolean getDecrement();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.DECREMENT</code>. 「decrement」递增/递减？如果为true则递减，为false则是递增,decrement,IS_DECREMENT
     */
    public IXNumber setDecrement(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public String getAppId();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public IXNumber setAppId(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.ACTIVE</code>. 「active」- 是否启用
     */
    public IXNumber setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXNumber setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.METADATA</code>. 「metadata」- 附加配置
     */
    public IXNumber setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXNumber setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXNumber setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXNumber setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXNumber setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_NUMBER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>DB_ETERNAL.X_NUMBER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXNumber setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IXNumber
     */
    public void from(cn.vertxup.ambient.domain.tables.interfaces.IXNumber from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IXNumber
     */
    public <E extends cn.vertxup.ambient.domain.tables.interfaces.IXNumber> E into(E into);

    default IXNumber fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setCode(json.getString("CODE"));
        setComment(json.getString("COMMENT"));
        setCurrent(json.getLong("CURRENT"));
        setFormat(json.getString("FORMAT"));
        setIdentifier(json.getString("IDENTIFIER"));
        setPrefix(json.getString("PREFIX"));
        setSuffix(json.getString("SUFFIX"));
        setTime(json.getString("TIME"));
        setLength(json.getInteger("LENGTH"));
        setStep(json.getInteger("STEP"));
        setDecrement(json.getBoolean("DECREMENT"));
        setAppId(json.getString("APP_ID"));
        setActive(json.getBoolean("ACTIVE"));
        setSigma(json.getString("SIGMA"));
        setMetadata(json.getString("METADATA"));
        setLanguage(json.getString("LANGUAGE"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("CODE", getCode());
        json.put("COMMENT", getComment());
        json.put("CURRENT", getCurrent());
        json.put("FORMAT", getFormat());
        json.put("IDENTIFIER", getIdentifier());
        json.put("PREFIX", getPrefix());
        json.put("SUFFIX", getSuffix());
        json.put("TIME", getTime());
        json.put("LENGTH", getLength());
        json.put("STEP", getStep());
        json.put("DECREMENT", getDecrement());
        json.put("APP_ID", getAppId());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("METADATA", getMetadata());
        json.put("LANGUAGE", getLanguage());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY", getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}