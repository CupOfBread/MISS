package org.tystudio.miss.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021-09-28
 */

@Slf4j
@Component
public class StartedTips implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
//        log.info("====================================================");
//        log.info("\n" + SystemUtil.getJavaRuntimeInfo());
//        log.info("\n" + SystemUtil.getRuntimeInfo());
        log.info("=====================项目启动完毕=====================");

    }
}
