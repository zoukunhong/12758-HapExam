package hbi.core.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.common.ObjectUtil;
import hbi.core.dto.HapArCustomer;
import hbi.core.dto.HapOmOrderHeader;
import hbi.core.dto.HapOmOrderLine;
import hbi.core.dto.HapOrgCompany;
import hbi.core.service.IHapOmOrderHeaderService;
import hbi.core.service.IHapOmOrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by 邹昆宏 on 2017/1/9.
 */
@RestController
@RequestMapping("/SaleOrder")
public class SaleOrderController extends BaseController{
    @Autowired
    @Qualifier("hapOmOrderHeaderServiceImpl")
    private IHapOmOrderHeaderService hapOmOrderHeaderService;
    @Autowired
    @Qualifier("hapOmOrderLineServiceImpl")
    private IHapOmOrderLineService hapOmOrderLineService;

    @RequestMapping(path = "",method = RequestMethod.POST)
    public HapOmOrderHeader insert(@RequestBody HapOmOrderHeader hapOmOrderHeader, HttpServletRequest req){
        IRequest request = this.createRequestContext(req);
        HapOmOrderHeader insert = hapOmOrderHeaderService.insert(request, hapOmOrderHeader);
        return insert;
    }
    @RequestMapping(path = "",method = RequestMethod.PUT)
    public HapOmOrderHeader update(@RequestBody HapOmOrderHeader hapOmOrderHeader,HttpServletRequest req){
        ResponseData responseData = new ResponseData();
        IRequest request = this.createRequestContext(req);
        HapOmOrderHeader update = hapOmOrderHeaderService.updateByPrimaryKey(request, hapOmOrderHeader);
        return update;
    }
    @RequestMapping(path = "",method = RequestMethod.DELETE)
    public Integer delete(@RequestBody HapOmOrderHeader hapOmOrderHeader){
        HapOmOrderLine hapOmOrderLine = new HapOmOrderLine();
        hapOmOrderLine.setHeaderId(hapOmOrderHeader.getHeaderId());
        hapOmOrderLineService.deleteByHeaderId(hapOmOrderLine);
        Integer result = hapOmOrderHeaderService.deleteByPrimaryKey(hapOmOrderHeader);
        return result;
    }
    @RequestMapping(path = "",method = RequestMethod.GET)
    public ResponseData select(HttpServletRequest req,
                               @RequestParam(name = "headerId",required = false,defaultValue = "") Long headerId,
                               @RequestParam(name = "companyId",required = false,defaultValue = "") Long companyId,
                               @RequestParam(name = "customerId",required = false,defaultValue = "") Long customerId,
                               @RequestParam(name = "orderNumber",required = false,defaultValue = "") String orderNumber,
                               @RequestParam(name = "orderStatus",required = false,defaultValue = "") String orderStatus,
                               @RequestParam(name = "itemCode",required = false,defaultValue = "") String itemCode,
                               @RequestParam(name = "page",required = false,defaultValue = "1") Integer page,
                               @RequestParam(name = "pageSize",required = false,defaultValue = "10") Integer pageSize){
        IRequest request = this.createRequestContext(req);
        System.out.println(pageSize);
        System.out.println(page);
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("headerId", ObjectUtil.testLong(headerId));
        map.put("companyId", ObjectUtil.testLong(companyId));
        map.put("customerId",ObjectUtil.testLong(customerId));
        map.put("orderNumber",ObjectUtil.testString(orderNumber));
        map.put("orderStatus",ObjectUtil.testString(orderStatus));
        map.put("itemCode",ObjectUtil.testString(itemCode));
        System.out.println(map);
        return new ResponseData(hapOmOrderHeaderService.selectByConditions(request,map,page,pageSize));
    }
}
