package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.simple.model.Country;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

public class UserMapperTest extends BaseMapperTest{

	@Test
	public void testSelectById(){
		SqlSession sqlSession = getSqlSession();
		try{
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			SysUser user =  userMapper.selectById(1l);
			//user不为空
			Assert.assertNotNull(user);
			Assert.assertEquals("admin", user.getUserName());
		}finally {
			sqlSession.close();
		}
	}

	@Test
	public void testSelectAll() {
		SqlSession sqlSession = getSqlSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<SysUser> usersList = userMapper.selectAll();
			//结果不为空
			Assert.assertNotNull(usersList);
			//用户数量大于0个
			Assert.assertTrue(usersList.size() > 0);

		}finally {
			sqlSession.close();
		}
	}

	@Test
	public void testSelectRoleByUserId(){
		SqlSession sqlSession = getSqlSession();

		try{
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			List<SysRole> sysRoleList = userMapper.selectRoleByUserId(1l);
		}finally {
			sqlSession.close();
		}
	}
	
}



