package com.nowui.chuangshi.dao;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.SqlPara;
import com.nowui.chuangshi.constant.Constant;
import com.nowui.chuangshi.model.App;

import java.util.Date;
import java.util.List;

public class AppDao extends Dao {

    public Integer countByApp_idOrLikeApp_name(String app_id, String app_name, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        sqlMap.put(App.APP_NAME, app_name);
        SqlPara sqlPara = Db.getSqlPara("app.countByApp_idOrLikeApp_name", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "countByApp_idOrLikeApp_name", sqlPara, request_user_id);

        Number count = Db.queryFirst(sqlPara.getSql(), sqlPara.getPara());
        return count.intValue();
    }

    public Integer countByOrApp_idOrLikeApp_name(String app_id, String app_name, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        sqlMap.put(App.APP_NAME, app_name);
        SqlPara sqlPara = Db.getSqlPara("app.countByOrApp_idOrLikeApp_name", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "countByOrApp_idOrLikeApp_name", sqlPara, request_user_id);

        Number count = Db.queryFirst(sqlPara.getSql(), sqlPara.getPara());
        return count.intValue();
    }

    public List<App> listByApp_idAndSystem_create_timeAndLimit(String app_id, Date system_create_time, int m, int n, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        sqlMap.put(App.SYSTEM_CREATE_TIME, system_create_time);
        sqlMap.put(Constant.M, m);
        sqlMap.put(Constant.N, n);
        SqlPara sqlPara = Db.getSqlPara("app.listByApp_idAndSystem_create_timeAndLimit", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "listByApp_idAndSystem_create_timeAndLimit", sqlPara, request_user_id);

        return new App().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public List<App> listByApp_idOrLikeApp_nameAndLimit(String app_id, String app_name, int m, int n, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        sqlMap.put(App.APP_NAME, app_name);
        sqlMap.put(Constant.M, m);
        sqlMap.put(Constant.N, n);
        SqlPara sqlPara = Db.getSqlPara("app.listByApp_idOrLikeApp_nameAndLimit", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "listByApp_idOrLikeApp_nameAndLimit", sqlPara, request_user_id);

        return new App().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public List<App> listByOrApp_idOrLikeApp_nameAndLimit(String app_id, String app_name, int m, int n, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        sqlMap.put(App.APP_NAME, app_name);
        sqlMap.put(Constant.M, m);
        sqlMap.put(Constant.N, n);
        SqlPara sqlPara = Db.getSqlPara("app.listByOrApp_idOrLikeApp_nameAndLimit", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "listByOrApp_idOrLikeApp_nameAndLimit", sqlPara, request_user_id);

        return new App().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public List<App> list(String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        SqlPara sqlPara = Db.getSqlPara("app.list", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "list", sqlPara, request_user_id);

        return new App().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public App findByApp_id(String app_id, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        SqlPara sqlPara = Db.getSqlPara("app.findByApp_id", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "findByApp_id", sqlPara, request_user_id);

        List<App> appList = new App().find(sqlPara.getSql(), sqlPara.getPara());
        if (appList.size() == 0) {
            return null;
        } else {
            return appList.get(0);
        }
    }

    public Boolean save(String app_id, String app_name, String app_secret, String wechat_app_id, String wechat_app_secret, String wechat_mch_id, String wechat_mch_key, String system_create_user_id, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        sqlMap.put(App.APP_NAME, app_name);
        sqlMap.put(App.APP_SECRET, app_secret);
        sqlMap.put(App.WECHAT_APP_ID, wechat_app_id);
        sqlMap.put(App.WECHAT_APP_SECRET, wechat_app_secret);
        sqlMap.put(App.WECHAT_MCH_ID, wechat_mch_id);
        sqlMap.put(App.WECHAT_MCH_KEY, wechat_mch_key);
        sqlMap.put(App.SYSTEM_CREATE_USER_ID, system_create_user_id);
        sqlMap.put(App.SYSTEM_CREATE_TIME, new Date());
        sqlMap.put(App.SYSTEM_UPDATE_USER_ID, system_create_user_id);
        sqlMap.put(App.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(App.SYSTEM_VERSION, 0);
        sqlMap.put(App.SYSTEM_STATUS, true);
        SqlPara sqlPara = Db.getSqlPara("app.save", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "save", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

    public Boolean update(String app_id, String app_name, String app_secret, String wechat_app_id, String wechat_app_secret, String wechat_mch_id, String wechat_mch_key, String system_update_user_id, Integer system_version, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        sqlMap.put(App.APP_NAME, app_name);
        sqlMap.put(App.APP_SECRET, app_secret);
        sqlMap.put(App.WECHAT_APP_ID, wechat_app_id);
        sqlMap.put(App.WECHAT_APP_SECRET, wechat_app_secret);
        sqlMap.put(App.WECHAT_MCH_ID, wechat_mch_id);
        sqlMap.put(App.WECHAT_MCH_KEY, wechat_mch_key);
        sqlMap.put(App.SYSTEM_UPDATE_USER_ID, system_update_user_id);
        sqlMap.put(App.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(App.SYSTEM_VERSION, system_version);
        SqlPara sqlPara = Db.getSqlPara("app.update", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "update", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

    public Boolean deleteByApp_idAndSystem_version(String app_id, String system_update_user_id, Integer system_version, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(App.APP_ID, app_id);
        sqlMap.put(App.SYSTEM_UPDATE_USER_ID, system_update_user_id);
        sqlMap.put(App.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(App.SYSTEM_VERSION, system_version);
        SqlPara sqlPara = Db.getSqlPara("app.deleteByApp_idAndSystem_version", sqlMap);

        logSql(request_app_id, request_http_id, "table_app", "deleteByApp_idAndSystem_version", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

}