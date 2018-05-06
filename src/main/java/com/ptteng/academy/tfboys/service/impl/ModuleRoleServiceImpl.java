package com.ptteng.academy.tfboys.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.ModuleRole;
import com.ptteng.academy.tfboys.service.ModuleRoleService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class ModuleRoleServiceImpl extends BaseDaoServiceImpl implements ModuleRoleService {

 

	private static final Log log = LogFactory.getLog(ModuleRoleServiceImpl.class);



		   
		@Override
		public Long insert(ModuleRole moduleRole)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + moduleRole);

		if (moduleRole == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		moduleRole.setCreateAt(currentTimeMillis);
		moduleRole.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(moduleRole);
		} catch (DaoException e) {
			log.error(" insert wrong : " + moduleRole);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<ModuleRole> insertList(List<ModuleRole> moduleRoleList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (moduleRoleList == null ? "null" : moduleRoleList.size()));
      
		List<ModuleRole> resultList = null;

		if (CollectionUtils.isEmpty(moduleRoleList)) {
			return new ArrayList<ModuleRole>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (ModuleRole moduleRole : moduleRoleList) {
			moduleRole.setCreateAt(currentTimeMillis);
			moduleRole.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<ModuleRole>) dao.batchSave(moduleRoleList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + moduleRoleList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert lists  success : " + (resultList == null ? "null" : resultList.size()));
    
		return resultList;
		
		
			
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
	
		            
	    log.info(" delete data : " + id);
 
		boolean result = false;

		if (id == null) {
			return true;
		}

		try {
			result = dao.delete(ModuleRole.class, id);
		} catch (DaoException e) {
			log.error(" delete wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
 
		log.info(" delete data success : " + id);
   
		return result;
		
		}	
		  
    	   
		@Override
		public boolean update(ModuleRole moduleRole)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (moduleRole == null ? "null" : moduleRole.getId()));

		boolean result = false;

		if (moduleRole == null) {
			return true;
		}

		moduleRole.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(moduleRole);
		} catch (DaoException e) {
			log.error(" update wrong : " + moduleRole);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + moduleRole);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<ModuleRole> moduleRoleList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (moduleRoleList == null ? "null" : moduleRoleList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(moduleRoleList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (ModuleRole moduleRole : moduleRoleList) {
			moduleRole.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(moduleRoleList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + moduleRoleList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + moduleRoleList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public ModuleRole getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		ModuleRole moduleRole = null;

		if (id == null) {
			return moduleRole;
		}

		try {
			moduleRole = (ModuleRole) dao.get(ModuleRole.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return moduleRole;		
		}	
		  
    	   
		@Override
		public List<ModuleRole> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<ModuleRole> moduleRole = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<ModuleRole>();
		}

		try {
			moduleRole = (List<ModuleRole>) dao.getList(ModuleRole.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (moduleRole == null ? "null" : moduleRole.size()));
    
		return moduleRole;	
		}	
		  
    	
		
	
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public List<Long>  getModuleRoleIdsByRoleIDAndModuleID(Long roleID,Long moduleID,Integer start,Integer limit)throws ServiceException, ServiceDaoException{
		
		       if(log.isInfoEnabled()){
      log.info(" get ids by roleID,moduleID,start,limit  : " + roleID+" , "+moduleID+" , "+start+" , "+limit );
	  }
	 	List<Long> idList = null;
        
        // TODO 参数检查!

        if (start == null) {
            start = 0;
        }

        if (limit == null) {
            limit = Integer.MAX_VALUE;
        }

	try {
		idList = dao.getIdList("getModuleRoleIdsByRoleIDAndModuleID", new Object[] { roleID,moduleID},start,limit, false);

   
   } catch (DaoException e) {
			log.error(" get ids  wrong by roleID,moduleID,start,limit)  : " + roleID+" , "+moduleID+" , "+start+" , "+limit );
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
  if(log.isInfoEnabled()){
   log.info(" get ids success : " + (idList == null ? "null" : idList.size()));
  }
		return idList;
		
	
	
	}
	
		
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Integer  countModuleRoleIdsByRoleIDAndModuleID(Long roleID,Long moduleID)throws ServiceException, ServiceDaoException{
		
		       if(log.isInfoEnabled()){
      log.info(" count ids by roleID,moduleID  : " + roleID+" , "+moduleID );
	  }
	 	Integer count=null;
        
       

	try {
	   
		count = dao.count("getModuleRoleIdsByRoleIDAndModuleID", new Object[] { roleID,moduleID});

   
   } catch (DaoException e) {
			log.error(" count ids  wrong by roleID,moduleID)  : " + roleID+" , "+moduleID );
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
  if(log.isInfoEnabled()){
    log.info(" count  success : " + count);
  }
		return count;
		
	
	
	}
	
		
	
	
	
		
	@Override
	public List<Long> getModuleRoleIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		
		log.info(" get ids   by start,limit  ================== " + start + " , " + limit);
		List<Long> idList = null;
		
		
		
		if (start == null) {
			start = 0;
		}

		if (limit == null) {
			limit = Integer.MAX_VALUE;
		}
		
		try {
			idList = dao.getIdList("getModuleRoleIdsAll",new Object[] {},start, limit, false);
		} catch (DaoException e) {
			log.error(" get ids  wrong by start,limit)  : " + start + " , " + limit);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" get ids success == : " + (idList == null ? "null" : idList.size()));
		}
		return idList;
	}
	
	
		@Override
	public Integer countModuleRoleIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getModuleRoleIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getModuleRoleIds " ) ;
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" count  : " + count);
		}
		return count;
	}

}

