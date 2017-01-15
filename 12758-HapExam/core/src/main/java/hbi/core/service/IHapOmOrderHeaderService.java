package hbi.core.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;
import hbi.core.dto.HapOmOrderHeader;

import java.util.List;
import java.util.Map;

/**
 * Created by 邹昆宏 on 2017/1/9.
 */
public interface IHapOmOrderHeaderService extends IBaseService<HapOmOrderHeader>{
    List<HapOmOrderHeader> selectByConditions(IRequest request, Map<String, Object> map, int pageNum, int pageSize);
}
