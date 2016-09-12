package a002TestMybatisByManual;import java.io.IOException;import java.io.InputStream;
import org.apache.ibatis.builder.xml.XMLConfigBuilder;import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import entity.Man;import interfaceTest001.ICRUDmanDB;
/**********************2016-09-11 13:39:53*********************/
public class TestMybatis001 {
	private static final Logger LOGGER = LogManager.getLogger();
/**********************2016-09-11 13:39:55*********************/
	public TestMybatis001() {}//no parameter constructor
/********************** 2016-09-11 13:40:10 *********************/
	public static void f(){	
		String resource = "xml/mybatisHeadquarters/mybatis-sqlMap.xml";
		InputStream inputStream=null;
		try {inputStream = Resources.getResourceAsStream(resource);} catch (IOException e) {e.printStackTrace();}
		if(inputStream!=null){
			//create XMLConfigBuilder by manual，parse and create Configuration object
			XMLConfigBuilder parser = new XMLConfigBuilder(inputStream, null,null);
			Configuration configuration=parser.parse();
			//use Configuratio object create SqlSessionFactory
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
			SqlSession sqlSession = sqlSessionFactory.openSession();//use MyBatis
			ICRUDmanDB mapperOfCRUDmanDB = sqlSession.getMapper(ICRUDmanDB.class);
			Man man=new Man( );
			man.setName("韩韩6");
			man.setAge("15");
			mapperOfCRUDmanDB.create(man);
			sqlSession.commit();
			try{inputStream.close();sqlSession.close();}catch(Exception e){LOGGER.error(e.getMessage(),e);}			
		}
/*******************************************/
	}
	public static void main(String[] args) {f();}
}
/**********************2016-09-11 13:40:06*********************/