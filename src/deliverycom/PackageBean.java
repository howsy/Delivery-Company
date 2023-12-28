
package deliverycom;





public class PackageBean {
    
    private int id;
    private String city;
    private int wslNum;
    private String comstomerName;
    private long costomerPhoneNum;
    private String agentName;
    private String deliveryGuyName;
    private String packageCondition;
    private int totalPrice;
    private String note;

    public PackageBean(int id, String city, int wslNum, String comstomerName, long costomerPhoneNum, String agentName, String deliveryGuyName, String packageCondition, int totalPrice, String note) {
        this.id = id;
        this.city = city;
        this.wslNum = wslNum;
        this.comstomerName = comstomerName;
        this.costomerPhoneNum = costomerPhoneNum;
        this.agentName = agentName;
        this.deliveryGuyName = deliveryGuyName;
        this.packageCondition = packageCondition;
        this.totalPrice = totalPrice;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getWslNum() {
        return wslNum;
    }

    public void setWslNum(int wslNum) {
        this.wslNum = wslNum;
    }

    public String getComstomerName() {
        return comstomerName;
    }

    public void setComstomerName(String comstomerName) {
        this.comstomerName = comstomerName;
    }

    public long getCostomerPhoneNum() {
        return costomerPhoneNum;
    }

    public void setCostomerPhoneNum(int costomerPhoneNum) {
        this.costomerPhoneNum = costomerPhoneNum;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getDeliveryGuyName() {
        return deliveryGuyName;
    }

    public void setDeliveryGuyName(String deliveryGuyName) {
        this.deliveryGuyName = deliveryGuyName;
    }

    public String getPackageCondition() {
        return packageCondition;
    }

    public void setPackageCondition(String packageCondition) {
        this.packageCondition = packageCondition;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
        
        
        
    
}
