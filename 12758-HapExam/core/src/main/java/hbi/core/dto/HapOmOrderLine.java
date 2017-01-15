package hbi.core.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Created by 邹昆宏 on 2017/1/11.
 */
@Table(name = "HAP_OM_ORDER_LINES")
public class HapOmOrderLine extends BaseDTO {
    @Id
    @Column(name = "LINE_ID")
    private Long lineId;
    @Column(name = "HEADER_ID")
    private Long headerId;
    @Column(name = "LINE_NUMBER")
    private Long lineNumber;
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "ORDERD_QUANTITY")
    private Long orderQuantity;
    @Column(name = "ORDER_QUANTITY_UOM")
    private String orderQuantityUom;
    @Column(name = "UNIT_SELLING_PRICE")
    private Double unitSellingPrice;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COMPANY_ID")
    private Long companyId;
    @Transient
    private HapInvInventoryItem inventoryItem;
    @Transient
    private Double countPrice;

    public HapOmOrderLine() {
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Long orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Double getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(Double unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public Double getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(Double countPrice) {
        this.countPrice = countPrice;
    }

    public HapInvInventoryItem getInventoryItem() {
        if(inventoryItem == null){
            inventoryItem = new HapInvInventoryItem();
        }
        return inventoryItem;
    }

    public void setInventoryItem(HapInvInventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public String toString() {
        return "HapOmOrderLine{" +
                "lineId=" + lineId +
                ", headerId=" + headerId +
                ", lineNumber=" + lineNumber +
                ", inventoryItemId=" + inventoryItemId +
                ", orderQuantity=" + orderQuantity +
                ", orderQuantityUom='" + orderQuantityUom + '\'' +
                ", unitSellingPrice=" + unitSellingPrice +
                ", description='" + description + '\'' +
                ", companyId=" + companyId +
                '}';
    }
}
