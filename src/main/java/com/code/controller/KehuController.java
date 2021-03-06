package com.code.controller;

import com.code.entity.Kehu;
import com.code.service.KehuService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Kehu)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("kehu")
public class KehuController {
    /**
     * 服务对象
     */
    @Resource
    private KehuService kehuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Kehu selectOne(String id) {
        return this.kehuService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Kehu> selectAll(){
           return this.kehuService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param kehu 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Kehu>  queryAll(Kehu kehu){
           return this.kehuService.queryAll(kehu);
    }

}