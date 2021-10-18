/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.SGroup;
import cn.vertxup.rbac.domain.tables.records.SGroupRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
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
public class SGroupDao extends DAOImpl<SGroupRecord, cn.vertxup.rbac.domain.tables.pojos.SGroup, String> implements VertxDAO<cn.vertxup.rbac.domain.tables.records.SGroupRecord,cn.vertxup.rbac.domain.tables.pojos.SGroup,java.lang.String> {

    /**
     * Create a new SGroupDao without any configuration
     */
    public SGroupDao() {
        super(SGroup.S_GROUP, cn.vertxup.rbac.domain.tables.pojos.SGroup.class);
    }

    /**
     * Create a new SGroupDao with an attached configuration
     */
    public SGroupDao(Configuration configuration) {
        super(SGroup.S_GROUP, cn.vertxup.rbac.domain.tables.pojos.SGroup.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.rbac.domain.tables.pojos.SGroup object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByKey(String... values) {
        return fetch(SGroup.S_GROUP.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.rbac.domain.tables.pojos.SGroup fetchOneByKey(String value) {
        return fetchOne(SGroup.S_GROUP.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByName(String... values) {
        return fetch(SGroup.S_GROUP.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByCode(String... values) {
        return fetch(SGroup.S_GROUP.CODE, values);
    }

    /**
     * Fetch records that have <code>PARENT_ID IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByParentId(String... values) {
        return fetch(SGroup.S_GROUP.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByModelId(String... values) {
        return fetch(SGroup.S_GROUP.MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>MODEL_KEY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByModelKey(String... values) {
        return fetch(SGroup.S_GROUP.MODEL_KEY, values);
    }

    /**
     * Fetch records that have <code>CATEGORY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByCategory(String... values) {
        return fetch(SGroup.S_GROUP.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchBySigma(String... values) {
        return fetch(SGroup.S_GROUP.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByLanguage(String... values) {
        return fetch(SGroup.S_GROUP.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByActive(Boolean... values) {
        return fetch(SGroup.S_GROUP.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByMetadata(String... values) {
        return fetch(SGroup.S_GROUP.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(SGroup.S_GROUP.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByCreatedBy(String... values) {
        return fetch(SGroup.S_GROUP.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(SGroup.S_GROUP.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchByUpdatedBy(String... values) {
        return fetch(SGroup.S_GROUP.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.KEY,values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.rbac.domain.tables.pojos.SGroup> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByKey(value)),vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByNameAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.NAME,values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.CODE,values);
    }

    /**
     * Fetch records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByParentIdAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.PARENT_ID,values);
    }

    /**
     * Fetch records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByModelIdAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.MODEL_ID,values);
    }

    /**
     * Fetch records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByModelKeyAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.MODEL_KEY,values);
    }

    /**
     * Fetch records that have <code>CATEGORY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByCategoryAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.CATEGORY,values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.SIGMA,values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(SGroup.S_GROUP.ACTIVE,values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.METADATA,values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SGroup.S_GROUP.CREATED_AT,values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.CREATED_BY,values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SGroup.S_GROUP.UPDATED_AT,values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SGroup>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(SGroup.S_GROUP.UPDATED_BY,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
