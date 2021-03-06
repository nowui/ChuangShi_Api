package com.nowui.chuangshi.dao;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.SqlPara;
import com.nowui.chuangshi.model.ProductCategory;

import java.util.Date;
import java.util.List;

public class ProductCategoryDao extends Dao {

    public List<ProductCategory> listByLikeProduct_category_parent_id(String product_category_parent_id, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_PARENT_ID, product_category_parent_id);
        SqlPara sqlPara = Db.getSqlPara("product_category.listByLikeProduct_category_parent_id", sqlMap);

        logSql(request_app_id, request_http_id, "table_product_category", "listByLikeProduct_category_parent_id", sqlPara, request_user_id);

        return new ProductCategory().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public List<ProductCategory> listByApp_idOrLikeProduct_category_name(String app_id, String product_category_name, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(ProductCategory.APP_ID, app_id);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_NAME, product_category_name);
        SqlPara sqlPara = Db.getSqlPara("product_category.listByApp_idOrLikeProduct_category_name", sqlMap);

        logSql(request_app_id, request_http_id, "table_product_category", "listByApp_idOrLikeProduct_category_name", sqlPara, request_user_id);

        return new ProductCategory().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public List<ProductCategory> listByOrApp_idOrLikeProduct_category_name(String app_id, String product_category_name, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(ProductCategory.APP_ID, app_id);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_NAME, product_category_name);
        SqlPara sqlPara = Db.getSqlPara("product_category.listByOrApp_idOrLikeProduct_category_name", sqlMap);

        logSql(request_app_id, request_http_id, "table_product_category", "listByOrApp_idOrLikeProduct_category_name", sqlPara, request_user_id);

        return new ProductCategory().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public ProductCategory findByProduct_category_id(String product_category_id, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_ID, product_category_id);
        SqlPara sqlPara = Db.getSqlPara("product_category.findByProduct_category_id", sqlMap);

        logSql(request_app_id, request_http_id, "table_product_category", "findByProduct_category_id", sqlPara, request_user_id);

        List<ProductCategory> product_categoryList = new ProductCategory().find(sqlPara.getSql(), sqlPara.getPara());
        if (product_categoryList.size() == 0) {
            return null;
        } else {
            return product_categoryList.get(0);
        }
    }

    public Boolean save(String product_category_id, String app_id, String product_category_parent_id, String product_category_name, Integer product_category_sort, String product_category_path, String system_create_user_id, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_ID, product_category_id);
        sqlMap.put(ProductCategory.APP_ID, app_id);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_PARENT_ID, product_category_parent_id);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_NAME, product_category_name);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_SORT, product_category_sort);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_PATH, product_category_path);
        sqlMap.put(ProductCategory.SYSTEM_CREATE_USER_ID, system_create_user_id);
        sqlMap.put(ProductCategory.SYSTEM_CREATE_TIME, new Date());
        sqlMap.put(ProductCategory.SYSTEM_UPDATE_USER_ID, system_create_user_id);
        sqlMap.put(ProductCategory.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(ProductCategory.SYSTEM_VERSION, 0);
        sqlMap.put(ProductCategory.SYSTEM_STATUS, true);
        SqlPara sqlPara = Db.getSqlPara("product_category.save", sqlMap);

        logSql(request_app_id, request_http_id, "table_product_category", "save", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

    public Boolean update(String product_category_id, String product_category_parent_id, String product_category_name, Integer product_category_sort, String product_category_path, String system_update_user_id, Integer system_version, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_ID, product_category_id);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_PARENT_ID, product_category_parent_id);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_NAME, product_category_name);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_SORT, product_category_sort);
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_PATH, product_category_path);
        sqlMap.put(ProductCategory.SYSTEM_UPDATE_USER_ID, system_update_user_id);
        sqlMap.put(ProductCategory.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(ProductCategory.SYSTEM_VERSION, system_version);
        SqlPara sqlPara = Db.getSqlPara("product_category.update", sqlMap);

        logSql(request_app_id, request_http_id, "table_product_category", "update", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

    public Boolean deleteByProduct_category_idAndSystem_version(String product_category_id, String system_update_user_id, Integer system_version, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_ID, product_category_id);
        sqlMap.put(ProductCategory.SYSTEM_UPDATE_USER_ID, system_update_user_id);
        sqlMap.put(ProductCategory.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(ProductCategory.SYSTEM_VERSION, system_version);
        SqlPara sqlPara = Db.getSqlPara("product_category.deleteByProduct_category_idAndSystem_version", sqlMap);

        logSql(request_app_id, request_http_id, "table_product_category", "deleteByProduct_category_idAndSystem_version", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

    public Boolean deleteByProduct_category_parent_id(String product_category_parent_id, String system_update_user_id, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(ProductCategory.PRODUCT_CATEGORY_PARENT_ID, product_category_parent_id);
        sqlMap.put(ProductCategory.SYSTEM_UPDATE_USER_ID, system_update_user_id);
        sqlMap.put(ProductCategory.SYSTEM_UPDATE_TIME, new Date());
        SqlPara sqlPara = Db.getSqlPara("product_category.deleteByProduct_category_parent_id", sqlMap);

        logSql(request_app_id, request_http_id, "table_product_category", "deleteByProduct_category_parent_id", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

}