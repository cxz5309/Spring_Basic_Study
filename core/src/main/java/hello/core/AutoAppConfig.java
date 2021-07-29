package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = Configuration.class))
//컴포넌트 스캔을 사용하면 Configuration이 붙은 설정 정보도 자동으로 등록되기 때문에
//excludeFilters를 이용해서 설정 정보를 제외했다. 보통은 제외하지 않으나 예제코드를 남기기 위하여 함
public class AutoAppConfig {

}
