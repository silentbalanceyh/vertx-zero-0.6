/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables.daos;


import cn.vertxup.lbs.domain.tables.LTent;
import cn.vertxup.lbs.domain.tables.records.LTentRecord;
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
public class LTentDao extends DAOImpl<LTentRecord, cn.vertxup.lbs.domain.tables.pojos.LTent, String> implements VertxDAO<cn.vertxup.lbs.domain.tables.records.LTentRecord, cn.vertxup.lbs.domain.tables.pojos.LTent, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new LTentDao without any configuration
     */
    public LTentDao() {
        super(LTent.L_TENT, cn.vertxup.lbs.domain.tables.pojos.LTent.class);
    }

    /**
     * Create a new LTentDao with an attached configuration
     */
    public LTentDao(Configuration configuration) {
        super(LTent.L_TENT, cn.vertxup.lbs.domain.tables.pojos.LTent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.lbs.domain.tables.pojos.LTent object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByKey(String... values) {
        return fetch(LTent.L_TENT.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.lbs.domain.tables.pojos.LTent fetchOneByKey(String value) {
        return fetchOne(LTent.L_TENT.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByName(String... values) {
        return fetch(LTent.L_TENT.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByCode(String... values) {
        return fetch(LTent.L_TENT.CODE, values);
    }

    /**
     * Fetch records that have <code>CONTACT_PHONE IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByContactPhone(String... values) {
        return fetch(LTent.L_TENT.CONTACT_PHONE, values);
    }

    /**
     * Fetch records that have <code>CONTACT_NAME IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByContactName(String... values) {
        return fetch(LTent.L_TENT.CONTACT_NAME, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByMetadata(String... values) {
        return fetch(LTent.L_TENT.METADATA, values);
    }

    /**
     * Fetch records that have <code>ORDER IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByOrder(Integer... values) {
        return fetch(LTent.L_TENT.ORDER, values);
    }

    /**
     * Fetch records that have <code>LOCATION_ID IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByLocationId(String... values) {
        return fetch(LTent.L_TENT.LOCATION_ID, values);
    }

    /**
     * Fetch records that have <code>YARD_ID IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByYardId(String... values) {
        return fetch(LTent.L_TENT.YARD_ID, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByActive(Boolean... values) {
        return fetch(LTent.L_TENT.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchBySigma(String... values) {
        return fetch(LTent.L_TENT.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByLanguage(String... values) {
        return fetch(LTent.L_TENT.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(LTent.L_TENT.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByCreatedBy(String... values) {
        return fetch(LTent.L_TENT.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(LTent.L_TENT.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchByUpdatedBy(String... values) {
        return fetch(LTent.L_TENT.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.lbs.domain.tables.pojos.LTent> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByNameAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.CODE, values);
    }

    /**
     * Fetch records that have <code>CONTACT_PHONE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByContactPhoneAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.CONTACT_PHONE, values);
    }

    /**
     * Fetch records that have <code>CONTACT_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByContactNameAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.CONTACT_NAME, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.METADATA, values);
    }

    /**
     * Fetch records that have <code>ORDER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByOrderAsync(List<Integer> values) {
        return fetchAsync(LTent.L_TENT.ORDER, values);
    }

    /**
     * Fetch records that have <code>LOCATION_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByLocationIdAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.LOCATION_ID, values);
    }

    /**
     * Fetch records that have <code>YARD_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByYardIdAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.YARD_ID, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(LTent.L_TENT.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(LTent.L_TENT.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(LTent.L_TENT.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.lbs.domain.tables.pojos.LTent>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(LTent.L_TENT.UPDATED_BY, values);
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
