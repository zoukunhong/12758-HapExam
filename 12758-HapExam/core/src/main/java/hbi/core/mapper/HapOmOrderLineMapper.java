package hbi.core.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.dto.HapOmOrderLine;

import java.util.List;

/**
 * Created by 邹昆宏 on 2017/1/9.
 */
public interface HapOmOrderLineMapper extends Mapper<HapOmOrderLine>{
    List<HapOmOrderLine> selectByHeaderId(HapOmOrderLine hapOmOrderLine);
    int insertByOrderLine(HapOmOrderLine hapOmOrderLine);
    int updateByOrderLine(HapOmOrderLine hapOmOrderLine);
    int deleteByHeaderId(HapOmOrderLine hapOmOrderLine);
}
