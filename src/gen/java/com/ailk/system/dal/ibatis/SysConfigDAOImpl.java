package com.ailk.system.dal.ibatis;

import com.ailk.system.dal.ibatis.model.SysConfig;
import com.ailk.system.dal.ibatis.model.SysConfigExample;
import com.ailk.system.dal.ibatis.model.SysConfigKey;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class SysConfigDAOImpl extends SqlMapClientDaoSupport implements SysConfigDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public SysConfigDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public int countByExample(SysConfigExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("sys_config.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public int deleteByExample(SysConfigExample example) {
        int rows = getSqlMapClientTemplate().delete("sys_config.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public int deleteByPrimaryKey(SysConfigKey _key) {
        int rows = getSqlMapClientTemplate().delete("sys_config.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public void insert(SysConfig record) {
        getSqlMapClientTemplate().insert("sys_config.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public void insertSelective(SysConfig record) {
        getSqlMapClientTemplate().insert("sys_config.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public List<SysConfig> selectByExample(SysConfigExample example) {
        List<SysConfig> list = getSqlMapClientTemplate().queryForList("sys_config.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public SysConfig selectByPrimaryKey(SysConfigKey _key) {
        SysConfig record = (SysConfig) getSqlMapClientTemplate().queryForObject("sys_config.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public int updateByExampleSelective(SysConfig record, SysConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("sys_config.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public int updateByExample(SysConfig record, SysConfigExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("sys_config.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public int updateByPrimaryKeySelective(SysConfig record) {
        int rows = getSqlMapClientTemplate().update("sys_config.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    public int updateByPrimaryKey(SysConfig record) {
        int rows = getSqlMapClientTemplate().update("sys_config.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_config
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends SysConfigExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysConfigExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}