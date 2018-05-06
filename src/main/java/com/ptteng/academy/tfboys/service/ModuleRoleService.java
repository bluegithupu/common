package com.ptteng.academy.tfboys.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.ModuleRole;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface ModuleRoleService extends BaseDaoService {

	



   		   
		
		public Long insert(ModuleRole moduleRole)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<ModuleRole> insertList(List<ModuleRole> moduleRoleList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(ModuleRole moduleRole)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<ModuleRole> moduleRoleList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public ModuleRole getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<ModuleRole> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer  countModuleRoleIdsByRoleIDAndModuleID(Long roleID,Long moduleID)throws ServiceException, ServiceDaoException;
					
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long>  getModuleRoleIdsByRoleIDAndModuleID(Long roleID,Long moduleID,Integer start,Integer limit)throws ServiceException, ServiceDaoException;
		
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getModuleRoleIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countModuleRoleIds() throws ServiceException, ServiceDaoException;
	

}

