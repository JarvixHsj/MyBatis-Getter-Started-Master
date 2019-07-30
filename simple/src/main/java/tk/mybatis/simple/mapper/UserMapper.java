package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

/**
 * Created By Jarvix 2019/7/25 16:42
 **/
public interface UserMapper {
    public SysUser selectById(Long id);

    public List<SysUser> selectAll();

    public List<SysRole> selectRoleByUserId(Long userId);
}
