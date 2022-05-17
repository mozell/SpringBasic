package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;

@Configuration
@ComponentScan(
        excludeFilters = @Filter(
                type = FilterType.ANNOTATION,
                classes = Configuration.class)
        ) //AppConfig.java 자동 등록을 피하기 위해 해당 애노테이션이 붙은 것은 컴포넌트스캔 대상에서 뺀다.
public class AutoAppConfig {
}
