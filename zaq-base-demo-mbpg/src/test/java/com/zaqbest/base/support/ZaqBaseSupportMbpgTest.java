package com.zaqbest.base.support;

import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.zaqbest.base.dao.mbpg.MbpGenerator;
import com.zaqbest.base.dao.mbpg.dto.GenerateReqDto;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ZaqBaseSupportMbpgTest
{
    @Test
    public void generateTest(){

        GenerateReqDto reqDto = new GenerateReqDto();
        reqDto.setUrl("jdbc:mysql://node01.zaqbest.com:3306/zaq-base-demo-db?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        reqDto.setUsername("zaq-base-demo-user");
        reqDto.setPassword("dEuS7LniYQZe9rXA");

        reqDto.setParent("com.zaqbest.base.demo.web");
        reqDto.setModuleName("data");
        reqDto.setOutputHome("/Users/lipan/MyData/tmpDir/generator");

        reqDto.setAuthor("mbp-generator");
        reqDto.setTableInclude(new String[]{"sys_user"});
        reqDto.setTablePrefix(new String[]{});

        reqDto.setDisableTemplateTypes(new TemplateType[]{TemplateType.CONTROLLER, TemplateType.SERVICE, TemplateType.SERVICE_IMPL});

        MbpGenerator.generate(reqDto);
    }
}