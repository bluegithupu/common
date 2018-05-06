package com.gemantic.commons.code.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gemantic.commons.code.cmodel.CProject;

public class CodeGenerateTest {

	private static final Log log = LogFactory.getLog(CodeGenerateTest.class);
	
	@Test
	public void testNull(){
		
		
		
		
	}

	@Test
	public void testCodeGenerate() throws Exception {
		
		
		
	
		
		
	}
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/commons-code-mananger/applicationContext.xml");
		CodeGenerate cg = (CodeGenerate) context.getBean("codeGenerate");

		CProject project= MockUtil.mockGetProject();
		
		
		
		log.info("generate core project");
		boolean bc=cg.generateCoreProject(project);
		
		log.info("generate service project");
		boolean bs=cg.generateServiceProject(project);
		
		log.info("generate client project");
		boolean bclient=cg.generateClientProject(project);
		
		log.info("generate client project");
		boolean bcontroller=cg.generateControllerProject(project);
		
	}




}
