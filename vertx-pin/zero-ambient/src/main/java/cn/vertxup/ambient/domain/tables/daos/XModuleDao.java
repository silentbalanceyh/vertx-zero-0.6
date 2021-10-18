/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XModule;
import cn.vertxup.ambient.domain.tables.records.XModuleRecord;
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
public class XModuleDao extends DAOImpl<XModuleRecord, cn.vertxup.ambient.domain.tables.pojos.XModule, String> implements VertxDAO<cn.vertxup.ambient.domain.tables.records.XModuleRecord, cn.vertxup.ambient.domain.tables.pojos.XModule, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new XModuleDao without any configuration
     */
    public XModuleDao() {
        super(XModule.X_MODULE, cn.vertxup.ambient.domain.tables.pojos.XModule.class);
    }

    /**
     * Create a new XModuleDao with an attached configuration
     */
    public XModuleDao(Configuration configuration) {
        super(XModule.X_MODULE, cn.vertxup.ambient.domain.tables.pojos.XModule.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ambient.domain.tables.pojos.XModule object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByKey(String... values) {
        return fetch(XModule.X_MODULE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ambient.domain.tables.pojos.XModule fetchOneByKey(String value) {
        return fetchOne(XModule.X_MODULE.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByName(String... values) {
        return fetch(XModule.X_MODULE.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByCode(String... values) {
        return fetch(XModule.X_MODULE.CODE, values);
    }

    /**
     * Fetch records that have <code>ENTRY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByEntry(String... values) {
        return fetch(XModule.X_MODULE.ENTRY, values);
    }

    /**
     * Fetch records that have <code>APP_ID IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByAppId(String... values) {
        return fetch(XModule.X_MODULE.APP_ID, values);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByModelId(String... values) {
        return fetch(XModule.X_MODULE.MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByActive(Boolean... values) {
        return fetch(XModule.X_MODULE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchBySigma(String... values) {
        return fetch(XModule.X_MODULE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByMetadata(String... values) {
        return fetch(XModule.X_MODULE.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByLanguage(String... values) {
        return fetch(XModule.X_MODULE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(XModule.X_MODULE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByCreatedBy(String... values) {
        return fetch(XModule.X_MODULE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(XModule.X_MODULE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchByUpdatedBy(String... values) {
        return fetch(XModule.X_MODULE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ambient.domain.tables.pojos.XModule> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByNameAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.CODE, values);
    }

    /**
     * Fetch records that have <code>ENTRY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByEntryAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.ENTRY, values);
    }

    /**
     * Fetch records that have <code>APP_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByAppIdAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.APP_ID, values);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByModelIdAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(XModule.X_MODULE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XModule.X_MODULE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XModule.X_MODULE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XModule>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(XModule.X_MODULE.UPDATED_BY, values);
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
