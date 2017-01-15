package hbi.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.dto.HapOmOrderHeader;
import hbi.core.mapper.HapOmOrderHeaderMapper;
import hbi.core.service.IHapOmOrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 邹昆宏 on 2017/1/9.
 */
@Service("hapOmOrderHeaderServiceImpl")
public class HapOmOrderHeaderServiceImpl extends BaseServiceImpl<HapOmOrderHeader> implements IHapOmOrderHeaderService{
    @Autowired
    private HapOmOrderHeaderMapper hapOmOrderHeaderMapper;

    @Override
    public List<HapOmOrderHeader> selectByConditions(IRequest request, Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return  hapOmOrderHeaderMapper.selectByConditions(map);
    }
}
