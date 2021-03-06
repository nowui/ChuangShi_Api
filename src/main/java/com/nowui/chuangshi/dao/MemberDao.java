package com.nowui.chuangshi.dao;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.SqlPara;
import com.nowui.chuangshi.constant.Constant;
import com.nowui.chuangshi.model.Member;
import com.nowui.chuangshi.model.User;

import java.util.Date;
import java.util.List;

public class MemberDao extends Dao {

    public Integer countByApp_idOrLikeUser_name(String app_id, String user_name, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.APP_ID, app_id);
        sqlMap.put(User.USER_NAME, user_name);
        SqlPara sqlPara = Db.getSqlPara("member.countByApp_idOrLikeUser_name", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "countByApp_idOrLikeUser_name", sqlPara, request_user_id);

        Number count = Db.queryFirst(sqlPara.getSql(), sqlPara.getPara());
        return count.intValue();
    }

    public Integer countByOrApp_idOrLikeUser_name(String app_id, String user_name, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.APP_ID, app_id);
        sqlMap.put(User.USER_NAME, user_name);
        SqlPara sqlPara = Db.getSqlPara("member.countByOrApp_idOrLikeUser_name", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "countByOrApp_idOrLikeUser_name", sqlPara, request_user_id);

        Number count = Db.queryFirst(sqlPara.getSql(), sqlPara.getPara());
        return count.intValue();
    }

    public List<Member> listByApp_idAndSystem_create_timeAndLimit(String app_id, Date system_create_time, int m, int n, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.APP_ID, app_id);
        sqlMap.put(Member.SYSTEM_CREATE_TIME, system_create_time);
        sqlMap.put(Constant.M, m);
        sqlMap.put(Constant.N, n);
        SqlPara sqlPara = Db.getSqlPara("member.listByApp_idAndSystem_create_timeAndLimit", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "listByApp_idAndSystem_create_timeAndLimit", sqlPara, request_user_id);

        return new Member().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public List<Member> listByApp_idOrLikeUser_nameAndLimit(String app_id, String user_name, int m, int n, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.APP_ID, app_id);
        sqlMap.put(User.USER_NAME, user_name);
        sqlMap.put(Constant.M, m);
        sqlMap.put(Constant.N, n);
        SqlPara sqlPara = Db.getSqlPara("member.listByApp_idOrLikeUser_nameAndLimit", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "listByApp_idOrLikeUser_nameAndLimit", sqlPara, request_user_id);

        return new Member().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public List<Member> listByOrApp_idOrLikeUser_nameAndLimit(String app_id, String user_name, int m, int n, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.APP_ID, app_id);
        sqlMap.put(User.USER_NAME, user_name);
        sqlMap.put(Constant.M, m);
        sqlMap.put(Constant.N, n);
        SqlPara sqlPara = Db.getSqlPara("member.listByOrApp_idOrLikeUser_nameAndLimit", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "listByOrApp_idOrLikeUser_nameAndLimit", sqlPara, request_user_id);

        return new Member().find(sqlPara.getSql(), sqlPara.getPara());
    }

    public Member findByMember_id(String member_id, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.MEMBER_ID, member_id);
        SqlPara sqlPara = Db.getSqlPara("member.findByMember_id", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "findByMember_id", sqlPara, request_user_id);

        List<Member> memberList = new Member().find(sqlPara.getSql(), sqlPara.getPara());
        if (memberList.size() == 0) {
            return null;
        } else {
            return memberList.get(0);
        }
    }

    public Boolean save(String member_id, String app_id, String user_id, String member_parent_id, String from_qrcode_id, String qrcode_id, String member_level_id, String member_path, Boolean member_status, String system_create_user_id, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.MEMBER_ID, member_id);
        sqlMap.put(Member.APP_ID, app_id);
        sqlMap.put(Member.USER_ID, user_id);
        sqlMap.put(Member.MEMBER_PARENT_ID, member_parent_id);
        sqlMap.put(Member.FROM_QRCODE_ID, from_qrcode_id);
        sqlMap.put(Member.QRCODE_ID, qrcode_id);
        sqlMap.put(Member.MEMBER_LEVEL_ID, member_level_id);
        sqlMap.put(Member.MEMBER_PATH, member_path);
        sqlMap.put(Member.MEMBER_STATUS, member_status);
        sqlMap.put(Member.SYSTEM_CREATE_USER_ID, system_create_user_id);
        sqlMap.put(Member.SYSTEM_CREATE_TIME, new Date());
        sqlMap.put(Member.SYSTEM_UPDATE_USER_ID, system_create_user_id);
        sqlMap.put(Member.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(Member.SYSTEM_VERSION, 0);
        sqlMap.put(Member.SYSTEM_STATUS, true);
        SqlPara sqlPara = Db.getSqlPara("member.save", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "save", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

    public Boolean update(String member_id, String user_id, String member_parent_id, String from_qrcode_id, String qrcode_id, String member_level_id, String member_path, Boolean member_status, String system_update_user_id, Integer system_version, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.MEMBER_ID, member_id);
        sqlMap.put(Member.USER_ID, user_id);
        sqlMap.put(Member.MEMBER_PARENT_ID, member_parent_id);
        sqlMap.put(Member.FROM_QRCODE_ID, from_qrcode_id);
        sqlMap.put(Member.QRCODE_ID, qrcode_id);
        sqlMap.put(Member.MEMBER_LEVEL_ID, member_level_id);
        sqlMap.put(Member.MEMBER_PATH, member_path);
        sqlMap.put(Member.MEMBER_STATUS, member_status);
        sqlMap.put(Member.SYSTEM_UPDATE_USER_ID, system_update_user_id);
        sqlMap.put(Member.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(Member.SYSTEM_VERSION, system_version);
        SqlPara sqlPara = Db.getSqlPara("member.update", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "update", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

    public Boolean deleteByMember_idAndSystem_version(String member_id, String system_update_user_id, Integer system_version, String request_app_id, String request_http_id, String request_user_id) {
        Kv sqlMap = Kv.create();
        sqlMap.put(Member.MEMBER_ID, member_id);
        sqlMap.put(Member.SYSTEM_UPDATE_USER_ID, system_update_user_id);
        sqlMap.put(Member.SYSTEM_UPDATE_TIME, new Date());
        sqlMap.put(Member.SYSTEM_VERSION, system_version);
        SqlPara sqlPara = Db.getSqlPara("member.deleteByMember_idAndSystem_version", sqlMap);

        logSql(request_app_id, request_http_id, "table_member", "deleteByMember_idAndSystem_version", sqlPara, request_user_id);

        return Db.update(sqlPara.getSql(), sqlPara.getPara()) != 0;
    }

}