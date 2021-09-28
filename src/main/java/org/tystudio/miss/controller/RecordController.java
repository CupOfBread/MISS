package org.tystudio.miss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tystudio.miss.component.RetResponse;
import org.tystudio.miss.entity.LocRecord;
import org.tystudio.miss.service.LocRecordService;

import java.util.Map;

/**
 * <p>
 * 定位记录控制器
 * </p>
 *
 * @author Cup Of Bread
 * @since 2021/9/28
 */

@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private LocRecordService locRecordService;

    @PostMapping("/push")
    public RetResponse pushRecord(LocRecord locRecord){
//        Boolean save = locRecordService.save(locRecord);
        System.out.println(locRecord);
        return new RetResponse().makeOKRsp(200).setMsg("locRecord");
    }

}
