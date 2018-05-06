/**
 * 
 */
package com.ptteng.sca.academy.tfboys.client;

import java.util.List;
import java.util.Map;

import com.ptteng.academy.tfboys.model.TemporaryData;
import com.ptteng.academy.tfboys.service.TemporaryDataService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class TemporaryDataSCAClient implements TemporaryDataService {

    private TemporaryDataService temporaryDataService;

	public TemporaryDataService getTemporaryDataService() {
		return temporaryDataService;
	}
	
	
	public void setTemporaryDataService(TemporaryDataService temporaryDataService) {
		this.temporaryDataService =temporaryDataService;
	}
	
	
			   
		@Override
		public Long insert(TemporaryData temporaryData)throws ServiceException, ServiceDaoException{
		
		return temporaryDataService.insert(temporaryData);
		          
		
		}	
		  
    	   
		@Override
		public List<TemporaryData> insertList(List<TemporaryData> temporaryDataList)throws ServiceException, ServiceDaoException{
		
		return temporaryDataService.insertList(temporaryDataList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return temporaryDataService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(TemporaryData temporaryData)throws ServiceException, ServiceDaoException{
		
		return temporaryDataService.update(temporaryData);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<TemporaryData> temporaryDataList)throws ServiceException, ServiceDaoException{
		
		return temporaryDataService.updateList(temporaryDataList);
		          
		
		}	
		  
    	   
		@Override
		public TemporaryData getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return temporaryDataService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<TemporaryData> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return temporaryDataService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Long  getTemporaryDataIdByOpenID(String openID)throws ServiceException, ServiceDaoException{
		
		return temporaryDataService.getTemporaryDataIdByOpenID(openID);
	
	
	}
	
		
	
	
    		
	
		@Override
	public List<Long> getTemporaryDataIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return temporaryDataService.getTemporaryDataIds(start, limit);
	}

	@Override
	public Integer countTemporaryDataIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return temporaryDataService.countTemporaryDataIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return temporaryDataService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return temporaryDataService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   temporaryDataService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.temporaryDataService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

