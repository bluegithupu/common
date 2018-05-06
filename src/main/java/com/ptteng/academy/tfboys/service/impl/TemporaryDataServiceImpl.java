package com.ptteng.academy.tfboys.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.TemporaryData;
import com.ptteng.academy.tfboys.service.TemporaryDataService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class TemporaryDataServiceImpl extends BaseDaoServiceImpl implements TemporaryDataService {

 

	private static final Log log = LogFactory.getLog(TemporaryDataServiceImpl.class);



		   
		@Override
		public Long insert(TemporaryData temporaryData)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + temporaryData);

		if (temporaryData == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		temporaryData.setCreateAt(currentTimeMillis);
		temporaryData.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(temporaryData);
		} catch (DaoException e) {
			log.error(" insert wrong : " + temporaryData);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<TemporaryData> insertList(List<TemporaryData> temporaryDataList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (temporaryDataList == null ? "null" : temporaryDataList.size()));
      
		List<TemporaryData> resultList = null;

		if (CollectionUtils.isEmpty(temporaryDataList)) {
			return new ArrayList<TemporaryData>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (TemporaryData temporaryData : temporaryDataList) {
			temporaryData.setCreateAt(currentTimeMillis);
			temporaryData.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<TemporaryData>) dao.batchSave(temporaryDataList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + temporaryDataList);
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
			result = dao.delete(TemporaryData.class, id);
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
		public boolean update(TemporaryData temporaryData)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (temporaryData == null ? "null" : temporaryData.getId()));

		boolean result = false;

		if (temporaryData == null) {
			return true;
		}

		temporaryData.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(temporaryData);
		} catch (DaoException e) {
			log.error(" update wrong : " + temporaryData);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + temporaryData);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<TemporaryData> temporaryDataList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (temporaryDataList == null ? "null" : temporaryDataList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(temporaryDataList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (TemporaryData temporaryData : temporaryDataList) {
			temporaryData.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(temporaryDataList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + temporaryDataList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + temporaryDataList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public TemporaryData getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		TemporaryData temporaryData = null;

		if (id == null) {
			return temporaryData;
		}

		try {
			temporaryData = (TemporaryData) dao.get(TemporaryData.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return temporaryData;		
		}	
		  
    	   
		@Override
		public List<TemporaryData> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<TemporaryData> temporaryData = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<TemporaryData>();
		}

		try {
			temporaryData = (List<TemporaryData>) dao.getList(TemporaryData.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (temporaryData == null ? "null" : temporaryData.size()));
    
		return temporaryData;	
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
		
		      if(log.isInfoEnabled()){
	  log.info(" get id by openID  : " + openID );
	  }
	  Long id = null;
	
      // TODO 参数检查!
      
	try {
		
	
	
        id = (Long) dao.getMapping("getTemporaryDataIdByOpenID", new Object[] {openID });
   } catch (DaoException e) {
			log.error(" get id wrong by openID  : " + openID );
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
  if(log.isInfoEnabled()){
   log.info(" get id success : " + id);
   }
		return id;
        
	
	
	
	
	}
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getTemporaryDataIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getTemporaryDataIdsAll",new Object[] {},start, limit, false);
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
	public Integer countTemporaryDataIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getTemporaryDataIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getTemporaryDataIds " ) ;
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

