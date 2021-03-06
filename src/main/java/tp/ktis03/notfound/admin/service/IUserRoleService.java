package tp.ktis03.notfound.admin.service;

import java.util.List;

import tp.ktis03.notfound.vo.UserRole;
/**
 * 
 * @author PC05
 *
 */
public interface IUserRoleService extends IBaseService<UserRole> {

	@Override
	List<UserRole> findAll();

	@Override
	UserRole findOne(int id);

	@Override
	void insert(UserRole param);

	@Override
	int insertReturn(UserRole param);

	@Override
	void update(UserRole param);

	@Override
	void delete(int id);
	

}
