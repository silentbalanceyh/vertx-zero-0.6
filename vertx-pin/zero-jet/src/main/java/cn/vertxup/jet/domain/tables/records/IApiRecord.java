/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain.tables.records;


import cn.vertxup.jet.domain.tables.IApi;
import cn.vertxup.jet.domain.tables.interfaces.IIApi;
import org.jooq.Record1;
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
public class IApiRecord extends UpdatableRecordImpl<IApiRecord> implements IIApi {

    private static final long serialVersionUID = 520198045;

    /**
     * Create a detached IApiRecord
     */
    public IApiRecord() {
        super(IApi.I_API);
    }

    /**
     * Create a detached, initialised IApiRecord
     */
    public IApiRecord(String key, String name, String uri, String method, String consumes, String produces, Boolean secure, String comment, String type, String paramMode, String paramRequired, String paramContained, String inRule, String inMapping, String inPlug, String inScript, String outWriter, String workerType, String workerAddress, String workerConsumer, String workerClass, String workerJs, String serviceId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(IApi.I_API);

        set(0, key);
        set(1, name);
        set(2, uri);
        set(3, method);
        set(4, consumes);
        set(5, produces);
        set(6, secure);
        set(7, comment);
        set(8, type);
        set(9, paramMode);
        set(10, paramRequired);
        set(11, paramContained);
        set(12, inRule);
        set(13, inMapping);
        set(14, inPlug);
        set(15, inScript);
        set(16, outWriter);
        set(17, workerType);
        set(18, workerAddress);
        set(19, workerConsumer);
        set(20, workerClass);
        set(21, workerJs);
        set(22, serviceId);
        set(23, sigma);
        set(24, language);
        set(25, active);
        set(26, metadata);
        set(27, createdAt);
        set(28, createdBy);
        set(29, updatedAt);
        set(30, updatedBy);
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.KEY</code>. ???key???- ??????ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.KEY</code>. ???key???- ??????ID
     */
    @Override
    public IApiRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.NAME</code>. ???name???- ????????????
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.NAME</code>. ???name???- ????????????
     */
    @Override
    public IApiRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.URI</code>. ???uri???- ????????????????????????????????? /api ??????
     */
    @Override
    public String getUri() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.URI</code>. ???uri???- ????????????????????????????????? /api ??????
     */
    @Override
    public IApiRecord setUri(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.METHOD</code>. ???method???- ???????????????HTTP??????
     */
    @Override
    public String getMethod() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.METHOD</code>. ???method???- ???????????????HTTP??????
     */
    @Override
    public IApiRecord setMethod(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.CONSUMES</code>. ???consumes???- ?????????????????????????????? MIME
     */
    @Override
    public String getConsumes() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.CONSUMES</code>. ???consumes???- ?????????????????????????????? MIME
     */
    @Override
    public IApiRecord setConsumes(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.PRODUCES</code>. ???produces???- ?????????????????????????????? MIME
     */
    @Override
    public String getProduces() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.PRODUCES</code>. ???produces???- ?????????????????????????????? MIME
     */
    @Override
    public IApiRecord setProduces(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.SECURE</code>. ???secure???- ?????????????????????????????????TRUE
     */
    @Override
    public Boolean getSecure() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.SECURE</code>. ???secure???- ?????????????????????????????????TRUE
     */
    @Override
    public IApiRecord setSecure(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.COMMENT</code>. ???comment???- ????????????
     */
    @Override
    public String getComment() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.COMMENT</code>. ???comment???- ????????????
     */
    @Override
    public IApiRecord setComment(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.TYPE</code>. ???type???- ???????????????ONE-WAY / REQUEST-RESPONSE / PUBLISH-SUBSCRIBE
     */
    @Override
    public String getType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.TYPE</code>. ???type???- ???????????????ONE-WAY / REQUEST-RESPONSE / PUBLISH-SUBSCRIBE
     */
    @Override
    public IApiRecord setType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.PARAM_MODE</code>. ???paramMode???- ???????????????QUERY / BODY / DEFINE / PATH
     */
    @Override
    public String getParamMode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.PARAM_MODE</code>. ???paramMode???- ???????????????QUERY / BODY / DEFINE / PATH
     */
    @Override
    public IApiRecord setParamMode(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.PARAM_REQUIRED</code>. ???paramRequired???- ????????????????????????JsonArray???????????? 400?????????????????????Query???Path???
     */
    @Override
    public String getParamRequired() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.PARAM_REQUIRED</code>. ???paramRequired???- ????????????????????????JsonArray???????????? 400?????????????????????Query???Path???
     */
    @Override
    public IApiRecord setParamRequired(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.PARAM_CONTAINED</code>. ???paramContained???- ????????????????????????JsonArray???????????? 400?????????????????????Body???
     */
    @Override
    public String getParamContained() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.PARAM_CONTAINED</code>. ???paramContained???- ????????????????????????JsonArray???????????? 400?????????????????????Body???
     */
    @Override
    public IApiRecord setParamContained(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.IN_RULE</code>. ???inRule???- ?????????????????????????????????
     */
    @Override
    public String getInRule() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.IN_RULE</code>. ???inRule???- ?????????????????????????????????
     */
    @Override
    public IApiRecord setInRule(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.IN_MAPPING</code>. ???inMapping???- ??????????????????
     */
    @Override
    public String getInMapping() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.IN_MAPPING</code>. ???inMapping???- ??????????????????
     */
    @Override
    public IApiRecord setInMapping(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.IN_PLUG</code>. ???inPlug???- ??????????????????????????????
     */
    @Override
    public String getInPlug() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.IN_PLUG</code>. ???inPlug???- ??????????????????????????????
     */
    @Override
    public IApiRecord setInPlug(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.IN_SCRIPT</code>. ???inScript???- ????????????????????????????????????????????????
     */
    @Override
    public String getInScript() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.IN_SCRIPT</code>. ???inScript???- ????????????????????????????????????????????????
     */
    @Override
    public IApiRecord setInScript(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.OUT_WRITER</code>. ???outWriter???- ?????????????????????
     */
    @Override
    public String getOutWriter() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.OUT_WRITER</code>. ???outWriter???- ?????????????????????
     */
    @Override
    public IApiRecord setOutWriter(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_TYPE</code>. ???workerType???- Worker?????????JS / PLUG / STD
     */
    @Override
    public String getWorkerType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_TYPE</code>. ???workerType???- Worker?????????JS / PLUG / STD
     */
    @Override
    public IApiRecord setWorkerType(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_ADDRESS</code>. ???workerAddress???- ??????????????????
     */
    @Override
    public String getWorkerAddress() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_ADDRESS</code>. ???workerAddress???- ??????????????????
     */
    @Override
    public IApiRecord setWorkerAddress(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_CONSUMER</code>. ???workerConsumer???- ??????????????????????????????
     */
    @Override
    public String getWorkerConsumer() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_CONSUMER</code>. ???workerConsumer???- ??????????????????????????????
     */
    @Override
    public IApiRecord setWorkerConsumer(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_CLASS</code>. ???workerClass???- OX | PLUG?????????????????????????????????JavaClass??????
     */
    @Override
    public String getWorkerClass() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_CLASS</code>. ???workerClass???- OX | PLUG?????????????????????????????????JavaClass??????
     */
    @Override
    public IApiRecord setWorkerClass(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.WORKER_JS</code>. ???workerJs???- JS ?????????JavaScript?????????runtime/workers/&lt;app&gt;/???????????????
     */
    @Override
    public String getWorkerJs() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.WORKER_JS</code>. ???workerJs???- JS ?????????JavaScript?????????runtime/workers/&lt;app&gt;/???????????????
     */
    @Override
    public IApiRecord setWorkerJs(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.SERVICE_ID</code>. ???serviceId???- ???????????????ID
     */
    @Override
    public String getServiceId() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.SERVICE_ID</code>. ???serviceId???- ???????????????ID
     */
    @Override
    public IApiRecord setServiceId(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.SIGMA</code>. ???sigma???- ????????????
     */
    @Override
    public String getSigma() {
        return (String) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.SIGMA</code>. ???sigma???- ????????????
     */
    @Override
    public IApiRecord setSigma(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.LANGUAGE</code>. ???language???- ???????????????
     */
    @Override
    public String getLanguage() {
        return (String) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.LANGUAGE</code>. ???language???- ???????????????
     */
    @Override
    public IApiRecord setLanguage(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.ACTIVE</code>. ???active???- ????????????
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.ACTIVE</code>. ???active???- ????????????
     */
    @Override
    public IApiRecord setActive(Boolean value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.METADATA</code>. ???metadata???- ??????????????????
     */
    @Override
    public String getMetadata() {
        return (String) get(26);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.METADATA</code>. ???metadata???- ??????????????????
     */
    @Override
    public IApiRecord setMetadata(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.CREATED_AT</code>. ???createdAt???- ????????????
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(27);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.CREATED_AT</code>. ???createdAt???- ????????????
     */
    @Override
    public IApiRecord setCreatedAt(LocalDateTime value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.CREATED_BY</code>. ???createdBy???- ?????????
     */
    @Override
    public String getCreatedBy() {
        return (String) get(28);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.CREATED_BY</code>. ???createdBy???- ?????????
     */
    @Override
    public IApiRecord setCreatedBy(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.I_API.UPDATED_AT</code>. ???updatedAt???- ????????????
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(29);
    }

    /**
     * Setter for <code>DB_ETERNAL.I_API.UPDATED_AT</code>. ???updatedAt???- ????????????
     */
    @Override
    public IApiRecord setUpdatedAt(LocalDateTime value) {
        set(29, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_ETERNAL.I_API.UPDATED_BY</code>. ???updatedBy???- ?????????
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(30);
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_ETERNAL.I_API.UPDATED_BY</code>. ???updatedBy???- ?????????
     */
    @Override
    public IApiRecord setUpdatedBy(String value) {
        set(30, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IIApi from) {
        setKey(from.getKey());
        setName(from.getName());
        setUri(from.getUri());
        setMethod(from.getMethod());
        setConsumes(from.getConsumes());
        setProduces(from.getProduces());
        setSecure(from.getSecure());
        setComment(from.getComment());
        setType(from.getType());
        setParamMode(from.getParamMode());
        setParamRequired(from.getParamRequired());
        setParamContained(from.getParamContained());
        setInRule(from.getInRule());
        setInMapping(from.getInMapping());
        setInPlug(from.getInPlug());
        setInScript(from.getInScript());
        setOutWriter(from.getOutWriter());
        setWorkerType(from.getWorkerType());
        setWorkerAddress(from.getWorkerAddress());
        setWorkerConsumer(from.getWorkerConsumer());
        setWorkerClass(from.getWorkerClass());
        setWorkerJs(from.getWorkerJs());
        setServiceId(from.getServiceId());
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
    public <E extends IIApi> E into(E into) {
        into.from(this);
        return into;
    }
}
