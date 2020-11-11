package andreasgroup.jms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created on 11/Nov/2020 to jms
 */
@EnableScheduling
@EnableAsync
@Configuration
public class TaskConfig {

//    TaskExecutor bean injected in Spring Context and context is going to use that for execution of the tasks.
//    Run Async task and enable scheduling in order to say in Spring to inspect classes for scheduled tasks.
    @Bean
    TaskExecutor taskExecutor(){
        return new SimpleAsyncTaskExecutor();
    }

}
