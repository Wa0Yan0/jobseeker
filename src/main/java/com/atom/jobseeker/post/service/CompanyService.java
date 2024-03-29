package com.atom.jobseeker.post.service;

import com.atom.jobseeker.common.utils.PageUtils;
import com.atom.jobseeker.post.pojo.Company;
import com.atom.jobseeker.post.vo.CompanyNameVo;
import com.atom.jobseeker.post.vo.CompanyVo;

import java.util.List;
import java.util.Map;

/**
 * @author wayan
 */
public interface CompanyService {


    /**
     * 查询带有分页和查询信息的数据
     * @param params
     * @return
     */
    PageUtils queryPage(Map<String, Object> params);


    /**
     * 通过id查询公司信息
     * @param id
     * @return
     */
    Company queryCompanyById(Long id);

    /**
     * 新增公司信息
     * @param company
     */
    void save(Company company);

    /**
     * 修改公司信息
     * @param company
     */
    void update(Company company);

    /**
     * 批量删除公司数据
     * @param ids
     */
    void batchDelete(Long[] ids);

    /**
     * 查询公司名称列表
     * @param query
     * @return
     */
    List<CompanyNameVo> queryNameList(String query);

    /**
     * 查询公司名称
     * @param companyName
     * @return
     */
    Long queryCompanyId(String companyName);
}
