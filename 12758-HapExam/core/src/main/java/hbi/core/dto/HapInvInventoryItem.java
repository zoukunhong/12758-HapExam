package hbi.core.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 邹昆宏 on 2017/1/11.
 */
@Table(name = "HAP_INV_INVENTORY_ITEMS")
public class HapInvInventoryItem extends BaseDTO {
    @Id
    @Column(name = "INVENTORY_ITEM_ID")
    private Long inventoryItemId;
    @Column(name = "ITEM_CODE")
    private String itemCode;
    @Column(name = "ITEM_UOM")
    private String itemUom;
    @Column(name = "ITEM_DESCRIPTION")
    @Condition(operator = LIKE)
    private String itemDescription;

    public HapInvInventoryItem() {
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "HapInvInventoryItem{" +
                "inventoryItemId=" + inventoryItemId +
                ", itemCode='" + itemCode + '\'' +
                ", itemUom='" + itemUom + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                '}';
    }
}
