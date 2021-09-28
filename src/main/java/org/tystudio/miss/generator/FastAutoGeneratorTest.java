package org.tystudio.miss.generator;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;


public class FastAutoGeneratorTest {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://192.168.56.100:3306/miss", "root", "root");

    /**
     * 执行 run
     */
    public static void main(String[] args) {
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                // 全局配置
                .globalConfig((scanner, builder) -> builder.outputDir("C:\\Users\\toby\\Desktop\\out")
                        .author("Cup Of Bread")
                        .enableSwagger()
                        .fileOverride())
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent("org.tystudio.miss"))
                // 策略配置
                .strategyConfig((scanner, builder) -> builder
                        .enableCapitalMode()
                        .addTablePrefix("miss_")
                        .entityBuilder()
                        .disableSerialVersionUID()
                        .enableChainModel()
                        .idType(IdType.AUTO)
                        .enableLombok()
                        .controllerBuilder()
                        .enableRestStyle()
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImp")
                        .mapperBuilder()
                        .enableMapperAnnotation()
                )
                .execute();
    }
}
