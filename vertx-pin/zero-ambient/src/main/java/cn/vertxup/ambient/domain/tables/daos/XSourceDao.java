/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.daos;


import cn.vertxup.ambient.domain.tables.XSource;
import cn.vertxup.ambient.domain.tables.records.XSourceRecord;
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
public class XSourceDao extends DAOImpl<XSourceRecord, cn.vertxup.ambient.domain.tables.pojos.XSource, String> implements VertxDAO<cn.vertxup.ambient.domain.tables.records.XSourceRecord, cn.vertxup.ambient.domain.tables.pojos.XSource, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new XSourceDao without any configuration
     */
    public XSourceDao() {
        super(XSource.X_SOURCE, cn.vertxup.ambient.domain.tables.pojos.XSource.class);
    }

    /**
     * Create a new XSourceDao with an attached configuration
     */
    public XSourceDao(Configuration configuration) {
        super(XSource.X_SOURCE, cn.vertxup.ambient.domain.tables.pojos.XSource.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ambient.domain.tables.pojos.XSource object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByKey(String... values) {
        return fetch(XSource.X_SOURCE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ambient.domain.tables.pojos.XSource fetchOneByKey(String value) {
        return fetchOne(XSource.X_SOURCE.KEY, value);
    }

    /**
     * Fetch records that have <code>IP_V4 IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByIpV4(String... values) {
        return fetch(XSource.X_SOURCE.IP_V4, values);
    }

    /**
     * Fetch records that have <code>IP_V6 IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByIpV6(String... values) {
        return fetch(XSource.X_SOURCE.IP_V6, values);
    }

    /**
     * Fetch records that have <code>HOSTNAME IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByHostname(String... values) {
        return fetch(XSource.X_SOURCE.HOSTNAME, values);
    }

    /**
     * Fetch records that have <code>PORT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByPort(Integer... values) {
        return fetch(XSource.X_SOURCE.PORT, values);
    }

    /**
     * Fetch records that have <code>CATEGORY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByCategory(String... values) {
        return fetch(XSource.X_SOURCE.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>DRIVER_CLASS_NAME IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByDriverClassName(String... values) {
        return fetch(XSource.X_SOURCE.DRIVER_CLASS_NAME, values);
    }

    /**
     * Fetch records that have <code>JDBC_URL IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByJdbcUrl(String... values) {
        return fetch(XSource.X_SOURCE.JDBC_URL, values);
    }

    /**
     * Fetch records that have <code>JDBC_CONFIG IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByJdbcConfig(String... values) {
        return fetch(XSource.X_SOURCE.JDBC_CONFIG, values);
    }

    /**
     * Fetch records that have <code>INSTANCE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByInstance(String... values) {
        return fetch(XSource.X_SOURCE.INSTANCE, values);
    }

    /**
     * Fetch records that have <code>USERNAME IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByUsername(String... values) {
        return fetch(XSource.X_SOURCE.USERNAME, values);
    }

    /**
     * Fetch records that have <code>PASSWORD IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByPassword(String... values) {
        return fetch(XSource.X_SOURCE.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>APP_ID IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByAppId(String... values) {
        return fetch(XSource.X_SOURCE.APP_ID, values);
    }

    /**
     * Fetch a unique record that has <code>APP_ID = value</code>
     */
    public cn.vertxup.ambient.domain.tables.pojos.XSource fetchOneByAppId(String value) {
        return fetchOne(XSource.X_SOURCE.APP_ID, value);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByActive(Boolean... values) {
        return fetch(XSource.X_SOURCE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchBySigma(String... values) {
        return fetch(XSource.X_SOURCE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByMetadata(String... values) {
        return fetch(XSource.X_SOURCE.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByLanguage(String... values) {
        return fetch(XSource.X_SOURCE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(XSource.X_SOURCE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByCreatedBy(String... values) {
        return fetch(XSource.X_SOURCE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(XSource.X_SOURCE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchByUpdatedBy(String... values) {
        return fetch(XSource.X_SOURCE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>IP_V4 IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByIpV4Async(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.IP_V4, values);
    }

    /**
     * Fetch records that have <code>IP_V6 IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByIpV6Async(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.IP_V6, values);
    }

    /**
     * Fetch records that have <code>HOSTNAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByHostnameAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.HOSTNAME, values);
    }

    /**
     * Fetch records that have <code>PORT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByPortAsync(List<Integer> values) {
        return fetchAsync(XSource.X_SOURCE.PORT, values);
    }

    /**
     * Fetch records that have <code>CATEGORY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByCategoryAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>DRIVER_CLASS_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByDriverClassNameAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.DRIVER_CLASS_NAME, values);
    }

    /**
     * Fetch records that have <code>JDBC_URL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByJdbcUrlAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.JDBC_URL, values);
    }

    /**
     * Fetch records that have <code>JDBC_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByJdbcConfigAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.JDBC_CONFIG, values);
    }

    /**
     * Fetch records that have <code>INSTANCE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByInstanceAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.INSTANCE, values);
    }

    /**
     * Fetch records that have <code>USERNAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByUsernameAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.USERNAME, values);
    }

    /**
     * Fetch records that have <code>PASSWORD IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByPasswordAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>APP_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByAppIdAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.APP_ID, values);
    }

    /**
     * Fetch a unique record that has <code>APP_ID = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ambient.domain.tables.pojos.XSource> fetchOneByAppIdAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByAppId(value)), vertx());
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(XSource.X_SOURCE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XSource.X_SOURCE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(XSource.X_SOURCE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ambient.domain.tables.pojos.XSource>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(XSource.X_SOURCE.UPDATED_BY, values);
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
