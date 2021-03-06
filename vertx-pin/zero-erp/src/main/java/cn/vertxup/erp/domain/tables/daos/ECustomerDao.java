/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.daos;


import cn.vertxup.erp.domain.tables.ECustomer;
import cn.vertxup.erp.domain.tables.records.ECustomerRecord;
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
public class ECustomerDao extends DAOImpl<ECustomerRecord, cn.vertxup.erp.domain.tables.pojos.ECustomer, String> implements VertxDAO<cn.vertxup.erp.domain.tables.records.ECustomerRecord, cn.vertxup.erp.domain.tables.pojos.ECustomer, java.lang.String> {

    private io.vertx.core.Vertx vertx;

    /**
     * Create a new ECustomerDao without any configuration
     */
    public ECustomerDao() {
        super(ECustomer.E_CUSTOMER, cn.vertxup.erp.domain.tables.pojos.ECustomer.class);
    }

    /**
     * Create a new ECustomerDao with an attached configuration
     */
    public ECustomerDao(Configuration configuration) {
        super(ECustomer.E_CUSTOMER, cn.vertxup.erp.domain.tables.pojos.ECustomer.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.erp.domain.tables.pojos.ECustomer object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByKey(String... values) {
        return fetch(ECustomer.E_CUSTOMER.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.erp.domain.tables.pojos.ECustomer fetchOneByKey(String value) {
        return fetchOne(ECustomer.E_CUSTOMER.KEY, value);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByComment(String... values) {
        return fetch(ECustomer.E_CUSTOMER.COMMENT, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByName(String... values) {
        return fetch(ECustomer.E_CUSTOMER.NAME, values);
    }

    /**
     * Fetch records that have <code>TITLE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByTitle(String... values) {
        return fetch(ECustomer.E_CUSTOMER.TITLE, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByCode(String... values) {
        return fetch(ECustomer.E_CUSTOMER.CODE, values);
    }

    /**
     * Fetch records that have <code>TAX_CODE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByTaxCode(String... values) {
        return fetch(ECustomer.E_CUSTOMER.TAX_CODE, values);
    }

    /**
     * Fetch records that have <code>TAX_TITLE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByTaxTitle(String... values) {
        return fetch(ECustomer.E_CUSTOMER.TAX_TITLE, values);
    }

    /**
     * Fetch records that have <code>CONTACT_NAME IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByContactName(String... values) {
        return fetch(ECustomer.E_CUSTOMER.CONTACT_NAME, values);
    }

    /**
     * Fetch records that have <code>CONTACT_PHONE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByContactPhone(String... values) {
        return fetch(ECustomer.E_CUSTOMER.CONTACT_PHONE, values);
    }

    /**
     * Fetch records that have <code>CONTACT_EMAIL IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByContactEmail(String... values) {
        return fetch(ECustomer.E_CUSTOMER.CONTACT_EMAIL, values);
    }

    /**
     * Fetch records that have <code>CONTACT_ONLINE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByContactOnline(String... values) {
        return fetch(ECustomer.E_CUSTOMER.CONTACT_ONLINE, values);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByEmail(String... values) {
        return fetch(ECustomer.E_CUSTOMER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>FAX IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByFax(String... values) {
        return fetch(ECustomer.E_CUSTOMER.FAX, values);
    }

    /**
     * Fetch records that have <code>HOMEPAGE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByHomepage(String... values) {
        return fetch(ECustomer.E_CUSTOMER.HOMEPAGE, values);
    }

    /**
     * Fetch records that have <code>LOGO IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByLogo(String... values) {
        return fetch(ECustomer.E_CUSTOMER.LOGO, values);
    }

    /**
     * Fetch records that have <code>PHONE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByPhone(String... values) {
        return fetch(ECustomer.E_CUSTOMER.PHONE, values);
    }

    /**
     * Fetch records that have <code>ADDRESS IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByAddress(String... values) {
        return fetch(ECustomer.E_CUSTOMER.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>RUN_UP IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByRunUp(Boolean... values) {
        return fetch(ECustomer.E_CUSTOMER.RUN_UP, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByType(String... values) {
        return fetch(ECustomer.E_CUSTOMER.TYPE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByMetadata(String... values) {
        return fetch(ECustomer.E_CUSTOMER.METADATA, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByActive(Boolean... values) {
        return fetch(ECustomer.E_CUSTOMER.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchBySigma(String... values) {
        return fetch(ECustomer.E_CUSTOMER.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByLanguage(String... values) {
        return fetch(ECustomer.E_CUSTOMER.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(ECustomer.E_CUSTOMER.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByCreatedBy(String... values) {
        return fetch(ECustomer.E_CUSTOMER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(ECustomer.E_CUSTOMER.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchByUpdatedBy(String... values) {
        return fetch(ECustomer.E_CUSTOMER.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.erp.domain.tables.pojos.ECustomer> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h -> h.complete(fetchOneByKey(value)), vertx());
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByCommentAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.COMMENT, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByNameAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.NAME, values);
    }

    /**
     * Fetch records that have <code>TITLE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByTitleAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.TITLE, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.CODE, values);
    }

    /**
     * Fetch records that have <code>TAX_CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByTaxCodeAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.TAX_CODE, values);
    }

    /**
     * Fetch records that have <code>TAX_TITLE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByTaxTitleAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.TAX_TITLE, values);
    }

    /**
     * Fetch records that have <code>CONTACT_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByContactNameAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.CONTACT_NAME, values);
    }

    /**
     * Fetch records that have <code>CONTACT_PHONE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByContactPhoneAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.CONTACT_PHONE, values);
    }

    /**
     * Fetch records that have <code>CONTACT_EMAIL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByContactEmailAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.CONTACT_EMAIL, values);
    }

    /**
     * Fetch records that have <code>CONTACT_ONLINE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByContactOnlineAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.CONTACT_ONLINE, values);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByEmailAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>FAX IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByFaxAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.FAX, values);
    }

    /**
     * Fetch records that have <code>HOMEPAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByHomepageAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.HOMEPAGE, values);
    }

    /**
     * Fetch records that have <code>LOGO IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByLogoAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.LOGO, values);
    }

    /**
     * Fetch records that have <code>PHONE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByPhoneAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.PHONE, values);
    }

    /**
     * Fetch records that have <code>ADDRESS IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByAddressAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>RUN_UP IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByRunUpAsync(List<Boolean> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.RUN_UP, values);
    }

    /**
     * Fetch records that have <code>TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByTypeAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.TYPE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.METADATA, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.erp.domain.tables.pojos.ECustomer>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(ECustomer.E_CUSTOMER.UPDATED_BY, values);
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
