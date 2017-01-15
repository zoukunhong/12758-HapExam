package hbi.core.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.dto.HapOmOrderHeader;

import java.util.List;
import java.util.Map;

/**
 * Created by 邹昆宏 on 2017/1/9.
 */
public interface HapOmOrderHeaderMapper extends Mapper<HapOmOrderHeader>{
    List<HapOmOrderHeader> selectByConditions(Map map);
}
