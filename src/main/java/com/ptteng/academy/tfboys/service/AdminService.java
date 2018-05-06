package com.ptteng.academy.tfboys.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.Admin;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface AdminService extends BaseDaoService {

	



   		   
		
		public Long insert(Admin admin)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Admin> insertList(List<Admin> adminList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Admin admin)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Admin> adminList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Admin getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Admin> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


					
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public String  getAdminSaltById(Long id)throws ServiceException, ServiceDaoException;
		
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getAdminIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countAdminIds() throws ServiceException, ServiceDaoException;
	

}

