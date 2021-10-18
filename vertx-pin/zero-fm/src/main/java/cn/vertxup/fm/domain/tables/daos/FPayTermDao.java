/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.fm.domain.tables.daos;


import cn.vertxup.fm.domain.tables.FPayTerm;
import cn.vertxup.fm.domain.tables.records.FPayTermRecord;

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
public class FPayTermDao extends DAOImpl<FPayTermRecord, cn.vertxup.fm.domain.tables.pojos.FPayTerm, String> implements VertxDAO<cn.vertxup.fm.domain.tables.records.FPayTermRecord,cn.vertxup.fm.domain.tables.pojos.FPayTerm,java.lang.String> {

    /**
     * Create a new FPayTermDao without any configuration
     */
    public FPayTermDao() {
        super(FPayTerm.F_PAY_TERM, cn.vertxup.fm.domain.tables.pojos.FPayTerm.class);
    }

    /**
     * Create a new FPayTermDao with an attached configuration
     */
    public FPayTermDao(Configuration configuration) {
        super(FPayTerm.F_PAY_TERM, cn.vertxup.fm.domain.tables.pojos.FPayTerm.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.fm.domain.tables.pojos.FPayTerm object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByKey(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.fm.domain.tables.pojos.FPayTerm fetchOneByKey(String value) {
        return fetchOne(FPayTerm.F_PAY_TERM.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByName(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByCode(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.CODE, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByType(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.TYPE, values);
    }

    /**
     * Fetch records that have <code>CATEGORY IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByCategory(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>HELP_CODE IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByHelpCode(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.HELP_CODE, values);
    }

    /**
     * Fetch records that have <code>LEAF IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByLeaf(Boolean... values) {
        return fetch(FPayTerm.F_PAY_TERM.LEAF, values);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByComment(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.COMMENT, values);
    }

    /**
     * Fetch records that have <code>PARENT_ID IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByParentId(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>SUBJECT_ID IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchBySubjectId(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.SUBJECT_ID, values);
    }

    /**
     * Fetch records that have <code>LOCKED IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByLocked(Boolean... values) {
        return fetch(FPayTerm.F_PAY_TERM.LOCKED, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchBySigma(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByLanguage(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByActive(Boolean... values) {
        return fetch(FPayTerm.F_PAY_TERM.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByMetadata(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(FPayTerm.F_PAY_TERM.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByCreatedBy(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(FPayTerm.F_PAY_TERM.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchByUpdatedBy(String... values) {
        return fetch(FPayTerm.F_PAY_TERM.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.KEY,values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.fm.domain.tables.pojos.FPayTerm> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByKey(value)),vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByNameAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.NAME,values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.CODE,values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.TYPE,values);
    }

    /**
     * Fetch records that have <code>CATEGORY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByCategoryAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.CATEGORY,values);
    }

    /**
     * Fetch records that have <code>HELP_CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByHelpCodeAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.HELP_CODE,values);
    }

    /**
     * Fetch records that have <code>LEAF IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByLeafAsync(List<Boolean> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.LEAF,values);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByCommentAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.COMMENT,values);
    }

    /**
     * Fetch records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByParentIdAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.PARENT_ID,values);
    }

    /**
     * Fetch records that have <code>SUBJECT_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchBySubjectIdAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.SUBJECT_ID,values);
    }

    /**
     * Fetch records that have <code>LOCKED IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByLockedAsync(List<Boolean> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.LOCKED,values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.SIGMA,values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.ACTIVE,values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.METADATA,values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.CREATED_AT,values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.CREATED_BY,values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.UPDATED_AT,values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.fm.domain.tables.pojos.FPayTerm>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(FPayTerm.F_PAY_TERM.UPDATED_BY,values);
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
