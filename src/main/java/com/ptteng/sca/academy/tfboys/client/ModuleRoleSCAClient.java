/**
 * 
 */
package com.ptteng.sca.academy.tfboys.client;

import java.util.List;
import java.util.Map;

import com.ptteng.academy.tfboys.model.ModuleRole;
import com.ptteng.academy.tfboys.service.ModuleRoleService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class ModuleRoleSCAClient implements ModuleRoleService {

    private ModuleRoleService moduleRoleService;

	public ModuleRoleService getModuleRoleService() {
		return moduleRoleService;
	}
	
	
	public void setModuleRoleService(ModuleRoleService moduleRoleService) {
		this.moduleRoleService =moduleRoleService;
	}
	
	
			   
		@Override
		public Long insert(ModuleRole moduleRole)throws ServiceException, ServiceDaoException{
		
		return moduleRoleService.insert(moduleRole);
		          
		
		}	
		  
    	   
		@Override
		public List<ModuleRole> insertList(List<ModuleRole> moduleRoleList)throws ServiceException, ServiceDaoException{
		
		return moduleRoleService.insertList(moduleRoleList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return moduleRoleService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(ModuleRole moduleRole)throws ServiceException, ServiceDaoException{
		
		return moduleRoleService.update(moduleRole);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<ModuleRole> moduleRoleList)throws ServiceException, ServiceDaoException{
		
		return moduleRoleService.updateList(moduleRoleList);
		          
		
		}	
		  
    	   
		@Override
		public ModuleRole getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return moduleRoleService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<ModuleRole> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return moduleRoleService.getObjectsByIds(ids);
		          
		
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
		
		return moduleRoleService.getModuleRoleIdsByRoleIDAndModuleID(roleID,moduleID,start,limit);
	
	
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
		
		return moduleRoleService.countModuleRoleIdsByRoleIDAndModuleID(roleID,moduleID);
	
	
	}
	
		
	
		@Override
	public List<Long> getModuleRoleIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return moduleRoleService.getModuleRoleIds(start, limit);
	}

	@Override
	public Integer countModuleRoleIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return moduleRoleService.countModuleRoleIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return moduleRoleService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return moduleRoleService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   moduleRoleService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.moduleRoleService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

