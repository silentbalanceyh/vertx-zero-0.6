/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XLog;
import cn.vertxup.ambient.domain.tables.records.XLogRecord;
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
public class XLogDao extends DAOImpl<XLogRecord, cn.vertxup.ambient.domain.tables.pojos.XLog, String> implements VertxDAO<cn.vertxup.ambient.domain.tables.records.XLogRecord, cn.vertxup.ambient.domain.tables.pojos.XLog, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new XLogDao without any configuration
     */
    public XLogDao() {
        super(XLog.X_LOG, cn.vertxup.ambient.domain.tables.pojos.XLog.class);
    }

    /**
     * Create a new XLogDao with an attached configuration
     */
    public XLogDao(Configuration configuration) {
        super(XLog.X_LOG, cn.vertxup.ambient.domain.tables.pojos.XLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ambient.domain.tables.pojos.XLog object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByKey(String... values) {
        return fetch(XLog.X_LOG.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ambient.domain.tables.pojos.XLog fetchOneByKey(String value) {
        return fetchOne(XLog.X_LOG.KEY, value);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByType(String... values) {
        return fetch(XLog.X_LOG.TYPE, values);
    }

    /**
     * Fetch records that have <code>LEVEL IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByLevel(String... values) {
        return fetch(XLog.X_LOG.LEVEL, values);
    }

    /**
     * Fetch records that have <code>INFO_STACK IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByInfoStack(String... values) {
        return fetch(XLog.X_LOG.INFO_STACK, values);
    }

    /**
     * Fetch records that have <code>INFO_SYSTEM IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByInfoSystem(String... values) {
        return fetch(XLog.X_LOG.INFO_SYSTEM, values);
    }

    /**
     * Fetch records that have <code>INFO_READABLE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByInfoReadable(String... values) {
        return fetch(XLog.X_LOG.INFO_READABLE, values);
    }

    /**
     * Fetch records that have <code>INFO_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByInfoAt(LocalDateTime... values) {
        return fetch(XLog.X_LOG.INFO_AT, values);
    }

    /**
     * Fetch records that have <code>LOG_AGENT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByLogAgent(String... values) {
        return fetch(XLog.X_LOG.LOG_AGENT, values);
    }

    /**
     * Fetch records that have <code>LOG_IP IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByLogIp(String... values) {
        return fetch(XLog.X_LOG.LOG_IP, values);
    }

    /**
     * Fetch records that have <code>LOG_USER IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByLogUser(String... values) {
        return fetch(XLog.X_LOG.LOG_USER, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByActive(Boolean... values) {
        return fetch(XLog.X_LOG.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchBySigma(String... values) {
        return fetch(XLog.X_LOG.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByMetadata(String... values) {
        return fetch(XLog.X_LOG.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByLanguage(String... values) {
        return fetch(XLog.X_LOG.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(XLog.X_LOG.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByCreatedBy(String... values) {
        return fetch(XLog.X_LOG.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(XLog.X_LOG.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchByUpdatedBy(String... values) {
        return fetch(XLog.X_LOG.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ambient.domain.tables.pojos.XLog> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.TYPE, values);
    }

    /**
     * Fetch records that have <code>LEVEL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByLevelAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.LEVEL, values);
    }

    /**
     * Fetch records that have <code>INFO_STACK IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByInfoStackAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.INFO_STACK, values);
    }

    /**
     * Fetch records that have <code>INFO_SYSTEM IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByInfoSystemAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.INFO_SYSTEM, values);
    }

    /**
     * Fetch records that have <code>INFO_READABLE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByInfoReadableAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.INFO_READABLE, values);
    }

    /**
     * Fetch records that have <code>INFO_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByInfoAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XLog.X_LOG.INFO_AT, values);
    }

    /**
     * Fetch records that have <code>LOG_AGENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByLogAgentAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.LOG_AGENT, values);
    }

    /**
     * Fetch records that have <code>LOG_IP IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByLogIpAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.LOG_IP, values);
    }

    /**
     * Fetch records that have <code>LOG_USER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByLogUserAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.LOG_USER, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(XLog.X_LOG.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XLog.X_LOG.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XLog.X_LOG.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XLog>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(XLog.X_LOG.UPDATED_BY, values);
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
