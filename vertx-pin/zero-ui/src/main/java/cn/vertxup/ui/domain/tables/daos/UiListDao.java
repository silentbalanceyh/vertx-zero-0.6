/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.daos;


import cn.vertxup.ui.domain.tables.UiList;
import cn.vertxup.ui.domain.tables.records.UiListRecord;
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
public class UiListDao extends DAOImpl<UiListRecord, cn.vertxup.ui.domain.tables.pojos.UiList, String> implements VertxDAO<cn.vertxup.ui.domain.tables.records.UiListRecord, cn.vertxup.ui.domain.tables.pojos.UiList, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new UiListDao without any configuration
     */
    public UiListDao() {
        super(UiList.UI_LIST, cn.vertxup.ui.domain.tables.pojos.UiList.class);
    }

    /**
     * Create a new UiListDao with an attached configuration
     */
    public UiListDao(Configuration configuration) {
        super(UiList.UI_LIST, cn.vertxup.ui.domain.tables.pojos.UiList.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ui.domain.tables.pojos.UiList object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByKey(String... values) {
        return fetch(UiList.UI_LIST.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ui.domain.tables.pojos.UiList fetchOneByKey(String value) {
        return fetchOne(UiList.UI_LIST.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByName(String... values) {
        return fetch(UiList.UI_LIST.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByCode(String... values) {
        return fetch(UiList.UI_LIST.CODE, values);
    }

    /**
     * Fetch records that have <code>IDENTIFIER IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByIdentifier(String... values) {
        return fetch(UiList.UI_LIST.IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>V_QUERY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByVQuery(String... values) {
        return fetch(UiList.UI_LIST.V_QUERY, values);
    }

    /**
     * Fetch records that have <code>V_SEARCH IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByVSearch(String... values) {
        return fetch(UiList.UI_LIST.V_SEARCH, values);
    }

    /**
     * Fetch records that have <code>V_TABLE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByVTable(String... values) {
        return fetch(UiList.UI_LIST.V_TABLE, values);
    }

    /**
     * Fetch records that have <code>V_SEGMENT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByVSegment(String... values) {
        return fetch(UiList.UI_LIST.V_SEGMENT, values);
    }

    /**
     * Fetch records that have <code>DYNAMIC_COLUMN IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByDynamicColumn(Boolean... values) {
        return fetch(UiList.UI_LIST.DYNAMIC_COLUMN, values);
    }

    /**
     * Fetch records that have <code>DYNAMIC_SWITCH IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByDynamicSwitch(Boolean... values) {
        return fetch(UiList.UI_LIST.DYNAMIC_SWITCH, values);
    }

    /**
     * Fetch records that have <code>OPTIONS_AJAX IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByOptionsAjax(String... values) {
        return fetch(UiList.UI_LIST.OPTIONS_AJAX, values);
    }

    /**
     * Fetch records that have <code>OPTIONS_SUBMIT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByOptionsSubmit(String... values) {
        return fetch(UiList.UI_LIST.OPTIONS_SUBMIT, values);
    }

    /**
     * Fetch records that have <code>OPTIONS IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByOptions(String... values) {
        return fetch(UiList.UI_LIST.OPTIONS, values);
    }

    /**
     * Fetch records that have <code>CLASS_COMBINER IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByClassCombiner(String... values) {
        return fetch(UiList.UI_LIST.CLASS_COMBINER, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByActive(Boolean... values) {
        return fetch(UiList.UI_LIST.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchBySigma(String... values) {
        return fetch(UiList.UI_LIST.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByMetadata(String... values) {
        return fetch(UiList.UI_LIST.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByLanguage(String... values) {
        return fetch(UiList.UI_LIST.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(UiList.UI_LIST.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByCreatedBy(String... values) {
        return fetch(UiList.UI_LIST.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(UiList.UI_LIST.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.ui.domain.tables.pojos.UiList> fetchByUpdatedBy(String... values) {
        return fetch(UiList.UI_LIST.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ui.domain.tables.pojos.UiList> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByNameAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.CODE, values);
    }

    /**
     * Fetch records that have <code>IDENTIFIER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByIdentifierAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>V_QUERY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByVQueryAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.V_QUERY, values);
    }

    /**
     * Fetch records that have <code>V_SEARCH IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByVSearchAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.V_SEARCH, values);
    }

    /**
     * Fetch records that have <code>V_TABLE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByVTableAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.V_TABLE, values);
    }

    /**
     * Fetch records that have <code>V_SEGMENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByVSegmentAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.V_SEGMENT, values);
    }

    /**
     * Fetch records that have <code>DYNAMIC_COLUMN IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByDynamicColumnAsync(List<Boolean> values) {
        return fetchAsync(UiList.UI_LIST.DYNAMIC_COLUMN, values);
    }

    /**
     * Fetch records that have <code>DYNAMIC_SWITCH IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByDynamicSwitchAsync(List<Boolean> values) {
        return fetchAsync(UiList.UI_LIST.DYNAMIC_SWITCH, values);
    }

    /**
     * Fetch records that have <code>OPTIONS_AJAX IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByOptionsAjaxAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.OPTIONS_AJAX, values);
    }

    /**
     * Fetch records that have <code>OPTIONS_SUBMIT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByOptionsSubmitAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.OPTIONS_SUBMIT, values);
    }

    /**
     * Fetch records that have <code>OPTIONS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByOptionsAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.OPTIONS, values);
    }

    /**
     * Fetch records that have <code>CLASS_COMBINER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByClassCombinerAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.CLASS_COMBINER, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(UiList.UI_LIST.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.SIGMA, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.METADATA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(UiList.UI_LIST.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(UiList.UI_LIST.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ui.domain.tables.pojos.UiList>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(UiList.UI_LIST.UPDATED_BY, values);
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
