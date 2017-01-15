package hbi.core.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import hbi.core.dto.HapOmOrderLine;

import java.util.List;

/**
 * Created by 邹昆宏 on 2017/1/9.
 */
public interface IHapOmOrderLineService extends IBaseService<HapOmOrderLine>{
    List<HapOmOrderLine> selectByHeaderId(IRequest request, HapOmOrderLine hapOmOrderLine, int pageNum, int pageSize);
    HapOmOrderLine insertByOrderLine(HapOmOrderLine hapOmOrderLine);
    int updateByOrderLine(HapOmOrderLine hapOmOrderLine);
    int deleteByHeaderId(HapOmOrderLine hapOmOrderLine);
}
