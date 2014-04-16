package sk.upjs.ics.novotnyr.mstd;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("sk.upjs.ics.novotnyr.mstd")
@MapperScan(basePackages="sk.upjs.ics.novotnyr.mstd.mybatis.mappers")
@EnableTransactionManagement
public class ApplicationContext {
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
        	.setType(EmbeddedDatabaseType.HSQL)
        	.addScript("classpath:sk/upjs/ics/novotnyr/mstd/schema.sql")
        	.build();	
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setFailFast(true);
		return sessionFactory.getObject();
	}
}

