package hbi.core.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.common.ObjectUtil;
import hbi.core.dto.HapOmOrderLine;
import hbi.core.service.IHapOmOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by 邹昆宏 on 2017/1/9.
 */
@RestController
@RequestMapping("/OrderLine")
public class OrderLineController extends BaseController{
    @Autowired
    @Qualifier("hapOmOrderLineServiceImpl")
    private IHapOmOrderLineService hapOmOrderLineService;

    @RequestMapping(path = "",method = RequestMethod.POST)
    public ResponseData insert( HttpServletRequest req,@RequestBody HapOmOrderLine hapOmOrderLine){

        ResponseData responseData = new ResponseData();
        IRequest request = this.createRequestContext(req);
        hapOmOrderLine = hapOmOrderLineService.insertByOrderLine(hapOmOrderLine);
        return responseData;
    }
    @RequestMapping(path = "",method = RequestMethod.PUT)
    public ResponseData update(HttpServletRequest req,@RequestBody HapOmOrderLine hapOmOrderLine){
        ResponseData responseData = new ResponseData();
        int result = hapOmOrderLineService.updateByOrderLine(hapOmOrderLine);
        return responseData;
    }

    @RequestMapping(path = "",method = RequestMethod.DELETE)
    public ResponseData delete(@RequestBody HapOmOrderLine hapOmOrderLine){
        ResponseData responseData = new ResponseData();
        hapOmOrderLineService.deleteByPrimaryKey(hapOmOrderLine);
        return responseData;
    }
    @RequestMapping(path = "",method = RequestMethod.GET)
    public ResponseData select(HttpServletRequest req,
                               @RequestParam(name = "headerId",required = false,defaultValue = "") Long headerId,
                               @RequestParam(name = "page",required = false,defaultValue = "1") Integer page,
                               @RequestParam(name = "pageSize",required = false,defaultValue = "10") Integer pageSize){
        IRequest request = this.createRequestContext(req);
        HapOmOrderLine hapOmOrderLine = new HapOmOrderLine();
        hapOmOrderLine.setHeaderId(headerId);
        return new ResponseData(hapOmOrderLineService.selectByHeaderId(request,hapOmOrderLine,page,pageSize));
    }
}
