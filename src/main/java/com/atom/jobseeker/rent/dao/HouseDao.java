package com.atom.jobseeker.rent.dao;

import com.atom.jobseeker.rent.vo.QueryVo;
import com.atom.jobseeker.rent.pojo.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author SunLei
 */
@Mapper
public interface HouseDao {
    /**
     * 根据ID搜索单例租房数据
     * @param hId
     * @return 返回House实例对象
     */
    House selectOneById(@Param("hosId") Long hId);

    /**
     * 搜索总记录数
     * @return 记录数总数
     */
     int selectTotalCount();

    /**
     * 根据高级查询搜索总记录数
     * @param queryVo
     * @return  高级查询后的总记录数
     */
     int selectTotalCountWithQuery(@Param("queryVo") QueryVo queryVo);

    /**
     * 根据高级查询搜索对应的信息列表
     * @param queryVo
     * @param begin
     * @param pageSize
     * @return  通过高级搜索到的对应的信息列表
     */
    List<House> selectListWithQuery(@Param("queryVo")QueryVo queryVo,@Param("begin") int begin,@Param("pagesize") int pageSize);

    /**
     * 根据id查询当前房屋信息的发布状态
     * @param hId
     * @return
     */
    Short selectStatus(@Param("hosId") Long hId);

    /**
     * 根据id集合获取到对应的租房信息集合
     * @param ids
     * @return
     */
    List<House> selectHouseList(@Param("ids") Long[] ids);

    /**
     * 将指定的cmy_id修改成指定的值
     * @param idOne 原cmy_id的值
     * @param idTwo 指定修改的cmy_id的值
     * @return
     */
    int updateCmyId(@Param("idOne") Long idOne,@Param("idTwo") Long idTwo);

    /**
     * 将临时house数据表中的数据推送到rent_house正式表中
     * @return
     */
    int postHouseNewData();

    /**
     * 清空临时表house
     * @return
     */
    int delHouse();

    /**
     * 修改属于指定cmyId小区的城市和地区信息
     * @param cId
     * @param rId
     * @param cmyId
     * @return
     */
    int updateRegion(@Param("cId") Long cId,@Param("rId") Long rId,@Param("cmyId") Long cmyId);

    /**
     * 删除正式表中属于指定cmyId的房屋信息
     * @param ids
     * @return
     */
    int delNewHouseByCmyId(@Param("ids")List<Long> ids);

    /**
     * 根据房屋id删除临时表中的房屋信息
     * @param ids
     * @return
     */

    /**
     * 对单条房屋信息进行更新
     * @param house
     * @return
     */
    int updateOneHouse(@Param("house")House house);

    /**
     * 删除正式表指定ID的房屋信息
     * @param ids
     * @return
     */
    int delNewHouseByIds(@Param("ids")List<Long> ids);

    /**
     * 删除临时表指定id的房屋信息
     * @param id
     * @return
     */
    int delHouseById(@Param("id")Long id);


    /**
     * 向正式表插入单条新的房屋信息
     * @param house
     * @return
     */
    int insertNewHouse(@Param("house")House house);

    /**
     * 向临时表插入单条新的房屋信息
     * @param house
     * @return
     */
    int insertHouse(@Param("house")House house);

    /**
     * 改变房屋审核状态
     * @param ids
     * @param code
     * @return
     */
    int updateStatus(@Param("ids")Long[] ids,@Param("code")short code);
}
