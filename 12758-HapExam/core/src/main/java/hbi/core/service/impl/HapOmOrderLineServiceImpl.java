package hbi.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.dto.HapOmOrderLine;
import hbi.core.mapper.HapOmOrderLineMapper;
import hbi.core.service.IHapOmOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by 邹昆宏 on 2017/1/9.
 */
@Service("hapOmOrderLineServiceImpl")
public class HapOmOrderLineServiceImpl extends BaseServiceImpl<HapOmOrderLine> implements IHapOmOrderLineService{
    @Autowired
    private HapOmOrderLineMapper hapOmOrderLineMapper;
    @Override
    public List<HapOmOrderLine> selectByHeaderId(IRequest request, HapOmOrderLine hapOmOrderLine, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<HapOmOrderLine> hapOmOrderLines = hapOmOrderLineMapper.selectByHeaderId(hapOmOrderLine);
        System.out.println(hapOmOrderLines);
        return hapOmOrderLines;
    }

    @Override
    public HapOmOrderLine insertByOrderLine(HapOmOrderLine hapOmOrderLine) {
        hapOmOrderLineMapper.insertByOrderLine(hapOmOrderLine);
        return hapOmOrderLine;
    }

    @Override
    public int updateByOrderLine(HapOmOrderLine hapOmOrderLine) {
        return hapOmOrderLineMapper.updateByOrderLine(hapOmOrderLine);
    }

    @Override
    public int deleteByHeaderId(HapOmOrderLine hapOmOrderLine) {
        return hapOmOrderLineMapper.deleteByHeaderId(hapOmOrderLine);
    }
}
