package com.liu.ordercore.dao.impl;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import com.liu.ordercore.dao.IBaseDao;



/**
 * 用户Dao基类
 */
public class BaseDaoImpl implements IBaseDao {
	private SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	/**
	 * 根据Id获取对象
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param id
	 *            主键
	 * @return Object对象
	 */
	@Override
	public Object queryForObject(String sqlId, Object id) {
		return getSqlSession().selectOne(sqlId, id);
	}

	/**
	 * 根据Id获取对象
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param id
	 *            主键
	 * @param cls
	 *            返回的对象Class
	 * @return cls对应的类
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T> T queryForObject(String sqlId, Object id, Class<T> cls) {
		return (T) getSqlSession().selectOne(sqlId, id);
	}

	/**
	 * 根据条件获取对象
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @return
	 */
	@Override
	public Object queryForObject(String sqlId, Map<String, Object> params) {
		return getSqlSession().selectOne(sqlId, params);
	}

	/**
	 * 根据条件获取对象
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @param cls
	 *            返回的对象Class
	 * @return cls对应的类
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T> T queryForObject(String sqlId, Map<String, Object> params,
			Class<T> cls) {
		return (T) getSqlSession().selectOne(sqlId, params);
	}

	/**
	 * 获取数据总条�?
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @return 条数
	 */
	@Override
	public int getTotalCount(String sqlId, Map<String, Object> params) {
		return (Integer) getSqlSession().selectOne(sqlId, params);
	}

	/**
	 * 查询列表
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @param cls
	 *            返回的对象Class
	 * @return 列表<cls对应的类>
	 */
	@Override
	public <T> List<T> queryForList(String sqlId, Map<String, Object> params,
			Class<T> cls) {
		return getSqlSession().selectList(sqlId, params);
	}

	/**
	 * 查询列表
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param params
	 *            参数
	 * @return 列表
	 */
	@Override
	public List<Map<String, Object>> queryForList(String sqlId,
			Map<String, Object> param) {
		return getSqlSession().selectList(sqlId, param);
	}

	/**
	 * 修改数据
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param object
	 *            对象
	 * @return 修改的行
	 */
	@Override
	public int update(String sqlId, Object object) {
		return getSqlSession().update(sqlId, object);
	}

	/**
	 * 插入数据
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param object
	 *            待插入的对象
	 * @return 插入条数
	 */
	@Override
	public int insert(String sqlId, Object object) {
		return (Integer) getSqlSession().insert(sqlId, object);
	}

	/**
	 * 删除数据
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param id
	 *            主键
	 * @return 主键
	 */
	@Override
	public int delete(String sqlId, int id) {
		return getSqlSession().delete(sqlId, id);
	}
	
	/**
	 * 删除数据
	 * 
	 * @param sqlId
	 *            脚本编号
	 * @param map
	 *            待删除的对象
	 * @return 主键
	 */
	@Override
	public int delete(String sqlId, Map<String, Object> map) {
		return getSqlSession().delete(sqlId, map);
	}
	
}