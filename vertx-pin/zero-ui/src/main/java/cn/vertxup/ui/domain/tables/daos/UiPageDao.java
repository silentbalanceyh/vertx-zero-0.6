/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.daos;


import cn.vertxup.ui.domain.tables.UiPage;
import cn.vertxup.ui.domain.tables.records.UiPageRecord;
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
public class UiPageDao extends DAOImpl<UiPageRecord, cn.vertxup.ui.domain.tables.pojos.UiPage, String> implements VertxDAO<cn.vertxup.ui.domain.tables.records.UiPageRecord, cn.vertxup.ui.domain.tables.pojos.UiPage, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new UiPageDao without any configuration
     */
    public UiPageDao() {
        super(UiPage.UI_PAGE, cn.vertxup.ui.domain.tables.pojos.UiPage.class);
    }

    /**
     * Create a new UiPageDao with an attached configuration
     */
    public UiPageDao(Configuration configuration) {
        super(UiPage.UI_PAGE, cn.vertxup.ui.domain.tables.pojos.UiPage.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ui.domain.tables.pojos.UiPage object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByKey(String... values) {
        return fetch(UiPage.UI_PAGE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ui.domain.tables.pojos.UiPage fetchOneByKey(String value) {
        return fetchOne(UiPage.UI_PAGE.KEY, value);
    }

    /**
     * Fetch records that have <code>APP IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByApp(String... values) {
        return fetch(UiPage.UI_PAGE.APP, values);
    }

    /**
     * Fetch records that have <code>MODULE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByModule(String... values) {
        return fetch(UiPage.UI_PAGE.MODULE, values);
    }

    /**
     * Fetch records that have <code>PAGE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByPage(String... values) {
        return fetch(UiPage.UI_PAGE.PAGE, values);
    }

    /**
     * Fetch records that have <code>LAYOUT_ID IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByLayoutId(String... values) {
        return fetch(UiPage.UI_PAGE.LAYOUT_ID, values);
    }

    /**
     * Fetch records that have <code>SECURE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchBySecure(Boolean... values) {
        return fetch(UiPage.UI_PAGE.SECURE, values);
    }

    /**
     * Fetch records that have <code>PARAM_MAP IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByParamMap(String... values) {
        return fetch(UiPage.UI_PAGE.PARAM_MAP, values);
    }

    /**
     * Fetch records that have <code>CONTAINER_NAME IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByContainerName(String... values) {
        return fetch(UiPage.UI_PAGE.CONTAINER_NAME, values);
    }

    /**
     * Fetch records that have <code>CONTAINER_CONFIG IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByContainerConfig(String... values) {
        return fetch(UiPage.UI_PAGE.CONTAINER_CONFIG, values);
    }

    /**
     * Fetch records that have <code>STATE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByState(String... values) {
        return fetch(UiPage.UI_PAGE.STATE, values);
    }

    /**
     * Fetch records that have <code>GRID IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByGrid(String... values) {
        return fetch(UiPage.UI_PAGE.GRID, values);
    }

    /**
     * Fetch records that have <code>ASSIST IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByAssist(String... values) {
        return fetch(UiPage.UI_PAGE.ASSIST, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByActive(Boolean... values) {
        return fetch(UiPage.UI_PAGE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchBySigma(String... values) {
        return fetch(UiPage.UI_PAGE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByMetadata(String... values) {
        return fetch(UiPage.UI_PAGE.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByLanguage(String... values) {
        return fetch(UiPage.UI_PAGE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(UiPage.UI_PAGE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByCreatedBy(String... values) {
        return fetch(UiPage.UI_PAGE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(UiPage.UI_PAGE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchByUpdatedBy(String... values) {
        return fetch(UiPage.UI_PAGE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ui.domain.tables.pojos.UiPage> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>APP IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByAppAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.APP, values);
    }

    /**
     * Fetch records that have <code>MODULE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByModuleAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.MODULE, values);
    }

    /**
     * Fetch records that have <code>PAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByPageAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.PAGE, values);
    }

    /**
     * Fetch records that have <code>LAYOUT_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByLayoutIdAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.LAYOUT_ID, values);
    }

    /**
     * Fetch records that have <code>SECURE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchBySecureAsync(List<Boolean> values) {
        return fetchAsync(UiPage.UI_PAGE.SECURE, values);
    }

    /**
     * Fetch records that have <code>PARAM_MAP IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByParamMapAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.PARAM_MAP, values);
    }

    /**
     * Fetch records that have <code>CONTAINER_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByContainerNameAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.CONTAINER_NAME, values);
    }

    /**
     * Fetch records that have <code>CONTAINER_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByContainerConfigAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.CONTAINER_CONFIG, values);
    }

    /**
     * Fetch records that have <code>STATE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByStateAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.STATE, values);
    }

    /**
     * Fetch records that have <code>GRID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByGridAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.GRID, values);
    }

    /**
     * Fetch records that have <code>ASSIST IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByAssistAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.ASSIST, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(UiPage.UI_PAGE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(UiPage.UI_PAGE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(UiPage.UI_PAGE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiPage>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(UiPage.UI_PAGE.UPDATED_BY, values);
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