
package com.lyh.game.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.Configuration;

/** 
 * ClassName:MybatisCreater <br/> 
 * Function: TODO (mybatis生成器). <br/> 
 * Reason:   TODO (). <br/> 
 * Date:     2017年5月10日 下午7:22:04 <br/> 
 * @author   lyh 
 * @version   
 * @see       
 */
public class MybatisCreater {
	
	/** 
	 * main:(). <br/> 
	 * TODO().<br/> 
	 * 
	 * @author lyh 
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		 String dir =   System.getProperty("user.dir");
		   File configFile = new File(dir+"/generatorConfig.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
	}
	
}
  