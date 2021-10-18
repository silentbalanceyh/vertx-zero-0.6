/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.daos;


import cn.vertxup.atom.domain.tables.MAttribute;
import cn.vertxup.atom.domain.tables.records.MAttributeRecord;
import io.github.jklingsporn.vertx.jooq.future.VertxDAO;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;

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
public class MAttributeDao extends DAOImpl<MAttributeRecord, cn.vertxup.atom.domain.tables.pojos.MAttribute, String> implements VertxDAO<cn.vertxup.atom.domain.tables.records.MAttributeRecord, cn.vertxup.atom.domain.tables.pojos.MAttribute, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new MAttributeDao without any configuration
     */
    public MAttributeDao() {
        super(MAttribute.M_ATTRIBUTE, cn.vertxup.atom.domain.tables.pojos.MAttribute.class);
    }

    /**
     * Create a new MAttributeDao with an attached configuration
     */
    public MAttributeDao(Configuration configuration) {
        super(MAttribute.M_ATTRIBUTE, cn.vertxup.atom.domain.tables.pojos.MAttribute.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.atom.domain.tables.pojos.MAttribute object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByKey(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.atom.domain.tables.pojos.MAttribute fetchOneByKey(String value) {
        return fetchOne(MAttribute.M_ATTRIBUTE.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByName(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.NAME, values);
    }

    /**
     * Fetch records that have <code>ALIAS IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByAlias(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.ALIAS, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByType(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.TYPE, values);
    }

    /**
     * Fetch records that have <code>EXPRESSION IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByExpression(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.EXPRESSION, values);
    }

    /**
     * Fetch records that have <code>NORMALIZE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByNormalize(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.NORMALIZE, values);
    }

    /**
     * Fetch records that have <code>IN_COMPONENT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByInComponent(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.IN_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>OUT_COMPONENT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByOutComponent(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.OUT_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByModelId(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>COMMENTS IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByComments(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.COMMENTS, values);
    }

    /**
     * Fetch records that have <code>SOURCE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchBySource(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.SOURCE, values);
    }

    /**
     * Fetch records that have <code>SOURCE_FIELD IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchBySourceField(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.SOURCE_FIELD, values);
    }

    /**
     * Fetch records that have <code>SOURCE_CONFIG IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchBySourceConfig(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.SOURCE_CONFIG, values);
    }

    /**
     * Fetch records that have <code>SOURCE_REFERENCE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchBySourceReference(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.SOURCE_REFERENCE, values);
    }

    /**
     * Fetch records that have <code>SOURCE_EXTERNAL IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchBySourceExternal(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.SOURCE_EXTERNAL, values);
    }

    /**
     * Fetch records that have <code>IS_ARRAY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByIsArray(Boolean... values) {
        return fetch(MAttribute.M_ATTRIBUTE.IS_ARRAY, values);
    }

    /**
     * Fetch records that have <code>IS_REFER IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByIsRefer(Boolean... values) {
        return fetch(MAttribute.M_ATTRIBUTE.IS_REFER, values);
    }

    /**
     * Fetch records that have <code>IS_SYNC_IN IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByIsSyncIn(Boolean... values) {
        return fetch(MAttribute.M_ATTRIBUTE.IS_SYNC_IN, values);
    }

    /**
     * Fetch records that have <code>IS_SYNC_OUT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByIsSyncOut(Boolean... values) {
        return fetch(MAttribute.M_ATTRIBUTE.IS_SYNC_OUT, values);
    }

    /**
     * Fetch records that have <code>IS_LOCK IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByIsLock(Boolean... values) {
        return fetch(MAttribute.M_ATTRIBUTE.IS_LOCK, values);
    }

    /**
     * Fetch records that have <code>IS_TRACK IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByIsTrack(Boolean... values) {
        return fetch(MAttribute.M_ATTRIBUTE.IS_TRACK, values);
    }

    /**
     * Fetch records that have <code>IS_CONFIRM IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByIsConfirm(Boolean... values) {
        return fetch(MAttribute.M_ATTRIBUTE.IS_CONFIRM, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchBySigma(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByLanguage(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByActive(Boolean... values) {
        return fetch(MAttribute.M_ATTRIBUTE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByMetadata(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(MAttribute.M_ATTRIBUTE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByCreatedBy(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(MAttribute.M_ATTRIBUTE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchByUpdatedBy(String... values) {
        return fetch(MAttribute.M_ATTRIBUTE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.atom.domain.tables.pojos.MAttribute> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByNameAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.NAME, values);
    }

    /**
     * Fetch records that have <code>ALIAS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByAliasAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.ALIAS, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.TYPE, values);
    }

    /**
     * Fetch records that have <code>EXPRESSION IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByExpressionAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.EXPRESSION, values);
    }

    /**
     * Fetch records that have <code>NORMALIZE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByNormalizeAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.NORMALIZE, values);
    }

    /**
     * Fetch records that have <code>IN_COMPONENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByInComponentAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.IN_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>OUT_COMPONENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByOutComponentAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.OUT_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByModelIdAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>COMMENTS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByCommentsAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.COMMENTS, values);
    }

    /**
     * Fetch records that have <code>SOURCE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchBySourceAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.SOURCE, values);
    }

    /**
     * Fetch records that have <code>SOURCE_FIELD IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchBySourceFieldAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.SOURCE_FIELD, values);
    }

    /**
     * Fetch records that have <code>SOURCE_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchBySourceConfigAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.SOURCE_CONFIG, values);
    }

    /**
     * Fetch records that have <code>SOURCE_REFERENCE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchBySourceReferenceAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.SOURCE_REFERENCE, values);
    }

    /**
     * Fetch records that have <code>SOURCE_EXTERNAL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchBySourceExternalAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.SOURCE_EXTERNAL, values);
    }

    /**
     * Fetch records that have <code>IS_ARRAY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByIsArrayAsync(List<Boolean> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.IS_ARRAY, values);
    }

    /**
     * Fetch records that have <code>IS_REFER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByIsReferAsync(List<Boolean> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.IS_REFER, values);
    }

    /**
     * Fetch records that have <code>IS_SYNC_IN IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByIsSyncInAsync(List<Boolean> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.IS_SYNC_IN, values);
    }

    /**
     * Fetch records that have <code>IS_SYNC_OUT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByIsSyncOutAsync(List<Boolean> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.IS_SYNC_OUT, values);
    }

    /**
     * Fetch records that have <code>IS_LOCK IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByIsLockAsync(List<Boolean> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.IS_LOCK, values);
    }

    /**
     * Fetch records that have <code>IS_TRACK IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByIsTrackAsync(List<Boolean> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.IS_TRACK, values);
    }

    /**
     * Fetch records that have <code>IS_CONFIRM IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByIsConfirmAsync(List<Boolean> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.IS_CONFIRM, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.atom.domain.tables.pojos.MAttribute>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(MAttribute.M_ATTRIBUTE.UPDATED_BY, values);
    }

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
