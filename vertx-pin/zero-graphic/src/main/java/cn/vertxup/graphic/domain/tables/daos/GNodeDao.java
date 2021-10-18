/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables.daos;


import cn.vertxup.graphic.domain.tables.GNode;
import cn.vertxup.graphic.domain.tables.records.GNodeRecord;
import io.github.jklingsporn.vertx.jooq.future.VertxDAO;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
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
public class GNodeDao extends DAOImpl<GNodeRecord, cn.vertxup.graphic.domain.tables.pojos.GNode, String> implements VertxDAO<cn.vertxup.graphic.domain.tables.records.GNodeRecord, cn.vertxup.graphic.domain.tables.pojos.GNode, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new GNodeDao without any configuration
     */
    public GNodeDao() {
        super(GNode.G_NODE, cn.vertxup.graphic.domain.tables.pojos.GNode.class);
    }

    /**
     * Create a new GNodeDao with an attached configuration
     */
    public GNodeDao(Configuration configuration) {
        super(GNode.G_NODE, cn.vertxup.graphic.domain.tables.pojos.GNode.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.graphic.domain.tables.pojos.GNode object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByKey(String... values) {
        return fetch(GNode.G_NODE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.graphic.domain.tables.pojos.GNode fetchOneByKey(String value) {
        return fetchOne(GNode.G_NODE.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByName(String... values) {
        return fetch(GNode.G_NODE.NAME, values);
    }

    /**
     * Fetch records that have <code>X IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByX(BigDecimal... values) {
        return fetch(GNode.G_NODE.X, values);
    }

    /**
     * Fetch records that have <code>Y IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByY(BigDecimal... values) {
        return fetch(GNode.G_NODE.Y, values);
    }

    /**
     * Fetch records that have <code>UI IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByUi(String... values) {
        return fetch(GNode.G_NODE.UI, values);
    }

    /**
     * Fetch records that have <code>GRAPHIC_ID IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByGraphicId(String... values) {
        return fetch(GNode.G_NODE.GRAPHIC_ID, values);
    }

    /**
     * Fetch records that have <code>RECORD_DATA IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByRecordData(String... values) {
        return fetch(GNode.G_NODE.RECORD_DATA, values);
    }

    /**
     * Fetch records that have <code>RECORD_KEY IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByRecordKey(String... values) {
        return fetch(GNode.G_NODE.RECORD_KEY, values);
    }

    /**
     * Fetch records that have <code>RECORD_COMPONENT IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByRecordComponent(String... values) {
        return fetch(GNode.G_NODE.RECORD_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>RECORD_CLASS IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByRecordClass(String... values) {
        return fetch(GNode.G_NODE.RECORD_CLASS, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchBySigma(String... values) {
        return fetch(GNode.G_NODE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByLanguage(String... values) {
        return fetch(GNode.G_NODE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByActive(Boolean... values) {
        return fetch(GNode.G_NODE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByMetadata(String... values) {
        return fetch(GNode.G_NODE.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(GNode.G_NODE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByCreatedBy(String... values) {
        return fetch(GNode.G_NODE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(GNode.G_NODE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchByUpdatedBy(String... values) {
        return fetch(GNode.G_NODE.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.graphic.domain.tables.pojos.GNode> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByNameAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.NAME, values);
    }

    /**
     * Fetch records that have <code>X IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByXAsync(List<BigDecimal> values) {
        return fetchAsync(GNode.G_NODE.X, values);
    }

    /**
     * Fetch records that have <code>Y IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByYAsync(List<BigDecimal> values) {
        return fetchAsync(GNode.G_NODE.Y, values);
    }

    /**
     * Fetch records that have <code>UI IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByUiAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.UI, values);
    }

    /**
     * Fetch records that have <code>GRAPHIC_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByGraphicIdAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.GRAPHIC_ID, values);
    }

    /**
     * Fetch records that have <code>RECORD_DATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByRecordDataAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.RECORD_DATA, values);
    }

    /**
     * Fetch records that have <code>RECORD_KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByRecordKeyAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.RECORD_KEY, values);
    }

    /**
     * Fetch records that have <code>RECORD_COMPONENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByRecordComponentAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.RECORD_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>RECORD_CLASS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByRecordClassAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.RECORD_CLASS, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(GNode.G_NODE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(GNode.G_NODE.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(GNode.G_NODE.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.graphic.domain.tables.pojos.GNode>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(GNode.G_NODE.UPDATED_BY, values);
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
